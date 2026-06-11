public class SensorPresenca extends Sensor{
    public SensorPresenca(String identificador, boolean ativo){
        super(identificador, ativo);
    }

    @Override
    public void realizarLeitura(){
        // adicionar depois ativo mudando dependendo se eh true ou false "status é “Movimento” ou “Sem movimento”"
        String status;
        
        this.ultimaLeitura = (int) (Math.random() * 2);
        
        if (ultimaLeitura == 1){
            status = "Movimento";
        } else {
            status = "Sem Movimento";
        }

        System.out.printf("Sensor %s: Leitura realizada = %.2f (%s)\n", identificador, ultimaLeitura, status);
    }

    @Override
    public void exibirDados(){
                String status2;
        if (isAtivo()){
            status2 = "Ativo";
        } else {
            status2 = "Inativo";
        }

        System.out.println("Tipo de Sensor: Presença");
        System.out.printf("Identificador: %s\n", identificador);
        System.out.printf("Status: %s\n", status2);
        System.out.printf("Ultima Leitura: %.2f\n", ultimaLeitura);
    }
}