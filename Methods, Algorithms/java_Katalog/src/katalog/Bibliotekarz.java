package katalog;

public class Bibliotekarz extends Osoba{
    public String dataZatrudnienia;
    public double wynagrodzenie;

    public Bibliotekarz(){}
    public Bibliotekarz(String imie, String nazwisko, String dataZatrudnienia, double wynagrodzenie){
    this.imie=imie; this.nazwisko=nazwisko;
    this.dataZatrudnienia= dataZatrudnienia;
    this.wynagrodzenie=wynagrodzenie;
    }

    public String getFullName(){
        return this.imie+" "+this.nazwisko+"\n";
    }
}
