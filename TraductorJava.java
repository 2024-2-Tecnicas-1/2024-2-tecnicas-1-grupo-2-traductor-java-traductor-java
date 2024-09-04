package com.mycompany.traductorjava;

import java.util.HashMap;
import java.util.Scanner;

public class TraductorJava {

    public static HashMap<String, String> obtenerTextos(String idioma){
        HashMap<String, String> mensajesESP = new HashMap<>();
        mensajesESP.put("Saludo", "Hola");
        mensajesESP.put("PreguntaNombre", "Cómo es tu nombre?");
        mensajesESP.put("PreguntaEdad", "Cuál es tu edad?");
        mensajesESP.put("muestraNombre", "Tu nombre es ");
        mensajesESP.put("muestraEdad", "Tu edad es ");
        
        HashMap<String, String> mensajesENG = new HashMap<>();
        mensajesENG.put("Saludo", "Hi");
        mensajesENG.put("PreguntaNombre", "What is your name?");
        mensajesENG.put("PreguntaEdad", "How old are you?");
        mensajesENG.put("muestraNombre", "Your name is ");
        mensajesENG.put("muestraEdad", "Your age is ");
        
        switch (idioma) {
            case "Espanol":
                return mensajesESP;
            case "English":
                return mensajesENG;
        }
        return null;
    }
   
       
    public static String[] numerosESP = {
        "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete",
        "ocho", "nueve", "diez", "once", "doce", "trece", "catorce",
        "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve",
        "veinte", "veintiuno", "veintidós", "veintitrés", "veinticuatro",
        "veinticinco", "veintiséis", "veintisiete", "veintiocho",
        "veintinueve", "treinta", "treinta y uno", "treinta y dos",
        "treinta y tres", "treinta y cuatro", "treinta y cinco",
        "treinta y seis", "treinta y siete", "treinta y ocho",
        "treinta y nueve", "cuarenta", "cuarenta y uno", "cuarenta y dos",
        "cuarenta y tres", "cuarenta y cuatro", "cuarenta y cinco",
        "cuarenta y seis", "cuarenta y siete", "cuarenta y ocho",
        "cuarenta y nueve", "cincuenta", "cincuenta y uno",
        "cincuenta y dos", "cincuenta y tres", "cincuenta y cuatro",
        "cincuenta y cinco", "cincuenta y seis", "cincuenta y siete",
        "cincuenta y ocho", "cincuenta y nueve", "sesenta",
        "sesenta y uno", "sesenta y dos", "sesenta y tres",
        "sesenta y cuatro", "sesenta y cinco", "sesenta y seis",
        "sesenta y siete", "sesenta y ocho", "sesenta y nueve",
        "setenta", "setenta y uno", "setenta y dos", "setenta y tres",
        "setenta y cuatro", "setenta y cinco", "setenta y seis",
        "setenta y siete", "setenta y ocho", "setenta y nueve",
        "ochenta", "ochenta y uno", "ochenta y dos", "ochenta y tres",
        "ochenta y cuatro", "ochenta y cinco", "ochenta y seis",
        "ochenta y siete", "ochenta y ocho", "ochenta y nueve",
        "noventa", "noventa y uno", "noventa y dos", "noventa y tres",
        "noventa y cuatro", "noventa y cinco", "noventa y seis",
        "noventa y siete", "noventa y ocho", "noventa y nueve",
        "cien"
    };

    public static String[] numerosENG = {
        "zero", "one", "two", "three", "four", "five", "six", "seven",
        "eight", "nine", "ten", "eleven", "twelve", "thirteen",
        "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
        "nineteen", "twenty", "twenty-one", "twenty-two", "twenty-three",
        "twenty-four", "twenty-five", "twenty-six", "twenty-seven",
        "twenty-eight", "twenty-nine", "thirty", "thirty-one",
        "thirty-two", "thirty-three", "thirty-four", "thirty-five",
        "thirty-six", "thirty-seven", "thirty-eight", "thirty-nine",
        "forty", "forty-one", "forty-two", "forty-three", "forty-four",
        "forty-five", "forty-six", "forty-seven", "forty-eight",
        "forty-nine", "fifty", "fifty-one", "fifty-two", "fifty-three",
        "fifty-four", "fifty-five", "fifty-six", "fifty-seven",
        "fifty-eight", "fifty-nine", "sixty", "sixty-one",
        "sixty-two", "sixty-three", "sixty-four", "sixty-five",
        "sixty-six", "sixty-seven", "sixty-eight", "sixty-nine",
        "seventy", "seventy-one", "seventy-two", "seventy-three",
        "seventy-four", "seventy-five", "seventy-six", "seventy-seven",
        "seventy-eight", "seventy-nine", "eighty", "eighty-one",
        "eighty-two", "eighty-three", "eighty-four", "eighty-five",
        "eighty-six", "eighty-seven", "eighty-eight", "eighty-nine",
        "ninety", "ninety-one", "ninety-two", "ninety-three",
        "ninety-four", "ninety-five", "ninety-six", "ninety-seven",
        "ninety-eight", "ninety-nine", "one hundred"
    };

    
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Selecciona el idioma/select the language");
        String idioma = scan.next();

       
        HashMap<String, String> textos = obtenerTextos(idioma);
        System.out.println(textos.get("Saludo"));
        System.out.println(textos.get("PreguntaNombre"));
        String nombre = scan.next();
        System.out.println(textos.get("PreguntaEdad"));
        int edad = scan.nextInt();
        System.out.println(textos.get("muestraNombre") + nombre);
        System.out.println(textos.get("muestraEdad") + edad);

        
        
            
        System.out.println("Primer numero");
        int numero1 = scan.nextInt();
        System.out.println("Segundo numero");
        int numero2 = scan.nextInt();

        if ((numero1 < 0 || numero1 > 100) || (numero2 < 0 || numero2 > 100)) {
            System.out.println("Número inválido");
        } else {
            int suma = numero1 + numero2;

            String numero1PalabraESP = numerosESP[numero1];
            String numero2PalabraESP = numerosESP[numero2];
            String sumaPalabraESP = numerosESP[suma];

            String numero1PalabraENG = numerosENG[numero1];
            String numero2PalabraENG = numerosENG[numero2];
            String sumaPalabraENG = numerosENG[suma];

            System.out.println("La suma de " + numero1PalabraESP + " más " + numero2PalabraESP + " es " + sumaPalabraESP);
            System.out.println("The sum of " + numero1PalabraENG + " plus " + numero2PalabraENG + " is " + sumaPalabraENG);
        }
    }
}
