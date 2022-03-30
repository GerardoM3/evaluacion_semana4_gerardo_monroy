package ejercicio2;

import java.util.Scanner;

public class area extends edificio{
    private int cod_a, cant_emp;
    private String nombre;
    private int num_edificio;
    
    

    public int getCod_a() {
        return cod_a;
    }

    public void setCod_a(int cod_a) {
        this.cod_a = cod_a;
    }

    public int getCant_emp() {
        return cant_emp;
    }

    public void setCant_emp(int cant_emp) {
        this.cant_emp = cant_emp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_edificio() {
        int n_ed = this.getNum_ed();
        return n_ed;
    }

    public void setNum_edificio(int num_edificio) {
        this.num_edificio = num_edificio;
    }

    public area() {
        
    }
}
