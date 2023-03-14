// two class with inhertance and parmetized constructor 
// with supper key word

class One {
    int i;

    public One(int i) {

        this.i = i;
    }

}

class Two extends One {
    int j;

    public Two(int i, int j) {
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
        Two t = new Two(100, 200);
        t.show();

    }
}
