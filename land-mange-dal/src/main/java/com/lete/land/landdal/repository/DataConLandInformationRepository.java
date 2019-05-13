package com.lete.land.landdal.repository;

import com.lete.land.landdal.entity.DataBusinessEntityInformation;
import com.lete.land.landdal.entity.DataConLandInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DataConLandInformationRepository extends JpaRepository<DataConLandInformation,String>,JpaSpecificationExecutor<DataConLandInformation> {

}
