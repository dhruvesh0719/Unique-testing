
public class AreaOfCircle
{


    //static method no return with parameterised
    void circle(int r)
    {
        double pie = 3.14;
        double area = (pie*(r*r));
        System.out.println("The area of the Circle for given radius "+r+" is : "+area);
    }


    public static void main(String[] args)
    {
        AreaOfCircle areaofcircle = new AreaOfCircle();
        areaofcircle.circle(5);
        System.out.println("New branch added");
        System.out.println("New branch added");
    }

}