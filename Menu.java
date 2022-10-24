import java.util.Scanner;

public class Menu{
  Scanner scanner = new Scanner(System.in);
  
  public Menu(){
    
  }

  public int opcao(){
    int op = 0;
    boolean continuar = true;
    
    while(continuar){
      try{
        op = Integer.parseInt(scanner.nextLine());
        if(op >= 0 && op <= 4){
          continuar = false;
        }
        else{
          System.out.println("Valor deve ser entre 0 à 4");
        }
      }catch(NumberFormatException e){
        System.out.println("ERRO! Entrada inválida");
      }
    }
    return op;
  }

  public String nome(){
    String n = null;
    boolean continuar = true;
    
    while(continuar){
      System.out.println("\nDigite o nome da pessoa ou aluno(a):");
      n = scanner.nextLine();

      if(n != null){
        continuar = false;
      }
      else{
        System.out.println("Nome não pode ser nulo");
      }
    }
    return n;
  }

  public String telefone(){
    String tel = null;
    boolean continuar = true;
    
    while(continuar){
      System.out.println("\nDigite o número do telefone:");

      tel = scanner.nextLine();

      if(tel != null){
          if(tel.length() == 11){
            continuar = false;
          }
          else{
            System.out.println("Número no formato 51999999999");
          }
      }
      else{
        System.out.println("Telefone não pode ser nulo");
      }
    }
    return tel;
  }

  public String nascimento(){
    String nasc = null;
    boolean continuar = true;
    int dia, mes, ano;
    
    while(continuar){
      System.out.println("\nDigite a data de nascimento (dd/mm/yyyy):");
      nasc = scanner.nextLine();

      if(nasc != null){
        if(nasc.length() == 10){
          try{
            String[] num = nasc.split("/");
            dia = Integer.parseInt(num[0]);
            mes = Integer.parseInt(num[1]);
            ano = Integer.parseInt(num[2]);
            
            if(dia < 1 || dia > 31){
              System.out.println("Dia tem que estar entre 1 à 31");
            }
            else if(mes < 1 || mes > 12){
              System.out.println("Mes tem que estar entre 1 à 12");
            }
            else if(ano < 1910 || ano > 2022){
              System.out.println("Ano tem que estar entre 1910 à 2022");
            }
            else{
              continuar = false;
            }
          }catch(Exception e){
            System.out.println("Data no formato (dd/mm/yyyy)");
          }
        }
        else{
          System.out.println("Data no formato (dd/mm/yyyy)");
        }
      }
      else{
        System.out.println("Data não pode ser nula");
      }
    }
    return nasc;
  }

  public double nota(){
    double not = 0;
    String opcao;
    boolean continuar = true;
    
    while(continuar){
      System.out.println("\nInformar a nota final? (s/n)");
      opcao = scanner.nextLine();

      if(opcao.length() == 1){
        if(opcao.equals("n")){
          not = 11;
          continuar = false;
        }
        else if(opcao.equals("s")){
          System.out.println("\nDigite a nota: (0 à 10)");
          
          try{
            not = Double.parseDouble(scanner.nextLine());
            
            if(not >= 0 && not <= 10){
              continuar = false;
            }
            else{
              System.out.println("Nota tem que ser entre 0 à 10");
            }
          }catch(NumberFormatException e){
            System.out.println("ERRO! Entrada inválida");
          }
        }
        else{
          System.out.println("s ou n");
        }
      }
      else{
        System.out.println("s ou n");
      }
    }
    return not;
  }  

  public String atualizar(){
    String n;
    
    System.out.println("\nDigite o nome da pessoa ou do aluno(a) que deseja atualizar:");
    n = scanner.nextLine();
    
    return n;
  }

  public String deletar(){
    String n;
    
    System.out.println("\nDigite o nome da pessoa ou do aluno(a) que deseja deletar:");
    n = scanner.nextLine();
    
    return n;
  }
    
}