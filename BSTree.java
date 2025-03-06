public class BSTree {
    Node raiz = null;
    public void inserir (Data valor){
        inserir(raiz, valor);
    }

    private void inserir (Node no, Data valor){
        if (no!=null){
            if (valor.temp < no.valor.temp){
                if (no.esquerda != null)
                    inserir(no.esquerda, valor);
                else
                    no.esquerda = new Node(valor);
            }else{
                if (no.direita!=null)
                    inserir(no.direita, valor);
                else
                    no.direita = new Node(valor);
            }
        } else {
            raiz = new Node(valor);
        }
    }

    public Data maiorTemp(){
        if(raiz != null){
            return maiorTemp(raiz);
        }else{
            return null;
        }
    }
    private Data maiorTemp(Node no){
        if(no.direita != null){
            return maiorTemp(no.direita);
        }else{
            return no.valor;
        }
    }
}
