
package ejercicio1;

import java.util.Scanner;

public class empleado {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        salario_empleado salario_emp = new salario_empleado();
        
        System.out.print("Ingrese el nombre del empleado: ");
        salario_emp.setNombre_empleado(leer.nextLine());
        System.out.print("Ingrese el salario base del empleado: $");
        salario_emp.setSalario(Double.parseDouble(leer.nextLine()));
        System.out.print("Ingrese el número de horas(extras) trabajadas en el mes: ");
        salario_emp.setHoras_trabajadas_mes(Integer.parseInt(leer.nextLine()));
        System.out.print("Ingrese el pago por horas trabajadas: $");
        salario_emp.setPago_hora(Double.parseDouble(leer.nextLine()));
        
        String imprimir = salario_emp.info();
        System.out.println(imprimir);
        
    }
    
    
}
