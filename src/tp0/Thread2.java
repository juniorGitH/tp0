package tp0;

public class Thread2 implements Runnable
{    
    private String prenom;

    public Thread2() {
    }

    public Thread2(String prenom) {
        this.prenom = prenom;
    }
    
    
    public static void main(String[] args) {
        new Thread1("tata").start();
        Thread2 t3 = new Thread2("toto");
        new Thread(t3).start();
        
        while(true){
            new Thread(new Thread2("jojo")).start();
        }
        
    }

    @Override
    public void run() { 
        System.out.println("Bienvenue " +prenom);
    }
    
   
}
