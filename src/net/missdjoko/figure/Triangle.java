package net.missdjoko.figure;

/**
 * Created by Miss_ on 21.03.2016.
 */
public class Triangle extends Figure{

    double height;

    Triangle (double i, double h ){
        super(i,0);
        height=h;
    }

    @Override // "@" так начинаются аннотации, в данном случае что это аннотация переопределения
    double area(){
        return (lenght/2)*height;
    }


}
