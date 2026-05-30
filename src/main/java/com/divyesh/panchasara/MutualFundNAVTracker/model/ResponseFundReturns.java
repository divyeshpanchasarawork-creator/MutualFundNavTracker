package com.divyesh.panchasara.MutualFundNAVTracker.model;


public class ResponseFundReturns {
    private String fundCode;
    private String fundName;
    private double absoluteReturn;

    public ResponseFundReturns() {
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

    public double getAbsoluteReturn() {
        return absoluteReturn;
    }

    public void setAbsoluteReturn(double absoluteReturn) {
        this.absoluteReturn = absoluteReturn;
    }
}
