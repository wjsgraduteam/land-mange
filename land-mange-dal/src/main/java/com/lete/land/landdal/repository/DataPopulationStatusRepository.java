package com.lete.land.landdal.repository;

import com.lete.land.landdal.entity.DataPopulationStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DataPopulationStatusRepository extends JpaRepository<DataPopulationStatus,String>,JpaSpecificationExecutor<DataPopulationStatus> {
}
