public class LDEC<T extends Comparable<T>>{
    private LDECNode prim;
    private LDECNode ult;
    protected int qtd;

    public boolean isEmpty(){
        if(this.prim== null && this.ult== null && this.qtd==0){
            return true;
        }
            else{
                return false;
                }
    }
    
    public void inserirOrdenadoCrescenteSemRepetidos(T value){
        LDECNode<T> novo= new LDECNode<T>(value);
        LDECNode<T> aux, anterior;
        
        if(this.isEmpty()==true){
            this.prim= novo;
            this.ult= novo;
            this.qtd++;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
            System.out.println(novo + " foi inserido!");
        }
        else if(value.compareTo((T)this.prim.getInfo()) < 0){
            novo.setProx(this.prim);
            this.prim.setAnt(novo);
            this.prim= novo;
            this.qtd++;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
        }
        else if(value.compareTo((T)this.prim.getInfo()) == 0 ){
            System.out.println("Valor repetido1!");
        }
        else if(value.compareTo((T) this.ult.getInfo()) > 0){
            this.ult.setProx(novo);
            novo.setAnt(this.ult);
            this.ult= novo;
            this.qtd++;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
        }
        else if(value.compareTo((T) this.ult.getInfo()) == 0){
            System.out.println("Valor repetido2!");
        }
        else{
            aux= this.prim.getProx();
            while(true){
                if(value.compareTo(aux.getInfo()) == 0){
                    System.out.println("Valor repetido!3");
                    break;
                }
                else if(value.compareTo(aux.getInfo()) < 0){
                    anterior= aux.getAnt();
                    anterior.setProx(novo);
                    aux.setAnt(novo);
                    novo.setProx(aux);
                    novo.setAnt(anterior);
                    this.qtd++;
                    this.prim.setAnt(this.ult);
                    this.ult.setProx(this.prim);
                    break;
                }
                else{
                    aux= aux.getProx();               
                }
            }
        }
    }

    public LDECNode<T> buscaMelhorada (T value) { // busca sequencial melhorada
        LDECNode<T> aux;
        if (this.isEmpty() == true) {
            return null;
        }
        else if (value.compareTo((T) this.ult.getInfo()) == 0) {
            return this.ult;
        }
        else if (value.compareTo((T) this.ult.getInfo()) > 0) {
            return null;
        }
        else {
            aux = this.prim;
            while (aux.getProx() != null) {
                if (aux.getInfo().compareTo(value) == 0) { // achei 
                    return aux;
                }
                else if (value.compareTo(aux.getInfo()) > 0) {
                    aux = aux.getProx();
                }
                else {
                    return null;
                }
            }
        }  
        return null;
    }

    public void remover (T value) {
        LDECNode<T> retorno = this.buscaMelhorada(value);
        LDECNode<T> prev, next;
        if (retorno == null){
            System.out.println("valor não encontrado");
        }
        else if (this.qtd == 1){ // lista com apenas um nó
            this.prim = null;
            this.ult = null;
            this.qtd = 0;
        }
        else if (retorno == this.prim){ // remover o primeiro
            this.prim = this.prim.getProx();
            this.prim.setAnt(null);
            this.qtd--;
        }
        else if (retorno == this.ult) { // remover o último
            this.ult = this.ult.getAnt();
            this.ult.setProx(null);
            this.qtd--;
        }
        else { // remover no "meio"
             prev = retorno.getAnt();
             next = retorno.getProx();
             prev.setProx(next);
             next.setAnt(prev);
             this.qtd--;
        }        
    }

    public void exibir () {
        LDECNode aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        }
        else { 
            aux = this.prim;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux= aux.getAnt();
            }
        }
    }
}
