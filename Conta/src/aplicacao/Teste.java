package aplicacao;

import java.util.ArrayList;
import java.util.Scanner;

import model.ContaBancaria;
import model.ContaPoupanca;

public class Teste {
	public static void main(String[] args) {
		//ContaBancaria conta = new ContaBancaria(1234);
		int numContas;
		int senha;
		int taxa;
		ArrayList<ContaBancaria> contas = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		System.out.println("quantas contas você deseja criar");
		numContas = Integer.parseInt(s.nextLine());
		for (int i = 0; i< numContas; i++){
			int tipo;
			System.out.println("----------------------------------------------");
			System.out.println("Informe o tipo de conta que você deseja criar");
			System.out.println("Digite 1 para Conta Poupança");
			System.out.println("Digite 2 para Conta Corrente");
			System.out.println("----------------------------------------------");
			tipo = Integer.parseInt(s.nextLine());
			if(tipo == 1){
				System.out.println("Digite sua senha");
				senha = Integer.parseInt(s.nextLine());
				System.out.println("Informe a taxa de rendimento");
				taxa= Integer.parseInt(s.nextLine());
				ContaPoupanca conta = new ContaPoupanca(senha, taxa);
			}
		}
		
	}
}
