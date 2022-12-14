package com.antsrl.anotherspringdemo.repository;

import com.antsrl.anotherspringdemo.model.SoftwareHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoftwareHouseRepository extends JpaRepository<SoftwareHouse, Long> {
}
