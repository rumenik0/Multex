package multex;

/**
 *
 * @author rudnik
 */
public class Multex implements Runnable{

    static Ambiente ambito;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ambito = new Ambiente();
        
        new Thread((Runnable) ambito,"Processo 1").start();
    }

    @Override
    public void run() {
        String processo = Thread.currentThread().getName();
        while(ambito.getVagas() !=0){
            ambito.consumir(processo);
            
        }
        
    }
    
}
