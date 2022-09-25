import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Vetores ou arrays
        // "Não podemos misturar tipos dentro de um array(vetor)
        // "Arrays tem numero de elementos imutável


//        String[] letras = new String[6];
//        // [0] [1] [2] [3] [4]
//        letras[0] = "B";
//        letras[1] = "R";
//        letras[2] = "A";
//        letras[3] = "S";
//        letras[4] = "I";
//        letras[5] = "L";
//        for( int i = 0; i < letras.length; i++){
//            System.out.println(letras[i]);
//        }
        // Segunda forma de declaração de arrays

        String[] letras = {"B", "R", "A", "S", "I", "L"}; // nesse caso o tamanho do array, será o numero de elementos dele

        for( int i = 0; i < letras.length; i++){
            System.out.println(letras[i]);
      }

        System.out.println(Arrays.toString(letras));

        int[] numeros = {9, 5, 3, 2, 0};
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;

        for( int i =0; i < numeros.length; i++){
            if ( numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor){
                menor = numeros[i];
            }
            media += numeros[i];
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media / numeros.length);





    }
}
