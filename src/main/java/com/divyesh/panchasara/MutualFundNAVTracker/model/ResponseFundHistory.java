package com.divyesh.panchasara.MutualFundNAVTracker.model;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class ResponseFundHistory {
    private String fundCode;
    private String fundName;
    private LocalDate fromDate;
    private  LocalDate toDate;
    private List<Double> navHistory;

    public ResponseFundHistory() {
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public List<Double> getNavHistory() {
        return navHistory;
    }

    public void setNavHistory(List<Double> navHistory) {
        this.navHistory = navHistory;
    }
}
