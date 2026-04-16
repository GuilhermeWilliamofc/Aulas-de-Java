public class Programa
{
    public static void main(String[] args)
    {
        FuncionarioDoTime t1 = new FuncionarioDoTime();
        t1.setNome("Fulano");
        t1.setIdade(22);
        t1.setSalario(2000);
        t1.exibirDados();

        Tecnico tecnico = new Tecnico();
        tecnico.setNome("Ciclano");
        tecnico.setIdade(46);
        tecnico.setSalario(20000);
        tecnico.setAnos_restante_contrato(5);
        tecnico.setNumero_de_vitorias(150);
        tecnico.exibirDados();

        Jogador jogador = new Jogador();
        jogador.setNome("Beltrano");
        jogador.setIdade(23);
        jogador.setSalario(15000);
        jogador.setNumeroCamisa(10);
        jogador.setPosicao("Atacante");
        jogador.setQuantidade_de_gols(80);
        jogador.exibirDados();

        
        // Polimorfismo
        System.out.println("\nUtilizando Polimorfismo:\n");
        FuncionarioDoTime funcionario;

        funcionario = tecnico;
        funcionario.exibirDados();

        funcionario = jogador;
        funcionario.exibirDados();
    }
}