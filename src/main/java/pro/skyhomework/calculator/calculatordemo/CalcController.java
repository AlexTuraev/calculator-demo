package pro.skyhomework.calculator.calculatordemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CalcController {
    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping
    public String helloStart() {
        return calcService.hello();
    }

    @GetMapping(path = "/calculator")
    public String hello() {
        return calcService.hello();
    }

    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam(defaultValue = "") String num1, @RequestParam(defaultValue = "") String num2) {
        return calcService.plus(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam(defaultValue = "") String num1, @RequestParam(defaultValue = "") String num2) {
        return calcService.minus(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam(defaultValue = "") String num1, @RequestParam(defaultValue = "") String num2) {
        return calcService.multiply(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam(defaultValue = "") String num1, @RequestParam(defaultValue = "") String num2) {
        return calcService.divide(num1, num2);
    }
}
