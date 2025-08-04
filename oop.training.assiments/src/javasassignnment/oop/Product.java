package javasassignnment.oop;
//Assignment 4 part 2
//encapsulation
public class Product {
    private String productId;
    private String productName;
    private double price;
    private boolean inStock;
//default constructor(made by me)
    public Product(String id ,String n ,double p ,boolean s){
        productId = id;
        productName = n ;
        price = p ;
        inStock = s ;
    }
    public void displayProductInfo(){
        System.out.println("Product ID : " + getProductId());
        System.out.println("Product name : " + getProductName());
        System.out.println("Price : " + price);
        System.out.println("In Stock : " + isInStock());
    }
//getter public methods
        public String getProductId () {
            return productId;
        }
        public String getProductName () {
            return productName;
        }
        public double getPrice () {
            return price;
        }
        public boolean isInStock () {
            return inStock;
        }
//setter methods
    public void setPrice(double newPrice){
        System.out.println("Old price : " + getPrice());
        if (newPrice >=0){
            price = newPrice;
            System.out.println("New price : " + newPrice);
        }else{
            System.out.println("Incorrect price");
        }
    }
    public void setInStock(boolean status){
        System.out.println("In stock : " + inStock);
        if (status){
            inStock =status ;
            System.out.println("In Stock");
        }else{
            System.out.println("Out of stock");
        }
    }

}
