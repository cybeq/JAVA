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
public class Czasopismo extends Pozycja {
    
    
    public int jakisNumer = 0;
    public  Czasopismo(){
         super();
    }
    public Czasopismo(String tytul, String wydawnictwo, int ID, int rokWydania, int jakisNumer ){
        super();
        this.tytul = tytul; this.wydawnictwo= wydawnictwo;  this.ID = ID; this.rokWydania = rokWydania; this.jakisNumer= jakisNumer;
     
    }
    @Override
           public void wypiszInfo(){
        System.out.println("Tytul: " + this.tytul + "\n" +"Wydawnictwo: " + this.wydawnictwo + "\n"  + "Rok wydania: " + this.rokWydania + "\n" + "Jakis numer: " + this.jakisNumer );
    
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
