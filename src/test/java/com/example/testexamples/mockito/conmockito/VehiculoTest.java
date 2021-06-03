package com.example.testexamples.mockito.conmockito;

import com.example.testexamples.mockito.conmockito.Piloto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class VehiculoTest {

    @Test
    public void conductorEnProblemas() {
        Vehiculo vehiculoMock = mock(Vehiculo.class);

        when(vehiculoMock.pitar()).thenReturn(true);
        when(vehiculoMock.frenar()).thenReturn(true);

        Piloto piloto = new Piloto(vehiculoMock);

        boolean exito = piloto.frenarPacificamente(true);

        assertTrue(exito);
        verify(vehiculoMock, times(1)).pitar();
        verify(vehiculoMock, times(1)).frenar();
    }

    @Test
    public void conductorSinProblemas() {
        Vehiculo vehiculoMock = mock(Vehiculo.class);

        when(vehiculoMock.pitar()).thenReturn(true);
        when(vehiculoMock.frenar()).thenReturn(true);

        Piloto piloto = new Piloto(vehiculoMock);

        boolean exito = piloto.frenarPacificamente(false);

        assertTrue(exito);
        verify(vehiculoMock, times(0)).pitar();
        verify(vehiculoMock, times(1)).frenar();
    }

}