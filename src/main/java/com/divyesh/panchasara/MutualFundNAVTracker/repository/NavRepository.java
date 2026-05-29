package com.divyesh.panchasara.MutualFundNAVTracker.repository;

import com.divyesh.panchasara.MutualFundNAVTracker.entity.FundEntity;
import com.divyesh.panchasara.MutualFundNAVTracker.entity.FundId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface NavRepository extends JpaRepository<FundEntity, FundId> {
//    FundEntity getLatest(String fundName);
//    List<FundEntity> getHistory(String fundName, LocalDate fromDate, LocalDate toDate);
//    FundEntity getReturn(String fundName, LocalDate fromDate, LocalDate toDate);
}
