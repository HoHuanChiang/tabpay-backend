package com.example.tabapay.api.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Destination")
public class Destination {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long id;

    @Column(name="name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "folder_id")
    private Folder folder;

    @OneToMany
    @JoinTable(name = "Location", joinColumns = { @JoinColumn(name = "destination_id") }, inverseJoinColumns = { @JoinColumn(name = "id") })
    private List<Location> locations = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Folder getFolder() {
        return folder;
    }

    public List<Location> getLocations() {
        return locations;
    }
}
