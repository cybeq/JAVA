import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Main {
    public Map<Character, String> keyMap = new HashMap<Character, String>();
    Main(){

        this.keyMap.put(' ',"1");
        this.keyMap.put('A',"2");
        this.keyMap.put('B', "22");
        this.keyMap.put('C', "222");
        this.keyMap.put('D', "3");
        this.keyMap.put('E', "33");
        this.keyMap.put('F', "333");
        this.keyMap.put('G',"4");
        this.keyMap.put('H', "44");
        this.keyMap.put('I', "444");
        this.keyMap.put('J',"5");
        this.keyMap.put('K', "55");
        this.keyMap.put('L', "555");
        this.keyMap.put('M', "6");
        this.keyMap.put('N', "66");
        this.keyMap.put('O', "666");
        this.keyMap.put('P',"7");
        this.keyMap.put('R', "77");
        this.keyMap.put('S', "777");
        this.keyMap.put('T', "8");
        this.keyMap.put('U', "88");
        this.keyMap.put('V', "888");
        this.keyMap.put('W', "9");
        this.keyMap.put('X', "99");
        this.keyMap.put('Y',"999");
        this.keyMap.put('Z',"9999");
    }

    public static void main(String[] args){
        String text= "KOT ktory lubi jesc";
        System.out.println(new Main().encode(text.toUpperCase()));

    }

 private String encode(String text){
     System.out.println(this.keyMap.entrySet());
          for (var single : this.keyMap.entrySet()) {
                  text = text.replace(String.valueOf(single.getKey()), single.getValue());
          }

      return text;
 }
}
