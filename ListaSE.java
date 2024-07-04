public class ListaSE {
     Celula primeiro;
     public ListaSE(){
          primeiro = null;          
     }

     public void inserirNoInicio(Celula c){
          c.prox = primeiro;
          primeiro = c;
     }

     public void imprimir(){
          Celula aux = primeiro;
          while (aux.prox != null) {
               System.out.println("valor:"+aux.valor);
               aux = aux.prox;
          }
          System.out.println("valor:"+aux.valor);
     }
}
