package com.example.tabapay.api.entity;

import com.example.tabapay.api.enums.ObjectType;
import jakarta.persistence.*;

@Entity
@Table(name="AssociateImage")
public class AssociateImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long id;

    @Column(name="object_type", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private ObjectType objectType;

    @Column(name="object_type_id", nullable = false)
    private Long objectTypeId;

    @Column(name="image_name", nullable = false)
    private String imageName;

    public ObjectType getObjectType() {
        return objectType;
    }

    public Long getObjectTypeId() {
        return objectTypeId;
    }

    public String getImageName() {
        return imageName;
    }
}
