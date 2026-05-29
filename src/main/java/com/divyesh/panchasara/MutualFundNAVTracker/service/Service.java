package com.divyesh.panchasara.MutualFundNAVTracker.service;

import com.divyesh.panchasara.MutualFundNAVTracker.model.ResponseFund;
import com.divyesh.panchasara.MutualFundNAVTracker.model.ResponseFundHistory;
import com.divyesh.panchasara.MutualFundNAVTracker.model.ResponseFundReturns;

import java.time.LocalDate;

public interface Service {
    ResponseFund getLatest(String fundCode, LocalDate date);
    ResponseFundHistory getHistory(String fundCode, LocalDate fromDate, LocalDate toDate);
    ResponseFundReturns getReturns(String fundCode, LocalDate fromDate, LocalDate toDate);
}
