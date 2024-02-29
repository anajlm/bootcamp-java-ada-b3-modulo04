package br.ada.aula02.media;

import br.ada.aula02.media.MediaNotas;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MediaNotasTest {

    @Test
    public void deveRetornarMedia5(){
        MediaNotas mediaNotas = new MediaNotas();
        int media = mediaNotas.calculaMediaNotas(6, 4, 5);
        assertEquals(media, 5);
    }

    @Test
    public void deveRetornarMedia7(){
        MediaNotas mediaNotas = new MediaNotas();
        int media = mediaNotas.calculaMediaNotas(7, 13, 1);
        assertEquals(media, 7);
    }

}