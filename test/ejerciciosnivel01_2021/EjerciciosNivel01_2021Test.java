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
//    @Test
//    public void testMaximo() {
//        System.out.println("maximo");
//        int[] lista = null;
//        EjerciciosNivel01_2021 instance = new EjerciciosNivel01_2021();
//        int expResult = 0;
//        int result = instance.maximo(lista);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

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
        assertEquals(true , instance.esPalindromo("All� ves a Sevilla"));
        assertEquals(true , instance.esPalindromo("Adivina ya te opina, ya ni miles origina, ya ni cetro me domina, ya ni monarcas, a repaso ni mulato carreta, acaso nicotina, ya ni cita vecino, anima cocina, pedazo gallina, cedazo terso nos retoza de canilla goza, de p�nico camina, �nice vaticina, ya ni tocino saca, a terracota luminosa pera, sacra n�mina y �nimo de mortecina, ya ni giros elimina, ya ni poeta, ya ni vida"));
        
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
        assertEquals(false, instance.esIsograma("is�droma"));
        assertEquals(true, instance.esIsograma("pita"));
        assertEquals(false, instance.esIsograma("p�jaro"));
        assertEquals(true, instance.esIsograma("MURCIELAGO"));
        assertEquals(false, instance.esIsograma("COCRETA"));
        assertEquals(true, instance.esIsograma("CETYS"));
        assertEquals(true, instance.esIsograma("UFV"));
        
        
        

    }



    /**
     * Test of quitaAcentos method, of class EjerciciosNivel01_2021.
     * S�lo quita los acentos, no cambia a may�sculas
     */
    @Test
    public void testQuitaAcentos() {
        System.out.println("quitaAcentos");
        EjerciciosNivel01_2021 instance = new EjerciciosNivel01_2021();

        assertEquals("pajaro", instance.quitaAcentos("p�jaro"));
        assertEquals("Andale", instance.quitaAcentos("�ndale"));
        assertEquals("Cigue�a", instance.quitaAcentos("Cig�e�a"));
        assertEquals("perro", instance.quitaAcentos("perro"));
        assertEquals("pajaro", instance.quitaAcentos("p�j�r�"));
        assertEquals("pristino", instance.quitaAcentos("pr�stino"));
        assertEquals("murcielago", instance.quitaAcentos("murci�lago"));
        assertEquals("atun", instance.quitaAcentos("at�n"));
        assertEquals("camion", instance.quitaAcentos("cami�n"));   
        assertEquals("PAJARO", instance.quitaAcentos("P�J�R�"));
        assertEquals("PRISTINO", instance.quitaAcentos("PR�STINO"));
        assertEquals("MURCIELAGO", instance.quitaAcentos("MURCI�LAGO"));
        assertEquals("ATUN", instance.quitaAcentos("AT�N"));
        assertEquals("CAMION", instance.quitaAcentos("CAMI�N"));      

    }

    /**
     * Test of quitaAcentosV2 method, of class EjerciciosNivel01_2021.
     */
    @Test
    public void testQuitaAcentosV2() {
        System.out.println("quitaAcentosV2");
        EjerciciosNivel01_2021 instance = new EjerciciosNivel01_2021();

        assertEquals("pajaro", instance.quitaAcentosV2("p�jaro"));
        assertEquals("Andale", instance.quitaAcentosV2("�ndale"));
        assertEquals("Cigue�a", instance.quitaAcentosV2("Cig�e�a"));
        assertEquals("perro", instance.quitaAcentosV2("perro"));
        assertEquals("pajaro", instance.quitaAcentosV2("p�j�r�"));
        assertEquals("pristino", instance.quitaAcentosV2("pr�stino"));
        assertEquals("murcielago", instance.quitaAcentosV2("murci�lago"));
        assertEquals("atun", instance.quitaAcentosV2("at�n"));
        assertEquals("camion", instance.quitaAcentosV2("cami�n"));   
        assertEquals("PAJARO", instance.quitaAcentosV2("P�J�R�"));
        assertEquals("PRISTINO", instance.quitaAcentosV2("PR�STINO"));
        assertEquals("MURCIELAGO", instance.quitaAcentosV2("MURCI�LAGO"));
        assertEquals("ATUN", instance.quitaAcentosV2("AT�N"));
        assertEquals("CAMION", instance.quitaAcentosV2("CAMI�N"));  
    }

 


    
}
