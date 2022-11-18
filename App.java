import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    int op;
    int matricula=0;
    int faltas=0;
    String nome= null;
    double mediaF=0;
    Cadastro turma1= new Cadastro<>(matricula, nome, mediaF, faltas);

    Scanner scanApp= new Scanner(System.in);    
        do{
            exibeMenu();
            op= scanApp.nextInt(); scanApp.nextLine();
            
            switch(op){
            case 1:
                System.out.println("Informe a matricula do aluno: ");
                matricula= scanApp.nextInt();
                System.out.println("Informe o nome do aluno: ");
                nome= scanApp.nextLine();
                System.out.println("Informe a media final do aluno: ");
                mediaF= scanApp.nextDouble();
                System.out.println("Informe as faltas do aluno: ");
                faltas= scanApp.nextInt();
                turma1.cadastrar(turma1);

            break;
            
            } 
            }   
            while(op !=0);
            }
            
            public static void exibeMenu(){
            System.out.println("Options");
            System.out.println("1- cadastrar novo aluno");
            System.out.println("0- fechar menu");
            System.out.print("Choose a option:");
            
            
    }
}
