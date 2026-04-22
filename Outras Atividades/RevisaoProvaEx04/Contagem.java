public class Contagem
{
    private int limite;
    
    Contagem(int limiteDigitado){
        setLimite(limiteDigitado);
    }
    
    public int getLimite(){
        return limite;
    }
    
    public void setLimite(int novoLimite){
        this.limite = novoLimite;
    }
    
    public void contar(){
        for(int i = 1; i <= this.limite; i++){
            // se for par
            if (i % 2 == 0){
                continue;
            }
            // se for o ultimo valor
            else if (i % 2 != 0 && i == this.limite || i % 2 != 0 && i+1 == this.limite){
                System.out.print(i);
            }
            // se for impar
            else {
                System.out.print(i + ", ");
            }
        }
    }
}