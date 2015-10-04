
public class TestarBusca
{
	public static boolean buscaBinaria(int vet[][],int login, int senha) {
		final int n = vet.length;
		int inicio=0,fim=n-1,meio;
		while (inicio<=fim){
			meio=(inicio+fim)/2;
			if (login == vet[meio][0] && senha == vet[meio][1])
				return true;
			else
				if (vet[meio][0] < login)
					inicio = meio+1;
				else
					fim = meio-1;
		}
		return false;
	}

}
