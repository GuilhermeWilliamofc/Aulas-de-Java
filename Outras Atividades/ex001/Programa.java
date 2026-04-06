public class Programa {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.deposita(500);

        Conta conta2 = new Conta();
        conta2.deposita(500);

        conta1.saca(500);
        conta2.saca(501);
    }
}