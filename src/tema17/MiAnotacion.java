package tema17;

@Documented
@interface MiAnotacion {
  String nombre();
  int valor() default 10;
  String[] palabrasClave();
}
