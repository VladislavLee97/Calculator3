package pro.sky.java.course4.calculator2.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.java.course4.calculator2.service.CalculationService;

@Service
public class CalculationServiceImpl implements CalculationService {

    @Override
    public String plus(Integer value, Integer value2) {
        int result = value + value2;
        return value + " + " + value2 + " = " + result;
    }
    @Override
    public String minus(Integer value, Integer value2) {
        int result = value + value2;
        return value + " - " + value2 + " = " + result;
    }
    @Override
    public String multiply(Integer value, Integer value2) {
        int result = value * value2;
        return value + " * " + value2 + " = " + result;
    }


    @Override
    public String divide(Integer value, Integer value2) {
        if (value2 == 0) {
            return "Ошибка: на ноль не делиться";
        }
        int result = value / value2;
        return value + " / " + value2 + " = " + result;
    }
    //

}
