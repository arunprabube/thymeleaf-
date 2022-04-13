package com.vehicle.entity;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "vehicle_data")
public class vehicleDetail {

    @Id
    private int vehicleId;

    private String regAuthority;

    private long RegNo;

    private long chassisNo;

    private String ownerName;

    private String vehicleClass;

    private String model;

    private String regnUpto;

    private String insuranceUpto;

    private String EmiNorms;

    private String regDate;

    private long engineNo;

    private String fuel;

    private String TaxUpto;

    private String puccUpto;

    private String rcStatus;



}
