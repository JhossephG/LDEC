import java.util.Scanner;

public class Cadastro<T> extends Aluno{
    LDEC lista= new LDEC<>();
    Scanner scan= new Scanner(System.in);
    LDECNode aux;
    private int controlador;

    public Cadastro(int matric, String nome, double mediaF, int faltas) {
        super(matric, nome, mediaF, faltas);
        //TODO Auto-generated constructor stub
    }
    
    public void cadastrar(Aluno novoAl){
        lista.inserirOrdenadoCrescenteSemRepetidos(novoAl);
            System.out.println("Aluno cadastrado!");    
    }

    public void listar(){
        lista.exibir();
    }

    public void consultar(Cadastro matric){
        aux=lista.buscaMelhorada(matric);
        if(aux == null){
            System.out.println("Aluno nao encontrado!");
        }
        else{
            System.out.println(aux);
            controlador++;
        }
    }

    public void alterarMediaFinal(Cadastro matric){
        consultar(matric);
        if(controlador!=0){
            System.out.println("Informe a nova media: ");
            double novaM= scan.nextDouble();
            //aux.setInfo(this.setMediaF(novaM));
            controlador--;
        }
    }
        
    public void alterarQtdFaltas(Cadastro matric){

    }

    public void exibir(Cadastro matric){
        aux=lista.buscaMelhorada(matric);
        if(aux == null){
            System.out.println("Aluno nao encontrado!");
        }
        else{
            this.aux.getInfo();
            
        }
    }

    public void remover(Cadastro matric){
        aux=lista.buscaMelhorada(matric);
        if(aux == null){
            System.out.println("Aluno nao encontrado!");
        }
        else{
            lista.remover(matric);
            System.out.println("Removido!");
        } 
    }
}
