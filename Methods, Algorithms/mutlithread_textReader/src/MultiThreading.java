import java.net.SocketTimeoutException;


public class MultiThreading extends Thread{
    private int index;
    private double seconds;
    private int task;
    private TxtReader txtReader;

public MultiThreading(int index,
                      double seconds,
                      int task){
    this.index=index;
    this.seconds= seconds;
    this.task=task;
}
    public MultiThreading(int index,
                          double seconds,
                          int task,
                          TxtReader txtReader){
        this.index=index;
        this.seconds= seconds;
        this.task=task;
        this.txtReader = txtReader;
    }

    @Override
    public void run(){
    switch(this.task) {

        //odpowiada za nowa linie
        case 0 :
        while(true) {
            System.out.println("");
            try {
                Thread.sleep(
                        Double.valueOf(this.seconds * 1000).longValue());
            } catch (InterruptedException e) { break; }
         }
        break;


        //odpowiada za czytanie pliku
        case 1:
            String[] textArray = this.txtReader.readText().split(" ");

            for (int i = 0; i <textArray.length; i++) {
                System.out.print(textArray[i] + " ");

                try {
                    Thread.sleep(
                            Double.valueOf(this.seconds * 1000).longValue());

                } catch (InterruptedException e) {}
            };
                this.stop(); break;


                default: this.stop(); break;

    }


}
}
