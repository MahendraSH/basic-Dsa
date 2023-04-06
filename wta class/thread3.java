class Athread extends  Thread{
    public  void run(){
        for(int i=0;i<5;i++)
        {
            System.out.println("A + i"+i);
        }
    }
}class Bthread extends  Thread{
    public  void run(){
        for(int i=0;i<5;i++)
        {
            System.out.println("B + j"+i);
        }
    }
}
class Cthread extends  Thread{
    public  void run(){
        for(int i=0;i<5;i++)
        {
            System.out.println("C + k"+i);
        }
    }
}

public class thread3 {
    public static void main(String[] args) {
        Thread a=new Thread(new Athread());
        Thread b =new Thread( new Bthread());
        Thread c=new Thread(new Cthread());

        a.setPriority(Thread.MAX_PRIORITY);
        b.setPriority(Thread.MIN_PRIORITY);
        c.setPriority(a.getPriority()-1);

        a.start();
        b.start();
        c.start();
    }
}
