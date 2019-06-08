package com.lete.land.landdal.repository;

import com.lete.land.landdal.entity.ExitSocialTypeChange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * Created by WJ on 2019/3/28 0028
 */
public interface ExitSocialTypeChangeRepository extends JpaRepository<ExitSocialTypeChange,String>, JpaSpecificationExecutor<ExitSocialTypeChange> {


    List<ExitSocialTypeChange> findByProId(String id);
}
