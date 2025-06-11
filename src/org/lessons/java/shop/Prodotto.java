package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
     int codice;
     String nome;
     String descrizione;
     double prezzo;
     int iva;

     Prodotto(String nome, String descrizione, double prezzo, int iva){
        this.codice = 100000 + new Random().nextInt(900000);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    void prezzoBase(){
        System.out.println("Il prezzo base è: " + this.prezzo);
    }

    void prezzoBaseIva(){
        double prezzoIvato = this.prezzo + (this.prezzo * this.iva / 100.0);
        System.out.println("Il prezzo compresa iva è: " + prezzoIvato);
    }

    void nomeEsteso(){
        System.out.println("Il nome esteso codice-nome è: " + this.codice + "-" + this.nome);
    }


}
