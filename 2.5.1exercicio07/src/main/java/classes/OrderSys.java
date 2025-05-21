package classes;

import java.util.List;
import java.util.ArrayList;

public class OrderSys {
 
    private List<Order> orders;

    public OrderSys() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public double totalRevenue() {
        double total = 0;
        for (Order o : orders) {
            total += o.getTotal();
        }
        return total;
    }

    public Product mostSoldProduct() {
        Product result = null;
        int maxCount = -1;

        for (Order o : orders) {
            for (Product p : o.getProducts()) {
                int count = countProduct(p);
                if (count > maxCount) {
                    maxCount = count;
                    result = p;
                }
            }
        }
        return result;
    }

    public Product leastSoldProduct() {
        Product result = null;
        int minCount = 999999;

        for (Order o : orders) {
            for (Product p : o.getProducts()) {
                int count = countProduct(p);
                if (count < minCount) {
                    minCount = count;
                    result = p;
                }
            }
        }
        return result;
    }

    public Customer clientWithMostOrders() {
        Customer result = null;
        int max = -1;
        for (Order o1 : orders) {
            int count = 0;
            for (Order o2 : orders) {
                if (o1.getCustomer().equals(o2.getCustomer())) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                result = o1.getCustomer();
            }
        }
        return result;
    }

    public Customer clientWhoSpentMost() {
        Customer result = null;
        double max = -1;
        for (Order o1 : orders) {
            double total = 0;
            for (Order o2 : orders) {
                if (o1.getCustomer().equals(o2.getCustomer())) {
                    total += o2.getTotal();
                }
            }
            if (total > max) {
                max = total;
                result = o1.getCustomer();
            }
        }
        return result;
    }

    private int countProduct(Product target) {
        int count = 0;
        for (Order o : orders) {
            for (Product p : o.getProducts()) {
                if (p.equals(target)) {
                    count++;
                }
            }
        }
        return count;
    }

    public List<Order> getOrders() {
        return orders;
    }
}
    

