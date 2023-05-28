import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;

import javax.swing.text.AbstractDocument.BranchElement;

public class Main {
    public static void main(String[] args){
//Imprimindo váriaveis  
        String nome = "Taina";
        System.out.println("Olá, " + nome);

// Boolean
        boolean fds = true;
        boolean sol = true;
        boolean praia = fds && sol;
        System.out.println(praia);

        String mensagem = fds ? "é fds" : "não é fds";
        System.out.println(mensagem);

// Condição
        int nota = 70;
        String graduacao;
        if(nota>=70 && nota<=100){
            graduacao ="A";
        }
        else if(nota>=40 && nota<=59){
            graduacao ="B";
        }
        else if(nota<40){
            graduacao ="C";
        }
        else{
            graduacao = null;
        }

        switch(graduacao){
            case "A": System.out.println("Você foi aprovado");
                break;
            case "B": System.out.println("Você precisa realizar prova final");
                break;
            case "C": System.out.println("Você foi reprovado");
                break;
            default: System.out.println("Procure a secretaria acadêmica");
                break;
        }

// Manipulando Strings
        String nam = "Taina";
        System.out.println(nam.toUpperCase());
        System.out.println(nam.toLowerCase());
        System.out.println(nam.length());

// Montando uma sequencia de Strings manipuladas
        String nam2 = "TainA";
        System.out.println(nam.equalsIgnoreCase(nam2));
        
        // iso 8601 Data formato padrao localdate
        
        LocalDate hoje = LocalDate.now();
        
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()));
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if(agora.getHour() >= 0 && agora.getHour() <12){
            saudacao = "bom dia";
        }
        else if(agora.getHour() >= 12 && agora.getHour() < 18){
            saudacao = "boa tarde";
        }
        else if(agora.getHour() >= 18 && agora.getHour() < 24){
            saudacao = "boa noite";
        }
        else{
            saudacao="Bem-vindo";
        }

        System.out.printf("Ola, %s. Hoje é %s, %s. %n", nome, diaSemana, saudacao.toUpperCase());
        
//Laços numéricos
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++)
            System.out.println(j + "x" + i + "=" + j*i);
        }  

// vetores
        int[] nu = new int [5];
        nu[0] = 5;
        nu[1] = 14;
        nu[2] = 23;
        nu[3] = 20;
        nu[4] = 11;
        String[] let = {"b", "k", "p", "p", "l"};
        for (int i=0; i<nu.length; i++){
            System.out.println(nu[i]);
        }
        System.out.println(Arrays.toString(let));
        int maior = nu[0], menor = nu[0], media=0;

        for(int i=0; i<nu.length; i++){
            if(nu[i]>maior){
                maior = nu[i];
            }
            if(nu[i]<menor){
                menor=nu[i];
            }
            media += nu[i];
        }
        System.out.println("Maior:" + maior);
        System.out.println("Menor:" + menor);
        System.out.println("Média:" + media/nu.length );

//funções(MÉTODOS)
        String nameORI = "jabba the hut";
        saudacao(nameORI);
        int resultado = soma(2, 3);
        System.out.println(resultado);
    }
    public static void saudacao(String namePAR){
        System.out.println("Hello "+ namePAR);
    }
    public static int soma(int a,int b){
        return a + b;
    }
}
