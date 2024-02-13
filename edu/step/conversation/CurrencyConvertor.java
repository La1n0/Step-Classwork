package edu.step.conversation;

public class CurrencyConvertor {
    private double exchangeRate=19.8;

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double convertToEUR(double amount) {
        return amount / exchangeRate;
    }

    public double convertFromEUR(double amount) {
        return amount * exchangeRate;
    }
}
