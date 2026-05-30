package com.divyesh.panchasara.MutualFundNAVTracker.model;

import java.time.LocalDate;
import java.util.List;

public class ResponseFundHistory {
    private String fundCode;
    private String fundName;
    private List<LocalDate> navDates;
    private List<Double> navValues;

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

    public List<LocalDate> getNavDates() {
        return navDates;
    }

    public void setNavDates(List<LocalDate> navDates) {
        this.navDates = navDates;
    }

    public List<Double> getNavValues() {
        return navValues;
    }

    public void setNavValues(List<Double> navValues) {
        this.navValues = navValues;
    }
}
