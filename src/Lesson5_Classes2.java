package CS102;

import java.util.Date;
import java.util.Random;

public class Lesson5_Classes2 {
    public static void main(String[] args) {

        Stock s1 = new Stock("AAPL", "Apple");
        s1.setPreviousClosingPrice(100);
        s1.setCurrentPrice(105);
        System.out.println(s1);
        System.out.println(s1.toString());

        //int[] intArr = new int [100]
        Stock[] stocks = new Stock[3];
        stocks[0] = s1;
        stocks[1] = new Stock("GOOG", "Google");
        stocks[1].setPreviousClosingPrice(1000);
        stocks[1].setCurrentPrice(2000);
        stocks[2] = new Stock("U", "Unity");
        stocks[2].setPreviousClosingPrice(100);
        stocks[2].setCurrentPrice(90);

        for (int i = 0; i < stocks.length; i++) {
            System.out.println(stocks[i].toString());
        }
        System.out.println(compareStocks(stocks[0], stocks[1]));
        System.out.println(compareStocks(s1, stocks[0]));
        //Date
        Date today = new Date();
        System.out.println(today.toString());
        System.out.println(today.getTime());
        today.setTime(1632244734360L);
        /*
        64 bits
        128 bits -2^128 --- 2^127-1

        12 by default : int
        12L

        2.00 by default : double
        2.00F
         */
        System.out.println(today.toString());
        //Random
        Random g = new Random(3);
        System.out.println(g.nextInt());
        System.out.println(g.nextInt(100));
        System.out.println(g.nextDouble());
        System.out.println(g.nextFloat());
        System.out.println(g.nextBoolean());
        StopWatch sw = new StopWatch();
        sw.Start();
        int[] intArr = new int[10];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = g.nextInt(500);
        }
        sw.Stop();
        System.out.println(sw.getElapsedTime());
        /*
        for (int element : intArr) {
            System.out.println(element + ",");
        }

         */
    }

    //object as parameters
    /*
            if s1.changePercent > s2.changePercent return 1
            if s1.changePercent < s2.changePercent return 1
            if s1.changePercent = s2.changePercent return 0
     */
    public static int compareStocks(Stock s1, Stock s2) {
        if (s1.getChangePercent() > s2.getChangePercent()) {
            return 1;
        } else if (s1.getChangePercent() < s2.getChangePercent()) {
            return -1;
        } else {
            return 0;
        }
    }
}

class Stock {
    //instance variables
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    //constructor
    public Stock() {
        //String: default null
        //numbers: 0
        //boolean: false
    }

    public Stock(String s, String n) {
        this.symbol = s;
        this.name = n;
    }

    //getter method: access the private member instance variables
    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }
    //setter method; modify the private instance variables;

    public void setSymbol(String s) {
        symbol = s;
    }

    public void setName(String n) {
        name = n;
    }

    public void setPreviousClosingPrice(double p) {
        previousClosingPrice = p;
    }

    public void setCurrentPrice(double c) {
        currentPrice = c;
    }

    //instance method
    public double getChangePercent() {
        //AAPL: previous closing price: 100
        //Current price: 105
        //change: (105-100)/100 = 0.05
        return (currentPrice - previousClosingPrice) / previousClosingPrice;
    }
    //toString

    public String toString() {
        String result = "Symbol:" + symbol + "\n";
        result += "Name:'" + name + "\n";
        result += "PreviousClosing: $" + previousClosingPrice + "\n";
        result += "CurrentPrice: $" + currentPrice + "\n";
        result += "GetChangePercent:" + getChangePercent() + "\n";
        return result;
    }
}

class StopWatch {
    //instance variables
    private Date startTime;
    private Date endTime;

    //constructor
    public StopWatch() {
        startTime = new Date();
    }
    //getter method

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    //instance method
    public void Start() {
        startTime = new Date();
    }

    public void Stop() {
        endTime = new Date();
    }

    public long getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }
}


