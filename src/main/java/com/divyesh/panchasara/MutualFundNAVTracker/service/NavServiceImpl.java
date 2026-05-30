package com.divyesh.panchasara.MutualFundNAVTracker.service;

import com.divyesh.panchasara.MutualFundNAVTracker.model.ResponseFund;
import com.divyesh.panchasara.MutualFundNAVTracker.model.ResponseFundHistory;
import com.divyesh.panchasara.MutualFundNAVTracker.model.ResponseFundReturns;
import com.divyesh.panchasara.MutualFundNAVTracker.repository.NavRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class NavService implements com.divyesh.panchasara.MutualFundNAVTracker.service.Service {

    private final NavRepository navRepository;

    public NavService(NavRepository navRepository) {
        this.navRepository = navRepository;
    }


    @Override
    public ResponseFund getLatest(String fundCode, LocalDate date) {
        return null;
    }

    @Override
    public ResponseFundHistory getHistory(String fundCode, LocalDate fromDate, LocalDate toDate) {
        return null;
    }

    @Override
    public ResponseFundReturns getReturns(String fundCode, LocalDate fromDate, LocalDate toDate) {
        return null;
    }
}
