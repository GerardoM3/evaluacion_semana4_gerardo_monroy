/*
Código de Gerardo Misael Monroy Moza
*/

package ejercicio1;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class salario_empleado extends horas_extras {
    private String nombre_empleado;
    private double  salario, renta = 0.1;

    public salario_empleado(String nombre_empleado, double salario) {
        this.nombre_empleado = nombre_empleado;
        this.salario = salario;
    }

    public double getRenta() {
        double renta;
        renta = this.salario * this.renta;
        return renta;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    

    public salario_empleado() {
    }
    
    public double salario_renta(){
        double resultado;
        resultado = this.getSalario() - this.getRenta();
        return resultado;
    }
    
    public double salarioFinal(){
        double resultado;
        resultado = this.salario_renta() + this.total_horas_extras();
        return resultado;
    }
    
    public String info(){
        NumberFormat formato = new DecimalFormat("#.##");
        String result = "_________________________________________________________________________";
        result += "\nNombre del empleado: " + this.getNombre_empleado();
        result += "\nSalario bruto (sin descuento alguno): $" + formato.format(this.getSalario());
        result += "\nSalario liquido (con descuento de la renta): $" + formato.format(this.salario_renta());
        result += "\nPago total por las horas extras: $" + formato.format(this.total_horas_extras());
        result += "\n" +this.total_horas_extras_text();
        result += "\nSalario final: $" + formato.format(this.salarioFinal());
        return result;
    }
}
