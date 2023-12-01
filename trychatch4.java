package aula11;

import java.util.Scanner;

public class trychatch4 {
    public static void main(String[] args) {
        try {
        Scanner scQuantia = new Scanner(System.in);
        System.out.println("Digite o valor da quantia que deseja depositar");
        long quantia = scQuantia.nextLong();

        if (quantia > 1500000000000000000L) {
            System.out.println("Valor muito alto para deposito! tente outro valor menor.");
        } else {
            System.out.println("Valor depositado com sucesso!");
        }
        scQuantia.close();

    } catch (Exception e) {
        System.out.println("Ops! ocorreu o erro " + e);
    }   
}
}
