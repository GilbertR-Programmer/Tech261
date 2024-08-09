package com.sparta.grr.calculators;

import com.sparta.grr.models.CarPortModel;
import com.sparta.grr.models.HouseModel;

public class AreaCalculator {

    public static double calculateFloorArea(HouseModel houseModel){
        return houseModel.getWidth() * houseModel.getLength();
    }

    public static double calculateWallArea(HouseModel houseModel){
        return 2 * (houseModel.getHeight() * houseModel.getWidth() + houseModel.getHeight() * houseModel.getLength());
    }

    public static double calculateCarPortArea(CarPortModel carPortModel){
        return carPortModel.getWidth() * carPortModel.getLength();
    }

    public static double calculateTotalArea(HouseModel houseModel){
        return calculateFloorArea(houseModel) + calculateCarPortArea(houseModel.getCarPort());
    }
}
