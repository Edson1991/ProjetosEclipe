package ui;
import core.BombaDeCombustivel;

public class Posto {
	public static void main(String[] args) {

		// estou passando logo no come�o os atributos para o metodo construtor
		// que s� ir� rodar uma vez no inicio do programa.
		
		System.out.println("*************VALORES INICIAIS DA BOMBA*************");
		BombaDeCombustivel b1 = new BombaDeCombustivel("Vazio", 0.00, 0.00, 0.00);
		System.out.println(b1.exibirComprovante());
					
		System.out.println("Frentista: Qual vai ser a boa hoje?");
		System.out.println("Cliente:   Abastece 50 litros de Alcool, por favor!");
		
		b1.setNomeCombustivel("Alcool");
		b1.setValorCombustivel(3.00);
		b1.abastecerPorLitros(50.00);		
		
		System.out.println(b1.exibirComprovante());	
		
		System.out.println("Frentista: Qual vai ser a boa hoje?");
		System.out.println("Cliente:   Abastece R$50,00 de gasolina, por favor!");
		
		b1.setNomeCombustivel("Gasolina");
		b1.setValorCombustivel(5.50);
		b1.abastecerPorValor(50.00);
		
		System.out.println(b1.exibirComprovante());	
		
	}
}
