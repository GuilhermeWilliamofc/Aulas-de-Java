public class ConversorTemperatura{
    private double temperatura;
    private String unidadeTemperatura;

    ConversorTemperatura(double temp; String unidadeTemp){
        this.temperatura = temp;
        this.unidadeTemperatura = unidadeTemp;
    }

    public double getTemperatura(double temperatura){
        return temperatura;
    }

    public void setTemperatura(double novaTemperatura){
        this.temperatura = novaTemperatura;
    }

    public String getUnidadeTemperatura(){
        return unidadeTemperatura;
    }

    public void setUnidadeTemperatura(int numero){
        if (numero == 0){ // se for 0 (Celsius)
            this.unidadeTemperatura = "Celsius";
        }
        elif (numero = 1){ // se for 1 (Fahrenheit)
            this.unidadeTemperatura = "Fahrenheit";
        }
        else{
            System.out.println("Erro! Coloque 0 para Celsius e 1 para Fahrenheit");
        }
    }

    public double converter(){
        if (this.unidadeTemperatura == "Celsius"){
            double calculo = (this.temperatura * 1.8) + 68;
            return calculo;
        }
        elif (this.unidadeTemperatura == "Fahrenheit"){
            double calculo = (this.temperatura - 32) / 1.8;
            return calculo;
        }
        else{
            System.out.println("Erro no Calculo! Coloque a Unidade de Temperatura:\n0 para Celsius e 1 para Fahrenheit");
        }
    }
}