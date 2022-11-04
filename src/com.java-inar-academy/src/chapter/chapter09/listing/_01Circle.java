package chapter.chapter09.listing;

class _01Circle {
    double radius ;
    static int numberOfObjecrts=0;


    _01Circle() {
        radius=1;
        numberOfObjecrts++;

    }

    _01Circle(double newRadius) {
        radius = newRadius;
        numberOfObjecrts++;

    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;

    }
    double setRadius(double newRadius){
       return radius=newRadius;
    }

    static int getNumberOfObjecrts(){
        return numberOfObjecrts;
    }
}
