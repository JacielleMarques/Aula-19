public class Carro {
    
        String fabricante;
        String modelo;
        String cor;
        int anoFab;
        float valorDeMercado;
        boolean flex;
        String tipoDeCombustivel;
        Proprietario dono;

        float retornaValorDeMercado(){
            return valorDeMercado;
        }

        void aleraModeloECor(String m, String c){
           if(modelo != null){
                modelo = m;
            }
            if(cor != null){
               this.cor = c;
            }
        
        }
    

        //metodo java em orientação a objeto
        void ligar (){
        System.out.println("Ligando o carro");

        }


     }


