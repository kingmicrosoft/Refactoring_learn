package com.refactor.method;

/**
 * Created by wenchai on 2015/8/27.
 */
public class ExtractMethodExample implements printStatement {
    private int _quality;
    private Product _product;
    private String _productName;
    private String _type;
    private static double _itemPrice = 2.0;

    /* too much work  */
    public String createStatements() {
        //do other work already..
        _productName=_product.getProductName();
        double price = getPrice();

        //print statement
        return printStatement(price);

    }

    private double getPrice() {
     final    double basePrice = _quality * _itemPrice;
        return  _quality>100?basePrice*2:basePrice;
    }

    @Override
    public String printStatement(double price) {
        System.out.println("to xml report");
        return "productName is:" + _productName + " and price is:" + price;
    }

    public String getFeedbackFromCustomer(CustomerComment customerComment) {
        //do something

        //for simple ,return the name of customer
        return customerComment.getName();
    }




    /*   */
    public ExtractMethodExample(int quality, Product product) {
        this._quality = quality;
        this._product=product;
    }

//    public ExtractMethodExample(int quality, String type) {
//        this._quality = quality;
//        this._type = type;
//    }

}
