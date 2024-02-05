import java.text.SimpleDateFormat;
import java.util.*;

public class DadosContato {

    public SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private String nome;
    private String email;
    private Integer telefone;
    private Date dataNascimento;
    private List<DadosContato> contatos = new ArrayList<>();


    public DadosContato() {
    }

    public DadosContato(String nome, String email, Integer telefone, Date DataNascimento) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        dataNascimento = DataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<DadosContato> getContatos() {
        return contatos;
    }

    public void AddContato(DadosContato contato) {
        contatos.add(contato);
    }

    public void RemoveContato(DadosContato contato) {
        contatos.remove(contato);
    }

    public DadosContato ProcurarContato(DadosContato contato) {
        boolean contatoEncontrado = false;
        for (DadosContato c : contatos) {

            if (contato.getNome().equalsIgnoreCase(c.getNome())) {
                System.out.print("Nome: " + c.getNome() + "\n");
                System.out.print("E-mail: " + c.getEmail() + "\n");
                System.out.print("Fone: " + c.getTelefone() + "\n");
                System.out.print("Aniversário: " + sdf.format(c.getDataNascimento()));
                contatoEncontrado = true;

            }

        }
        if (!contatoEncontrado) {
            System.out.println("Contato inexistente");


        }
        return contato;

    }

//return (DadosContato) contatos;




    @Override
    public String toString() {
        return "\nNome: " + nome
                + "\nE_mail: "
                + email
                + "\nFone: " + telefone + "\n"
                +"Aniversário: "+sdf.format(dataNascimento)+"\n";
    }
}




