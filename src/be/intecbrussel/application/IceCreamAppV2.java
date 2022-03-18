package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.NoMoreIceCreamException;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.Stock;

import java.util.Scanner;

public class IceCreamAppV2 {

    public static void main(String args[]) throws NoMoreIceCreamException {

        PriceList priceList = new PriceList(2,2,3);

        Stock stock = new Stock(3,3,2,4);

        IceCreamCar iceCreamCar = new IceCreamCar(stock,priceList);

        Magnum magnum = iceCreamCar.orderMagnum(Magnum.MagnumType.BLACKCHOCOLATE);
        Magnum magnum1 = iceCreamCar.orderMagnum(Magnum.MagnumType.ALPINENUTS);
        Magnum magnum2 = iceCreamCar.orderMagnum(Magnum.MagnumType.MILKCHOCOLADE);
        //Magnum magnum4 = iceCreamCar.orderMagnum(Magnum.MagnumType.ALPINENUTS);

        // als je magnum4 toevoeg, krijg je een uitzondering want er is geen voorraad

        try {

           Magnum magnum3 = iceCreamCar.orderMagnum(Magnum.MagnumType.ALPINENUTS);
        } catch (NoMoreIceCreamException ex) {
            System.err.print(ex);
        }



        IceRocket iceRocket = iceCreamCar.orderIceRocket();
        IceRocket iceRocket1 = iceCreamCar.orderIceRocket();
        //IceRocket iceRocket3 = iceCreamCar.orderIceRocket();
        // als je iceRocket3 toevoeg, krijg je een uitzondering

        try {
            IceRocket iceRocket2 = iceCreamCar.orderIceRocket();
        } catch (NoMoreIceCreamException ex) {
            System.err.print(ex);
        }


        Cone cone = iceCreamCar.orderCone(new Cone.Flavor[]{Cone.Flavor.BANANA});
        Cone cone1 = iceCreamCar.orderCone(new Cone.Flavor[]{Cone.Flavor.LEMON});
        //Cone cone3 = iceCreamCar.orderCone(new Cone.Flavor[]{Cone.Flavor.BANANA});
        // als je cone3 toevoeg, krijg je een uitzondering
        try {
            Cone cone2 = iceCreamCar.orderCone(new Cone.Flavor[]{Cone.Flavor.BANANA});
        } catch (NoMoreIceCreamException ex) {
            System.err.print(ex);
        }


        Eatable [] instances = {magnum,magnum1,magnum2,iceRocket,iceRocket1,cone,cone1};

        for (int i = 0; i < instances.length; i++)
        {
            instances[i].eat();
        }
        String str = new String(String.valueOf(iceCreamCar.getProfit()));
        System.out.println("total profit : "  + str.substring(0,4));

    }
}
