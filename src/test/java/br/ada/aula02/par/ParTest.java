package br.ada.aula02.par;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParTest {

    @Test
    public void retornaNumeroPar(){
        Par par = new Par();
        boolean numeroPar = par.par(6);
        assertTrue(numeroPar);
    }

    @Test
    public void retornaNumeroNaoPar(){
        Par par = new Par();
        boolean numeroPar = par.par(9);
        assertFalse(numeroPar);
    }

}