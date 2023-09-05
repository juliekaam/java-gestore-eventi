package gestore_eventi;

import java.time.LocalDate;

public class Evento {
    //attributi
   private String titolo;
private LocalDate data;
private  int posti_totali;
private int posti_prenotati;

//COSTRUTTORI

    public Evento(String titolo, LocalDate data, int posti_totali, int posti_prenotati) throws RuntimeException {
        this.titolo = titolo;
        isNotBefore(data);
        this.data = data;
        isPositif(posti_totali);
        this.posti_totali= posti_totali;

        this.posti_prenotati = 0;
    }
    //GETTER E SETTER
    //titolo sia in lettura e in scrittura

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    //data sia in lettura e scrittura

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    //numero di posti totale sia solo in lettura

    public void setPosti_totali(int posti_totali) {
        this.posti_totali = posti_totali;
    }

    //numero di posti prenotati sia solo in lettura

    public void setPosti_prenotati(int posti_prenotati) {
        this.posti_prenotati = posti_prenotati;
    }

    //METODI

    //controllo che la data non sia già passata
    private void isNotBefore( LocalDate data_in){
        if (data_in.isBefore(data))
        {
throw new RuntimeException();
        }
    }
    //controllo che il numero di posti totali sia positivo
    private void isPositif(int posti_totali){
        if(posti_totali<0){
            throw new RuntimeException();
        }
    }

    // prenota : aggiunge un certo numero di posti prenotati. Se l’evento è già passato
    // o non ha posti disponibili deve sollevare un’eccezione
    public void prenota(int posti_prenotati,int posti_dispo){
        posti_dispo=posti_totali;
        for (int i=0; i<posti_dispo; i++){
        posti_prenotati=posti_prenotati++;
        posti_dispo--;
        }
        if (data.isBefore(LocalDate.now()) || posti_dispo==0){
            throw new RuntimeException();

        }
    }
    //disdici : riduce di un certo numero i posti prenotati.
   // Se l’evento è già passato o non ci sono prenotazioni deve sollevare un’eccezione.

    public void disdisci(int posti_prenotati){
        posti_prenotati=posti_prenotati--;
        if (data.isBefore(LocalDate.now()) || posti_prenotati==0){
            throw new RuntimeException();

        }
    }

    @Override
    public String toString() {
        return "Evento{" +
                "titolo='" + titolo + '\'' +
                ", data=" + data +
                ", posti_totali=" + posti_totali +
                ", posti_prenotati=" + posti_prenotati +
                '}';
    }
}
