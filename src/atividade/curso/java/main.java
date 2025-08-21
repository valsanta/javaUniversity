package atividade.curso.java;

public class main {
    public static void main(String[] args) {
        String nome = "Alice";
        //Notas: Matemática, Física, Química
        int[] notas = {85, 92, 78};

        // Calculo da média
        int soma = 0;
        for (int nota : notas) {
            soma += nota;
        }
       double media = soma/notas.length;

        // Verificação de aprovação
        String status;
        if (media >= 60) {
            status = "Aprovado";
        } else {
            status = "Reprovado";
        }

        int notaMaisAlta = notas[0];
        int notaMaisBaixa = notas[0];
        for (int nota : notas) {
            if (nota > notaMaisAlta) {
                notaMaisAlta = nota;
            }
            if (nota < notaMaisBaixa) {
                notaMaisBaixa = nota;
            }
        }


        //Dados foram armazenados nas variáveis
        System.out.println("Dados armazenados");
        //Exibir notas  solicitadas
        System.out.println("Notas da aluna " + nome + ":");
        System.out.println("Matemática :" + notas[0]);
        System.out.println("Física :" + notas[1]);
        System.out.println("Química :" + notas[2]);
        System.out.println("Nota média do aluno " +media);
        System.out.println("O aluno foi " +status);
        System.out.println("A nota mais alta foi: " +notaMaisAlta);
        System.out.println("A nota mais baixa foi: " +notaMaisBaixa);

    }
    }


