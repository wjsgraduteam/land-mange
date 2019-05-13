package com.lete.land.landdal.repository;

import com.lete.land.landdal.entity.DataLandTransfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DataLandTransferRepository extends JpaRepository<DataLandTransfer,String>,JpaSpecificationExecutor<DataLandTransfer> {
}
