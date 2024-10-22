package Task_44;

class NewOrderState implements OrderState {
    public void payOrder(Order order) {
        System.out.println("Order is paid.");
        order.setState(new PaidOrderState());
    }

    public void shipOrder(Order order) {
        System.out.println("Cannot ship, order is not paid.");
    }

    public void deliverOrder(Order order) {
        System.out.println("Cannot deliver, order is not shipped.");
    }

    public void cancelOrder(Order order) {
        System.out.println("Order is cancelled.");
        order.setState(new CancelledOrderState());
    }
}

class PaidOrderState implements OrderState {
    public void payOrder(Order order) {
        System.out.println("Order is already paid.");
    }

    public void shipOrder(Order order) {
        System.out.println("Order is shipped.");
        order.setState(new ShippedOrderState());
    }

    public void deliverOrder(Order order) {
        System.out.println("Cannot deliver, order is not shipped.");
    }

    public void cancelOrder(Order order) {
        System.out.println("Order is cancelled.");
        order.setState(new CancelledOrderState());
    }
}

class ShippedOrderState implements OrderState {
    public void payOrder(Order order) {
        System.out.println("Order is already paid.");
    }

    public void shipOrder(Order order) {
        System.out.println("Order is already shipped.");
    }

    public void deliverOrder(Order order) {
        System.out.println("Order is delivered.");
        order.setState(new DeliveredOrderState());
    }

    public void cancelOrder(Order order) {
        System.out.println("Cannot cancel, order is already shipped.");
    }
}

class DeliveredOrderState implements OrderState {
    public void payOrder(Order order) {
        System.out.println("Order is already paid.");
    }

    public void shipOrder(Order order) {
        System.out.println("Order is already shipped.");
    }

    public void deliverOrder(Order order) {
        System.out.println("Order is already delivered.");
    }

    public void cancelOrder(Order order) {
        System.out.println("Cannot cancel, order is already delivered.");
    }
}

class CancelledOrderState implements OrderState {
    public void payOrder(Order order) {
        System.out.println("Order is cancelled.");
    }

    public void shipOrder(Order order) {
        System.out.println("Order is cancelled.");
    }

    public void deliverOrder(Order order) {
        System.out.println("Order is cancelled.");
    }

    public void cancelOrder(Order order) {
        System.out.println("Order is already cancelled.");
    }
}
