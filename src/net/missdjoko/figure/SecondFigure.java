package net.missdjoko.figure;

/**
 * Created by Miss_ on 23.03.2016.
 */
abstract public class SecondFigure {
    double lenght;
    double width;

    SecondFigure(double n, double m){
        lenght=n;
        width=m;
    }

    double area(){ return 0;}

    void pechat(){ // абстрактный метод может содержать обычные методы
        System.out.println("this is abstract class and default methood");
    }

}
