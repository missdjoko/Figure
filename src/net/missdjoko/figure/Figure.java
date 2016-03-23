package net.missdjoko.figure;

/**
 * Created by Miss_ on 18.03.2016.
 */
 public class Figure {
    public static void main(String[] args) {
        Triangle tr= new Triangle(12.3,18.9);
        Rectangle rc= new Rectangle(12.3,18.9);
       // SecondFigure f= new SecondFigure(10,10); нельз€ создать экземпл€р абстрактного класса
        SecondFigure fixfigure;

       /* System.out.println(tr.area());
        System.out.println(rc.area());
        System.out.println(f.area());*/

       // fixfigure=f;
       // System.out.println(fixfigure.area());
        fixfigure=rc;
        fixfigure.pechat();
        System.out.println(fixfigure.area());
        fixfigure=tr;
        System.out.println(fixfigure.area());


    }


}


