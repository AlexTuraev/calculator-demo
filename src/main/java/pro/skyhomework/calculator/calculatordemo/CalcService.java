package pro.skyhomework.calculator.calculatordemo;

import org.springframework.stereotype.Service;

@Service
public class CalcService {
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public Boolean isExistParameters(String num1, String num2) {
        if(num1.equals("") || num2.equals("")){
            return false;
        } else {
            return true;
        }
    }

    public Boolean isValidParameters(String num1, String num2) {
        try {
            double n1 = Double.parseDouble(num1);
            double n2 = Double.parseDouble(num2);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String plus(String num1, String num2) {
        if (!isExistParameters(num1, num2)) {
            return ("Переданы не все параметры");
        }
        if (!isValidParameters(num1, num2)) {
            return ("Неверный формат данных переданных параметров");
        }

        double n1 = Double.parseDouble(num1);
        double n2 = Double.parseDouble(num2);
        return (num1 + " + " + num2 + " = " + Double.toString(n1 + n2));
    }

    public String minus(String num1, String num2) {
        if (!isExistParameters(num1, num2)) {
            return ("Переданы не все параметры");
        }
        if (!isValidParameters(num1, num2)) {
            return ("Неверный формат данных переданных параметров");
        }
        double n1 = Double.parseDouble(num1);
        double n2 = Double.parseDouble(num2);
        return (num1 + " - " + num2 + " = " + Double.toString(n1 - n2));
    }

    public String multiply(String num1, String num2) {
        if (!isExistParameters(num1, num2)) {
            return ("Переданы не все параметры");
        }
        if (!isValidParameters(num1, num2)) {
            return ("Неверный формат данных переданных параметров");
        }
        double n1 = Double.parseDouble(num1);
        double n2 = Double.parseDouble(num2);
        return (num1 + " * " + num2 + " = " + Double.toString(n1 * n2));
    }

    public String divide(String num1, String num2) {
        if (!isExistParameters(num1, num2)) {
            return ("Переданы не все параметры");
        }
        if (!isValidParameters(num1, num2)) {
            return ("Неверный формат данных переданных параметров");
        }
        double n1 = Double.parseDouble(num1);
        double n2 = Double.parseDouble(num2);
        if (n2 == 0) {
//            return ("На 0 делить нельзя. Попробуйте поменять 2-й параметр");
            throw new IllegalArgumentException("На ноль делить нельзя");
        }else {
            return (num1 + " / " + num2 + " = " + Double.toString(n1 / n2));
        }
    }
}
