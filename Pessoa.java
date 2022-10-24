import java.util.Calendar;

public class Pessoa{
  private String nome;
  private String telefone;
  private String dataNasc;
  private String dataCad;
  private String dataAlt;

  public Pessoa(){
    this.setNome("");
    this.setTelefone("");
    this.setDataNasc("11/11/1111");
    this.setDataCad();
    this.setDataAlt();
  }

  public Pessoa(String nome, String telefone, String nasc){
    this.setNome(nome);
    this.setTelefone(telefone);
    this.setDataNasc(nasc);
    this.setDataCad();
    this.setDataAlt();
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public void setTelefone(String telefone){
    this.telefone = telefone;
  }

  public void setDataNasc(String d){
    this.dataNasc = d;
  }
  
  public void setDataCad(){
    this.dataCad = data();
  }
  
  public void setDataAlt(){
    this.dataAlt = data();
  }

  public String getNome(){
    return nome;
  }

  public String getTelefone(){
    return telefone;
  }

  public String getDataNasc(){
    return dataNasc;
  }

  public String getDataCad(){
    return dataCad;
  }

  public String getDataAlt(){
    return dataAlt;
  }

  public String data(){
    String d;
    int dia, mes, ano;
    Calendar calendario = Calendar.getInstance();

    dia = calendario.get(Calendar.DATE);
    mes = (calendario.get(Calendar.MONTH) + 1);
    ano = calendario.get(Calendar.YEAR);
      
    d = dia + "/" + mes + "/" + ano;
    
    return d;
  }

  public void exibir(){
    System.out.println("\n" + getNome()); 
    System.out.println("Telefone: " + getTelefone()); 
    System.out.println("Data Nascimento: " + getDataNasc()); 
    System.out.println("Data Cadastro: " + getDataCad()); 
    System.out.println("Data Atualização: " + getDataAlt());
  }
}