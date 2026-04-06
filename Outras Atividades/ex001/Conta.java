public class Conta{
    int numero;
    String titular; // string com S maiusculo
    double saldo;

    void deposita(double valor){
        if (valor > 0){
            this.saldo += valor;
            System.out.println("Valor de R$" + valor + " depositado!");
        }
        else{
            System.out.println("Nao foi possivel depositar, valor negativo ou nulo!");
        }
    }

    boolean saca(double valor){
        if (valor > this.saldo){
            System.out.println("Valor insuficiente para sacar!");
            System.out.println("Voce possui R$" + this.saldo + " mas quer sacar R$ " + valor);
            return false;
        }
        else{
            System.out.println("Valor de R$" + valor + " sacado!");
            return true;
        }
    }
}