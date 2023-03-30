/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciogit;

/**
 *
 * @author Onna
 */
public class EjercicioGit {
static class Calculadora{

        public Calculadora() {
        }
        public float sumar(float num1, float num2){
            return num1+num2;
        }
        public float restar(float num1, float num2){
            return num1-num2;
        }
        public float dividir(float num1, float num2){
            return num1/num2;
        }
        public float multiplicar(float num1, float num2){
            return num1*num2;
        }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calc = new Calculadora();
        System.out.println("El resultado de multiplicar 80 por 3 es : "+calc.multiplicar(80, 3) );
        System.out.println("El resultado de sumar 180 más 150, y dividirlo por 3 es : "+calc.dividir(calc.sumar(150, 180),3) );
        System.out.println("El resultado de restar 90 y 50, y multiplicarlo por 15 es : "+calc.multiplicar(calc.restar(90, 50), 15) );
        System.out.println("El resultado de sumar 70 y 40 y multiplicarlo por 25 es : "+calc.multiplicar(calc.sumar(70,40), 25) );
    }
    
}
