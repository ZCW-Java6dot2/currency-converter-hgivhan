package io.zipcoder.currencyconverterapplication;

import java.util.Currency;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        Double getRate = currencyType.getRate();
        return currencyType.getRate() / this.getType().getRate();

        //currencyType.getRate is currency I want to convert to

        //this. current currency you're on in the test, the currency I have
        //get type of the currency in test
        //get rate of the type given in test

        //return Double.MAX_VALUE; <-- doesn't convert anything
        // returning max value is like returning 0/null
    }

    CurrencyType getType();

}
