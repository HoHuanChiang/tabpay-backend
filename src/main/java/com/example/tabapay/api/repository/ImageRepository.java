package com.example.tabapay.api.repository;

import com.example.tabapay.api.entity.AssociateImage;
import com.example.tabapay.api.enums.ObjectType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageRepository extends JpaRepository<AssociateImage, Long> {
    public List<AssociateImage> findByObjectTypeAndObjectTypeIdIn(ObjectType objectType, List<Long> objectTypeId);
}
