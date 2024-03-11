public class AreaofTriangle extends AreaofSquare
{
    public void AoT(double b, double c)
    {
        double a = ((b * c) / 2);
        System.out.println("The area of Triangle for given sides "+b+" and "+c+" is : "+a);
    }

    public static void main(String[] args)
    {
        AreaofTriangle areaofTriangle = new AreaofTriangle();
        areaofTriangle.AoT(4,5);
        areaofTriangle.AoS(6);
    }
}
