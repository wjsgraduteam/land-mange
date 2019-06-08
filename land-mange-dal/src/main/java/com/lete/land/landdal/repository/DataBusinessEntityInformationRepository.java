package com.lete.land.landdal.repository;

import com.lete.land.landdal.entity.DataBusinessEntityInformation;
import com.lete.land.landdal.entity.DataTemplateDeatil;
import com.lete.land.landdal.vo.business.SummaryAnalysisVO;
import com.lete.land.landdal.vo.dataCenter.TemplateVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface DataBusinessEntityInformationRepository extends JpaRepository<DataBusinessEntityInformation,String>,JpaSpecificationExecutor<DataBusinessEntityInformation> {
    @Modifying
    @Query(value = "alter table d_business_entity_information modify column id varchar(32) comment ?1",nativeQuery = true)
    void alterTemplate(String comment);

    @Query(value = "select u.idCard as idCard from DataBusinessEntityInformation u")
    List<TemplateVo> findTemplateVo();

    @Query(value = "select distinct new com.lete.land.landdal.vo.business.SummaryAnalysisVO(b.town,b.village) from DataBusinessEntityInformation b where b.townId = :townId and  b.year = :year")
    Page<SummaryAnalysisVO> getVillagePageByTown(@Param(value = "townId") Integer townId,@Param(value = "year") String year, Pageable pageable);

    Long countByOperatorTypeAndVillageLike(Integer type, String town);

    @Query(value = "select sum(b.contracted_area) from d_business_entity_information b where b.operator_type = ?1 and b.village like ?2",nativeQuery = true)
    Double summaryArea(Integer i, String village);


















































}
