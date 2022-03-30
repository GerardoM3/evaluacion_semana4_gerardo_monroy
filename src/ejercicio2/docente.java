
package ejercicio2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class docente extends empleado{
    private String status;

    public docente() {
        
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        
        return status;
    }
    
    public String info(){
        
        String r = "";
        r = "\nEl nombre del empleado es: " + this.getNombre_emp();
        r += "\nCódigo del empleado: " + this.getCod_emp();
        r += "\nEdad: " + this.getEdad();
        r += "\nDirección: " + this.getDireccion();
        r += "\nÁrea: " + this.getArea();
        r += "\n\tCódigo área: " + this.getCod_a();
        r += "\n\tNombre del área: " + this.getNombre();
        r += "\n\tCantidad de empleados: " + this.getCant_emp();
        r += "\n\tNúmero de edificio: " + this.getNum_edificio();
        r += "\n\t\tNombre del edificio: " + this.getNombre_ed();
        r += "\n\t\tUbicación del edificio: " + this.getUbicacion();
        r += "\n\t\tCantidad de departamentos: " + this.getCant_depa();
        r += "\n\t\tCantidad de pisos: " + this.getCant_pisos();
        
        return r;
    }
    
    public double desc_ISSS(double sueldo){
        sueldo = sueldo - (sueldo * 0.03);
        return sueldo;
    }
    public double desc_renta(double sueldo){
        sueldo = sueldo - (sueldo * 0.1);
        return sueldo;
    }
    public double desc_afp(double sueldo){
        sueldo = sueldo - (sueldo * 0.07);
        return sueldo;
    }
    
    public static void main(String[] args) {
        docente d = new docente();
        
        NumberFormat formato = new DecimalFormat("#.##");
        
        Scanner leer = new Scanner(System.in);
        System.out.println("------Datos del empleado------");
        System.out.println("Ingrese el código de empleado:");
        d.setCod_emp(Integer.parseInt(leer.nextLine()));
        System.out.println("Ingrese el nombre del empleado:");
        d.setNombre_emp(leer.nextLine());
        System.out.println("Ingrese la edad del empleado:");
        d.setEdad(Integer.parseInt(leer.nextLine()));
        System.out.println("Ingrese la dirección del empleado:");
        d.setDireccion(leer.nextLine());
        System.out.println("¿Es:");
        System.out.println("1. Docente \t\t2. Administrador?");
        System.out.print("Su opción: ");
        d.setOpcion(Integer.parseInt(leer.nextLine()));
        
        int op = 0;
        if(d.getOpcion() == 1){
            System.out.println("1. Permanente \t\t2. Servicio");
            System.out.print("Su opción: ");
            op = Integer.parseInt(leer.nextLine());
        }
        System.out.println("Ingrese el salario base del empleado:");
        d.setSueldo_base(Double.parseDouble(leer.nextLine()));
        System.out.println("Ingrese la fecha de ingreso:");
        d.setFecha_ingreso(leer.nextLine());
        
        System.out.println("-------Área que pertenece-------");
        System.out.println("Ingrese el código del área:");
        d.setCod_a(Integer.parseInt(leer.nextLine()));
        System.out.println("Ingrese el nombre del área:");
        d.setNombre(leer.nextLine());
        System.out.println("Ingrese la cantidad de empleados que hay en el área:");
        d.setCant_emp(Integer.parseInt(leer.nextLine()));
        
        System.out.println("\n-------Edificio-------");
        System.out.println("Ingrese el número de edificio:");
        d.setNum_ed(Integer.parseInt(leer.nextLine()));
        System.out.println("Ingrese el nombre del edificio:");
        d.setNombre_ed(leer.nextLine());
        System.out.println("Ingrese la ubicación del edificio:");
        d.setUbicacion(leer.nextLine());
        System.out.println("Ingrese la cantidad de departamentos que alberga:");
        d.setCant_depa(Integer.parseInt(leer.nextLine()));
        System.out.println("Ingrese la cantidad de pisos que tiene el edificio:");
        d.setCant_pisos(Integer.parseInt(leer.nextLine()));
        
        System.out.println("");
        System.out.println("\n");
        String text = d.info();
        System.out.println(text);
        System.out.println("------------------");
        if(op == 1){
            System.out.println(d.desc_ISSS(d.getSueldo_base()));
            System.out.println(d.desc_afp(d.desc_ISSS(d.getSueldo_base())));
            System.out.println("Salario Final " + formato.format(d.desc_renta(d.desc_afp(d.desc_ISSS(d.getSueldo_base())))));
        }else if((op == 2) ||(d.getOpcion() == 2)){
            System.out.println("Salario Final: " + formato.format(d.desc_renta(d.getSueldo_base())));
        }
        
        
    }

}
