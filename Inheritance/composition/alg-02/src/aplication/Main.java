package aplication;

import entities.Agenda;
import entities.Contato;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Contato> contatoList = new ArrayList<>();

        System.out.println("Nome agenda: ");
        String nomeAgenda = sc.nextLine();
        for (int i = 0; i < 3; i++) {
            System.out.println("------------------");
            System.out.println("Entre com nome: ");
            String nome = sc.nextLine();
            System.out.println("Entre com telefone: ");
            int phone = sc.nextInt();
            sc.nextLine();
            System.out.println("Entre com e-mail: ");
            String email = sc.nextLine();
            Agenda agenda = new Agenda(nomeAgenda, new Contato(nome, phone, email));
            contatoList.add(agenda.getContato());

        }

        System.out.println(nomeAgenda);
        for (Contato listContact : contatoList
        ) {
            System.out.println(listContact.toString());
        }
    }
}
