package com.example.tabapay.api.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Destination")
public class Destination {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long Id;

    @Column(name="name", nullable = false)
    private String Name;

    @ManyToOne
    @JoinColumn(name = "folder_id")
    private Folder folder;

    public Long getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public Folder getFolder() {
        return folder;
    }
}
