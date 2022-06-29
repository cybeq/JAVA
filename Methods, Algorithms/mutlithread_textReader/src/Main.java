import javax.sound.sampled.Line;
import java.sql.SQLOutput;

public class Main{
    public static void main(String[] args){

        //task: 0 sluzy do okreslenia co jaki czas ma wystapic przejscie do nowej lini
        //task: 1 obsluguje text ktory ma byc przeczytany
        MultiThreading newLine = new MultiThreading(2,1,0);
        MultiThreading reader = new MultiThreading(1,0.2,1, new TxtReader());
        reader.start(); newLine.start();

        new Thread(){
          public void run(){
              while(true){
                  if (!reader.isAlive()) {
                      newLine.stop();
                      this.stop();
                  }
                  try {
                      this.sleep(200);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
          }
        }.start();
    }



}
