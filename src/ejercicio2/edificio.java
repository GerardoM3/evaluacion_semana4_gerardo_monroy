
package ejercicio2;

import java.util.Scanner;

public class edificio{
    private String nombre_ed, ubicacion;
    private int cant_depa, cant_pisos, num_ed;

    

    public edificio() {
    }

    public String getNombre_ed() {
        return nombre_ed;
    }

    public void setNombre_ed(String nombre_ed) {
        this.nombre_ed = nombre_ed;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCant_depa() {
        return cant_depa;
    }

    public void setCant_depa(int cant_depa) {
        this.cant_depa = cant_depa;
    }

    public int getCant_pisos() {
        return cant_pisos;
    }

    public void setCant_pisos(int cant_pisos) {
        this.cant_pisos = cant_pisos;
    }

    
    public int getNum_ed(){
        return num_ed;
    }

    public void setNum_ed(int num_ed) {
        this.num_ed = num_ed;
    }
    
}
