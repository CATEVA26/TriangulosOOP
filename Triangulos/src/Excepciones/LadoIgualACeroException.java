package Excepciones;

import Logger.Logger;

public class LadoIgualACeroException extends Exception {
    public LadoIgualACeroException() {
        super("un lado es igual a cero");
        Logger.longError("un lado es igual a cero");
    }
}
