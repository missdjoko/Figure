package net.missdjoko.figure;

/**
 * Created by Miss_ on 18.03.2016.
 */
public class Figure {
    public static void main(String[] args) {
        Triangle tr= new Triangle(12.3,18.9);
        Rectangle rc= new Rectangle(12.3,18.9);
        Figure f= new Figure(10,10);
        Figure fixfigure;

       /* System.out.println(tr.area());
        System.out.println(rc.area());
        System.out.println(f.area());*/

        fixfigure=f;
        System.out.println(fixfigure.area());
        fixfigure=rc;
        System.out.println(fixfigure.area());
        fixfigure=tr;
        System.out.println(fixfigure.area());


    }

    double lenght;
    double width;

    Figure(double n, double m){
        lenght=n;
        width=m;
    }

    double area(){
        return 0;
    }

}


