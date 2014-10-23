import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class PattysChallenge {

	public static void main(String[] args) {
		try {
			File f = new File("/home/alunos5/numeros");
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			int [] numeros = new int[10];
			
			int pares =0;
			int impares = 0;
			String linha;
			while((linha = br.readLine()) != null){
				
				if(Integer.parseInt(linha) % 2 == 0)
					pares++;
				else
					impares++;
				
				numeros[Integer.parseInt(linha)]++;				
			}
			
			System.out.println("Existem " + pares + " números pares.");
			System.out.println("Existem " + impares + " números ímpares.");
			
			for(int i =0 ; i<10; i++){
//				System.out.println("O número: " + i + " se repetiu " + numeros[i] + " vezes.");
				System.out.println(i+" " + numeros[i]);
			}
				
			
			
		} catch (Exception ex) {
			
			System.out.println(ex.getMessage());

		}
		

	}

}
