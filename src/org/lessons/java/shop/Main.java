package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        Prodotto prodotto = new Prodotto("Banana", "Gialla e buona", 2.5, 22);

        System.out.println("Codice: " + prodotto.codice);
        System.out.println("Nome: " + prodotto.nome);
        System.out.println("Descrizione: " + prodotto.descrizione);
        System.out.println("Prezzo: " + prodotto.prezzo);
        System.out.println("IVA: " + prodotto.iva);
        System.out.println();

        prodotto.prezzoBase();
        prodotto.prezzoBaseIva();
        prodotto.nomeEsteso();
    }
}
