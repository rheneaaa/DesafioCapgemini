package Respostas;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class questao2 {
    
    String senha = "";
		
		char[] charSearch = {'!','@','#','$','%','^','&','*','(',')','-','+'};
		boolean validacao = false;
		
		while (validacao != true) {
			
			senha = JOptionPane.showInputDialog("Digite a sua senha\n\n"
					+ "Critérios de validação:\n"
					+ "Possuir no mínimo 6 caracteres\n"
					+ "Conter no mínimo 1 digito\n"
					+ "Conter no mínimo 1 letra em minúscula\n"
					+ "Conter no mínimo 1 letra em maiúscula\n"
					+ "Conter no mínimo 1 caractere especial\n"
					+ "Os caracteres especiais são: !@#$%^&*()_+\n");			
			
			int tam = senha.length();
			
			if (tam <= 5 || tam >= 7) { // verifica se a senha é maior ou menor que 6
				int caracs = 6 - tam;
				System.out.println("Você digitou " + tam + " caracteres, ainda faltam " + caracs + " para completar 6 caracteres.");
			} else {
                            int q = 0;
                            int w = 0;
                            int e = 0;
                            int r = 0;
				for (int i = 0; i < senha.length(); i++) { // verifica se contém um número
					char c = senha.charAt(i);
					if (Character.isDigit(c)) {
                                            q = q + 1;
						if (Character.isLowerCase(c)) { // verifica se tem minuscula
                                                    w = w + 1;
							if (Character.isUpperCase(c)) { // verifica se tem maiuscula
                                                            e = e + 1;
								for (int j = 0; j < charSearch.length; j++) { // verifica se há caracteres
									if (charSearch[j] == c) {
                                                                            r = r + 1;
									}
								}
							}
						} else{
                                                    System.out.println(c);
                                                }
						}
					} 
                                        if (q == 0){
                                            validacao = false;
                                        } else if (w == 0) {
                                            validacao = false;
                                        } else if (e == 0) {
                                            validacao = false;
                                        } else if (r == 0) {
                                            validacao = false;
                                        } else {
                                            validacao = true;
                                        }
				}
			}	
	System.out.println("Senha cadastrada com sucesso");
}