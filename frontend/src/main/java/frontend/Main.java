package frontend;

import inventory.model.InventoryItem;
import inventory.service.InventoryService;
import product.model.Product;

import java.util.List;

public class Main {

    public static void main(String args[])
    {

    }

    public static void listInventoryItems()
    {
        InventoryService service = null;
        List<InventoryItem> items =  service.getAllItems();
        for(InventoryItem item: items)
        {
            Product product = item.getProduct();
        }
    }
}
