import org.w3c.dom.Text;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
          // trabalhando com complexividade de strings
        // exemplo:
        // Olá, {nome}. Hoje é {dia-da-semana}, Bom dia !;

        String nome = "Vinicius";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());

        String nomeOutro = "Vinicius";

        System.out.println(nome.equals(nomeOutro));
        System.out.println(nome.equalsIgnoreCase(nomeOutro));

        // ISO 8601
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt","BR");
        //  Locale brasil = new Locale(language:'pt', country: 'BR');
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL , brasil));
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL , brasil);

        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "Bom dia";
        }else if ( agora.getHour() >= 12 && agora.getHour() < 18) {

            saudacao = "Boa tarde";

        }else {
            saudacao = "Boa noite";
        }
        System.out.printf("Olá, %s, Hoje é %s, %s.%n , nome" , nome, diaSemana, saudacao.toUpperCase( ));
    }
}
