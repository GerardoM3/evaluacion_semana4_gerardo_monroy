
package ejercicio1;

public class horas_extras {
    
    private double pago_hora;
    private int horas_trabajadas_mes;

    public horas_extras() {
    }

    public double getPago_hora() {
        return pago_hora;
    }

    public void setPago_hora(double pago_hora) {
        this.pago_hora = pago_hora;
    }

    public int getHoras_trabajadas_mes() {
        return horas_trabajadas_mes;
    }

    public void setHoras_trabajadas_mes(int horas_trabajadas_mes) {
        this.horas_trabajadas_mes = horas_trabajadas_mes;
    }
    
    public double total_horas_extras(){
        double salario_horas_extras = 0.0;
        if(this.getHoras_trabajadas_mes() < 40){
            salario_horas_extras = this.getHoras_trabajadas_mes() * this.getPago_hora();
        }else if(this.getHoras_trabajadas_mes() > 40 && this.getHoras_trabajadas_mes() <= 48){
            double horas_extras = this.getHoras_trabajadas_mes() - 40;
            salario_horas_extras = (40 * this.getPago_hora()) + ((horas_extras * this.getPago_hora()) * 2);
        }else if(this.getHoras_trabajadas_mes() > 48){
            double horas_extras = this.getHoras_trabajadas_mes() - 48;
            salario_horas_extras = (40 *this.getPago_hora()) + ((8 * this.getPago_hora()) * 2) + ((horas_extras * this.getPago_hora()) * 3);
        }
        return salario_horas_extras;
    }
    
    public String total_horas_extras_text(){
        String Texto = "";
        if(this.getHoras_trabajadas_mes() < 40){
            Texto = "El empleado no ha realizado horas extras en el mes. No se paga extra.";
        }else if(this.getHoras_trabajadas_mes() > 40 && this.getHoras_trabajadas_mes() <= 48){
            Texto = "El empleado ha realizado horas extras en el mes. Por lo cual se le paga el doble de la hora nomral";
        }else if(this.getHoras_trabajadas_mes() > 48){
            Texto = "El empleado ha realizado horas extras en el mes. Ha acumulado más de 48 horas extras en el mes.";
            Texto += "\nSe le paga el doble por las 8 horas extras, y el triple el que se excendan las 8 horas extras.";
        }
        return Texto;
    }
    
}
