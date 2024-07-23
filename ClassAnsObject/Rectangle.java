package ClassAnsObject;

public class Rectangle {
    int length;
    int width;
     Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    public void area(){
        System.out.println("Area: "+(length*width));
    }
    public void perimeter(){
        System.out.println("Perimeter: "+(2*(length+width)));
    }



}
