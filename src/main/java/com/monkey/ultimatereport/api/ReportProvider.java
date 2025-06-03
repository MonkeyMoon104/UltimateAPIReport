package com.monkey.ultimatereport.api;

public interface ReportProvider {

    int createReport(String reporter, String target, String reason);

    int getValidReports(String playerName);

    int getMaxValidReports();
}
