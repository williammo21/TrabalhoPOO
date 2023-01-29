

import java.util.Scanner;
public class TrabalhoPOO1{
	public static void main(String[] args) {
        Scanner Read = new Scanner(System.in);
        System.out.println("escreva uma palavra com 5 letras: "); 
	String texto = Read.next(); 
	String read = null; 
	int tamanho = read.length();

    if (tamanho == 5) {
			
			char palavra[]= texto.toCharArray();
			for (int i = 0;i < tamanho;i++) {
				for(int j=0; j< tamanho;j++) {
					for(int x =0;x<tamanho;x++) {
						System.out.print(palavra[i]);
						
					System.out.print(palavra[j]);
						
				    System.out.print(palavra[x]);
						
				System.out.println("");
					}
				}
			}
				
		}else{
			

        System.out.println("Error");

	

}
}
}