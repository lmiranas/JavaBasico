package main.java.aula2;

/*
Validação de Login

Crie um programa que simule um login. O programa deve:
Ler um nome de usuário e uma senha
Verificar se o usuário é "admin" E a senha é "1234"
Se ambos estiverem corretos, exiba "Login realizado!"
Caso contrário, exiba "Usuário ou senha incorretos"
Entrada: Usuário e senha Saída: Mensagem de sucesso ou erro
 */

/*
Soma de N Números

Desenvolva um programa que:
Leia a quantidade de números a serem informados
Leia N números inteiros
Calcule a soma de todos os números
Calcule a média
Exiba soma e média
Entrada: Quantidade N, seguida de N números Saída: Soma e média dos números
 */

/*
Classificação de Notas

Faça um programa que leia uma nota (0 a 10) de um aluno e classifique-a conforme:
9-10: Excelente
7-8.9: Bom
5-6.9: Satisfatório
0-4.9: Insuficiente
Entrada: Uma nota em decimal Saída: Classificação da nota
 */


import java.lang.reflect.Array;
import java.util.Scanner;

public class EstruturasCondicionais {

    public static void menu(){
        System.out.println("Escolha uma das opções:");
        System.out.println("1 - Login");
        System.out.println("2 - Números");
        System.out.println("3 - Notas");

        Scanner scanner = new Scanner(System.in);

        int opcao = scanner.nextInt();

        switch(opcao){
            case 1:
                login();
                break;
            case 2:
                numeros();
                break;
            case 3:
                notas();
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    public static void login(){
        String usuario;
        Double senha;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Login\n");

        System.out.println("Digite o usuário: ");
        usuario = scanner.nextLine();

        System.out.println("Digite a senha: ");
        senha = scanner.nextDouble();

        if(usuario.equals("admin") || senha.equals(1234)){
            System.out.println("Login realizado com sucesso!");
        }else{
            System.out.println("Usuário ou senha incorretos!");
        }
    }

    public static void numeros(){
        int n, i = 0, s = 0, m = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Soma e média números\n");

        System.out.println("Digite a quantidade de números: ");
        n = scanner.nextInt();

        while(i < n){
            System.out.println("Insira o número " + (i+1) +":");
            s = s + scanner.nextInt();
            i++;
        }

        m = s/n;

        System.out.println("Soma: " + s + " Média: " + m);
    }

    public static void notas(){
        System.out.println("Digite a nota do aluno:");

        Scanner scanner = new Scanner(System.in);

        Double nota = scanner.nextDouble();

        if(nota >= 0.0 && nota <= 4.9)
            System.out.println("Insuficiente");
        if(nota >= 5.0 && nota <= 6.9)
            System.out.println("Satisfatório");
        if(nota >= 7.0 && nota <= 8.9)
            System.out.println("Bom");
        if(nota >= 9.0 && nota <= 10.0)
            System.out.println("Excelente");
        if(nota < 0.0 || nota > 10.0)
            System.out.println("Nota Inválida!");
    }

    public static void main(String[] args) {
        menu();
    }

}
