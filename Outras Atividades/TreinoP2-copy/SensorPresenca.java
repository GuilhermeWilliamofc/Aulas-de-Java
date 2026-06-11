public class SensorPresenca extends Sensor{
	public SensorPresenca(String identificador, boolean ativo){
		super(identificador, ativo);
	}

	@Override
	public void realizarLeitura(){
		String movimentoTexto;
		ultimaLeitura = (int) (Math.random() * 2);
		
		if (ultimaLeitura == 0){
			movimentoTexto = "Sem Movimento";
		} else {
			movimentoTexto = "Movimento";
		}

		System.out.printf("Sensor %s: Leitura realizada = %.2f (%s)\n", identificador, ultimaLeitura, movimentoTexto);
	}

	@Override
	public void exibirDados(){
		String statusTexto;
		if (isAtivo()){
			statusTexto = "Ativo";
		} else {
			statusTexto = "Inativo";
		}

		System.out.println("Sensor de Presenca");
		System.out.printf("Identificador: %s\n", identificador);
		System.out.printf("Status: %s\n", statusTexto);
		System.out.printf("Ultima Leitura: %.2f\n", ultimaLeitura);
	}
}