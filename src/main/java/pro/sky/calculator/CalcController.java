package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalcController {
    private final CalcService calcService;

    public CalcController(CalcService calcService){
        this.calcService = calcService;
    }

    @GetMapping
    public String calculator() {
        return calcService.calculator();
    }


    @GetMapping("/plus")
    public  String plus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2){
        return calcService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public  String minus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2){
        return calcService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public  String multiply(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2){
        return calcService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public  String divide(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2){
        return calcService.divide(num1, num2);
    }
}
