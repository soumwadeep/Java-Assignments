class Circle 
{
    double radius;
    void setRadius(double r)
    {
        radius = r;
    }
    double calcArea()
    {
        return 3.14*radius*radius;
    }
    public static void main(String args[])
    {
        Circle obj = new Circle();
        obj.setRadius(Double.parseDouble(args[0]));
        System.out.println("Area of Circle is: "+obj.calcArea());
    }
}
