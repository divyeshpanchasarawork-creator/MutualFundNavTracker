package com.divyesh.panchasara.MutualFundNAVTracker.service;

import com.divyesh.panchasara.MutualFundNAVTracker.model.ResponseFund;
import com.divyesh.panchasara.MutualFundNAVTracker.model.ResponseFundHistory;
import com.divyesh.panchasara.MutualFundNAVTracker.model.ResponseFundReturns;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public interface NavService {
    ResponseFund getNavOfDate(String fundCode, LocalDate date);
    ResponseFundHistory getHistory(String fundCode, LocalDate fromDate, LocalDate toDate);
    ResponseFundReturns getReturns(String fundCode, LocalDate beforeDate, LocalDate afterDate);
}
