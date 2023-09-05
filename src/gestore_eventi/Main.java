package gestore_eventi;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    /*Creare una classe Main di test, in cui si chiede all’utente di inserire un nuovo evento con tutti i parametri.
2. Dopo che l’evento è stato istanziato, chiedere all’utente se e quante prenotazioni vuole fare e provare ad effettuarle,
 implementando opportuni controlli e gestendo eventuali eccezioni.
3. Stampare a video il numero di posti prenotati e quelli disponibili
4. Chiedere all’utente se e quanti posti vuole disdire
5. Provare ad effettuare le disdette, implementando opportuni controlli e gestendo eventuali eccezioni
6. Stampare a video il numero di posti prenotati e quelli disponibili*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("crea un Evento");

        System.out.println("inserisci titolo ");
        String titolo=scan.nextLine();
        System.out.println("inserisci la data(A/M/G)");
        LocalDate data= LocalDate.parse(scan.nextLine());
        System.out.println("inserisci numero posti");
        int posti= scan.nextInt();



        //provo a creaare un nuovo evento
        try {
           Evento evento=new Evento(titolo,data,posti,0);

        } catch (RuntimeException e){
            System.out.println("incorrect parametershdjc");

        }


    }
}
