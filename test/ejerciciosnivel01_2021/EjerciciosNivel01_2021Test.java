/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosnivel01_2021;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author xp
 */
public class EjerciciosNivel01_2021Test {
    
    public EjerciciosNivel01_2021Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of maximo method, of class EjerciciosNivel01_2021.
     */
    @Test
    public void testMaximo() {
        System.out.println("maximo");
        int[] lista = null;
        EjerciciosNivel01_2021 instance = new EjerciciosNivel01_2021();
        int expResult = 0;
        int result = instance.maximo(lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esPalindromo method, of class EjerciciosNivel01_2021.
     */
    @Test
    public void testEsPalindromo() {
        System.out.println("esPalindromo");
        EjerciciosNivel01_2021 instance = new EjerciciosNivel01_2021();

        assertEquals(true , instance.esPalindromo("Acaso hubo buhos aca"));
        assertEquals(true , instance.esPalindromo("Aca"));
        assertEquals(false , instance.esPalindromo("feo cara culo"));
        assertEquals(false , instance.esPalindromo("ligar es agil"));
        assertEquals(true , instance.esPalindromo("Allí ves a Sevilla"));
        assertEquals(true , instance.esPalindromo("Adivina ya te opina, ya ni miles origina, ya ni cetro me domina, ya ni monarcas, a repaso ni mulato carreta, acaso nicotina, ya ni cita vecino, anima cocina, pedazo gallina, cedazo terso nos retoza de canilla goza, de pánico camina, ónice vaticina, ya ni tocino saca, a terracota luminosa pera, sacra nómina y ánimo de mortecina, ya ni giros elimina, ya ni poeta, ya ni vida"));
        
    }

    /**
     * Test of esIsograma method, of class EjerciciosNivel01_2021.
     */
    @Test
    public void testEsIsograma() {
        System.out.println("esIsograma");
        EjerciciosNivel01_2021 instance = new EjerciciosNivel01_2021();

        assertEquals(true, instance.esIsograma("murcielago"));
        assertEquals(false, instance.esIsograma("cocreta"));
        assertEquals(false, instance.esIsograma("casa"));
        assertEquals(false, instance.esIsograma("supercalifragilisticoespialidoso"));
        assertEquals(false, instance.esIsograma("Cocreta"));
        assertEquals(false, instance.esIsograma("isódroma"));
        assertEquals(true, instance.esIsograma("pita"));
        assertEquals(false, instance.esIsograma("pájaro"));
        assertEquals(true, instance.esIsograma("MURCIELAGO"));
        assertEquals(false, instance.esIsograma("COCRETA"));
        assertEquals(true, instance.esIsograma("CETYS"));
        assertEquals(true, instance.esIsograma("UFV"));
        
        
        

    }

    /**
     * Test of main method, of class EjerciciosNivel01_2021.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        EjerciciosNivel01_2021.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    
}
