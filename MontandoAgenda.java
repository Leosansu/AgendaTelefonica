public class MontandoAgenda {

    private String nome;
    private String rua;
    private int numero;
    private String bairro;

    private String lista;

    public void setnome(String Nome) {
        this.nome = Nome;
    }

    public String getNome() {
        return nome;
    }
    public void setRua(String Rua){
        this.rua = Rua;
    }
    public void setNumero(int Numero){
        this.numero = Numero;
    }
    public void setBairro(String Bairro){
        this.bairro = Bairro;
    }

    public void addContato() {

        lista = nome + rua + numero + bairro;

    }

    public String toString() {
        return "Nome : "
                + nome
                + " \nRua : "
                + rua
                + " \nN° : "
                + numero
                + " \nBairro : "
                + bairro;
    }

}

