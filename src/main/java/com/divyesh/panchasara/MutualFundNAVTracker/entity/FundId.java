package com.divyesh.panchasara.MutualFundNAVTracker.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class FundId implements Serializable {

    private String fundCode;
    private LocalDate navDate;

    public FundId() {}

    public FundId(String fundCode, LocalDate navDate) {
        this.fundCode = fundCode;
        this.navDate = navDate;
    }

    // Getters and Setters
    public String getFundCode() { return fundCode; }
    public void setFundCode(String fundCode) { this.fundCode = fundCode; }

    public LocalDate getNavDate() { return navDate; }
    public void setNavDate(LocalDate navDate) { this.navDate = navDate; }

    // equals and hashCode are REQUIRED for composite keys
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FundId fundId = (FundId) o;
        return Objects.equals(fundCode, fundId.fundCode) &&
                Objects.equals(navDate, fundId.navDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fundCode, navDate);
    }
}