public class Aluno extends Pessoa{
  private double nota;
  
  public Aluno(){
    super();
    this.setNota(0);
  }
  
  public Aluno(String nome, String telefone, String nasc, double nota){
    super(nome, telefone, nasc);
    this.setNota(nota);
  }

  public void setNota(double nota){
    this.nota = nota;
  }

  public double getNota(){
    return nota;
  }

  public void exibir(){
    System.out.println("\n" + getNome()); 
    System.out.println("Telefone: " + getTelefone()); 
    System.out.println("Data Nascimento: " + getDataNasc()); 
    System.out.println("Data Cadastro: " + getDataCad()); 
    System.out.println("Data Atualização: " + getDataAlt());
    System.out.println("Nota Final: " + getNota());
  }
}