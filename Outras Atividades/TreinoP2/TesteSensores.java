import java.util.Scanner;

public class TesteSensores{
    public static void main(String[] args){
        System.out.println("SISTEMA DE MONITORAMENTO DE SENSORES IoT");
        
        System.out.println("DADOS INICIAIS DOS SENSORES");

        Sensor[] sensores = new Sensor[2];

        sensores[0] = new SensorTemperatura("TEMP-01", true, 25.0);
        sensores[1] = new SensorPresenca("PRES-01", true);

        for (int i = 0; i < 2; i++){
            sensores[i].exibirDados();
        }

        System.out.println("INICIANDO LEITURAS");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas rodadas de leitura deseja realizar: ");
        int rodadas = scanner.nextInt();

        for (int i1 = 0; i1 < rodadas; i1++){
            for (int i2 = 0; i2 < 2; i2++){
                if (sensores[i2].verificarConexao()){
                    sensores[i2].realizarLeitura();
                }
                else {
                    System.out.println("O sensor está desconectado!");
                }
            }
        }

        System.out.println("TESTE DE REFERÊNCIA GENÉRICA (Interface Monitoravel)");
        
        Monitoravel sensorTemp = (Monitoravel) sensores[0];
        System.out.printf("Conexão ativa: %b\n", sensorTemp.verificarConexao());
        sensorTemp.enviarAlerta("Alerta de Teste");
    }
}