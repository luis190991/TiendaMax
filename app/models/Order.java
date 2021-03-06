package models;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import play.db.jpa.Model;

@Entity
public class Order extends Model {

    @ManyToOne
    public Customer customer;
    public Date orderDate;
    public Date shippedDate;
    

    public Order() {
        orderDate = new Date();
        shippedDate = new Date();
    }

}
