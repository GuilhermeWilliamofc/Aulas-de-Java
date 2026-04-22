/*
4. Sistema Simples de Cadastro de Usuários (User Profile System)
Conceito Principal: Encapsulamento de dados textuais e uso de métodos para formatação de saída.

Classes Envolvidas:

Usuario: Classe que armazena dados pessoais (Nome, Email, Data de Nascimento).
(Não é estritamente necessária uma classe separada se você for apenas fazer o cadastro em um loop).
O que você praticará:

Manipulação de Strings e datas.
Uso de printf para formatar a saída dos dados do usuário de forma bonita (ex: "Nome: João | Email: joao@exemplo.com").
Simular o cadastro de vários usuários usando um loop e o Scanner.   
*/

public class Usuario
{
    String nome;
    String email;
    String dataDeNascimento;
    
    public Usuario(String nomeDigitado, String emailDigitado, String dataDigitada){
        this.nome = nomeDigitado;
        this.email = emailDigitado;
        this.dataDeNascimento = dataDigitada;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getDataDeNascimento(){
        return dataDeNascimento;
    }
    
    public void printDados(){
        System.out.println("Dados do Usuario:");
        System.out.printf("Nome: %s \n", this.nome);
        System.out.printf("Email: %s \n", this.email);
        System.out.printf("Data de Nascimento: %s", this.dataDeNascimento);
    }
}