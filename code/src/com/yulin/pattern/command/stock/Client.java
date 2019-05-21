package com.yulin.pattern.command.stock;

public class Client {

    public static void main(String[] args) {
        Stock stock = new Stock();

        BuyStockOrder buyStockOrder = new BuyStockOrder(stock);
        SellStockOrder sellStockOrder = new SellStockOrder(stock);

        Broker broker = new Broker();
        broker.addOrder(buyStockOrder);
        broker.addOrder(sellStockOrder);
        broker.placeOrders();
    }

}
