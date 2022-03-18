package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

//constructor nodig

public class IceCreamSalon implements IceCreamSeller{

    private PriceList priceList;
    private double totalProfit;

    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] ball) {

        Cone cone = new Cone(ball);

        totalProfit +=priceList.getBallPrice()*ball.length;

        return cone;
    }

    @Override
    public IceRocket orderIceRocket() {

        IceRocket iceRocket = new IceRocket();

        totalProfit += priceList.getRocketPrice();

        return iceRocket;
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) {
        Magnum magnum = new Magnum(magnumType);

        totalProfit +=priceList.getMagnumPrice(magnumType);
        return magnum;
    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }

    @Override
    public double getProfit() {
        return totalProfit;
    }
}
