package com.monkey.ultimatereport.api;

import java.util.List;

public interface UltimateReportProvider {

    int createReport(String reporter, String target, String reason, boolean bypasscooldown, boolean silent);

    int getValidReports(String playerName);

    int getMaxValidReports();

    List<ReportData> getAllPendingReports();

    List<ReportData> getAllReportsFor(String player);


}
