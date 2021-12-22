package com.company.decoratorPattern;

import com.company.decoratorPattern.decorator.A3;
import com.company.decoratorPattern.decorator.A4;
import com.company.decoratorPattern.decorator.A5;
import com.company.decoratorPattern.decorator.Audi;
import com.company.decoratorPattern.decorator.ICar;

public class Main {

    public static void main(String[] args) {
	    ICar audi = new Audi(1000);
	    audi.showCost();

	    //a3
        ICar audi3 = new A3(audi,"A3");
        audi3.showCost();

        //a4
        ICar audi4 = new A4(audi,"A4");
        audi4.showCost();

        //a5
        ICar audi5 = new A5(audi,"A5");
        audi5.showCost();
    }
}
