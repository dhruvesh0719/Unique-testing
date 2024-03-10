public class AreaofSquare
{

    public void AoS(int b)
    {
        double a = (b * b);
        System.out.println("The area of Square for given dimension "+b+" is : "+a);
    }

    public static void main(String[] args)
    {
        AreaofSquare areaofsquare = new AreaofSquare();
        areaofsquare.AoS(10);
    }
}
