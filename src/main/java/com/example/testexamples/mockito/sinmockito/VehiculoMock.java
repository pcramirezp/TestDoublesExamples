package com.example.testexamples.mockito.sinmockito;

public class VehiculoMock implements Vehiculo{
    private Integer numVecesPito = 0;
    private Integer numVecesFrenado = 0;

    @Override
    public boolean pitar() {
        numVecesPito++;
        return true;
    }

    @Override
    public boolean frenar() {
        numVecesFrenado++;
        return true;
    }

    public Integer getNumVecesPito() {
        return numVecesPito;
    }

    public void setNumVecesPito(Integer numVecesPito) {
        this.numVecesPito = numVecesPito;
    }

    public Integer getNumVecesFrenado() {
        return numVecesFrenado;
    }

    public void setNumVecesFrenado(Integer numVecesFrenado) {
        this.numVecesFrenado = numVecesFrenado;
    }
}
