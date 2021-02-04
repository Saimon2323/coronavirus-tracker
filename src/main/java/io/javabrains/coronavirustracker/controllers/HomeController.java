package io.javabrains.coronavirustracker.controllers;

import io.javabrains.coronavirustracker.models.LocationStats;
import io.javabrains.coronavirustracker.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")
    public String home(Model model){

        List<LocationStats> allStats = coronaVirusDataService.getAllStats();

//        int totalReportedCasesToday = allStats.stream().mapToInt(stat -> stat.getLocationTotalCasesToday()).sum();
//        int totalReportedCasesYesterday = allStats.stream().mapToInt(stat -> stat.getLocationTotalCasesYesterday()).sum();
//        int totalNewCases = allStats.stream().mapToInt(stat -> stat.getDiffFromPrevDay()).sum();
        // same
        int totalReportedCasesToday = allStats.stream().mapToInt(LocationStats::getLocationTotalCasesToday).sum();
        int totalReportedCasesYesterday = allStats.stream().mapToInt(LocationStats::getLocationTotalCasesYesterday).sum();
        int totalNewCases = allStats.stream().mapToInt(LocationStats::getDiffFromPrevDay).sum();

        model.addAttribute("totalReportedCasesYesterday", totalReportedCasesYesterday);
        model.addAttribute("totalReportedCasesToday", totalReportedCasesToday);
        model.addAttribute("totalNewCases", totalNewCases);
        model.addAttribute("coronaRecords", allStats);

        return "home";
    }
}
