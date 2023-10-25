package Task8_02;

public class Car implements Comparable { //<Car>{
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }


    public int compareTo(Object o) {    // public int compareTo(Car o) {
        int speedCompare = this.speed - ((Car)o).speed;   // int temp = this.speed - o.speed;
        if (speedCompare == 0) {
            int priceCompare = this.price - ((Car)o).price;
            if(priceCompare == 0){
                int colorCompare = this.color.compareTo((((Car) o).color));
                if(colorCompare == 0){
                    return this.model.compareTo(((Car) o).model);
                }else{
                    return colorCompare;
                }
            } else{
                return priceCompare;
            }
        } else {
            return speedCompare;
        }
    }
}