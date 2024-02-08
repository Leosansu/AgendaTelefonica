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
        Contatos.AddContato(new DadosContato(nome, email, tel, dataNasci));

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
        System.out.println("--Contatos-- ");
        for (DadosContato d : Contatos.getContatos()) {
            System.out.print(d);
        }
        System.out.println();
        System.out.print("Pesquisar: ");
        sc.nextLine();
        String pesquisa = sc.next();

        sc.nextLine();
        List<DadosContato> contatoPesquisa = Contatos.ProcurarContatoPorNome(Contatos.getContatos(), pesquisa);
        // verifica se contatoPesquisa teve algum retorno e entao printa as infoformacoes para o usuario
        for (DadosContato d : contatoPesquisa) {

            if (d.getNome() != null) {
                System.out.print("Nome: " + d.getNome() + "\n");
                System.out.print("E-mail: " + d.getEmail() + "\n");
                System.out.print("Fone: " + d.getTelefone() + "\n");
                System.out.print("Aniversário: " + sdf.format(d.getDataNascimento()));
            } else {
                System.out.println("Contato inexistente");
            }
        }
        }
    }


//System.out.printf("Aniversário: "+sdf.format(usuario.getDataNascimento())+"\n");

