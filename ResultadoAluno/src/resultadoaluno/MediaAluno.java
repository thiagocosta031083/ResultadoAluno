
package resultadoaluno;

import java.util.Scanner;


public class MediaAluno {
    public String aluno;
    public double nota1,nota2,nota3,nota4,media;
          
    public void situacaoAluno(){//Declaração do Método
    Scanner ler = new Scanner (System.in);
    System.out.println("Digite o nome do aluno:");
        aluno = ler.nextLine();
    System.out.println("Digite a primeira nota:");
        nota1 = ler.nextInt();
    System.out.println("Digite a segunda nota:");
        nota2 = ler.nextInt();
    System.out.println("Digite a terceira nota:");
        nota3 = ler.nextInt();
    System.out.println("Digite a quarta nota:");
        nota4 = ler.nextInt();
    ler.close();//objeto.close() = fecha o a função scanner
    media = (nota1+nota2+nota3+nota4)/4;
    
    if (media>=7.0){
        System.out.println("O "+aluno +" está APROVADO com a nota: "+media);
    }else if (media<5.0){
        System.out.println("O "+aluno +" está REPROVADO com a nota: "+media);
    }else {
        System.out.println("O "+aluno +" está EM RECUPERAÇÃO com a nota: "+media);
    }
    }   
}
