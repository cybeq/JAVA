import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static double onp(String[] operacje) {
        Stack<Double> liczby = new Stack<>();
        liczby.push(0.0);
        for (int i=0; i<operacje.length; i++) {
            switch(operacje[i]) {
                case "+": {
                    //operacje dodawania (krok 6,7,8 algorytmu)
                    //operacje dodawania (krok 6,7,8)
                    double liczba1 = liczby.pop();
                    double liczba2 = liczby.pop();
                    double wynik = liczba1 + liczba2;
                    liczby.push(wynik);
                    break;

                }
                case "-": {
                    double liczba1 = liczby.pop();
                    double liczba2 = liczby.pop();
                    double wynik = liczba1 - liczba2;
                    liczby.push(wynik);
                    break;

                }
                case "*": {
                    double liczba1 = liczby.pop();
                    double liczba2 = liczby.pop();
                    double wynik = liczba1 * liczba2;
                    liczby.push(wynik);
                    break;

                }
                case "/": {
                    double liczba1 = liczby.pop();
                    double liczba2 = liczby.pop();
                    double wynik = liczba1 / liczba2;
                    liczby.push(wynik);
                    break;

                }
                default: {
                    //jeżeli nie jest to żadna z operacji matematycznych
                    //musi to być liczba (krok 4)
                    try {
                        double liczba = Double.parseDouble(operacje[i]);
                        liczby.push(liczba);
                    }catch(Exception e){
                      double liczba = Main.doMath(operacje[i]);
                      //  System.out.println(liczba);
                        liczby.push(liczba);
                    }

                    break;

                }
            }
        }
        //zwracany jest wynik ostatniego działania (lub 0)
        return liczby.pop();

    }
public static void main(String[] args) {
    String[] operacje = {"2", "2", "*", "2+4*(3-2)+2", "*"};
    System.out.println("Wynik " + onp(operacje));
    Stack<Double> liczby = new Stack<>();


}

private static double doMath(String operacja){
    Stack<Double> stack = new Stack<>();
    Stack<Double> stackN = new Stack<>();
    StringBuilder stringBuilder = new StringBuilder();
    String memmory = null;
    Double wynik = 0.0;
        for(int i=0; i<operacja.length(); i++){
            if(Character.toString(operacja.charAt(i)).equals("(")){
                for(int j=i+1; j<operacja.length(); j++){
                    if(Character.toString(operacja.charAt(j)).equals(")")) {
                        i=j;
                        break;
                    }
                   stringBuilder.append(operacja.charAt(j));
                   // System.out.println(operacja.charAt(j));
                }

               // System.out.println(stringBuilder.toString());

                stack.push(doMath(stringBuilder.toString()));
                continue;
            }


            try {
                stack.push(Double.parseDouble(Character.toString(operacja.charAt(i))));
            }catch(Exception e){
                memmory = Character.toString(operacja.charAt(i));
            }
            if(stack.size()==2){
                Double liczba2 = stack.pop();
                Double liczba1 = stack.pop();

                switch(memmory){

                    case "+":
                        wynik = liczba1+liczba2;
                        stack.push(wynik);
                        break;
                    case "-":
                        wynik = liczba1-liczba2;
                        stack.push(wynik);
                        break;
                    case "*":
                        wynik = liczba1*liczba2;
                        stack.push(wynik);
                        break;
                    case "/":
                        wynik = liczba1/liczba2;
                        stack.push(wynik);
                        break;
                    default:
                        break;
                }

            }

        }

    return wynik;
}


}