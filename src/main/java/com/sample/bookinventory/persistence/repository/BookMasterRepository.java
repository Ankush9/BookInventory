package com.sample.bookinventory.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.sample.bookinventory.persistence.domain.BookMaster;

/**
 * JPA Repository for Book Master Table
 * 
 * @author Ankush
 * 
 */
public interface BookMasterRepository extends JpaRepository<BookMaster, String>, JpaSpecificationExecutor<BookMaster> {
}
