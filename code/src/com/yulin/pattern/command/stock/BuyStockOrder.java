package com.yulin.pattern.command.stock;

public class BuyStockOrder implements Order {

    private Stock stock;

    public BuyStockOrder(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        this.stock.buy();
    }

}
