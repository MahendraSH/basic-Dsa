

// protected spacefier implmentation 
class DemoSome {
    private int n = 10;
    protected int x = 100;

}

class Sub extends DemoSome {
    void show() {
        System.out.println("The protected =" + x);
    }
}

public class wtaJava28 {
    public static void main(String[] args) {
        Sub s =new Sub();
        s.show();

    }
}
