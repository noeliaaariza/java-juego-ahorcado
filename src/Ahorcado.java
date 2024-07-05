import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        //Declaraciones y asignaciones
        String palabraSecreta ="inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean isAdivinada = false;

        //Arrays
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Estructura de control: Iterativa (bucle)
        for (int i=0; i < letrasAdivinadas.length; i++){
            letrasAdivinadas[i] = '_';
        
        }

        // Estructura de control: Iterativa (bucle)
        while(!isAdivinada && intentos<intentosMaximos){
                                                        //esto se usa cuando tenemos una palabra de chars
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)");
            System.out.println("Introduce una letra por favor");
            
            // Usamos la clase scanner para pedir una letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            // Estructura de control: Iterativa (bucle)
            for(int i = 0; i < palabraSecreta.length(); i++){
                // Estructura de control condicional
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                    System.out.println("Correcto! La letra " + Character.toUpperCase(letra) +" sí se encuentra!  Número de intentos restantes: " + (intentosMaximos - intentos) );
                }
            }
            if(!letraCorrecta){
                intentos++;
                System.out.println("INCORRECTO. Te quedan " + (intentosMaximos - intentos) + " intentos" );
            }

            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                isAdivinada = true;
                System.out.println("Felicidades has adivinado la palabra secreta: " + palabraSecreta);
            }



        }
        if(!isAdivinada){
            System.out.println("Has perdido, partida finalizada.");
        }

        scanner.close();

   
        
        

    }
}
