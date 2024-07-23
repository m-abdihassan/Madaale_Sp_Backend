package com.example.MadaaleSp_MS.Usercontroler;


import com.example.MadaaleSp_MS.Service.OverviewService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/overview")
public class OverviewController {


    private final OverviewService overviewService;

    public OverviewController(OverviewService overviewService) {
        this.overviewService = overviewService;
    }

    @GetMapping
    public Map<String, Long> getOverviewData() {
        return overviewService.getOverviewData();
    }
}
