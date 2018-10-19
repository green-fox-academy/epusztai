import java.util.Scanner;
public class Cuboid {

    public static void main(String args[])
    {

        Scanner s= new Scanner(System.in);
        System.out.println("Length of Cubiod:");
        double l=s.nextDouble();

        System.out.println("Breadth of Cubiod:");
        double b=s.nextDouble();

        System.out.println("Height of Cubiod:");
        double h=s.nextDouble();



        double  volume= l*b*h;

        System.out.println("Volume:" +volume);

        double  area=(2*((l*b)+(b*h)+(h*l)));

        System.out.println("Total Surface Area:" +area);



    }
}

