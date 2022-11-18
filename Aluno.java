public class Aluno<T> implements Comparable<Aluno>{
private int matric, faltas;
private String nome;
private double mediaF;    
      

@Override
public String toString() {
    return "Aluno [matric=" + matric + ", nome=" + nome + ", mediaF=" + mediaF + ", faltas=" + faltas + "]";
}

public Aluno(int matric, String nome, double mediaF, int faltas) {
    this.matric = matric;
    this.nome = nome;
    this.mediaF = mediaF;
    this.faltas = faltas;
}

public int getMatric() {
    return matric;
}
public void setMatric(int matric) {
    this.matric = matric;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public double getMediaF() {
    return mediaF;
}
public void setMediaF(double mediaF) {
    this.mediaF = mediaF;
}
public int getFaltas() {
    return faltas;
}
public void setFaltas(int faltas) {
    this.faltas = faltas;
}

@Override
public int compareTo(Aluno al) {
    int result;
    result= this.getMatric().compareTo(al.getMatric());
    return result;
}
}
