public class SensorTemperatura extends Sensor{
	private double temperaturaMaxima;

	public SensorTemperatura(String identificador, boolean ativo, double temperaturaMaxima){
		super(identificador, ativo);
		this.temperaturaMaxima = temperaturaMaxima;
	}

	@Override
	public void realizarLeitura(){
		this.ultimaLeitura = Math.random() * (35 - 15 + 1) + 15;
		System.out.printf("Sensor %s: Leitura realizada = %.2f°C\n", identificador, ultimaLeitura);
	}

	@Override
	public void exibirDados(){
		String status;
		if (isAtivo()){
			status = "Ativo";
		} else {
			status = "Inativo";
		}

		System.out.println("Tipo de Sensor: Temperatura");
		System.out.printf("Identificador: %s\n", identificador);
		System.out.printf("Status: " + status + "\n");
		System.out.printf("Ultima Leitura: %.2f°C\n", ultimaLeitura);
	}
}