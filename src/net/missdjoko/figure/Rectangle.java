package net.missdjoko.figure;

/**
 * Created by Miss_ on 18.03.2016.
 */
public class Rectangle extends Figure{

    Rectangle(double i, double j){
        super(i,j);
    }

    double area(){
        return lenght*width;
    }

}
