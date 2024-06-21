package lesson20240617.refactoring;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class OrderProcessor {

    private static final String EXPRESS = "express";
    private static final String STANDARD = "standard";
    private List<Order> orders = new ArrayList<>();

    public void processOrder(String customerId, List<String> itemIds, String shippingMethod) {
        Customer customer = getCustomerById(customerId);
        if (customer == null) {
            logInfo("Customer not found");
            return;
        }

        List<Item> items = getItemsInCart(itemIds);

        if (items.isEmpty()) {
            logInfo("No valid items found for order");
            return;
        }

        double totalAmount = items.stream().mapToDouble(Item::getPrice).sum();

        if (!isValidShippingMethod(shippingMethod)) {
            logInfo("Invalid shipping method");
            return;    
        }
        double shippingCost = getShippingCost(shippingMethod);

        Order order = createOrder(customer, items, totalAmount, shippingCost);
        orders.add(order);
        logInfo("Order processed: " + order.getId());
    }

    private void logInfo(String data) {
        System.out.println(data);
    }

    private static Order createOrder(Customer customer, List<Item> items, double totalAmount, double shippingCost) {
        Order order = new Order();
        order.setCustomer(customer);
        order.setItems(items);
        order.setTotalAmount(totalAmount);
        order.setShippingCost(shippingCost);
        order.setOrderStatus("Processing");
        return order;
    }

    private static double getShippingCost(String shippingMethod) {
        return switch (shippingMethod) {
            case STANDARD -> 5.99;
            default -> 9.99;
        };
    }

    private boolean isValidShippingMethod(String shippingMethod) {
        return STANDARD.equals(shippingMethod) || EXPRESS.equals(shippingMethod);
    }

    private List<Item> getItemsInCart(List<String> itemIds) {
        return itemIds.stream().map(this::getItemById).peek(item -> {
            if (item == null) {
                logInfo("Item not found: " + item.getId());
            }
        }).filter(Objects::nonNull).collect(Collectors.toCollection(ArrayList::new));
    }

    public void cancelOrder(long orderId) {
        Order orderToRemove = getOrderById(orderId);
        if (orderToRemove != null) {
            orders.remove(orderToRemove);
            logInfo("Order canceled: " + orderToRemove.getId());
        } else {
            logInfo("Order not found: " + orderId);
        }
    }

    private Order getOrderById(long orderId) {
        return orders.stream().filter(order -> order.getId() == orderId).findFirst().orElse(null);
    }

    public void printOrderDetails(long orderId) {
        Order foundOrder = getOrderById(orderId);
        if (foundOrder != null) {
            logInfo("Order Details: ");
            logInfo("Customer: " + foundOrder.getCustomer().getName());
            logInfo("Items: ");
            for (Item item : foundOrder.getItems()) {
                logInfo(" - " + item.getName() + ": $" + item.getPrice());
            }
            logInfo("Total Amount: $" + foundOrder.getTotalAmount());
            logInfo("Shipping Cost: $" + foundOrder.getShippingCost());
            logInfo("Status: " + foundOrder.getOrderStatus());
        } else {
            logInfo("Order not found: " + orderId);
        }
    }

    private Customer getCustomerById(String customerId) {
        // Simulated method to get customer by ID
        return new Customer(customerId, "Customer Name");
    }

    private Item getItemById(String itemId) {
        // Simulated method to get item by ID
        return new Item(itemId, "Item Name", Math.random() * 100);
    }
}