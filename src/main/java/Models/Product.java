package java.Models;

public class Product {
    private int productID;
    private int categoryID;
    private String title;
    private String description;
    private float price;
    private int sales;
    private int newProduct;

    public Product(int categoryID, String title, String description, float price, int sales, int newProduct) {
        this.categoryID = categoryID;
        this.title = title;
        this.description = description;
        this.price = price;
        this.sales = sales;
        this.newProduct = newProduct;
    }
    public Product(){

    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public int getNewProduct() {
        return newProduct;
    }

    public void setNewProduct(int newProduct) {
        this.newProduct = newProduct;
    }
}