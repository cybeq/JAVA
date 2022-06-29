/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katalog;

/**
 *
 * @author student
 */
public class Ksiazka  extends Pozycja{
   
    public int liczbaStron=0;
    Autor autor = null;
    public Ksiazka(){
       
    }
    public Ksiazka(String tytul, String wydawnictwo, int ID, int rokWydania, int liczbaStron, Autor autor){
        super();this.tytul=tytul; this.autor = autor;
        this.liczbaStron = liczbaStron; this.ID=ID;
        
    }
    public void dodajAutora(Autor autor){
        this.autor = autor;
    }
   
    @Override
    public void wypiszInfo(){
        System.out.println("Tytul: " + this.tytul + "\n" +"Wydawnictwo: " + this.wydawnictwo + "\n"  + "Rok wydania: " + this.rokWydania + "\n" + "Liczba stron: " + this.liczbaStron + "\n" +"Autor: " + this.autor.getFullName() + "\n"  );
    
    }
    @Override
    public String getTitle(){
         return this.tytul;
    }
     @Override
      public int getID(){
        return this.ID;
    }
   
    
}
