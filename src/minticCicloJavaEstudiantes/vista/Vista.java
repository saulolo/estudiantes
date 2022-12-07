package minticCicloJavaEstudiantes.vista;

/* @author: Saulolo */
public class Vista {

    /*
    LA VISTA: Es lo que el usuario vé, con lo que el usuario interactua.
     */
    //Paso 2:Crer menú
    public static void imprimirMenu() {
        System.out.println("UNIVERSIDAD DE ANTIOQUIA");
        System.out.println("Seleccione la tarea a realizar: (1 al 6)");
        System.out.println("1. Ingresar nuevo estudiante: ");
        System.out.println("2. Buscar estudiante registrado: ");
        System.out.println("3. Modificar estudiante registrado: ");
        System.out.println("4. Eliminar estudiante registrado: ");
        System.out.println("5. Ver directorio de estudiantes: ");
        System.out.println("6. Salir");
    }

    public static String verDirectorio() {
        return " ";
    }

}
