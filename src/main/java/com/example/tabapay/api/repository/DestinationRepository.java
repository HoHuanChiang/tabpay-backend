package com.example.tabapay.api.repository;

import com.example.tabapay.api.entity.Destination;
import com.example.tabapay.api.entity.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinationRepository extends JpaRepository<Destination, Long> {

}
