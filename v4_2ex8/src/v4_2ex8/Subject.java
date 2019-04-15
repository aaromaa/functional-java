import static java.lang.Thread.sleep;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Subject extends Observable implements Runnable{

    @Override
    public void run() {
        String[] str = {"politiikka huono","lksdvjlsdjv", "julkkis kuollut"};
         for (int i=0; i < 3; i++){
             try {
                 setChanged();
                 notifyObservers(str[i]);
                 sleep(100);
             } catch (InterruptedException ex) {
             }
         }
    }
    
    
    
    
    
    
}