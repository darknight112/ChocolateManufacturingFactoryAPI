package com.Hisham.Task3.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Data
public class Order extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

//    @JoinColumn(name = "Product ID", referencedColumnName = "id")
//    @OneToOne(cascade = CascadeType.ALL)
//    Product product;

    int quantity;
    String shipping_address;


}
