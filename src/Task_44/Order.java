package Task_44;

class Order {
    private OrderState state;

    public Order() {
        state = new NewOrderState();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void payOrder() {
        state.payOrder(this);
    }

    public void shipOrder() {
        state.shipOrder(this);
    }

    public void deliverOrder() {
        state.deliverOrder(this);
    }

    public void cancelOrder() {
        state.cancelOrder(this);
    }
}
