package com.company.Inventory;

public class Food extends Items {

    private String categories;
    private String expirationDate;
    private boolean isRefrigerated;


    public Food(double price, String itemName, int quantity, String dateReceived, String categories, String expirationDate, boolean isRefrigerated) {
        super(price, itemName, quantity, dateReceived);
        this.categories = categories;
        this.expirationDate = expirationDate;
        this.isRefrigerated = isRefrigerated;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isRefrigerated() {
        return isRefrigerated;
    }

    public void setRefrigerated(boolean refrigerated) {
        isRefrigerated = refrigerated;
    }
}
