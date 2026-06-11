public abstract class Sensor implements Monitoravel{
	protected String identificador;
	private boolean ativo;
	protected double ultimaLeitura;

	public Sensor(String identificador, boolean ativo){
		this.identificador = identificador;
		this.ativo = ativo;
		this.ultimaLeitura = 0.0;
	}

	@Override
	public boolean verificarConexao(){
		return ativo;
	}

	@Override
	public void enviarAlerta(String mensagem){
		System.out.printf("ALERTA %s: %s", identificador, mensagem);
	}

	public String getIdentificador(){
		return identificador;
	}

	public double getUltimaLeitura(){
		return ultimaLeitura;
	}

	public boolean isAtivo(){
		return ativo;
	}

	public abstract void realizarLeitura();
	public abstract void exibirDados();
}