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

    private final NavService navService;

    public NavController(NavService navService) {
        this.navService = navService;
    }

    @GetMapping("/{fundCode}/latest-nav")
    public ResponseEntity<ResponseFund> getLatestNav(
            @PathVariable String fundCode,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date
            ) {
        ResponseFund responseFund = navService.getLatest(fundCode, date);
        return ResponseEntity.ok(responseFund);
    }
    
    @GetMapping("/{fundCode}/history")
    public ResponseEntity<ResponseFundHistory> getHistory(
            @PathVariable String fundCode,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fromDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate toDate
    ) {
        ResponseFundHistory responseFundHistory = navService.getHistory(fundCode, fromDate, toDate);
        return ResponseEntity.ok(responseFundHistory);
    }

    @GetMapping("/{fundCode}/returns")
    public ResponseEntity<ResponseFundReturns> getReturns(
            @PathVariable String fundCode,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fromDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate toDate
    ) {
        ResponseFundReturns returns = navService.getReturns(fundCode, fromDate, toDate);
        return ResponseEntity.ok(returns);
    }
}
