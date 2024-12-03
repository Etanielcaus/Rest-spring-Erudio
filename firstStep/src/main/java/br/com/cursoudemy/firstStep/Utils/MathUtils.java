package br.com.cursoudemy.firstStep.Utils;

import org.springframework.stereotype.Component;

@Component
public class MathUtils {

    public void validateNumbers(String... numbers){
        for (String number : numbers){
            if (!isNumeric(number)){
                throw new UnsupportedOperationException("Please a Set Numeric value");
            }
        }

    }

    public Double convertToDouble(String strNumber) {
        if (strNumber == null) return 0D;

//        BR 10,25 US 10.25
        String number = strNumber.replaceAll(",", ".");

        if (isNumeric(number)) return Double.parseDouble(number);

        return Double.parseDouble(strNumber);
    }

    public boolean isNumeric(String strNumber) {
        if (strNumber == null) return false;

        String number = strNumber.replaceAll(",", ".");

        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

}
