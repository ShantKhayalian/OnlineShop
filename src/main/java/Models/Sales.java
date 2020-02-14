package java.Models;

public class Sales {
    private int salesID;
    private int categoryID;
    private float salesPercent;

    public Sales(int categoryID, float salesPercent) {
        this.categoryID = categoryID;
        this.salesPercent = salesPercent;
    }

    public Sales(){

    }

    public int getSalesID() {
        return salesID;
    }

    public void setSalesID(int salesID) {
        this.salesID = salesID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public float getSalesPercent() {
        return salesPercent;
    }

    public void setSalesPercent(float salesPercent) {
        this.salesPercent = salesPercent;
    }
}
