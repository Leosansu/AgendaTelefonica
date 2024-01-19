import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class DadosContato {

    private String nome;
    private String email;
    private Integer telefone;
    private List<DadosContato> contatos = new ArrayList<>();

    public DadosContato() {
    }

    public DadosContato(String nome, String email, Integer telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
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

    public List<DadosContato> getContatos() {
        return contatos;
    }

    public void AddContato(DadosContato contato) {
        contatos.add(contato);
    }

    public void RemoveContato(DadosContato contato) {
        contatos.remove(contato);
    }

    public void ProcurarContato(String contato) {
        for (DadosContato pessoa : contatos) {
            if (Objects.equals(pessoa.getNome(), contato)) {

                System.out.print(pessoa.getNome());
            }
        }
    }

    @Override
    public String toString() {
        return "\nNome: "+nome
                + "\nE-mail: "
                + email
                +"\nFone: "+telefone+"\n";
    }


}



