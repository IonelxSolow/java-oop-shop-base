package org.lessons.java.shop;

/* import java.util.Random;


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


} */

/* import java.util.Random;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Prodotto {
    public int codice; // default null
    public String nome; //default null
    public String descrizione; // default null
    public BigDecimal prezzo; // default 0
    public BigDecimal iva; // default 0

    Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {
        Random rand = new Random();
        this.codice = rand.nextInt(99999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva; // 0.22
    }

    public BigDecimal getPrezzoBase() {
        return this.prezzo;
    }

    public BigDecimal getPrezzoIvato() {
        if(prezzo != null && iva != null){
            // stiamo verificando che siano inizializzate le nostre variabili di istanza
            return prezzo.add(prezzo.multiply(iva)).setScale(2, RoundingMode.DOWN);
        } // non ci servirà eseguire la nostra operazione e ritorneremo null
        return null;
    }

    public String getNomeEsteso() {
        if(nome != null){
             return codice + "-" + nome;
        }
        return null;
    }

} */


import java.util.Random;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Prodotto {
    private int codice; // default null
    private String nome; //default null
    private String descrizione; // default null
    private BigDecimal prezzo; // default 0
    private BigDecimal iva; // default 0

    Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {
        Random rand = new Random();
        this.codice = rand.nextInt(99999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva; // 0.22
    }

    Prodotto() {
        Random rand = new Random();
        this.codice = rand.nextInt(99999);
        this.nome = "Senza Nome";
        this.descrizione = "Senza descizione";
        this.prezzo = BigDecimal.ZERO;
        this.iva = BigDecimal.ZERO;
    }


    public int getCodice() {
        return codice;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setDescrizione(String descrizione){
        this.descrizione = descrizione;
    }
    public String getDescrizione(){
        return descrizione;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal getIva() {
        if(iva != null){
            return iva;
        }
        return null;
        
    }



    public BigDecimal getPrezzoBase() {
        return this.prezzo;
    }

    public BigDecimal getPrezzoIvato() {
        if(prezzo != null && iva != null){
            // stiamo verificando che siano inizializzate le nostre variabili di istanza
            return prezzo.add(prezzo.multiply(iva)).setScale(2, RoundingMode.DOWN);
        } // non ci servirà eseguire la nostra operazione e ritorneremo null
        return null;
    }

    public String getNomeEsteso() {
        if(nome != null){
             return codice + "-" + nome;
        }
        return null;
    }

}