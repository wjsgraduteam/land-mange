package com.lete.land.landdal.repository;

import com.lete.land.landdal.entity.DataResidenceIncome;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DataResidenceIncomeRepository extends JpaRepository<DataResidenceIncome,String>,JpaSpecificationExecutor<DataResidenceIncome> {
}
