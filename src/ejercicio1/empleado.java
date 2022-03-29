
package ejercicio1;

import java.util.Scanner;

public class empleado {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        salario_empleado empleado = new salario_empleado();
        
        System.out.print("Ingrese el nombre del empleado: ");
        empleado.setNombre_empleado(leer.nextLine());
        System.out.print("Ingrese el salario base del empleado: $");
        empleado.setSalario(Double.parseDouble(leer.nextLine()));
        
    }
}
