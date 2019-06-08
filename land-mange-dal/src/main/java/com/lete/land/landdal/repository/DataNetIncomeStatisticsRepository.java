package com.lete.land.landdal.repository;

import com.lete.land.landdal.entity.DataNetIncomeStatistics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DataNetIncomeStatisticsRepository extends JpaRepository<DataNetIncomeStatistics,String>,JpaSpecificationExecutor<DataNetIncomeStatistics> {

    @Query(value = "select distinct d.year from d_net_income_statistics d order by d.year",nativeQuery = true)
    List<Object> findYear();
}
