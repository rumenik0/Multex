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
        Multex multex = new Multex();
        
        new Thread(multex,"Processo 1").start();
        new Thread(multex,"Processo 2").start();
        new Thread(multex,"Processo 3").start();
        new Thread(multex,"Processo 4").start();
    
    }

    @Override
    public void run() {
        String processo = Thread.currentThread().getName();
        while(ambito.getVagas() !=0){
            ambito.consumir(processo);
            
        }
        
    }
    
}
