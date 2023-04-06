package day_3;
// Write a Java program to facilitate the multilevel inheritance. 
// (Also demonstrate the use of constructor in multilevel inheritance)

class Box{
    int length;
    int breadth;
    int height;
    Box(int length, int breadth, int height) {
        this.length = length;
        this. breadth = breadth;
        this. height = height;
    }
   int  findVolume(){
        return length*breadth*height;
    }
}
class BoxWeight extends Box{
    int weight;
    BoxWeight(int length, int breadth, int height,int weight) {
        super(length, breadth, height);
        this.weight = weight;
    }
    int showWeight(){
        return weight;
    }

}
class BoxPrice extends BoxWeight{
    int price;
    BoxPrice(int length, int breadth, int height,int weight,int price) {
        super(length, breadth, height, weight);
        this.price = price;
    }
    int showPrice(){
        return price;
    }
}
public class lab1 {
    public static void main(String[] args) {
        BoxPrice price = new BoxPrice(10,20,30,40,100);
        System.out.println("The volume is " + price.findVolume());
        System.out.println("The weight is " + price.showWeight());
        System.out.println("The price is " + price.showPrice());

    }
}
