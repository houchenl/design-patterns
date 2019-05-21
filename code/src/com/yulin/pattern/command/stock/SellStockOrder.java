package com.yulin.pattern.command.stock;

public class SellStockOrder implements Order {

    private Stock stock;

    public SellStockOrder(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        this.stock.sell();
    }

}
