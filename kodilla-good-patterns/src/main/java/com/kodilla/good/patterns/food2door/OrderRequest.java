package com.kodilla.good.patterns.food2door;

public class OrderRequest {
    private CompanyNames selectedCompany;
    private User user;
    private String productType;
    private int productQuantity;

    public OrderRequest(User user, CompanyNames selectedCompany, String productType, int productQuantity) {
        this.selectedCompany = selectedCompany;
        this.productType = productType;
        this.productQuantity = productQuantity;
        this.user = user;
    }

    public CompanyNames getSelectedCompany() {
        return selectedCompany;
    }

    public void setSelectedCompany(CompanyNames selectedCompany) {
        this.selectedCompany = selectedCompany;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
