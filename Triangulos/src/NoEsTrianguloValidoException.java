public class NoEsTrianguloValidoException extends Exception {
    public NoEsTrianguloValidoException(String message) {
        super("Uno de los lados no permite crear un triangulo");
    }
}
