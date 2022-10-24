class Main {
  public static void main(String[] args) {
    Pessoa[] pessoa = new Pessoa[10];
    Aluno[] aluno = new Aluno[10];
    
    pessoa[0] = new Pessoa("João", "51998568745", "12/12/1980");
    pessoa[1] = new Pessoa("Paulo", "51996572383", "27/08/1992");

    aluno[0] = new Aluno("Flavio", "51998901534", "03/02/2000", 5.2);
    aluno[1] = new Aluno("Gustavo", "51998526042", "30/05/2002", 8.9);
    
    boolean continuar = true;
    int opcao; 
    double nota;
    String nome, telefone, nascimento, nomeAt, nomeDel;
    int pos = 0;
    int posAt = 0;
    int posDel = 0;

    Menu menu = new Menu();
    
    while(continuar){
      System.out.println("\nMenu");
      System.out.println("\n1 - Cadastrar pessoa ou aluno");
      System.out.println("2 - Exibir pessoas e alunos");
      System.out.println("3 - Atualizar dados de pessoa ou aluno");
      System.out.println("4 - Deletar pessoa ou alunos");
      System.out.println("0 - Encerrar programa");

      opcao = menu.opcao();

      switch(opcao){
        case 0:
          continuar = false;
        break;
  
        case 1:
          nome = menu.nome();
          telefone = menu.telefone();
          nascimento = menu.nascimento();
          nota = menu.nota();

          if(nota == 11){
            for(Pessoa elemento: pessoa){
              if(elemento != null){
                pos++;
              }
              else{
                pessoa[pos] = new Pessoa(nome, telefone, nascimento);
                pos = 0;
                break;
              }
            }
          }
          else{
            for(Aluno elemento: aluno){
              if(elemento != null){
                pos++;
              }
              else{
                aluno[pos] = new Aluno(nome, telefone, nascimento, nota);
                pos = 0;
                break;
              }
            }
          }
        break;
        
        case 2:
          System.out.println("\nPessoas:");
          for(Pessoa elemento: pessoa){
            if(elemento != null){
              elemento.exibir();
            }
          }

          System.out.println("\nAlunos:");
          for(Aluno elemento: aluno){
            if(elemento != null){
              elemento.exibir();
            }
          }
        break;
  
        case 3:
          nomeAt = menu.atualizar();
          for(Pessoa elemento: pessoa){
            if(elemento != null){
              if(nomeAt.equals(elemento.getNome())){
                break;
              }
              else{
                posAt++;
              }
            }
            else{
              posAt = 0;
              break;
            }
          }

          if(posAt != 0){
            telefone = menu.telefone();
            nascimento = menu.nascimento();

            pessoa[posAt].setTelefone(telefone);
            pessoa[posAt].setDataNasc(nascimento);
            pessoa[posAt].setDataAlt();
          }
          else{
            for(Aluno elemento: aluno){
              if(elemento != null){
                if(nomeAt.equals(elemento.getNome())){
                  telefone = menu.telefone();
                  nascimento = menu.nascimento();
                  nota = menu.nota();
                  
                  aluno[posAt].setTelefone(telefone);
                  aluno[posAt].setDataNasc(nascimento);
                  aluno[posAt].setDataAlt();
                  aluno[posAt].setNota(nota);
  
                  posAt = 0;
                  break;
                }
                else{
                  posAt++;
                }
              }
              else{
                posAt = 0;
                break;
              }
            }
          }
        break;

        case 4:
          nomeDel = menu.atualizar();
          for(Pessoa elemento: pessoa){
            if(elemento != null){
              if(nomeDel.equals(elemento.getNome())){
                break;
              }
              else{
                posDel++;
              }
            }
            else{
              posDel = 0;
              break;
            }
          }

          if(posDel != 0){
            pessoa[posDel] = null;
          }
          else{
            for(Aluno elemento: aluno){
              if(elemento != null){
                if(nomeDel.equals(elemento.getNome())){
                  aluno[posDel] = null;
  
                  posDel = 0;
                  break;
                }
                else{
                  posDel++;
                }
              }
              else{
                posDel = 0;
                break;
              }
            }
          }
        break;
  
        default:
          System.out.println("\nOpção inválida!");
        break;
      }
    }
  }
}



