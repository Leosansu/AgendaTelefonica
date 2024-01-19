import java.util.List;
import java.util.Scanner;

public class AppAgenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------Agenda telefônica-----");
        System.out.println("Adicionar contato");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();
        System.out.print("Telefone: ");
        int tel = sc.nextInt();
        DadosContato contatos = new DadosContato(nome, email, tel);

        System.out.print("Adicionar contato, sim ou não? (s/n) : ");
        sc.nextLine();
        String infor = sc.nextLine();
        System.out.print("Quantos contatos?");

        int n = sc.nextInt();
        if (infor.equals("s")) {
            for(int i = 1;i <= n;i++){
                System.out.print("Nome: ");
                sc.nextLine();
                String nomeContact = sc.nextLine();
                System.out.print("E-mail: ");
                String emailContact = sc.nextLine();
                System.out.print("Telefone: ");
                int telContact = sc.nextInt();
                DadosContato contact = new DadosContato(nomeContact,emailContact,telContact);
                contatos.AddContato(contact);
            }
            contatos.AddContato(contatos);

            System.out.println();
            System.out.print(contatos.getContatos());
            System.out.println();

        }
    }
}