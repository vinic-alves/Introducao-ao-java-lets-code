public class Main {
    public static void main(String[] args) {
        // tipos de dados boolean

        //boolean resultado = true;
        //System.out.println(resultado);

        // Algoritmo para ir a praia

        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosApraia = fimDeSemana && fazendoSol;

        System.out.println(vamosApraia);

        // Tabela verdade

        // Operador && (AND)
        // true && true = true;
        // true && false = false;
        // false && true = false;
        // false && false = false


        // Operador || (OR)

        // True || true = true
        // true || false = true
        // false || true = true
        // false || false = false

        //Operador ternário em java
        String mensagem = fimDeSemana ? "È fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);




    }
}
