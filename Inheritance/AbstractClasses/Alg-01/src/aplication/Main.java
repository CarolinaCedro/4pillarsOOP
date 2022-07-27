package aplication;

import entities.*;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        List<Mamifero> mamiferos = new ArrayList<>();
        List<Ave> aves = new ArrayList<>();

        System.out.println("Quantos animais desejam cadastrar: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("--------------------------------");
            System.out.println("Escolha a categoria do animal: ");
            System.out.println("(1)Mamifero");
            System.out.println("(2)Ave");
            int op = sc.nextInt();
            if (op == 1) {
                sc.nextLine();
                System.out.println("Entre com o nome do Animal: ");
                String nome = sc.nextLine();
                System.out.println("Entre com o tipo: ");
                System.out.println("(1)Cachorro");
                System.out.println("(2)Gato");
                int opMamifero = sc.nextInt();

                if (opMamifero == 1) {
                    sc.nextLine();
                    System.out.println("Tamanho: ");
                    double tamanho = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Raca: ");
                    String raca = sc.nextLine();
                    Cachorro cachorro = new Cachorro(nome, tamanho, raca);
                    mamiferos.add(cachorro);
                } else {
                    sc.nextLine();
                    System.out.println("Raca: ");
                    String raca = sc.nextLine();
                    Gato gato = new Gato(nome, raca);
                    mamiferos.add(gato);
                }
            } else {
                sc.nextLine();
                System.out.println("Entre com o nome do Animal: ");
                String nome = sc.nextLine();
                Papagaio papagaio = new Papagaio(nome);
                aves.add(papagaio);
            }
        }

        System.out.println(" -- Animais cadastrados --");
        System.out.println();

        System.out.println("Mamiferos =>");
        for (Mamifero listMamifero : mamiferos
        ) {
            System.out.println(listMamifero);
        }

        System.out.println("Aves");
        for (Ave listAves : aves
        ) {
            if (listAves == null) {
                System.out.println("Não possui aves cadastradas no sistema!!");
            } else {
                System.out.println(listAves);
            }

        }

        System.out.println("Relatorio criado em " + sdf.format(new Date()));

    }
}
