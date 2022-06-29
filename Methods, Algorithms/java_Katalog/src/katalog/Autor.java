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
public class Autor {
    public String imie="";
    public String nazwisko="";
  
    
    public Autor(String imie,String nazwisko){
    this.imie=imie; this.nazwisko=nazwisko;
    }
    public String getFullName(){
return imie+" "+ nazwisko;
    }

}



