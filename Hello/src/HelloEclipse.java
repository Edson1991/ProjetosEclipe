import java.util.Scanner;

public class HelloEclipse{
    
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int idade=0;
        int cont=0;
        double soma=0;
       
        while (true){
        	System.out.println("Digite um valor inteiro");
            idade = teclado.nextInt();
            if (idade < 0){
                break;
            }
            soma = soma + idade;
            cont++;            
        }
        System.out.printf("A m�dia dos valores digitados �: %.2f%n",soma/cont);
        teclado.close();
    }
}

