// 3 варіант
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Order {
    private String orderNumber;
    private String customerName;
    private List<String> dishes;

    public Order(String orderNumber, String customerName) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.dishes = new ArrayList<>();
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<String> getDishes() {
        return dishes;
    }

    public void addDish(String dish) {
        dishes.add(dish);
    }

    @Override
    public String toString() {
        return "Order Number: " + orderNumber + "\nCustomer: " + customerName + "\nDishes: " + dishes;
    }
}

class Restaurant {
    private Map<String, Order> orders;

    public Restaurant() {
        orders = new HashMap<>();
    }

    public void addOrder(Order order) {
        orders.put(order.getOrderNumber(), order);
    }

    public void removeOrder(String orderNumber) {
        if (orders.remove(orderNumber) != null) {
            System.out.println("Order " + orderNumber + " removed successfully.");
        } else {
            System.out.println("Order " + orderNumber + " not found.");
        }
    }

    public Order getOrder(String orderNumber) {
        return orders.get(orderNumber);
    }

    public void displayAllOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders found.");
        } else {
            for (Order order : orders.values()) {
                System.out.println(order);
                System.out.println("----------------------");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        Order order1 = new Order("001", "Alice");
        order1.addDish("Pizza");
        order1.addDish("Pasta");

        Order order2 = new Order("002", "Bob");
        order2.addDish("Burger");
        order2.addDish("Fries");

        restaurant.addOrder(order1);
        restaurant.addOrder(order2);

        System.out.println("All orders:");
        restaurant.displayAllOrders();

        System.out.println("\nSearch for order 001:");
        Order foundOrder = restaurant.getOrder("001");
        if (foundOrder != null) {
            System.out.println(foundOrder);
        } else {
            System.out.println("Order not found.");
        }

        System.out.println("\nRemoving order 002:");
        restaurant.removeOrder("002");

        System.out.println("\nAll orders after removal:");
        restaurant.displayAllOrders();
    }
}
