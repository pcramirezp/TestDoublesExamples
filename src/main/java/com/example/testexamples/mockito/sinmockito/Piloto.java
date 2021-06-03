package com.example.testexamples.mockito.sinmockito;

public class Piloto {
    private Vehiculo vehiculo;

    public Piloto(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public boolean frenarPacificamente(boolean isOfendido) {
        if (isOfendido) {
            insultar();
            return this.vehiculo.frenar() && this.vehiculo.pitar();
        }
        return this.vehiculo.frenar();
    }

    public void insultar() {
        System.out.println("!@@@#$$$ mensaje censurado!");
    }
}
