package minticCicloJavaEstudiantes.vista;

import minticCicloJavaEstudiantes.modelo.Modelo;

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

    public static void mostrar(int indice) {
        
        System.out.println("Información del estudiante: ");
        System.out.println("Nombres: " + Modelo.nombres.get(indice));
        System.out.println("Apellidos: " + Modelo.apellidos.get(indice));
        System.out.println("Fecha de nacimiento: " + Modelo.nacimiento.get(indice));
        System.out.println("Correo Electrónico: " + Modelo.correo.get(indice));
        System.out.println("Número celular: " + Modelo.celular.get(indice));
        System.out.println("Programa de interés: " + Modelo.programa.get(indice));
        
    }
}
