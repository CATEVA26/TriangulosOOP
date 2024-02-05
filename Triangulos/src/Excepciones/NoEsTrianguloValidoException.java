package Excepciones;

import Logger.Logger;

public class NoEsTrianguloValidoException extends Exception {
    public NoEsTrianguloValidoException() {
        super("Uno de los lados no permite crear un triangulo");
        Logger.longError("Uno de los lados no permite crear un triangulo");
    }
}
