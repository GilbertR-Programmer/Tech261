package com.sparta.grr.calculators;

import com.sparta.grr.definitions.PriceDefinition;
import com.sparta.grr.models.CarPortModel;
import com.sparta.grr.models.HouseModel;

import java.math.BigDecimal;

public class PriceCalculator {

    private final PriceDefinition priceDefinition;

    public PriceCalculator(PriceDefinition priceDefinition) {
        this.priceDefinition = priceDefinition;
    }

    public BigDecimal calculateFloorPrice(HouseModel houseModel){
        return BigDecimal.valueOf(AreaCalculator.calculateFloorArea(houseModel)).multiply(priceDefinition.getFloorPrice()) ;
    }

    public BigDecimal calculateWallPrice(HouseModel houseModel){
        return BigDecimal.valueOf(AreaCalculator.calculateWallArea(houseModel)).multiply(priceDefinition.getWallPrice()) ;
    }

    public BigDecimal calculateCarPortPrice(CarPortModel carPortModel){
        return BigDecimal.valueOf(AreaCalculator.calculateCarPortArea(carPortModel)).multiply(priceDefinition.getCarPortPrice()) ;
    }

    public BigDecimal calculateTotalPrice(HouseModel houseModel){
        return calculateFloorPrice(houseModel).add(calculateWallPrice(houseModel)).add(calculateCarPortPrice(houseModel.getCarPort()));
    }
}
