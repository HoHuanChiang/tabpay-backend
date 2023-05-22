package com.example.tabapay.api.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.*;

@Entity
@Table(name="Folder")
public class Folder  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long id;

    @Column(name="name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "parent_folder_id")
    private Folder parentFolder;

    @OneToMany
    @JoinTable(name = "Folder", joinColumns = { @JoinColumn(name = "parent_folder_id") }, inverseJoinColumns = { @JoinColumn(name = "id") })
    private List<Folder> subFolders = new ArrayList<>();

    @OneToMany
    @JoinTable(name = "Destination", joinColumns = { @JoinColumn(name = "folder_id") }, inverseJoinColumns = { @JoinColumn(name = "id") })
    private List<Destination> destinations = new ArrayList<>();


    @Column(name="create_time", nullable = false, updatable = false, insertable = false)
    @CreationTimestamp
    private Date createTime;

    public Folder() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Folder> getSubFolder(){
        return subFolders;
    }

    public List<Destination> getDestinations(){
        return destinations;
    }
}
