package chapter.chapter09.homework;

public class Exercises02Stock {
    private String symbol;
    private String name;
    double previousClosingPrice;
    double currentPrice;


    Exercises02Stock(String newsymbol,String newName){
        this("","",0,0);


    }
    Exercises02Stock(String newsymbol,String newName,double previousClosingPrice,double currentPrice){
        this.symbol=newsymbol;
        this.name=newName;
        this.previousClosingPrice=previousClosingPrice;
        this.currentPrice=currentPrice;


    }
    public double getChangePercent(){
       return this.previousClosingPrice/this.currentPrice;

    }
    public void print(){
        System.out.println(this.symbol+"   "+this.name);
        System.out.println("Stock price-chance percentage: "+getChangePercent());
    }


}
