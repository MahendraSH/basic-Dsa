
class OneTh extends Thread{
    public void run(){
        for(int i=0;i<5;i++)
        {
            System.out.println("Oneth i ="+i);
        }
        System.out.println("exit one");
    }
    

}

class SecTh extends Thread{
    public void run(){
        for(int i=0;i<5;i++)
        {
            System.out.println("Twoth i ="+i);
        }
        System.out.println("exit sec");
    }

}

class ThTh extends Thread{
    public void run(){
        for(int i=0;i<5;i++)
        {
            System.out.println("Thth i ="+i);
        }
        
        System.out.println("exit three");
    }

}
class FourTh implements Runnable{
    public void run(){
        for(int i=0;i<5;i++)
        {
            System.out.println("Fourth i ="+i);
        }
        
        System.out.println("exit Four");
    }

}
class FiveTh implements Runnable{
    public void run(){
        for(int i=0;i<5;i++)
        {
            System.out.println("Fiveth i ="+i);
        }
        
        System.out.println("exit Five");
    }

}
class SixTh implements Runnable{
    public void run(){
        for(int i=0;i<5;i++)
        {
            System.out.println("Sixth i ="+i);
        }
        
        System.out.println("exit Six");
    }

}

class pro3pro1{
    public static void main(String[] args) {
        Thread tone = new Thread(new OneTh());
        Thread tsec = new Thread(new SecTh());
        Thread tth = new Thread(new ThTh());
        Thread tfour = new Thread(new FourTh());
        Thread tfive = new Thread(new FiveTh());
        Thread tsix = new Thread(new SixTh());
        tone.start();
        tth.start();
        tsec.start();
        tfive.start();
        tsix.start();
        tfour.start();
    }
}