package br.com.cursoudemy.firstStep;

import br.com.cursoudemy.firstStep.excpetions.UnsupportedMathOperationException;
import br.com.cursoudemy.firstStep.service.MathService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MathController {

    private final MathService mathService;

//    private final AtomicLong counter = new AtomicLong();

    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double greeting(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
            ) throws Exception {
        return mathService.realizeSum(numberOne, numberTwo);
    }

    @RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double subtraction(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        return mathService.realizeSubtraction(numberOne, numberTwo);
    }

    @RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double division(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        return mathService.realizeDivision(numberOne, numberTwo);
    }

    @RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multiplication(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {

        return mathService.realizeMultiplication(numberOne, numberTwo);
    }

    @RequestMapping(value = "/media/{numberOne}/{numberTwo}/{numberThree}", method = RequestMethod.GET)
    public Double media(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo,
            @PathVariable(value = "numberThree") String numberThree
    ) throws Exception {
        return mathService.realizeMedia(numberOne, numberTwo, numberThree);
    }

    @RequestMapping(value = "/raiz/{number}", method = RequestMethod.GET)
    public Double raizQuadrada(
            @PathVariable(value = "number") String number
    ) throws Exception {
        return mathService.realizeSquareRoot(number);
    }

}
