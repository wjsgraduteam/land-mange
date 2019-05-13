package com.lete.land.landdal.repository;

import com.lete.land.landdal.entity.DataLandUseType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DataLandUseTypeRepository extends JpaRepository<DataLandUseType,String>,JpaSpecificationExecutor<DataLandUseType> {
}
