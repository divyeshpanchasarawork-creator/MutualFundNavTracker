package com.divyesh.panchasara.MutualFundNAVTracker.model;

import org.springframework.stereotype.Component;

@Component
public class ResponseFund {
    private String fundCode;
    private String fundName;
    private double navValue;

    public ResponseFund() {
    }

    public double getNavValue() {
        return navValue;
    }

    public void setNavValue(double navValue) {
        this.navValue = navValue;
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
}
