package java.Models;

public class SpecialPrice {
    private int specialPriceID;
    private int categoryID;
    private float specialPrice;

    public SpecialPrice(int categoryID, float specialPrice) {
        this.categoryID = categoryID;
        this.specialPrice = specialPrice;
    }
    public SpecialPrice(){

    }

    public int getSpecialPriceID() {
        return specialPriceID;
    }

    public void setSpecialPriceID(int specialPriceID) {
        this.specialPriceID = specialPriceID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public float getSpecialPrice() {
        return specialPrice;
    }

    public void setSpecialPrice(float specialPrice) {
        this.specialPrice = specialPrice;
    }
}