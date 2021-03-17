
package classe;

import java.util.Scanner;

public class DepTransitoSpPesquisa {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

		int anoNascimento = 1;
		char sexo = '0';
		int codRegistro = 0;
		int cont = 0;
		float percMotoristaMenor25, quantMotoristaMenor25 = 0;
		float percMulheres, quantMulheres = 0;
		float percMotoristaComRegForaSP, quantMotoristaComRegForaSP = 0;


		while (anoNascimento > 0) {
			System.out.println("Informe o ano de nascimento do motorista: ");
			anoNascimento = teclado.nextInt();
			
			if(anoNascimento > 0) {
			System.out.println("Informe o sexo > F (Feminino) ou M (Masculino): ");
			sexo = teclado.next().charAt(0);
			System.out.println("Informe o código de registro > 1 (SP) ou 0 (demais registros): ");
			codRegistro = teclado.nextInt();
			

			if (2020 - anoNascimento < 25) {
				quantMotoristaMenor25++;

			}
			if (sexo == 'f' || sexo == 'F') {
				quantMulheres++;
			}
			if (codRegistro == 0) {
				quantMotoristaComRegForaSP++;
			}
			cont++;
			}

		}
		percMotoristaMenor25 = quantMotoristaMenor25 / cont * 100;
		percMulheres = quantMulheres / cont * 100;
		percMotoristaComRegForaSP = quantMotoristaComRegForaSP / cont * 100;
		
		System.out.println("Quantidade de Motorista com menos de 25 anos: " + quantMotoristaMenor25);
		System.out.println("Quantidade de mulheres: " + quantMulheres);
		System.out.println("Quantidade de motorista com registro fora de SP: " + quantMotoristaComRegForaSP);
		System.out.println("Quantidade de pessoas envolvidas na compilação de dados: " + cont);
		System.out.println("Percentual de motorista com menos de 25 anos " + percMotoristaMenor25 + " %");
		System.out.println("Percentual de mulheres " + percMulheres + " %");
		System.out.println("Percentual de motorista com registro fora de SP " + percMotoristaComRegForaSP + " %");
        
        
    }
    
}
