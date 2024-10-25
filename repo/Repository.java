package uk.co.devfoundry.tasks.polytask.repo;

import java.util.ArrayList;
import java.util.List;

public class Repository<T> {
    private final List<T> items;

    public Repository() {
        items = new ArrayList<>();
    }

    // Add an item to the repository
    public void add(T item) {
        items.add(item);
        System.out.println("Item added to repository.");
    }

    // Retrieve all items in the repository
    public List<T> getAll() {
        return items;
    }

    // Display all items in the repository
    public void displayAll() {
        for (T item : items) {
            System.out.println(item.toString());
        }
    }
}
