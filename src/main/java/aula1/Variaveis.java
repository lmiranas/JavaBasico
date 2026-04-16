/*
Cálculo do IMC

Desenvolva um programa que calcule o Índice de Massa Corporal (IMC) de uma pessoa. O programa deve:
Ler o nome, peso (em kg) e altura (em metros)
Calcular o IMC usando a fórmula: IMC = peso / (altura²)
Exibir o nome da pessoa e seu IMC
Entrada: Nome (String), peso (double), altura (double) Saída: Mensagem com nome e IMC

Salário com Bônus

Um funcionário recebe um salário e um bônus. Escreva um programa que:
Leia o nome do funcionário
Leia o salário base
Leia a porcentagem do bônus
Calcule o valor do bônus (salário × porcentagem / 100)
Calcule o salário final (salário + bônus)
Exiba o nome, salário base, valor do bônus e salário final
Entrada: Nome, salário base, porcentagem de bônus Saída: Detalhamento do cálculo
*/



package main.java.aula1;
import java.util.Scanner;

public class Variaveis {

    public static void menu(){
        System.out.println("Escolha uma das opções:");
        System.out.println("1 - IMC");
        System.out.println("2 - Bônus");

        Scanner scanner = new Scanner(System.in);

        int opcao = scanner.nextInt();

        switch(opcao){
            case 1:
                imc();
                break;
            case 2:
                bonus();
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    public static void imc(){
        String nome;
        float peso, altura, imc;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calcule IMC\n");

        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Digite seu peso: ");
        peso = Float.parseFloat(scanner.nextLine());

        System.out.println("Digite sua altura: ");
        altura = Float.parseFloat(scanner.nextLine());

        imc = peso / (altura * altura);

        System.out.println(
                nome + ", seu peso é " + peso + " e sua altura é " + altura + " com I.M.C de " + imc);
    }

    public static void bonus(){
        String nome;
        double salario_base,salario_final,  percentual, b;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calcule Bônus\n");

        System.out.println("Digite o nome do funcionário: ");
        nome = scanner.nextLine();

        System.out.println("Digite o salário base: ");
        salario_base = Float.parseFloat(scanner.nextLine());

        System.out.println("Digite a porcentagem do bonus: ");
        percentual = Float.parseFloat(scanner.nextLine());

        b = (salario_base  * percentual) / 100.0;
        salario_final = b + salario_base;

        System.out.println(
                nome + ", seu salário é " + salario_base + " com percentual de bônus " + percentual + " e seu salário final é de " + salario_final);
    }

    public static void main(String[] args) {
        menu();
    }

}

