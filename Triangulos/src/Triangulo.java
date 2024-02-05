import java.lang.instrument.ClassDefinition;

public  class Triangulo implements Calculable{
    private double lados[];

    public Triangulo(double l1, double l2, double l3) {
        this.lados = new double[3];
        lados[0] = l1;
        lados[1] = l2;
        lados[2] = l3;
        System.out.println(verificarTriangulo());
    }


    public String verificarTriangulo(){
        String tipoTriangulo = "";
        if (lados[0] == lados[1] && lados[1] == lados[2]) {
            tipoTriangulo = "EQUILATERO";
        } else if (lados[0] == lados[1] || lados[0] == lados[2] || lados[1] == lados[2]) {
        tipoTriangulo = "ISOCELES";
        } else {
           tipoTriangulo = "ESCALENO";
        }
        return tipoTriangulo;
    }


    @Override
    public double calcularArea() {
        double semiperimetro = calcularSemiperimetro();
        return Math.sqrt(semiperimetro * (semiperimetro - lados[0]) * (semiperimetro - lados[1]) * (semiperimetro - lados[2]));
    }

    @Override
    public double calcularSemiperimetro() {
        double sumaLados = 0;
        for (int i = 0; i <lados.length ; i++) {
            sumaLados += lados[i];
        }
        return sumaLados/2;
    }

}
