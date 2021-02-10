/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosnivel01_2021;

import java.util.Arrays;

/**
 *
 * @author xp
 */
public class EjerciciosNivel01_2021 {

    //declaro un array de integers para hacer pruebas
    int[] listaNumeros = {3, 31, 200, 20, 5, 99};
    char caracter = '2';
    String miString = "hola";

    public int maximo(int[] lista) {
        int auxiliar = lista[0];  //el m�ximo va a ser el primer elemento del array
        for (int i = 0; i < lista.length; i++) {
            if (auxiliar < lista[i]) {
                auxiliar = lista[i];
            }
        }
        return auxiliar;
    }

    /**
     * m�todo para quitar los espacios en blanco a un String
     */
    private String quitaEspaciosEnBlanco(String cadena) {
        // Acaso hubo buhos aca
        // Acasohubobuhosaca
        String auxiliar = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ' && cadena.charAt(i) != ',') {
                auxiliar = auxiliar + cadena.charAt(i);
            }
        }
        return auxiliar;
    }
    
    /**
     * 
     * @param cadena el string a limpiar
     * @return  el string sin acentos
     */
    public String quitaAcentos(String cadena){
        // p�jaro
        // pajaro
        //cadena = cadena.toLowerCase();
        cadena = cadena.replace('�', 'a');
        cadena = cadena.replace('�', 'e');
        cadena = cadena.replace('�', 'i');
        cadena = cadena.replace('�', 'o');
        cadena = cadena.replace('�', 'u');
        cadena = cadena.replace('�', 'u');
        
        cadena = cadena.replace('�', 'A');
        cadena = cadena.replace('�', 'E');
        cadena = cadena.replace('�', 'I');
        cadena = cadena.replace('�', 'O');
        cadena = cadena.replace('�', 'U');
        cadena = cadena.replace('�', 'U');       
        
        
        return cadena;
    }
    
    public String quitaAcentosV2(String cadena){
        String auxiliar = "";
        for (int i=0; i < cadena.length(); i++){
            if (cadena.charAt(i) == '�') { auxiliar = auxiliar + 'a'; }
            else if (cadena.charAt(i) == '�') { auxiliar = auxiliar + 'e'; }
            else if (cadena.charAt(i) == '�') { auxiliar = auxiliar + 'i'; }
            else if (cadena.charAt(i) == '�') { auxiliar = auxiliar + 'o'; }
            else if (cadena.charAt(i) == '�') { auxiliar = auxiliar + 'u'; }
            else if (cadena.charAt(i) == '�') { auxiliar = auxiliar + 'u'; }
            
            else if (cadena.charAt(i) == '�') { auxiliar = auxiliar + 'A'; }
            else if (cadena.charAt(i) == '�') { auxiliar = auxiliar + 'E'; }
            else if (cadena.charAt(i) == '�') { auxiliar = auxiliar + 'I'; }
            else if (cadena.charAt(i) == '�') { auxiliar = auxiliar + 'O'; }
            else if (cadena.charAt(i) == '�') { auxiliar = auxiliar + 'U'; }
            else if (cadena.charAt(i) == '�') { auxiliar = auxiliar + 'u'; }
            else {
                auxiliar = auxiliar + cadena.charAt(i);
            }
        }
        return auxiliar;     
    }

    
    
    public boolean esPalindromo(String frase) {
        //este programa devuelve verdadero si la frase tiene los mismos caracteres
        //de izquierda a derecha y de derecha a izquierda

        // Acaso hubo buhos aca
        // Acasohubobuhosaca
        frase = quitaAcentos(frase);
        //primera fase: quitar los espacios en blanco de la cadena
        String auxiliar2 = quitaEspaciosEnBlanco(frase);
        
        //2� pasamos a min�sculas toda la frase
        auxiliar2 = auxiliar2.toLowerCase();
        
        //3� voy a usar el m�todo de los dos �ndices
        int indiceIzquierdo = 0; 
        int indiceDerecho = auxiliar2.length()-1;
        
        while (auxiliar2.charAt(indiceIzquierdo) == auxiliar2.charAt(indiceDerecho) 
                && indiceIzquierdo <= indiceDerecho){
            indiceIzquierdo++;
            indiceDerecho--;
        }
        if (indiceIzquierdo < indiceDerecho){ //se ha salido antes de llegar al medio, luego no es pal�ndromo
            return false; //no son pal�ndromos
        }
        else{
            return true; //s� que es pal�ndromo porque los indices se han cruzado
        }
        
    }
    
    public boolean esIsograma( String palabra){
        //este m�todo devuelve true si la palabra no tiene
        //ninguna letra repetida
        //y false si se repite alguna
        palabra = palabra.toUpperCase();
        palabra = quitaAcentos(palabra);
        for (int i=0; i < palabra.length(); i++){
            for (int j=i+1; j<palabra.length(); j++){
                if (palabra.charAt(i) == palabra.charAt(j)){
                    return false;
                }
            }
        }
        //si ha recorrido los dos bucles sin salir en el return false, 
        //es porque la palabra no tiene letras repetidas    
        return true;   
    }
    
    /**
     * este m�todo recibe un string formado por varias palabras
     * por ejemplo "Alta Velocidad Espa�ola"
     * y devuelve un array de Strings por ejemplo 
     * {"Alta", "Velocidad", "Espa�ola"}
     * ESTA VERSI�N S�LO SE USAR� EN LAS PR�CTICAS
     * NO EN LA VIDA REAL
    */
    public String[] divideFrase( String frase){
        frase = frase + " "; //m�todo Paco, a�ade un espacio en blanco al final
                             // para que funcione el for con todas las palabras
        String auxiliar = "";
        //1� averiguo cu�ntos espacios en blanco tiene la frase
        int numeroEspaciosEnBlanco = 0;
        for (int i=0; i < frase.length(); i++){
           if (frase.charAt(i) == ' '){   
               numeroEspaciosEnBlanco++;
           }   
        }
         
        String[] dividido = new String[numeroEspaciosEnBlanco];
        int contadorPalabra = 0;
        for (int i=0; i< frase.length(); i++){
            if (frase.charAt(i) == ' '){
                dividido[contadorPalabra] = auxiliar;
                auxiliar = "";
                contadorPalabra++;
            }
            else{
                auxiliar = auxiliar + frase.charAt(i);
            }
        }
        
        return dividido;
    }
    
    
    /**
     * recibe una frase y devuelve su acr�nimo (la primera letra
     * de cada palabra que forma la frase)
     * @param frase
     * @return 
     */
    public String acronimo (String frase){
        frase = frase.toUpperCase();
        //String [] palabras = divideFrase(frase);
        String [] palabras = frase.split(" ");
        String auxiliar = "";
        for (int i=0; i < palabras.length; i++){
            if(palabras[i].length() > 0){ //para evitar el problema de las palabras vac�as
                if (!(palabras[i].equals("Y") || palabras[i].equals("E")  || palabras[i].equals("DE") || palabras[i].equals("LA") || palabras[i].equals("LAS"))){  
                    auxiliar = auxiliar + palabras[i].charAt(0);
                }
            }
        }
        return auxiliar;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosNivel01_2021 ejercicio = new EjerciciosNivel01_2021();
        System.out.println("pal�ndromo: " + ejercicio.esPalindromo("Acaso hubo buhos aca"));
        System.out.println("pal�ndromo: " + ejercicio.esPalindromo("estonoes"));
        System.out.println("el m�ximo es " + ejercicio.maximo(ejercicio.listaNumeros));
        

        System.out.println("la palabra murcielago " + ejercicio.esIsograma("murcielago"));
        System.out.println("la palabra careta " + ejercicio.esIsograma("careta"));
      
        System.out.println( Arrays.toString( ejercicio.divideFrase("Alta Velocidad Espa�ola")));
    }

}
