package com.monkey.ultimatereport.api;

import java.util.List;

public interface UltimateReportProvider {

    int createPendingReport(String reporter, String target, String reason, boolean silent);

    int getValidReports(String playerName);

    int getMaxValidReports();

    List<ReportData> getAllPendingReports();

    List<ReportData> getAllReportsFor(String player);


}
