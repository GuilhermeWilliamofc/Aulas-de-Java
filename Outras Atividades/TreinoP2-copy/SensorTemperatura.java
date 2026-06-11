public class SensorTemperatura extends Sensor{
	private double temperaturaMaxima;

	public SensorTemperatura(String identificador, boolean ativo, double temperaturaMaxima){
		super(identificador, ativo);
		this.temperaturaMaxima = temperaturaMaxima;
	}
	
	@Override
	public void realizarLeitura(){
		this.ultimaLeitura = (Math.random() * (35.0 - 15.0)) + 15.0;
		System.out.printf("Sensor %s: Leitura realizada = %.2f°C\n", identificador, ultimaLeitura);
	}

	@Override
	public void exibirDados(){
		String statusTexto;
		if (isAtivo()){
			statusTexto = "Ativo";
		} else {
			statusTexto = "Inativo";
		}

		System.out.println("Sensor de Temperatura");
		System.out.printf("Identificador: %s\n", identificador);
		System.out.printf("Status: %s\n", statusTexto);
		System.out.printf("Ultima Leitura: %.2f°C\n", ultimaLeitura);
	}
}