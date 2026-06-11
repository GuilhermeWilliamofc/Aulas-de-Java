import java.util.Scanner;

public class TesteSensores{
	public static void main(String[] args){
		System.out.println("SISTEMA DE MONITORAMENTO DE SENSORES IoT");

		Sensor[] sensores = new Sensor[2];
		sensores[0] = new SensorTemperatura("TEMP-01", true, 25.0);
		sensores[1] = new SensorPresenca("PRES-01", true);

		for (int i = 0; i < 2; i++){
			sensores[i].exibirDados();
		}

		Scanner scanner = new Scanner(System.in);
		System.out.println("Quantas rodadas de leitura deseja realizar: ");
		int limite = scanner.nextInt();

		scanner.close();

		for (int i = 0; i < limite; i++){
			for (int i2 = 0; i2 < 2; i2++){
				if (sensores[i2].verificarConexao()){
					sensores[i2].realizarLeitura();
				} else {
					System.out.println("O Sensor está desconectado!");
				}
	
			}
		}

		Monitoravel teste = (Monitoravel) sensores[0];
		System.out.printf("Status de Conexao: %b\n", teste.verificarConexao());
		teste.enviarAlerta("Teste de alerta via interface");
	}
}