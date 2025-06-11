package org.lessons.java.shop;

/* public class Main {
    public static void main(String[] args) {

        Prodotto prodotto = new Prodotto("Banana", "Gialla e buona", 2, 22);

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
} */

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Prodotto prodotto = new Prodotto("Banana", "Gialla e buona", new BigDecimal(2), new BigDecimal(0.22));

        System.out.println("Codice: " + prodotto.codice);
        System.out.println("Nome: " + prodotto.nome);
        System.out.println("Descrizione: " + prodotto.descrizione);
        System.out.println("Prezzo: " + prodotto.prezzo);
        System.out.println("IVA: " + prodotto.iva);
        System.out.println(prodotto.getPrezzoBase());
        System.out.println(prodotto.getPrezzoIvato());
        System.out.println(prodotto.getNomeEsteso());

    }
}
