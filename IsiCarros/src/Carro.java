/* Quando eu declaro uma classe, na verdade eu estou declarando um novo tipo de dado (estrutura)
 * Neste caso, o tipo de CARRO cont�m propriedades (atributos) que s�o: Marca, modelo, ano, cor e pre�o.
 */

public class Carro {
	
	String marca;
	String modelo;
	String cor;
	int    ano;
	double preco;	
	
	
	//m�todo IMPRIMIR 
	void imprimir(){
		System.out.println("");
		System.out.println("--------CARRO---------");
		System.out.println("Marca: "+marca+"/"+modelo);
		System.out.println("Ano: "+ano+ " / Cor: "+cor);
		System.out.println("Pre�o: R$ "+preco);
	}
	
	/*m�todo calculo IPVA que retorna valor do IPVA
	 * metodo � um trecho de codigo, como todo trecho codigo ele segue o padr�o E-> P-> S
	 * a declara��o do metodo � feita da seguinte forma:
	 * 
	 * tipo Saida  nomeMetodo (lista de paramentos de entrada){
	 * .... logica (processamento)
	 * }
	 * 
   */
	double calcularIPVA() {
		double valorIpva;
		if (ano < 2000) {
			valorIpva = 0;
		}
		else 
			valorIpva = preco * 0.04;
		return valorIpva;
	}
}
