package com.monkey.ultimatereport.api;

import java.util.List;

public interface UltimateReportProvider {

    int createReport(String reporter, String target, String reason);

    int getValidReports(String playerName);

    int getMaxValidReports();
    List getAllPendingReports();
    List getAllPlayerReports(String playerName);

}
