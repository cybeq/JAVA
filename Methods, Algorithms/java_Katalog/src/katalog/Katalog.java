
package katalog;

import java.util.ArrayList;

public class Katalog implements ZarzPoz{
    public String dzialTematyczny="";
    public ArrayList<Pozycja> katalog = new ArrayList<Pozycja>();
    public static Katalog katalogG;
    
    public Katalog(){
      Autor autor = new Autor("Johhny", "Kowalski");
     Ksiazka ksiazka = new Ksiazka("Harry Potter", "Librus", 1, 1995, 120, autor);
     ksiazka.wypiszInfo();
     
     Czasopismo czasopismo = new Czasopismo("Telegazeta", "FunMedia", 2, 2022, 9097);
     czasopismo.wypiszInfo();
    
     dodajPozycje(ksiazka);
     dodajPozycje(czasopismo);
     znajdzPozycjePoTytule("Telegazeta");
     znajdzPozycjePoID(1);
     
     wypiszWszystkiePozycje();

        Biblioteka biblioteka = new Biblioteka("ul. Grajka 3");
        biblioteka.dodajBibliotekarza(new Bibliotekarz("Marek", "Budzik", "23.11.2000", 1200));
        biblioteka.dodajBibliotekarza(new Bibliotekarz("Roman", "Gyrtych", "23.11.2000", 1200));
        biblioteka.dodajKatalog(katalogG);
        biblioteka.wypiszBibliotekarzy();
        biblioteka.dodajPozycje(ksiazka, "Horror");
        biblioteka.dodajPozycje(czasopismo, "NudyNaPudy");
        biblioteka.wypiszWszystkiePozycje();
    }
    
 

    public static void main(String[] args) {
   
   katalogG =new Katalog();

    }
    
    public void dodajPozycje(Pozycja pozycja){
        
        katalog.add(pozycja);
        
        
    }
    public void znajdzPozycjePoTytule(String tytul){
        for(int i = 0; i<katalog.size(); i++){
            if(katalog.get(i).getTitle()==tytul){
                System.out.println("Tytuł wywołany po tytule: ");
                System.out.println(katalog.get(i).getTitle());
            }
            
        }
    
    }
    
     public void znajdzPozycjePoID(int ID){
        for(int i = 0; i<katalog.size(); i++){
            if(katalog.get(i).getID()==ID){
                System.out.println("Tytuł wywołany po ID: ");
                System.out.println(katalog.get(i).getTitle());
            }
            
        }
    
    }
    
    public void wypiszWszystkiePozycje(){
         System.out.println("Wszystkie tytuly obiektow: ");
             for(int i = 0; i<katalog.size(); i++){
                System.out.println(katalog.get(i).getTitle());
            }

        }

    
    
    
    public void znajdzPozycje(){
   
        
    }
    
    
    
}
