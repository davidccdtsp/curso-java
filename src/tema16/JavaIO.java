package tema16;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Map;
import java.util.Set;

public class JavaIO {

	public static void ejemplo01() {

		// Microsoft Windows syntax
//     final String RUTA = "\"C:\\home\\joe\\foo\"";
    final String RUTA = "/home/david.cc/foo";
//	final String RUTA = "$HOME/foo";
//		Map<String, String> entorno = System.getenv();
//		final String RUTA = entorno.get("HOME") + "/foo";

		Path p1 = Paths.get(RUTA);

		System.out.println();
		System.out.println("Creando un path a:");
		System.out.format("toString: %s%n", p1.toString());
		System.out.format("getFileName: %s%n", p1.getFileName());
		System.out.format("getName(0): %s%n", p1.getName(0));
		System.out.format("getNameCount: %d%n", p1.getNameCount());
		System.out.format("subp1(0,2): %s%n", p1.subpath(0, 2));
		System.out.format("getParent: %s%n", p1.getParent());
		System.out.format("getRoot: %s%n", p1.getRoot());
		System.out.format("%s%n", p1.toUri());
		System.out.format("resolve(\"nuevo\"): %s%n", p1.resolve("nuevo"));
	}

	public static void ejemplo02() {

		final String URI1 = "/home/david.cc/foo/fooA.txt";
		final String URI2 = "/home/david.cc/foo/falso";
		Path p1 = Paths.get(URI1);
		Path p2 = Paths.get(URI2);

		boolean existe = Files.exists(p1);
		System.out.println("Files.exists*(" + p1 + ") = " + existe);
		existe = Files.exists(p2);
		System.out.println("Files.exists*(" + p2 + ") = " + existe);

		System.out.println("\nComprobando accesibilidad");

		boolean accesible = Files.isRegularFile(p1) & Files.isReadable(p1) & Files.isExecutable(p1);
		System.out.println("Files.isRegularFile(" + p1 + ") = " + accesible);

	}

	public static void ejemplo03() {

		final String URI1 = "/home/david.cc/foo/fooC";
		Path p1 = Paths.get(URI1);
		Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rw-r--r--");
		FileAttribute<Set<PosixFilePermission>> attr = PosixFilePermissions.asFileAttribute(perms);

		System.out.println();
		System.out.println("Creando fichero: " + p1);

		try {
			Files.createFile(p1, attr);
		} catch (FileAlreadyExistsException e) {
			// TODO Auto-generated catch block
			System.out.println("El fichero ya existe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		boolean existe = Files.exists(p1);
		System.out.println("Files.exists*(" + p1 + ") = " + existe);

	}

	public static void ejemplo04() {
		final String URI1 = "/home/david.cc/foo/fooC";
		Path p1 = Paths.get(URI1);
		
		try {
			Files.delete(p1);
		} catch (NoSuchFileException e) {
			System.err.format("%s: no such" + " file or directory%n", p1);
		} catch (DirectoryNotEmptyException e) {
			System.err.format("%s not empty%n", p1);
		} catch (IOException e) {
			// File permission problems are caught here.
			System.err.println(e);
		}

		boolean existe = Files.exists(p1);
		System.out.println("Files.exists*(" + p1 + ") = " + existe);

	}

	public static void ejemplo05() {

		final String URI1 = "/home/david.cc/foo/original";
		final String URI2 = "/home/david.cc/foo/copia";
		Path p1 = Paths.get(URI1);
		Path p2 = Paths.get(URI2);

		crearFichero(p1);

		try {
			Files.copy(p1, p2, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		boolean existe = Files.exists(p2);
		System.out.println("Files.exists*(" + p2 + ") = " + existe);
	}

	public static void ejemplo06() {

		final String URI1 = "/home/david.cc/foo/original";
		final String URI2 = "/home/david.cc/foo/temp/original";
		Path origen = Paths.get(URI1);
		Path destino = Paths.get(URI2);

		crearFichero(origen);

		boolean existe = Files.exists(origen);
		System.out.println("Files.exists*(" + origen + ") = " + existe);
		existe = Files.exists(destino);
		System.out.println("Files.exists*(" + destino + ") = " + existe);
		System.out.println("Moviendo el fichero");

		try {
			Files.move(origen, destino, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		existe = Files.exists(origen);
		System.out.println("Files.exists*(" + origen + ") = " + existe);
		existe = Files.exists(destino);
		System.out.println("Files.exists*(" + destino + ") = " + existe);

	}

	public static void ejemplo07() {
		final String URI1 = "/home/david.cc/foo/original";
		final String URI2 = "/home/david.cc/foo/enalceSimbolico";
		final String URI3 = "/home/david.cc/foo/enlaceDuro";
		Path fichero = Paths.get(URI1);
		Path enlace = Paths.get(URI2);
		Path enlaceDuro = Paths.get(URI3);

		// crearFichero(fichero);
		borrarFichero(enlace);
		borrarFichero(enlaceDuro);

		boolean existe = Files.exists(fichero);
		System.out.println("Files.exists*(" + fichero + ") = " + existe);
		existe = Files.exists(enlace);
		System.out.println("Files.exists*(" + enlace + ") = " + existe);
		System.out.println("\nCreando enlace simbolico");

		try {
			Files.createSymbolicLink(enlace, fichero);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		existe = Files.exists(fichero);
		System.out.println("Files.exists*(" + fichero + ") = " + existe);
		existe = Files.exists(enlace);
		System.out.println("Files.exists*(" + enlace + ") = " + existe);

		existe = Files.exists(fichero);
		System.out.println("Files.exists*(" + fichero + ") = " + existe);
		existe = Files.exists(enlaceDuro);
		System.out.println("Files.exists*(" + enlaceDuro + ") = " + existe);
		System.out.println("\nCreando enlace duro");

		try {
			Files.createLink(enlaceDuro, fichero);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		existe = Files.exists(fichero);
		System.out.println("Files.exists*(" + fichero + ") = " + existe);
		existe = Files.exists(enlaceDuro);
		System.out.println("Files.exists*(" + enlaceDuro + ") = " + existe);

		System.out.format("isSymbolicLink(" + enlace + "): %s%n", Files.isSymbolicLink(enlace));
		try {
			System.out.format("readSymbolicLink(%s): %s%n", enlace, Files.readSymbolicLink(enlace));
		} catch (IOException x) {
			System.err.println(x);
		}

	}

	public static void ejemplo08() {
		final String URI1 = "/home/david.cc/foo/fichero.txt";
		Path fichero = Paths.get(URI1);

		crearFichero(fichero);

		try {
			System.out.format("Con tamaño: %s Bytes %n", Files.size(fichero));
			System.out.format("Directorio: %s%n", Files.isDirectory(fichero));
			System.out.format("Fichero regular: %s%n", Files.isRegularFile(fichero));
			System.out.format("Oculto: %s%n", Files.isHidden(fichero));
			System.out.format("Propietario: %s%n", Files.getOwner(fichero));

			BasicFileAttributes attr = Files.readAttributes(fichero, BasicFileAttributes.class);

			System.out.println("creationTime: " + attr.creationTime());
			System.out.println("lastAccessTime: " + attr.lastAccessTime());
			System.out.println("lastModifiedTime: " + attr.lastModifiedTime());

			System.out.println("isDirectory: " + attr.isDirectory());
			System.out.println("isOther: " + attr.isOther());
			System.out.println("isRegularFile: " + attr.isRegularFile());
			System.out.println("isSymbolicLink: " + attr.isSymbolicLink());
			System.out.println("size: " + attr.size());

			final String ATRIBUTOS = "posix:permissions,owner,size";
			Map<String, Object> mapAtributos = Files.readAttributes(fichero, ATRIBUTOS);
			System.out.println(mapAtributos);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Crea un fichero e inserta un texto de ejemplo
	 * 
	 * @param path ruta o path en la que se creara el fichero
	 */
	private static void crearFichero(Path path) {
		Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rw-r--r--");
		FileAttribute<Set<PosixFilePermission>> attr = PosixFilePermissions.asFileAttribute(perms);
		;

		System.out.println();
		System.out.println("Creando fichero: " + path);

		try {
			Files.createFile(path, attr);
		} catch (FileAlreadyExistsException e) {
			// TODO Auto-generated catch block
			System.out.println("El fichero ya existe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Files.write(path, "Texto de ejemplo".getBytes(), StandardOpenOption.CREATE);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	};

	/**
	 * Elimina un fichero procesando las posibles excepciones
	 * 
	 * @param path ruta o path en la que se eliminara
	 */
	private static void borrarFichero(Path path) {

		try {
			Files.delete(path);
		} catch (NoSuchFileException e) {
			System.err.format("%s: no such" + " file or directory%n", path);
		} catch (DirectoryNotEmptyException e) {
			System.err.format("%s not empty%n", path);
		} catch (IOException e) {
			// File permission problems are caught here.
			System.err.println(e);
		}

	}

}
