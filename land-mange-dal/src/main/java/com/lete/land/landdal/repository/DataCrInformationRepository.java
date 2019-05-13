package com.lete.land.landdal.repository;

import com.lete.land.landdal.entity.DataConLandInformation;
import com.lete.land.landdal.entity.DataCrInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DataCrInformationRepository extends JpaRepository<DataCrInformation,String>,JpaSpecificationExecutor<DataCrInformation> {

}
