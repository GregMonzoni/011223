package aula11;

import java.util.Scanner;

public class switchcase1 {
    public static void main(String[] args) {
        String[] cores = {"azul","laranja", "amarelo","vermelho","verde"};
        Scanner scCor = new Scanner(System.in);
        for (int c = 0; c < cores.length; c++) {
        System.out.println("cor [ " + c + " ] - " + cores[c]);
        }
        System.out.println("Digite o código de uma das cores acima");
        short cor = scCor.nextShort();

        switch (cor) {
            case 0:
                System.out.println("Voce escolheu a cor " +cores[0]);                
                break;
        
            case 1:
                System.out.println("Voce escolheu a cor " +cores[1]);                
                break;
        
            case 2:
                System.out.println("Voce escolheu a cor " +cores[2]);                
                break;
        
            case 3:
                System.out.println("Voce escolheu a cor " +cores[3]);                
                break;
        
            case 4:
                System.out.println("Voce escolheu a cor " +cores[4]);                
                break;
        
            default:
                System.out.println("Ops! cor não encontrada");
                break;
        }
        scCor.close();
    }
}
