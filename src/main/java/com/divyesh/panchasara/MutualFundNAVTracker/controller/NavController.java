package com.divyesh.panchasara.MutualFundNAVTracker.controller;

import com.divyesh.panchasara.MutualFundNAVTracker.model.ResponseFund;
import com.divyesh.panchasara.MutualFundNAVTracker.model.ResponseFundHistory;
import com.divyesh.panchasara.MutualFundNAVTracker.model.ResponseFundReturns;
import com.divyesh.panchasara.MutualFundNAVTracker.service.NavService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/funds")
public class NavController {

    private final NavService navServiceImpl;

    public NavController(NavService navServiceImpl) {
        this.navServiceImpl = navServiceImpl;
    }

    @GetMapping("/{fundCode}/latest-nav")
    public ResponseEntity<ResponseFund> getLatestNav(
            @PathVariable String fundCode,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date
            ) {
        ResponseFund responseFund = navServiceImpl.getNavOfDate(fundCode, date);
        if (responseFund == null) return ResponseEntity.badRequest().build();
        return ResponseEntity.ok(responseFund);
    }
    
    @GetMapping("/{fundCode}/history")
    public ResponseEntity<ResponseFundHistory> getHistory(
            @PathVariable String fundCode,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fromDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate toDate
    ) {
        ResponseFundHistory responseFundHistory = navServiceImpl.getHistory(fundCode, fromDate, toDate);
        if (responseFundHistory == null) return ResponseEntity.badRequest().build();
        return ResponseEntity.ok(responseFundHistory);
    }

    @GetMapping("/{fundCode}/returns")
    public ResponseEntity<ResponseFundReturns> getReturns(
            @PathVariable String fundCode,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate beforeDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate afterDate
    ) {
        ResponseFundReturns returns = navServiceImpl.getReturns(fundCode, beforeDate, afterDate);
        if (returns == null) return  ResponseEntity.badRequest().build();
        return ResponseEntity.ok(returns);
    }
}
