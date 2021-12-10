package com.Univer.laba_2;

public class InvoiceTest {

    private String partNumber;
    private String description;
    private int quantityOfGoods;
    private double priceParts;

    public InvoiceTest() {

    }

    public InvoiceTest(String partNumber, String description, int quantityOfGoods, double priceParts) {
        this.partNumber = partNumber;

        this.description = description;

        if (quantityOfGoods < 0)
            this.quantityOfGoods = 0;
        else
            this.quantityOfGoods = quantityOfGoods;

        if (priceParts < 0)
            this.priceParts = 0;
        else
            this.priceParts = priceParts;

    }


    public double getInvoiceQuantity() {
        return quantityOfGoods * priceParts;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setQuantityOfGoods(int quantityOfGoods) {
        if (quantityOfGoods < 0) {
            System.out.println("Error! The quantity of goods can't be less than 0.");
        }
        this.quantityOfGoods = quantityOfGoods;
    }

    public int getQuantityOfGoods() {
        return quantityOfGoods;
    }

    public void setPriceParts(double priceParts) {
        if (priceParts < 0) {
            System.out.println("Error! The price for a parts can't be less than 0.");
        }
        this.priceParts = priceParts;
    }

    public double getPriceParts() {
        return priceParts;
    }

}