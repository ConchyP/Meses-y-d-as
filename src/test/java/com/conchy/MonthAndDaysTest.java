package com.conchy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class MonthAndDaysTest {

    @Test
    public void testEnero() {
        assertEquals("El mes de Enero tiene 31 días.", MonthAndDays.getMonth(1));
    }

    @Test
    public void testFebrero() {
        assertEquals("El mes de Febrero tiene 28 días.", MonthAndDays.getMonth(2));
    }

    @Test
    public void testMarzo() {
        assertEquals("El mes de Marzo tiene 31 días.", MonthAndDays.getMonth(3));
    }

    @Test
    public void testAbril() {
        assertEquals("El mes de Abril tiene 30 días.", MonthAndDays.getMonth(4));
    }

    @Test
    public void testMayo() {
        assertEquals("El mes de Mayo tiene 31 días.", MonthAndDays.getMonth(5));
    }

    @Test
    public void testJunio() {
        assertEquals("El mes de Junio tiene 30 días.", MonthAndDays.getMonth(6));
    }

    @Test
    public void testJulio() {
        assertEquals("El mes de Julio tiene 31 días.", MonthAndDays.getMonth(7));
    }

    @Test
    public void testAgosto() {
        assertEquals("El mes de Agosto tiene 31 días.", MonthAndDays.getMonth(8));
    }

    @Test
    public void testSeptiembre() {
        assertEquals("El mes de Septiembre tiene 30 días.", MonthAndDays.getMonth(9));
    }

    @Test
    public void testOctubre() {
        assertEquals("El mes de Octubre tiene 31 días.", MonthAndDays.getMonth(10));
    }

    @Test
    public void testNoviembre() {
        assertEquals("El mes de Noviembre tiene 30 días.", MonthAndDays.getMonth(11));
    }

    @Test
    public void testDiciembre() {
        assertEquals("El mes de Diciembre tiene 31 días.", MonthAndDays.getMonth(12));
    }

    @Test
    public void testMesInvalido() {
        assertEquals("Mes inválido", MonthAndDays.getMonth(13));
        assertEquals("Mes inválido", MonthAndDays.getMonth(0));
        assertEquals("Mes inválido", MonthAndDays.getMonth(-1));
    }
}
