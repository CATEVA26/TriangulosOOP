import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Triangulo trianguloIsoceles = new Triangulo(5,5,8);
        Triangulo trianguloEquilatero = new Triangulo(3.5,3.5,3.5);
        Triangulo trianguloEscaleno =  new Triangulo(2.5,3.2,4.1);

        System.out.println(trianguloIsoceles.calcularArea());
        System.out.println(trianguloEquilatero.calcularArea());
        System.out.println(trianguloEscaleno.calcularArea());




    }
}
