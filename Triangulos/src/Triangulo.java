import java.lang.instrument.ClassDefinition;

public  class Triangulo implements Calculable{
    private double lados[];

    public Triangulo(double l1, double l2, double l3) {
        this.lados = new double[3];
        lados[0] = l1;
        lados[1] = l2;
        lados[2] = l3;
        System.out.println(verificarTriangulo());
        try {
            esTrianguloValido(l1,l2,l3);
            tieneLadoNegativo();
            tieneLadoIgualACero();
        } catch (NoEsTrianguloValidoException e) {
            throw new RuntimeException(e);
        } catch (LadoIgualACeroException e) {
            throw new RuntimeException(e);
        } catch (TrianguloConLadoNegativoException e) {
            throw new RuntimeException(e);
        }
    }

    private void tieneLadoIgualACero() throws LadoIgualACeroException {
        //TODO: Verificar el metodo
        for (Double lado:lados
             ) {
            if (lado==0)
                throw new LadoIgualACeroException();
        }
    }

    private void tieneLadoNegativo() throws TrianguloConLadoNegativoException {
        for (Double lado:lados
             ) {
            if (lado<0)
                throw new TrianguloConLadoNegativoException();
        }

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
    public void esTrianguloValido(double lado1, double lado2, double lado3) throws NoEsTrianguloValidoException{
        // Para formar un triángulo válido, la suma de las longitudes de cualesquiera dos lados debe ser mayor que la longitud del tercer lado.
        if((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)){

        }else {
            throw new NoEsTrianguloValidoException();
        }
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
