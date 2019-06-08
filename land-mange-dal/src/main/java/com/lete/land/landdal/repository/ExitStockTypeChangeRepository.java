package com.lete.land.landdal.repository;

import com.lete.land.landdal.entity.ExitStockTypeChange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by WJ on 2019/3/28 0028
 */
public interface ExitStockTypeChangeRepository extends JpaRepository<ExitStockTypeChange,String>, JpaSpecificationExecutor<ExitStockTypeChange> {


}
