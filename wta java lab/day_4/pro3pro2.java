
class AThread extends Thread{
    public void run(){
        for(int i=0;i<5;i++)
        {
            System.out.println("A i ="+i);
        }
        System.out.println("exit A ");
    }
}
class BThread extends Thread{
    public void run(){
        for(int i=0;i<5;i++)
        {
            System.out.println("B i ="+i);
        }
        System.out.println("exit B ");
    }
}
class CThread extends Thread{
    public void run(){
        for(int i=0;i<5;i++)
        {
            System.out.println("C i ="+i);
        }
        System.out.println("exit C ");
    }
}
class DThread extends Thread{
    public void run(){
        for(int i=0;i<5;i++)
        {
            System.out.println("D i ="+i);
        }
        System.out.println("exit D ");
    }
}


public class pro3pro2{
    public static void main(String[] args) {
        
        Thread a =new Thread(new AThread());
        Thread b =new Thread(new BThread());
        Thread c =new Thread(new CThread());
        Thread d =new Thread(new DThread());

        System.out.println("Before starting Threads");
        System.out.println("Thread alive for a "+a.isAlive());
        System.out.println("starting the therads ");
        a.start();
        System.out.println("Thread alive for a "+a.isAlive());
        System.out.println("Thread a is being stoped ");
        a.stop();
        System.out.println("Thread b is started");
        try{
            b.start();
             b.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        c.start();

        d.start();
        try{
            c.sleep(5000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
