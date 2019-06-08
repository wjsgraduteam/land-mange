package com.lete.land.landdal.repository;

import com.lete.land.landdal.entity.ExitProject;
import com.lete.land.landdal.vo.exitMange.ExitApplyVo;
import org.apache.xmlbeans.impl.common.ValidatorListener;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by WJ on 2019/3/28 0028
 */
public interface ExitProjectRepository extends JpaRepository<ExitProject,String>, JpaSpecificationExecutor<ExitProject> {

   @Query(value = " select f.town,f.village,f.householder_name,f.id_card,s.social_security_type,t.present_stock_type,f.apply_exit_land_no,f.apply_exit_lan_area ,f.house_site_area,f.house_area from e_project p inner join e_exit_famers_apply f on p.id = f.pro_id  inner join e_social_type_change s on p.id = s.pro_id inner join e_stock_type_change t on p.id = t.pro_id  \n" +
           " where p.id = ?1 and s.hourse_holder_id = '0'",nativeQuery = true)
    List<Object[]> findExitApplyInfoByProId(String proId);

    @Query(value = "select s.name, s.id_card ,s.relation, s.social_security_type,t.present_stock_type from e_social_type_change s inner join e_stock_type_change t on s.pro_id = t.pro_id  \n" +
            "WHERE s.pro_id = ?1 and s.hourse_holder_id != '0'",nativeQuery = true)
    List<Object[]> findFamilyMemberList(String id);
}
