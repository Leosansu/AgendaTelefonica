public class MontandoAgenda {

        public String nome ;
        public String rua ;
        public int numero ;
        public String bairro;

        public String lista;

        public void addContato(){

            lista = nome + rua + numero + bairro;

        }
        public String toString (){
            return "Nome : "
                    +nome
                    +" \nRua : "
                    +rua
                    +" \nN° : "
                    +numero
                    +" \nBairro : "
                    +bairro;
        }

    }

