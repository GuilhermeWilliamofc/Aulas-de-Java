public class TesteMarketplace {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Antonio Helio Cabral", "antoniohc1994@email.com", "(62) 9 9685-9588");
        Usuario usuario2 = new Usuario("Luís Augusto Fischer", "luisaf1977@email.com", "(18) 9 6814-2561");
        
        System.out.println("Usuários criados");

        Livro livro1 = new Livro(
            "Clean Code",
            "Robert C. Martin",
            "9780132350884",
            "Usado - bom estado"
        );

        Livro livro2 = new Livro(
            "Java: Como Programar",
            "Deitel",
            "9788576052452",
            "Usado - com marcas"
        );

        System.out.println("Livros criados");
        
        Anuncio anuncio1 = new Anuncio(
            livro1,
            usuario1,
            80.0,
            "Livro bem conservado."
        );

        Anuncio anuncio2 = new Anuncio(
            livro2,
            usuario2,
            50.0,
            "Algumas páginas grifadas."
        );
        
        System.out.println("Anúncios criados");

        System.out.println("Anúncios:");
        System.out.println(anuncio1.info());
        System.out.println();
        System.out.println(anuncio2.info());

        System.out.println("\nAtualizando Dados");

        usuario1.setNome("João Pedro");
        livro1.setEstado("Usado - excelente estado");
        anuncio1.setPreco(75.0);

        System.out.println("\nAnúncio Atualizado");
        System.out.println(anuncio1.info());

        System.out.println("\nTroca de Vendedor");
        anuncio1.setVendedor(usuario2);

        System.out.println(anuncio1.info());

        System.out.println("\nTeste Concluído");
    }
}