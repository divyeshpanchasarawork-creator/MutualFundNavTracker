package com.divyesh.panchasara.MutualFundNAVTracker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import java.time.LocalDate;

@Entity
@IdClass(FundId.class) // Links the composite key class
public class FundEntity {

    @Id
    private String fundCode;

    @Id
    private LocalDate navDate;

    private String fundName;
    private double navValue;

    public FundEntity() {
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public LocalDate getNavDate() {
        return navDate;
    }

    public void setNavDate(LocalDate navDate) {
        this.navDate = navDate;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public double getNavValue() {
        return navValue;
    }

    public void setNavValue(double navValue) {
        this.navValue = navValue;
    }
}