package com.example.testexamples.mockito.sinmockito;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehiculoTest {

    @Test
    public void conductorEnProblemas() {
        VehiculoMock vehiculoMock = new VehiculoMock();
        Piloto piloto = new Piloto(vehiculoMock);

        boolean exito = piloto.frenarPacificamente(true);

        assertTrue(exito);
        assertEquals(1, vehiculoMock.getNumVecesFrenado());
        assertEquals(1, vehiculoMock.getNumVecesPito());

    }

    @Test
    public void conductorSinProblemas() {
        VehiculoMock vehiculoMock = new VehiculoMock();
        Piloto piloto = new Piloto(vehiculoMock);

        boolean exito = piloto.frenarPacificamente(false);

        assertTrue(exito);
        assertEquals(1, vehiculoMock.getNumVecesFrenado());
        assertEquals(0, vehiculoMock.getNumVecesPito());
    }

}