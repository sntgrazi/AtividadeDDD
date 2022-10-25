import java.util.Scanner;

public class DDD {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String[] listaDDD = {"61", "71", "11", "21", "32", "19", "27", "31"};

        System.out.println("Pesquisa de DDD");
        System.out.println();

        while (true) {
            System.out.println("Digite um código de DDD ou 0 para fechar:");
            String ddd = ler.nextLine();


            if (ddd.equals("0")) {
                System.out.println("Adeus :(");
                break;
            } else if (ddd.length() != 2) {
                System.out.println("DDD inválido.");
            } else if (ddd.equals("61")) {
                System.out.println("Brasília.");
            } else if (ddd.equals("71")) {
                System.out.println("Salvador.");
            } else if (ddd.equals("11")) {
                System.out.println("São Paulo.");
            } else if (ddd.equals("21")) {
                System.out.println("Rio de Janeiro.");
            } else if (ddd.equals("32")) {
                System.out.println("Juiz de Fora.");
            } else if (ddd.equals("19")) {
                System.out.println("Campinas.");
            } else if (ddd.equals("27")) {
                System.out.println("Vitória.");
            } else if (ddd.equals("31")) {
                System.out.println("Belo Horizonte.");
            } else {
                System.out.println("DDD não cadastrado.");
            }
        }
    }
}
