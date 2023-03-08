package curso_progamacao;

import java.util.Scanner;

public class login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.println("Insira a senha: ");
		x= sc.nextInt();
		
		while(x!=12345) {
			System.out.println("senha inválida!");
			x= sc.nextInt();
		}
		System.out.println("senha correta amigo.");
		sc.close();

	}

}
