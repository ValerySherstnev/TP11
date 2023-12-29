package org.example;
import javax.persistence.*;
@Entity
@Table(name = "purchase")
public class Purchase<List> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "buyer_id")
    public Buyers buyer;

    @ManyToOne
    @JoinColumn(name = "product_id")
    public Product products;

    @Column
    public int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Buyers getBuyer() {
        return buyer;
    }

    public Product getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products = products;
    }

    public void setBuyer(Buyers buyer) {
        this.buyer = buyer;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }


    @Override
    public String toString(){
        return getProducts().getTitle() + " (id: " + getProducts().getId() + ") за";
    }
}

