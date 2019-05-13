package com.lete.land.landdal.repository;

import com.lete.land.landdal.entity.DataInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DataInformationRepository extends JpaRepository<DataInformation,String>,JpaSpecificationExecutor<DataInformation> {


}
