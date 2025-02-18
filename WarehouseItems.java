import java.util.*;

abstract class WarehouseItem {
    String name;

    WarehouseItem(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class Electronics extends WarehouseItem {
    Electronics(String name) {
        super(name);
    }
}

class Groceries extends WarehouseItem {
    Groceries(String name) {
        super(name);
    }
}

class Furniture extends WarehouseItem {
    Furniture(String name) {
        super(name);
    }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }

    void displayItems() {
        for (T item : items) {
            System.out.println(item.getName());
        }
    }
}

public class WarehouseItems {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Apple"));
        groceryStorage.addItem(new Groceries("Milk"));

        electronicsStorage.displayItems();
        groceryStorage.displayItems();
    }
}