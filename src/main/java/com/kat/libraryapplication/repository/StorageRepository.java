package com.kat.libraryapplication.repository;

import com.kat.libraryapplication.entity.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StorageRepository extends JpaRepository<Rent, Long> {
}
