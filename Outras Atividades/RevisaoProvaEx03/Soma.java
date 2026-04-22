public class Soma
{
    private int limite;
    
    Soma(int limiteDigitado){
        setLimite(limiteDigitado);
    }
    
    public int getLimite(){
        return limite;
    }
    
    public void setLimite(int novoLimite){
        this.limite = novoLimite;
    }
    
    public void calcularSoma(){
        int somaTotal = 0;
        
        for(int i = 1; i <= this.limite; i++){
            if (i < this.limite){
                System.out.print(i + "+");
                somaTotal += i;
            }
            else {
                somaTotal += i;
                System.out.print(i + " = " + somaTotal);
            }
        }
    }
}