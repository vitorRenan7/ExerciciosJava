package numerospares;

import java.util.Scanner;

public class Numero {
    Scanner scanner = new Scanner(System.in);

    private int numero;


    public Numero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }




    public int verificarNumero(){

        System.out.printf("Digite um número: ");
        setNumero(scanner.nextInt());

        if(getNumero() %2 == 0){
            System.out.printf("O número %d é par", getNumero());
        }else{
            System.out.printf("O número %d é ímpar", getNumero());
        }

        int numeroVerificado = getNumero();

        return numeroVerificado;
    }
//O operador % retorna o resto da divisão inteira de um número pelo outro.
//O número é par, se o resto da divisão por 2 for igual a 0.
}
