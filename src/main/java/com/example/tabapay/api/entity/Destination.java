package com.example.tabapay.api.entity;

import jakarta.persistence.*;

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

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Folder getFolder() {
        return folder;
    }
}
