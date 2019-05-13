package com.lete.land.landdal.repository;

import com.lete.land.landdal.entity.DataNetIncomeStatistics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DataNetIncomeStatisticsRepository extends JpaRepository<DataNetIncomeStatistics,String>,JpaSpecificationExecutor<DataNetIncomeStatistics> {
}
