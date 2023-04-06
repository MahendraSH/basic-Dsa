package day_3;
// Write a Java Program to demonstrate the concept of hierarchical inheritance. 
// (implement this program with super keyword, final keyword, constructor and method overriding concept)

class PlainRetangle{
    int lenght;
    int breadth;
    PlainRetangle(int lenght, int breadth){
        this.lenght = lenght;
        this.breadth = breadth;
    }
    final int  findarea(){
        return lenght*breadth;
    }

}
class Cuboid extends PlainRetangle{
    int height;
    Cuboid(int lenght,int breadth ,int height){
        super(lenght,breadth);
        this.height = height;
    }
    int findSurfaceArea(){
        return 2*(super.findarea()+lenght*height+height*breadth);
    }
}
class Cube extends PlainRetangle{
    int len;
    Cube(int len){
          super(len,len);
        this.len = len;
    }
    int findSurfaceArea(){
        return 6*super.findarea();
    }
}
public class lab4 {
    public static void main(String[] args) {
        PlainRetangle plane = new PlainRetangle(5,10);
        System.out.println(plane.findarea());
        Cuboid cuboid = new Cuboid(10,5,15);
        System.out.println(cuboid.findSurfaceArea());
        Cube cube = new Cube(5);
        System.out.println(cube.findSurfaceArea());
    }
    
}
