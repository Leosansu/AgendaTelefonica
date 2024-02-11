import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class AppAgenda {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);

        DadosContato Contatos = new DadosContato();

        System.out.println("------Agenda telefônica-----");
        System.out.print("Salvar contato\n");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();
        System.out.print("Telefone: ");
        int tel = sc.nextInt();
        System.out.print("Data de nascimento: ");
        Date dataNasci = sdf.parse(sc.next());
        DadosContato contact = new DadosContato(nome, email, tel, dataNasci);
        Contatos.AddContato(contact);

        System.out.print("Adicionar contato, sim ou não? (s/n) : ");
        sc.nextLine();
        String infor = sc.nextLine();
        System.out.print("Quantos contatos?");

        int n = sc.nextInt();
        if (infor.equalsIgnoreCase("s")) {
            for (int i = 1; i <= n; i++) {
                System.out.printf("-Dados do %s° contato- \n", i);
                System.out.print("Nome: ");
                sc.nextLine();
                String nomeContact = sc.nextLine();
                System.out.print("E-mail: ");
                String emailContact = sc.nextLine();
                System.out.print("Telefone: ");
                int telContact = sc.nextInt();
                System.out.print("Data de nascimento: ");
                Date aniversario = sdf.parse(sc.next());
                Contatos.AddContato((new DadosContato(nomeContact, emailContact, telContact, aniversario)));

            }
        }
        else {
            System.out.println("Nenhum contato adicionado");

        }

        System.out.println();
        System.out.print("Pesquisar: ");
        sc.nextLine();
        String pesquisa = sc.next();

        sc.nextLine();
        List<DadosContato> contatoPesquisa = Contatos.ProcurarContatoPorNome(pesquisa);
        if (contatoPesquisa.isEmpty() ) {
            System.out.print("Contato inexistente");
        }
        else {
            for (DadosContato d : contatoPesquisa) {
                System.out.print("Nome: " + d.getNome() + "\n");
                System.out.print("E-mail: " + d.getEmail() + "\n");
                System.out.print("Fone: " + d.getTelefone() + "\n");
                System.out.print("Aniversário: " + sdf.format(d.getDataNascimento()));
            }
        }
    }
}


//List<DadosContato> contatoPesquisa = Contatos.ProcurarContatoPorNome(pesquisa);
//        for (DadosContato d : contatoPesquisa) {
//
//            if (d.getNome().isEmpty()) {
//                System.out.print("Contato inexistente");
//            }
//            else {
//                System.out.print("Nome: " + d.getNome() + "\n");
//                System.out.print("E-mail: " + d.getEmail() + "\n");
//                System.out.print("Fone: " + d.getTelefone() + "\n");
//                System.out.print("Aniversário: " + sdf.format(d.getDataNascimento()));
//
//            }



//System.out.printf("Aniversário: "+sdf.format(usuario.getDataNascimento())+"\n");
