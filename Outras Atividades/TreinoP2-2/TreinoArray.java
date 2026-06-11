public class TreinoArray{
	public static void main(String[] args){
		int[] idades = new int[5];
		int soma = 10;

		for (int i = 0; i < 5; i++){
			idades[i] = soma;
			soma += 10;
		}

		for (int i = 0; i < 5; i++){
			int num = idades[i];
			System.out.printf("%d ", num);
		}
	}
}