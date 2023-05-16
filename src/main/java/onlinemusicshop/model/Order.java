package onlinemusicshop.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "client_order")

public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "order_number")
    private String orderNumber;
    @Column(name = "date_of_oder")
    private Date dateOfOrder;
    @Column(name = "total_amount")
    private Double totalAmount;

    @OneToMany(mappedBy = "order")
    private List<ProductOrder> productOrder;
    public Order() {
    }

    public Order(String orderNumber, Date dateOfOrder, Double totalAmount) {
        this.orderNumber = orderNumber;
        this.dateOfOrder = dateOfOrder;

        this.totalAmount = totalAmount;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderNumber='" + orderNumber + '\'' +
                ", dateOfOrder=" + dateOfOrder +
                ", totalAmount=" + totalAmount +
                '}';
    }

}
