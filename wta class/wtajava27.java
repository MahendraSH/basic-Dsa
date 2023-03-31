// two class with inhertance and parmetized constructor 
// with supper key word

class One1 {
    int i;

    public One1(int i) {

        this.i = i;
    }

}

class Two1 extends One1 {
    int j;

    public Two1(int i, int j) {
        super(i);
        this.j = j;

    }

    void show() {
        System.out.println(super.i);
        System.out.println(j);
    }
}

public class wtajava27 {
    public static void main(String[] args) {
        Two1 t = new Two1(100, 200);
        t.show();

    }
}
