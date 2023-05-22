package com.example.tabapay.api.repository;

import com.example.tabapay.api.entity.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FolderRepository extends JpaRepository<Folder, Long> {
    public List<Folder> findByParentFolderId(Long parentFolderId);
}
