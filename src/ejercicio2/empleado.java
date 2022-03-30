
package ejercicio2;

import java.util.Scanner;

public class empleado extends area {
    private String nombre_emp, direccion, cargo_area, fecha_ingreso, tipo_emp;
    private int cod_emp, edad;
    private double sueldo_base;
    private String area;
    private int opcion;

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public String getTipo_emp() {
        return tipo_emp;
    }

    public void setTipo_emp(String tipo_emp) {
        this.tipo_emp = tipo_emp;
    }
    

    public empleado() {
        
    }

    public String getNombre_emp() {
        return nombre_emp;
    }

    public void setNombre_emp(String nombre_emp) {
        this.nombre_emp = nombre_emp;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCargo_area() {
        return cargo_area;
    }

    public void setCargo_area(String cargo_area) {
        this.cargo_area = cargo_area;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public int getCod_emp() {
        return cod_emp;
    }

    public void setCod_emp(int cod_emp) {
        this.cod_emp = cod_emp;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(double sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public String getArea() {
        String nombre_a = this.getNombre();
        return nombre_a;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
