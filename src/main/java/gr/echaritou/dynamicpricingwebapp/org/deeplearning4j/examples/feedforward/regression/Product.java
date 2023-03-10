package gr.echaritou.dynamicpricingwebapp.org.deeplearning4j.examples.feedforward.regression;

public class Product {

    //Product	object	variables
    private String productId;
    private double baseCost;
    private double brandPower;
    private double stock;                        //number	of	pieces
    private boolean stockBool;    //stock	available	or	no	stock
    private double referencePrice;
    private double price;
    private double NN1price;

    private double relativeBaseCost;
    private double relativePrice;


    //Constructors
    Product() {
    }

    Product(String productId, double baseCost, double brandPower, boolean stockBool, double referencePrice, double price) {
        this.productId = productId;
        this.baseCost = baseCost;
        this.brandPower = brandPower;
        this.stockBool = stockBool;
        this.referencePrice = referencePrice;
        this.price = price;
    }


    // Getters
    public String getProductId() {
        return productId;
    }

    // Setters
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double newBaseCost) {
        this.baseCost = newBaseCost;
    }

    public double getBrandPower() {
        return brandPower;
    }

    public void setBrandPower(double newBrandPower) {
        this.brandPower = newBrandPower;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double newStock) {
        this.stock = newStock;
    }

    public boolean getStockBool() {
        return stockBool;
    }

    public void setStockBool(boolean newStockBool) {
        this.stockBool = newStockBool;
    }

    public double getReferencePrice() {
        return referencePrice;
    }

    public void setReferencePrice(double newBasePrice) {
        this.referencePrice = newBasePrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public double getNN1Price() {
        return NN1price;
    }

    public void setNN1Price(double newNN1Price) {
        this.NN1price = newNN1Price;
    }

    public double getRelativeBaseCost() {
        return relativeBaseCost;
    }

    public void setRelativeBaseCost(double newRelativeBaseCost) {
        this.relativeBaseCost = newRelativeBaseCost;
    }

    public double getRelativePrice() {
        return relativePrice;
    }

    public void setRelativePrice(double newRelativePrice) {
        this.relativePrice = newRelativePrice;
    }


    //refresh stock, when a product is sold
    public void refreshstock() {
        stock = this.getStock() - 1;
        if (this.stock == 0) {
            this.setStockBool(false);
        }
    }
}