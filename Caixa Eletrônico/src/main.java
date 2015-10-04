
public class main 
{
	public static void main(String args[])
	{
		TestarBusca bin = new TestarBusca();
		
		int [][] vetor = {
						  	{3,2},
						  	{5,3},
						  	{6,9},
						  	{7,13},
						  	{10,15}
						  };
		
		System.out.println(bin.buscaBinaria(vetor, 6, 14));
	}
}
