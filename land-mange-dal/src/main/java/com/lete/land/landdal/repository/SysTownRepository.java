package com.lete.land.landdal.repository;

import com.lete.land.landdal.entity.SysTown;
import com.lete.land.landdal.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by WJ on 2019/3/28 0028
 */
public interface SysTownRepository extends JpaRepository<SysTown,String>, JpaSpecificationExecutor<SysTown> {

}
