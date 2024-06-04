package HW28;

import java.util.*;
import java.util.stream.Collectors;

public class CustomerMain {
    public static void main(String[] args) {
        Map<Integer, Customer> customers = new HashMap<>();
        CustomerWithId customerWithId1 = new CustomerWithId("John", "Smith",1);
        CustomerWithId customerWithId2 = new CustomerWithId("Bred", "Pit",2);
        CustomerWithId customerWithId3 = new CustomerWithId("Michael", "Jordan",3);
        CustomerWithId customerWithId4 = new CustomerWithId("Lebron", "James",4);
        CustomerWithId customerWithId5 = new CustomerWithId("Michael", "Schumacher",5);
        List<CustomerWithId> customerWithIdList = new ArrayList<>(List.of
                (customerWithId1,customerWithId2,customerWithId3,customerWithId4,customerWithId5));

        customerWithIdList.stream()
                .map(customer->customers.put(customer.getId(),new Customer(customer.getName(),customer.getSurname())))
                .collect(Collectors.toList());

        Collection<Customer> values = customers.values();
        for(Customer elem: values){
            System.out.println("Value: "+ elem);
        }
        System.out.println("==========================");
        Set<Integer> keys = customers.keySet();
        for(Integer elem: keys){
            System.out.println("Key: " + elem);
        }
        System.out.println("==========================");
        Set<Map.Entry<Integer,Customer>> set = customers.entrySet();
        for (Map.Entry<Integer,Customer> entry: set)
            System.out.println("Key: " + entry.getKey() + "; Value: " + entry.getValue());
    }
}
