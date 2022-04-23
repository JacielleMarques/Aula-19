public class Principal {
   
        public static void main(String[] args) {

            Proprietario  dono  = new Proprietario();
            dono.nome = "João da Silva";
            dono.cpf = "111111111";
            dono.endereco= "rua20, numero 666";
            dono.bairro = "Centro";
            dono.cidade = "Ituiutaba";

            Carro meuCarro = new Carro();
            
            meuCarro.fabricante = "Lamborghni";
            meuCarro.modelo = "Aventador";
            meuCarro.cor = "Amarelo";
            meuCarro.anoFab = 2009;
            meuCarro.valorDeMercado = 10000f;
            meuCarro.flex = true;
            meuCarro.tipoDeCombustivel = "Alcool/gasolina";
             meuCarro.dono = dono;

             meuCarro.ligar();
             meuCarro.aleraModeloECor("Fusca","Azul");
             float valor = meuCarro.retornaValorDeMercado();
             System.out.println("Valor do carro: " + valor);
             

            
            Carro seuCarro = new Carro();
            seuCarro.fabricante = "Honda";
            seuCarro.modelo = "Civic";
            seuCarro.anoFab = 2009;
            seuCarro.tipoDeCombustivel = "Preto";
            seuCarro.flex = false;
            seuCarro.tipoDeCombustivel = "gasolina";
            seuCarro.dono = dono;
    
            System.out.println("Meu carro");
            System.out.println("-------------------------------------------");
            System.out.println("Modelo: " + meuCarro.modelo);
            System.out.println("Ano: " + meuCarro.anoFab);
                                       // dono.nome
            System.out.println("Proprietario: " + meuCarro.dono.nome);
            
            System.out.println("Seu carro");
            System.out.println("-------------------------------------------");
            System.out.println("Modelo: " + seuCarro.modelo);
            System.out.println("Ano: " + seuCarro.anoFab);
            System.out.println("Proprietario: " + seuCarro.dono.nome);

            dono.nome = "Manuel Junqueira";

        }
    }

