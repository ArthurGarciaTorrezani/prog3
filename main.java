public class main{
     public static void main(String[] args){
          Celula dez = new Celula(10);
          Celula vinte  = new Celula(20);
          Celula trinta = new Celula(30);
          ListaSE lista = new ListaSE();
          lista.inserirNoInicio(dez);
          lista.inserirNoInicio(vinte);
          lista.inserirNoInicio(trinta);
          lista.imprimir();
     }
}