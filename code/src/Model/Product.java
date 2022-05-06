package Model;

public class Product {

    private int productID;
    private String productName;
    private int amount, priceOrigin, price;

    private String userName, actionType, productIDtg, productNametg;
    private String timeInsert;
    private int amounttg;
    private int priceOrigintg;
    private int pricetg;

    public Product(int productID, String productName, int amount, int priceOrigin, int price, String userName, String actionType, String productIDtg, String productNametg, String timeInsert, int amounttg, int priceOrigintg, int pricetg) {
        this.productID = productID;
        this.productName = productName;
        this.amount = amount;
        this.priceOrigin = priceOrigin;
        this.price = price;
        this.userName = userName;
        this.actionType = actionType;
        this.productIDtg = productIDtg;
        this.productNametg = productNametg;
        this.timeInsert = timeInsert;
        this.amounttg = amounttg;
        this.priceOrigintg = priceOrigintg;
        this.pricetg = pricetg;
    }

    public Product() {
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPriceOrigin() {
        return priceOrigin;
    }

    public void setPriceOrigin(int priceOrigin) {
        this.priceOrigin = priceOrigin;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getProductIDtg() {
        return productIDtg;
    }

    public void setProductIDtg(String productIDtg) {
        this.productIDtg = productIDtg;
    }

    public String getProductNametg() {
        return productNametg;
    }

    public void setProductNametg(String productNametg) {
        this.productNametg = productNametg;
    }

    public String getTimeInsert() {
        return timeInsert;
    }

    public void setTimeInsert(String timeInsert) {
        this.timeInsert = timeInsert;
    }

    public int getAmounttg() {
        return amounttg;
    }

    public void setAmounttg(int amounttg) {
        this.amounttg = amounttg;
    }

    public int getPriceOrigintg() {
        return priceOrigintg;
    }

    public void setPriceOrigintg(int priceOrigintg) {
        this.priceOrigintg = priceOrigintg;
    }

    public int getPricetg() {
        return pricetg;
    }

    public void setPricetg(int pricetg) {
        this.pricetg = pricetg;
    }

}
