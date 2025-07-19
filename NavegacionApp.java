import java.util.Stack;

public class NavegacionApp {
    public static void main(String[] args) {
        Stack<String> historialPantallas = new Stack<>();

        // Simulación de navegación en la aplicación
        historialPantallas.push("Inicio");
        historialPantallas.push("Lista de jóvenes");
        historialPantallas.push("Detalles de Kaleb");
        historialPantallas.push("Configuración de campamento");

        System.out.println("Pantalla actual: " + historialPantallas.peek());

        // Usuario regresa a la pantalla anterior
        historialPantallas.pop();
        System.out.println("Regresó a: " + historialPantallas.peek());
    }
}
