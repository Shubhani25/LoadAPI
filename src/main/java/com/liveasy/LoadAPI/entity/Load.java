package com.liveasy.LoadAPI.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "loads")
public class Load {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "load_id")
    private Integer LoadId;

    @Column(name = "shipper_id")
    private Integer shipperId;

    @Column(name = "loading_point")
    private String loadingPoint;

    @Column(name = "unloading_point")
    private String unloadingPoint;

    @Column(name = "product_type")
    private String productType;

    @Column(name = "truck_type")
    private String truckType;

    @Column(name = "no_of_trucks")
    private Integer noOfTrucks;

    @Column(name = "weight")
    private Integer weight;

    @Column(name = "comment")
    private String comment;

    @Column(name = "date")
    private Date date;
}
