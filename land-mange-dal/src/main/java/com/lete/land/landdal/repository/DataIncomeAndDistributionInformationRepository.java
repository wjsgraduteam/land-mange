package com.lete.land.landdal.repository;

import com.lete.land.landdal.entity.DataIncomeAndDistributionInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DataIncomeAndDistributionInformationRepository extends JpaRepository<DataIncomeAndDistributionInformation,String>,JpaSpecificationExecutor<DataIncomeAndDistributionInformation> {
}
