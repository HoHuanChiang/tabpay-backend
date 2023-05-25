package com.example.tabapay.api.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

@Entity
@Table(name="Location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "destination_id")
    private Destination destination;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="address", nullable = false)
    private String address;

    @Column(name="description", nullable = false, columnDefinition = "nvarchar(max)")
    private String description;

    @Column(name="website", nullable = true)
    private String website;

    public Long getId() {
        return id;
    }

    public Destination getDestination() {
        return destination;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }

    public String getWebsite() {
        return website;
    }
}
