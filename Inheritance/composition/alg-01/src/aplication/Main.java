package aplication;

import entities.Adress;
import entities.People;
import entities.Phones;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        System.out.println("Entre com seu nome: ");
        String name = sc.nextLine();
        System.out.println("Entre com seu genero (f)/(m) ?");
        char gender = sc.next().charAt(0);
        System.out.println("Entre com sua idade: ");
        int age = sc.nextInt();
        System.out.println("Entre com seu peso: ");
        double weigth = sc.nextDouble();

        System.out.println();
        System.out.println("-- Preencha seu endereço --");
        System.out.println();

        System.out.print("Cep:");
        int cep = sc.nextInt();
        sc.nextLine();
        System.out.print("Logradouro: ");
        String logradouro = sc.nextLine();
        System.out.print("referencia: ");
        String referencia = sc.nextLine();
        System.out.print("cidade: ");
        String city = sc.nextLine();
        System.out.print("estado: ");
        String state = sc.nextLine();

        System.out.println();
        System.out.println("-- Preencha seu Telefone --");
        System.out.println();

        System.out.println("Telefone pessoal: ");
        int phoneR = sc.nextInt();

        System.out.println("Telefone residencial: ");
        int residential = sc.nextInt();

        People people = new People(name, gender, age, weigth, new Adress(logradouro, cep, referencia, city, state),
                new Phones(phoneR, residential));

        System.out.println(people);


    }
}
