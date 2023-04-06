class Thered1 extends  Thread{
  public   void run(){
      int n=10;
        for(int i=0;i<n;i++)
        {

            System.out.println(i);

            if(i==6)
            {
                this.interrupt();

            }

        }
    }
}
public class thread2 {
    public static void main(String[] args) {
        Thered1 t=new Thered1();
        Thread th=new Thread(t);
        th.start();
        System.out.println("priority"+th.getPriority());
        th.setPriority(4);
        System.out.println("set pririty"+th.getPriority());
        System.out.println();
        System.out.println("id");
        System.out.println(th.threadId());
        System.out.println();
        System.out.println();
        System.out.println(th.getName());
        System.out.println(th.getThreadGroup());
    }
}
