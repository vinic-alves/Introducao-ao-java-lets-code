public class Main {
    public static void main(String[] args) {
        // Estruturas básicas condicionais com java

        int nota = 55;
        // nota maior que 70 ou igual a 70 -> aprovado
        // if-else -> operadores condicionais

        if(nota >= 70){
            System.out.println("O aluno está aprovado");
        }else{
            System.out.println(" Infelizmente o aluno foi reprovado");
        }

        // A > 80 PONTOS || B de 70 a 80 pts || C de 60 a 70 pts || D abaixo de 60
        String graduacao;

        if ( nota >= 80){
            graduacao = "A";
        } else if (nota >= 70 && nota < 80) {
            graduacao = "B";
        } else if (nota >= 60 && nota < 70) {
            graduacao = "C";
        }else{
            graduacao = "D";
        }
        System.out.println(graduacao);

        switch (graduacao){
            case "A":
            case "B":
                System.out.println(" Parabéns você foi aprovado");
                break;
            case "C":
            case "D":
                System.out.println("Infelizmente você foi reprovado novamente, vamos estudar mais");
                break;
            default:
                System.out.println("Graduação Inválida");
        }

    }
}
