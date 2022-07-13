package CS102;

public class Lesson4_Class {
    public static void main(String[] args) {
        /*
        TV nanTV = new TV();
        nanTV.turnOn();
        System.out.println(nanTV.channel);
        nanTV.setChannel(5);
        System.out.println(nanTV.channel);
        nanTV.channelUP();
        System.out.println(nanTV.channel);
         */
        Rectangle r1 = new Rectangle(2, 4);
        System.out.println(Rectangle.numOfObjects);
        System.out.println(r1.width);
        System.out.println(r1.height);
        System.out.println(r1.getArea());
        Rectangle r2 = new Rectangle(4, 8);
        System.out.println(Rectangle.numOfObjects);
        System.out.println(Rectangle.getNumberOfObjects());
        r1 = r2;
        System.out.println(r1.width);
        r2.width = 10;
        System.out.println(r1.width);
    }
}

class TV {
    //data field
    int channel; //1 to 120
    int volumeLevel;
    boolean on;

    //constructor
    TV() {
        channel = 1;
        volumeLevel = 4;
        on = false;
    }

    //method
    void setChannel(int c) {
        if (on && c >= 1 && c <= 120) {
            channel = c;
        }
    }

    void setVolume(int v) {
        if (on && v >= 1 && v <= 10) {
            volumeLevel = v;
        }
    }

    void channelUP() {
        if (on && channel > 1) {
            channel--;
        }
    }

    void volumeUp() {
        if (on && volumeLevel < 10) {
            volumeLevel++;
        }
    }

    void turnOn() {
        on = true;
    }

    void turnOff() {
        on = false;
    }
}

//if there is no modifier which means default
class Rectangle {
    //data field
    int width;
    int height;
    static int numOfObjects;

    //constructor
    Rectangle() {
        /*
        width = 1;
        height = 1;
         */
        this(1, 1);
    }

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        numOfObjects++;
    }

    // static method
    static int getNumberOfObjects() {
        return numOfObjects;
    }

    //method
    int getArea() {
        return width * height;
    }
    int getPerimeter(){
        return 2*(width+height);
    }
    int ss=0;
    //getter method
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    //setter method
    public void setWidth(int w) {
        width = w;
    }

    public void setHeight(int h) {
        height = h;
    }
}
