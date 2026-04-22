public class ParOuImpar
{
    private int numero;
    
    ParOuImpar(int numeroDigitado){
        setNumero(numeroDigitado);
    }
    
    public void setNumero(int numeroDigitado2){
        this.numero = numeroDigitado2;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void parImpar(){
        // se for par
        if (this.numero % 2 == 0){
            System.out.println("O numero " + this.numero + " eh par!");
        }
        else{
            System.out.println("O numero " + this.numero + " eh impar!");
        }
    }
}