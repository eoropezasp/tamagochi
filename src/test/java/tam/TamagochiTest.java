package tam;

import org.junit.Assert;
import org.junit.Test;

public class TamagochiTest {
    @Test
    public void testQuePruebaQuePuedoCrearUnTama(){

        Tamagochi tama = new Tamagochi();
        Assert.assertNotNull(tama);
    }


    @Test
    public void testQuePruebaQuePuedoCrearUnTamaConNombre(){
        //pasos para resolverlos test
        // 1. declaramos los objetos y atributos necesarios
        // 2. Ejecutamos el motodo a probar (ORIGINAL)
        // 3. Validamos mediante Assert la prueba

        Tamagochi tama = new Tamagochi("cris");

        String obtenido = tama.getNombre();

        String esperado = "cris";
        Assert.assertEquals(obtenido, esperado);
    }


    @Test
    public void testQuePruebaQuePuedoCrearDosTamasConNombre(){
        Tamagochi tama1 = new Tamagochi("cris");
        Tamagochi tama2 = new Tamagochi("cleo");

        String obtenido1 = tama1.getNombre();
        String obtenido2 = tama2.getNombre();

        String esperado1 = "cris";
        String esperado2 = "cleo";


        Assert.assertEquals(obtenido1, esperado1);
        Assert.assertEquals(obtenido2, esperado2);
    }

}
