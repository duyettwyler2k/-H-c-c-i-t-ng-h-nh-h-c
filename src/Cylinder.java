public class Cylinder extends Circle{

    double height;
    public Cylinder(){};
    public Cylinder(double radius,String color,double height){
        super(radius,color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double Volume(){
        double Volume=super.getArea()*this.height;
        return Volume;
    }
}
