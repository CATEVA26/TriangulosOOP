package Excepciones;

import Logger.Logger;

public class TrianguloConLadoNegativoException extends Exception{
    public TrianguloConLadoNegativoException() {
        super("Un lado es negativo");
        Logger.longError("Un lado es negativo");
    }
}
