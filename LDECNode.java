public class LDECNode<T extends Comparable<T>>{
    private LDECNode<T> ant;
    private LDECNode<T> prox;
    private T info;
            
public LDECNode (T valor) {
    this.info = valor;
}
public void setAnt(LDECNode<T> novoAnt) {
    this.ant = novoAnt;
}
public LDECNode<T> getAnt () {
    return this.ant;
}
public void setInfo(T valor) {
    this.info = valor;
}
public T getInfo() {
    return this.info;
}
public void setProx (LDECNode<T> novoProx) {
    this.prox = novoProx;
}
public LDECNode<T> getProx() {
    return this.prox;
}   
}
