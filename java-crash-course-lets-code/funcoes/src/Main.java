public class Main {
    public static void main(String[] args) {
        // funções em Java
        //No java se declara a função método fora da classe main, depois se chama
        // ela na Main,, porém é preciso declarar na Classe main e também no argumento da função
        // com o seu respectivo tipo

        int resultado = soma(2, 3);
        System.out.println(resultado);

    }


    public static int soma(int a , int b){
        return a + b;
    }
}
