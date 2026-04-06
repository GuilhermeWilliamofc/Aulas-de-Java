/*
- Criar uma classe com com três construtores, 
sendo um o construtor default;
- Todos atributos desta classe devem ser privados, sendo um estático;
*/

class ContaInstagram
{
    private String nome_de_usuario;
    private String email_do_usuario;
    private int numero_de_seguidores;
    private static int totalDeContasCriadas;
    
    // Primeiro Construtor (Nenhum valor como parametro = todos os valores como padrão)
    // Construtor Default
    ContaInstagram(){
        ContaInstagram.totalDeContasCriadas += 1;
    }
    
    // Segundo Construtor (Nome de usuario como parametro)
    // Chama o metodo construtor anterior
    ContaInstagram(String nome_de_usuario){
        this();
        this.nome_de_usuario = nome_de_usuario;
        this.email_do_usuario = "Sem Email";
        this.numero_de_seguidores = 0;
    }
    
    // Terceiro Construtor (Nome e email do usuario como parametro)
    // Chama o metodo construtor anterior que chama o metodo construtor anterior
    ContaInstagram(String nome_de_usuario, String email_do_usuario){
        this(nome_de_usuario);
        this.email_do_usuario = email_do_usuario;
    }
    
    // Criando Getters e Setters
    public String getNomeDeUsuario(){
        return nome_de_usuario; // não precisa do this nesse caso, funciona do mesmo jeito
    }
    
    public void setNomeDeUsuario(String nome_de_usuario) {
        this.nome_de_usuario = nome_de_usuario;
        System.out.println("Nome de usuario setado para: " + this.nome_de_usuario);
    }
    
    public String getEmailDoUsuario(){
        return email_do_usuario;
    }
    
    public void setEmailDoUsuario(String email_do_usuario) {
        this.email_do_usuario = email_do_usuario;
        System.out.println("Email do usuario setado para: " + this.email_do_usuario);
    }
    
    public int getNumeroDeSeguidores(){
        return numero_de_seguidores;
    }
    
    public int gettotalDeContasCriadas(){
        return totalDeContasCriadas;
    }
}