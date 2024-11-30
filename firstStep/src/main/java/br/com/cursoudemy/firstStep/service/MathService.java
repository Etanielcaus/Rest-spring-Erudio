package br.com.cursoudemy.firstStep.service;

import br.com.cursoudemy.firstStep.Utils.MathUtils;
import org.springframework.stereotype.Service;

@Service
public class MathService {
    private final MathUtils mathUtils;

    public MathService(MathUtils mathUtils) {
        this.mathUtils = mathUtils;
    }

    public Double realizeSum(String numberOne, String numberTwo) throws Exception {
        mathUtils.validateNumbers(numberOne, numberTwo);
        return mathUtils.convertToDouble(numberOne) + mathUtils.convertToDouble(numberTwo);
    }

    public Double realizeSubtraction(String numberOne, String numberTwo) throws Exception {
        mathUtils.validateNumbers(numberOne, numberTwo);
        return mathUtils.convertToDouble(numberOne) - mathUtils.convertToDouble(numberTwo);
    }

    public Double realizeDivision(String numberOne, String numberTwo) throws Exception {
        mathUtils.validateNumbers(numberOne, numberTwo);
        return mathUtils.convertToDouble(numberOne) / mathUtils.convertToDouble(numberTwo);
    }

    public Double realizeMultiplication(String numberOne, String numberTwo) throws Exception {
        mathUtils.validateNumbers(numberOne, numberTwo);
        return mathUtils.convertToDouble(numberOne) * mathUtils.convertToDouble(numberTwo);
    }

    public Double realizeMedia(String numberOne, String numberTwo, String numberThree) throws Exception {
        mathUtils.validateNumbers(numberOne, numberTwo);
        return (mathUtils.convertToDouble(numberOne) + mathUtils.convertToDouble(numberTwo)
                + mathUtils.convertToDouble(numberThree)) / 3;
    }

    public Double realizeSquareRoot(String numberOne) throws Exception {
        mathUtils.validateNumbers(numberOne);
        return Math.sqrt(mathUtils.convertToDouble(numberOne));
    }
}
