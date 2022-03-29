/*
Código de Gerardo Misael Monroy Moza
*/

package ejercicio1;

public class salario_empleado extends horas_extras {
    private String nombre_empleado;
    private double  salario, renta = 0.1;

    public salario_empleado(String nombre_empleado, double salario) {
        this.nombre_empleado = nombre_empleado;
        this.salario = salario;
    }

    public double getRenta(double salario) {
        renta = salario * renta;
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
        resultado = this.getSalario() - this.getRenta(this.getSalario());
        return resultado;
    }
    
    public double salarioFinal(){
        double resultado;
        resultado = this.salario_renta() + this.total_horas_extras();
        return resultado;
    }
    
}
