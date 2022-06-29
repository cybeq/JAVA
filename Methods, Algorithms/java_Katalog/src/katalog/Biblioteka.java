package katalog;

import java.util.ArrayList;

public class Biblioteka implements ZarzPoz{
    public String adres;
    public ArrayList<Pozycja> pozycja = new ArrayList<Pozycja>();
    public ArrayList<Katalog> katalogi = new ArrayList<Katalog>();
    public ArrayList<Bibliotekarz> bibliotekarze= new ArrayList<Bibliotekarz>();
    public Biblioteka(){};
    public Biblioteka(String adres){
    }

    public void dodajBibliotekarza(Bibliotekarz bibliotekarz){
        bibliotekarze.add(bibliotekarz);
    }
    public void wypiszBibliotekarzy(){
        System.out.println("Bibliotekarze z biblioteki to: ");
    for (int i=0; i<bibliotekarze.size(); i++){
        System.out.println(bibliotekarze.get(i).getFullName());
    }
}
public void dodajKatalog(Katalog katalog){
    katalogi.add(katalog);
}
public void dodajPozycje(Pozycja pozycja, String dzialTematyczny){
this.pozycja.add(pozycja);
}

    public void znajdzPozycjePoTytule(String tytul){
        for(int i = 0; i<pozycja.size(); i++){
            if(pozycja.get(i).getTitle()==tytul){
                System.out.println("Tytuł wywołany po tytule: ");
                System.out.println(pozycja.get(i).getTitle());
            }}}



    public void znajdzPozycjePoID(int ID){

            for(int i = 0; i<pozycja.size(); i++){
                if(pozycja.get(i).getID()==ID){
                    System.out.println("Tytuł wywołany po ID: ");
                    System.out.println(pozycja.get(i).getTitle());
                }

            }
    }

    public void wypiszWszystkiePozycje(){

        System.out.println("Wszystkie tytuly obiektow: ");
        for(int i = 0; i<pozycja.size(); i++){
            System.out.println(pozycja.get(i).getTitle());
        }

    }
    }


