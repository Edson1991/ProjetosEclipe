
public class EmpregadoTeste {
	public static void main(String[] args) {
		Empregado e1 = new Empregado();
		Empregado e2 = new Empregado();
		
		e1.nome = "Isidro";
		e1.cargo = "Professor";
		e1.salario = 10000.00;
		
		e2.nome = "Edson";
		e2.cargo = "Engenheiro";
		e2.salario = 20000.00;
		
		System.out.println("-------> Ordenado antes do aumento ....");
		e1.imprimir();
		e2.imprimir();
		
		System.out.println("-------> Aumentando salario <----------");
		System.out.println("");
			
		e1.aumentarSalario(15.0);
		e2.aumentarSalario(10.0);
		
		System.out.println("-------> Ordenado depois do aumento ....");
		e1.imprimir();
		e2.imprimir();
	}
}
