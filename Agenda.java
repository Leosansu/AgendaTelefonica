import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MontandoAgenda agendaA = new MontandoAgenda();

        System.out.print("          Agenda telefônica  ");
        System.out.println();

        System.out.println("Adicionar Contato  ");
        System.out.print("Nome : ");

        String nome = sc.nextLine();
        agendaA.setnome(nome);

        System.out.print("Bairro : ");
        String bairro = sc.nextLine();
        agendaA.setBairro(bairro);

        System.out.print("Rua : ");
        String rua = sc.nextLine();
        agendaA.setRua(rua);

        System.out.print("N° : ");
        int numero = sc.nextInt();
        agendaA.setNumero(numero);

        agendaA.addContato();
        System.out.println();
        System.out.println(agendaA);
    }
}
