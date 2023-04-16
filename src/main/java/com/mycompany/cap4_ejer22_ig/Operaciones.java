
package com.mycompany.cap4_ejer22_ig;


public class Operaciones {
    int num1; float num2;
    String mensaje;
    public Operaciones(){
    }
    public float setSalario_mensual(int numero_de_horas_trabajadas, float salario_basico_por_hora){
        this.num1 = numero_de_horas_trabajadas;
        this.num2 = salario_basico_por_hora;
        return num1 * num2;
    }
    public String setTexto(String nombre, float salario_mensual){
        this.num2 = salario_mensual;
        if(num2> 450000){
            mensaje = (String) nombre + "\n" + "su salario es de:\n" + num2;
        }else{
            mensaje = nombre;
        }
        return mensaje;
    }
}
