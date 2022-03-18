package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamCar implements IceCreamSeller {

    private PriceList priceList;
    private double profit;
    private Stock stock;


    public IceCreamCar(Stock stock, PriceList priceList){
        this.stock = stock;
        this.priceList = priceList;
    }

    public void outOfStock() throws NoMoreIceCreamException {
            if (stock.getCones() == 0) {
                throw  new NoMoreIceCreamException("All Cones are sold out");
            }else if (stock.getIceRockets() < 0) {
                throw new NoMoreIceCreamException("All IceRockets are sold out");
            } else if (stock.getMagni() < 0) {
                throw new NoMoreIceCreamException("All Magnums are sold out");
            }


        }

    @Override
    public Cone orderCone(Cone.Flavor[] ball) throws NoMoreIceCreamException {

        Cone cone = prepareCone(ball);
        profit +=priceList.getBallPrice()*ball.length;
        int a= stock.getCones();
        a--;
        stock.setCones(a);
        return cone;
    }
    private Cone prepareCone(Cone.Flavor[] ball) throws NoMoreIceCreamException{
        outOfStock(); // stock control
        Cone cone = new Cone(ball);
        return cone;
    }

    @Override
    public IceRocket orderIceRocket() throws NoMoreIceCreamException {
        IceRocket iceRocket =prepareIceRocket();

        profit += priceList.getRocketPrice();
        int a= stock.getIceRockets();
        a--;
        stock.setIceRockets(a);
        return iceRocket;
    }
    private IceRocket prepareIceRocket() throws NoMoreIceCreamException {
        outOfStock();
        IceRocket iceRocket = new IceRocket();
        return iceRocket;
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) throws NoMoreIceCreamException {
            Magnum magnum = prepareMagnum(magnumType);
            profit +=priceList.getMagnumPrice(magnumType);
            int a= stock.getMagni();
            a--;
            stock.setMagni(a);

        return magnum;
    }
    private Magnum prepareMagnum(Magnum.MagnumType magnumType) throws NoMoreIceCreamException{
        outOfStock();

        Magnum magnum = new Magnum(magnumType);

        return magnum;
    }

    @Override
    public double getProfit() {

        return profit;
    }
}
