public class ListaSE {
    Celula primeiro;
    public ListaSE(){
        primeiro = null;
    }

    public void inserirNoInicio(Celula c){
        c.prox = primeiro;
        primeiro = c;
    }

    public void inserirNoIFinal(Celula c){
        if(c == null){

        }else{
            Celula aux = primeiro;
            while (aux.prox != null){ // 1.2    2.3   3.0
                aux = aux.prox;       // 1.2
            }
            aux.prox = c;
        }
    }

    public void imprimir(){ //1.2 2.3 3.0
        Celula aux = primeiro;
        while (aux != null) {
            System.out.println("valor:"+aux.valor);
            aux = aux.prox;
        }

    }
}
