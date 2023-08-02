import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MontandoAgenda agendaA = new MontandoAgenda();

        System.out.print("          Agenda telefônica  ");
        System.out.println();

        System.out.println("Adicionar Contato  ");
        System.out.print("Nome : ");
        agendaA.nome = sc.nextLine();

        System.out.print("Bairro : ");
        agendaA.bairro = sc.nextLine();

        System.out.print("Rua : ");
        agendaA.rua = sc.nextLine();

        System.out.print("N° : ");
        agendaA.numero = sc.nextInt();

        agendaA.addContato();
        System.out.println();
        System.out.println(agendaA);
    }
}
