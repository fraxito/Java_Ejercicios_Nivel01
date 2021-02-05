/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosnivel01_2021;

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
        int auxiliar = lista[0];  //el máximo va a ser el primer elemento del array
        for (int i = 0; i < lista.length; i++) {
            if (auxiliar < lista[i]) {
                auxiliar = lista[i];
            }
        }
        return auxiliar;
    }

    /**
     * método para quitar los espacios en blanco a un String
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
        // pájaro
        // pajaro
        //cadena = cadena.toLowerCase();
        cadena = cadena.replace('á', 'a');
        cadena = cadena.replace('é', 'e');
        cadena = cadena.replace('í', 'i');
        cadena = cadena.replace('ó', 'o');
        cadena = cadena.replace('ú', 'u');
        cadena = cadena.replace('ü', 'u');
        
        cadena = cadena.replace('Á', 'A');
        cadena = cadena.replace('É', 'E');
        cadena = cadena.replace('Í', 'I');
        cadena = cadena.replace('Ó', 'O');
        cadena = cadena.replace('Ú', 'U');
        cadena = cadena.replace('Ü', 'U');       
        
        
        return cadena;
    }
    
    public String quitaAcentosV2(String cadena){
        String auxiliar = "";
        for (int i=0; i < cadena.length(); i++){
            if (cadena.charAt(i) == 'á') { auxiliar = auxiliar + 'a'; }
            else if (cadena.charAt(i) == 'é') { auxiliar = auxiliar + 'e'; }
            else if (cadena.charAt(i) == 'í') { auxiliar = auxiliar + 'i'; }
            else if (cadena.charAt(i) == 'ó') { auxiliar = auxiliar + 'o'; }
            else if (cadena.charAt(i) == 'ú') { auxiliar = auxiliar + 'u'; }
            else if (cadena.charAt(i) == 'ü') { auxiliar = auxiliar + 'u'; }
            
            else if (cadena.charAt(i) == 'Á') { auxiliar = auxiliar + 'A'; }
            else if (cadena.charAt(i) == 'É') { auxiliar = auxiliar + 'E'; }
            else if (cadena.charAt(i) == 'Í') { auxiliar = auxiliar + 'I'; }
            else if (cadena.charAt(i) == 'Ó') { auxiliar = auxiliar + 'O'; }
            else if (cadena.charAt(i) == 'Ú') { auxiliar = auxiliar + 'U'; }
            else if (cadena.charAt(i) == 'Ü') { auxiliar = auxiliar + 'u'; }
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
        
        //2º pasamos a minúsculas toda la frase
        auxiliar2 = auxiliar2.toLowerCase();
        
        //3º voy a usar el método de los dos índices
        int indiceIzquierdo = 0; 
        int indiceDerecho = auxiliar2.length()-1;
        
        while (auxiliar2.charAt(indiceIzquierdo) == auxiliar2.charAt(indiceDerecho) 
                && indiceIzquierdo <= indiceDerecho){
            indiceIzquierdo++;
            indiceDerecho--;
        }
        if (indiceIzquierdo < indiceDerecho){ //se ha salido antes de llegar al medio, luego no es palíndromo
            return false; //no son palíndromos
        }
        else{
            return true; //sí que es palíndromo porque los indices se han cruzado
        }
        
    }
    
    public boolean esIsograma( String palabra){
        //este método devuelve true si la palabra no tiene
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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosNivel01_2021 ejercicio = new EjerciciosNivel01_2021();
        System.out.println("palíndromo: " + ejercicio.esPalindromo("Acaso hubo buhos aca"));
        System.out.println("palíndromo: " + ejercicio.esPalindromo("estonoes"));
        System.out.println("el máximo es " + ejercicio.maximo(ejercicio.listaNumeros));
        

        System.out.println("la palabra murcielago " + ejercicio.esIsograma("murcielago"));
        System.out.println("la palabra careta " + ejercicio.esIsograma("careta"));
      
    }

}
