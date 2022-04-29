package inventory.model;


import product.model.Product;


public class InventoryItem {
    Product product ;
    int      quantity ;

    public Product getProduct()
    {
        return this.product;
    }

    public int  getQuantity()
    {
        return this.quantity;
    }

    public void setProduct(Product product)
    {
        this.product = product ;
    }

    public void setQuantity(int qty)
    {
        this.quantity = qty ;
    }

}
