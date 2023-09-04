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
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class JavaIO {

  public static void ejemplo01() {

    final String URI = "/home/david.cc/foo";
    Path p1 = Paths.get(URI);

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

  /*
   * Crea un fichero e inserta un texto de ejemplo
   */
  private static void crearFichero(Path path) {
    Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rw-r--r--");
    FileAttribute<Set<PosixFilePermission>> attr = PosixFilePermissions.asFileAttribute(perms);;

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
      Files.writeString(path, "Texto de ejemplo", StandardCharsets.UTF_8);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  };

}
