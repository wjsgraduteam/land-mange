package com.lete.land.landdal.repository;

import com.lete.land.landdal.entity.BusinessIncomeDistribution;
import com.lete.land.landdal.entity.DataBusinessEntityInformation;
import com.lete.land.landdal.vo.dataCenter.TemplateVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BusinessEntityIncomeRepository extends JpaRepository<BusinessIncomeDistribution,String>,JpaSpecificationExecutor<BusinessIncomeDistribution> {
}
