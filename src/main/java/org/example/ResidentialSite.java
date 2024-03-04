package org.example;

public class ResidentialSite extends Site{
    public double getBillableAmount(double units, double rate) {
        double base = units * rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
