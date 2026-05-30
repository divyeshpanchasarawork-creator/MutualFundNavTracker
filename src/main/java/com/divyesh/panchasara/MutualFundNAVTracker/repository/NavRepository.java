package com.divyesh.panchasara.MutualFundNAVTracker.repository;

import com.divyesh.panchasara.MutualFundNAVTracker.entity.FundEntity;
import com.divyesh.panchasara.MutualFundNAVTracker.entity.FundId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface NavRepository extends JpaRepository<FundEntity, FundId> {

    @Query("SELECT f FROM FundEntity f WHERE f.fundCode = :fundCode AND f.navDate = :date")
    FundEntity getNavOfDate(@Param("fundCode") String fundCode, @Param("date") LocalDate date);

    @Query("SELECT f FROM FundEntity f WHERE f.fundCode = :fundCode AND f.navDate BETWEEN :fromDate AND :toDate ORDER BY f.navDate ASC")
    List<FundEntity> getHistory(@Param("fundCode") String fundCode, @Param("fromDate") LocalDate fromDate, @Param("toDate") LocalDate toDate);
}
