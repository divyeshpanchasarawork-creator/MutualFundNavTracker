package com.divyesh.panchasara.MutualFundNAVTracker.service;

import com.divyesh.panchasara.MutualFundNAVTracker.entity.FundEntity;
import com.divyesh.panchasara.MutualFundNAVTracker.model.ResponseFund;
import com.divyesh.panchasara.MutualFundNAVTracker.model.ResponseFundHistory;
import com.divyesh.panchasara.MutualFundNAVTracker.model.ResponseFundReturns;
import com.divyesh.panchasara.MutualFundNAVTracker.repository.NavRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class NavServiceImpl implements NavService {

    private final NavRepository navRepository;

    public NavServiceImpl(NavRepository navRepository) {
        this.navRepository = navRepository;
    }


    @Override
    public ResponseFund getNavOfDate(String fundCode, LocalDate date) {
        FundEntity fundEntity = navRepository.getNavOfDate(fundCode, date);

        if (fundEntity == null) return null;

        ResponseFund response = new ResponseFund();

        response.setFundCode(fundEntity.getFundCode());
        response.setFundName(fundEntity.getFundName());
        response.setNavValue(fundEntity.getNavValue());

        return response;
    }

    // use a hashmap the list may be misleading
    @Override
    public ResponseFundHistory getHistory(String fundCode, LocalDate fromDate, LocalDate toDate) {
        List<FundEntity> entities = navRepository.getHistory(fundCode, fromDate, toDate);

        if (entities == null || entities.isEmpty()) return null;

        ResponseFundHistory response = new ResponseFundHistory();
        response.setFundCode(fundCode);
        response.setFundName(entities.getFirst().getFundName());

        List<LocalDate> dates = new ArrayList<>();
        List<Double> values = new ArrayList<>();

        for (FundEntity entity : entities) {
            dates.add(entity.getNavDate());
            values.add(entity.getNavValue());
        }

        response.setNavDates(dates);
        response.setNavValues(values);

        return response;
    }

    @Override
    public ResponseFundReturns getReturns(String fundCode, LocalDate beforeDate, LocalDate afterDate) {
        FundEntity beforeDateFund = navRepository.getNavOfDate(fundCode, beforeDate);
        FundEntity afterDateFund = navRepository.getNavOfDate(fundCode, afterDate);

        if (beforeDateFund == null || afterDateFund == null) return null;

        // should be interms of percentage
        double returns = afterDateFund.getNavValue() - beforeDateFund.getNavValue();

        ResponseFundReturns responseFundReturns = new ResponseFundReturns();
        responseFundReturns.setAbsoluteReturn(returns);
        responseFundReturns.setFundName(beforeDateFund.getFundName());
        responseFundReturns.setFundCode(beforeDateFund.getFundCode());

        return responseFundReturns;
    }
}
