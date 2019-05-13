package com.lete.land.landdal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "d_population_status")
public class DataPopulationStatus {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "town_id")
    private String townId;
    @Column(name = "village")
    private String village;
    @Column(name = "town")
    private String town;

}
