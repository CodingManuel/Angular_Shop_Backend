package com.zinneluv2code.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name="product_category")
// @Data -- Lombock known bug
@Getter
@Setter
public class ProductCategory {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Product> products;




    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
