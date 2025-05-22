package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {

    public String calculator() {
        return "<b>Добро пожаловать в калькулятор!</b> ";
    }

    //Сложение
    public String plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка!";
        }
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    //Вычитание
    public String minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка!";
        }
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    //Умножение
    public String multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка!";
        }
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    //Деление
    public String divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка!";
        }
        if (num2 == 0) {
            return "На ноль делить нельзя!";
        }
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}
