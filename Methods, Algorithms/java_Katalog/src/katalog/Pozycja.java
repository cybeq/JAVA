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
public abstract class Pozycja {
    public String tytul="";
    public int ID = 0;
    public String wydawnictwo= "";
    public int rokWydania = 0;
    public Pozycja(){};
    public Pozycja(String tytul, String wydawnictwo, int ID, int rokWydania){
        this.tytul = tytul; this.wydawnictwo=wydawnictwo; this.ID= ID; this.rokWydania=rokWydania;
    }
    
    public void wypiszInfo(){
        
        System.out.println(this.tytul+this.wydawnictwo+this.ID+this.rokWydania);
        if(this.ID==0) System.out.println("brak danych o pozycji");
        
    }
       public String getTitle(){
        return this.tytul;
    }
          public int getID(){
        return this.ID;
    }
    
}
