public class Main {



    public static void main(String[] args){

        Grzybek borowik = new Grzybek("Borowik", 2);
        Grzybek borowiczek = new Grzybek("Borowik", 3);
        Grzybek nieNazywaczek = new Grzybek();

        System.out.println(borowik.hashCode());
        System.out.println(borowiczek.hashCode());
        System.out.println(nieNazywaczek.hashCode());
        System.out.println(borowik.equals(borowiczek));

        Grzybek borowik2 = new Grzybek("Borowik", 2);
        System.out.println(borowik2.equals(borowik));

    }


}
class Grzybek{
    private String gatunek;
    private Integer waga;
    public Grzybek(){
    }
    public Grzybek(String gatunek, Integer waga){
        this.gatunek = gatunek;
        this.waga=waga;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public Integer getWaga() {
        return waga;
    }

    public void setWaga(Integer waga) {
        this.waga = waga;
    }
    @Override
    public int hashCode() {
        if(this.waga==null || this.gatunek==null){
            return super.hashCode();
        }
    Integer result = 50;
    result = result *15 + this.waga;
    result = result * 15 + this.gatunek.hashCode();

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(obj==null || this.getClass() != obj.getClass()){
            return false;
        }

        Grzybek grzybulek = (Grzybek) obj;

        return (
        waga == grzybulek.waga
        && gatunek == grzybulek.gatunek
        );


    }
}
