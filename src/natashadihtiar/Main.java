package natashadihtiar;

public class Main {

    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(5.45, 13.8 );
        System.out.println(fraction1.toString());
        Fraction fraction2 = new Fraction(8.5, 3.7 );
        System.out.println(fraction2.toString());
        Fraction fraction3 = new Fraction(6.2, 11.8 );
        System.out.println(fraction3.toString());

        System.out.println("\n Back fractions \n");
        System.out.println(fraction1.backFraction());
        System.out.println(fraction2.backFraction());
        System.out.println(fraction3.backFraction());


        System.out.println("\n*************Figures*************\n");
        System.out.println("Triangle\n");
        Point p1 = new Point(0, 3, "A" );
            System.out.println(p1.getTitle()+"( " + p1.getX() + ", " + p1.getY() + " )");

            Point p2 = new Point(4, 0, "B");
            System.out.println(p2.getTitle() + "( " + p2.getX() + ", " + p2.getY() + " )");

            Point p3 = new Point(4, 3, "C");
            System.out.println(p3.getTitle() + "( " + p3.getX() + ", " + p3.getY() + " )");

            Figure figs = new Figure("Triangle", p1, p2, p3);
            System.out.println("Length of side = " + figs.CalculateSideLength(p1, p2));
            System.out.println("Perimeter= " + figs.CalculatePerimeter1());



        System.out.println("\nRectangle\n");
            Point point1 = new Point(5, 4);
        System.out.println("( " + point1.getX() + ", " + point1.getY() + " )");

            Point point2 = new Point(8, 10);
        System.out.println("( " + point2.getX() + ", " + point2.getY() + " )");

            Point point3 = new Point(5, 1);
        System.out.println("( " + point3.getX() + ", " + point3.getY() + " )");

            Point point4 = new Point(3, 5);
        System.out.println("( " + point4.getX() + ", " + point4.getY() + " )");

        Figure figs2 = new Figure("Rectangle", point1, point2, point3, point4);
        System.out.println("Length of side = " + figs2.CalculateSideLength2(point1, point2));
        System.out.println("Perimetr = " + figs.CalculatePerimeter2());


        System.out.println("\n\n" + "Pentagon\n");
        Point point_1 = new Point(8, 4);
        System.out.println("( " + point_1.getX() + ", " + point_1.getY() + " )");

        Point point_2 = new Point(3, 1);
        System.out.println("( " + point_2.getX() + ", " + point_2.getY() + " )");

        Point point_3 = new Point(1, 1);
        System.out.println("( " + point_3.getX() + ", " + point_3.getY() + " )");

        Point point_4 = new Point(6, 5);
        System.out.println("( " + point_4.getX() + ", " + point_4.getY() + " )");

        Point point_5 = new Point(3, 5);
        System.out.println("( " + point_5.getX() + ", " + point_5.getY() + " )");

        Figure figs3 = new Figure("Pentagon", point_1, point_2, point_3, point_4, point_5);
        System.out.println("Length of side = " + figs2.CalculateSideLength3(point_1, point_2));
        System.out.println("Perimetr = " + figs.CalculatePerimeter3());
        }
    }
