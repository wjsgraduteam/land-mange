package com.lete.land.landdal.repository;

import com.lete.land.landdal.entity.DataBusinessEntityInformation;
import com.lete.land.landdal.entity.DataTemplateDeatil;
import com.lete.land.landdal.vo.dataCenter.TemplateVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DataBusinessEntityInformationRepository extends JpaRepository<DataBusinessEntityInformation,String>,JpaSpecificationExecutor<DataBusinessEntityInformation> {
    @Modifying
    @Query(value = "alter table d_business_entity_information modify column id varchar(32) comment ?1",nativeQuery = true)
    void alterTemplate(String comment);

    @Query(value = "select u.idCard as idCard from DataBusinessEntityInformation u")
    List<TemplateVo> findTemplateVo();
}
