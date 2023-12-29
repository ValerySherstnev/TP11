package org.example;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "buyers")
public class Buyers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "buyer")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Purchase> purchases;

    public List<Purchase> getPurchases() {
        return purchases;
    }

    public Buyers() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return getName() + " (id: " + getId() + ")";
    }
}