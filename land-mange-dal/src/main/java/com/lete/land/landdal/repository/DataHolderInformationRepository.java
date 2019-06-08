package com.lete.land.landdal.repository;

import com.lete.land.landdal.entity.DataHolderInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DataHolderInformationRepository extends JpaRepository<DataHolderInformation,String>,JpaSpecificationExecutor<DataHolderInformation> {
    DataHolderInformation findByIdCard(String idCard);
}
