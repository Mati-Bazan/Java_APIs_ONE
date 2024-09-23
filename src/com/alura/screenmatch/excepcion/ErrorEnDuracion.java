package com.alura.screenmatch.excepcion;

public class ErrorEnDuracion extends RuntimeException {
    private String mensaje;


    public ErrorEnDuracion(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
