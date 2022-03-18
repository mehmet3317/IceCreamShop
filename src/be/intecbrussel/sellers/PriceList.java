package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum.MagnumType;

public class PriceList{

    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;

    public double getBallPrice() {
        return ballPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public double getMagnumPrice(MagnumType magnumType){
        double price = 0;
        if(magnumType == MagnumType.BLACKCHOCOLATE) {
            price = magnumStandardPrice * 1.5;
        }if(magnumType == MagnumType.WHITECHOCOLATE) {
            price = magnumStandardPrice * 1.6;
        }if(magnumType == MagnumType.ALPINENUTS) {
            price = magnumStandardPrice * 1.3;
        }if(magnumType == MagnumType.ROMANTICSSTRAMBERRIES) {
            price = magnumStandardPrice * 1.2;
        }if(magnumType == MagnumType.MILKCHOCOLADE) {
            price = magnumStandardPrice * 1.1;
        }
        return price;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {

        this.magnumStandardPrice = magnumStandardPrice;
    }

    public PriceList(){

    }
    public PriceList(double ballPrice,double rocketPrice,double magnumStandardPrice){

        this.magnumStandardPrice=magnumStandardPrice;
        this.ballPrice=ballPrice;
        this.rocketPrice=rocketPrice;

        System.out.println("1 = Magnum MILKCHOCOLADE : " + getMagnumPrice(MagnumType.MILKCHOCOLADE));
        System.out.println("2 = Magnum ALPINENUTS : " + getMagnumPrice(MagnumType.ALPINENUTS));
        System.out.println("3 = Magnum BLACKCHOCOLATE : " + getMagnumPrice(MagnumType.BLACKCHOCOLATE));
        System.out.println("4 = Magnum ROMANTICSSTRAMBERRIES : " + getMagnumPrice(MagnumType.ROMANTICSSTRAMBERRIES));
        System.out.println("5 = Magnum WHITECHOCOLATE : " + getMagnumPrice(MagnumType.WHITECHOCOLATE));


        System.out.println("Ball Price : " + getBallPrice());

        System.out.println("Rocket Price :" + getRocketPrice());

    }
}
