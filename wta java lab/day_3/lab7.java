package day_3;
class Grandfather
{
    private String name="Ram";
    public void Gname()
    {
        System.out.println("Grandfather name is : "+name);
    }
}
class Father extends Grandfather
{
    private String name="Darshan";
    public void Fname()
    {
        System.out.println("Father name is : "+name);
    }
}
class Son1 extends Father
{
    private String name="Amar";
    public void allname()
    {
        System.out.println();
        System.out.println("-----Son1 Details-----");
        super.Gname();
        super.Fname();
        System.out.println("Son1 Name is : "+name);
        
        System.out.println(); 
    }
}
class Son2 extends Father
{
    private String name="Satya";
    public void allname()
    {
        System.out.println();
        System.out.println("-----Son2 Details-----");
        super.Gname();
        super.Fname();
        System.out.println("Son2 Name is : "+name);
        System.out.println();
    }
}

public class lab7{
    public static void main(String[] args) 
    {
        Son1 s1=new Son1();
        Son2 s2=new Son2();
        s1.allname();
        s2.allname();
    }
}


