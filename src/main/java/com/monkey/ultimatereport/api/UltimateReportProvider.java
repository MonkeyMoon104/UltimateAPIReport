package com.monkey.ultimatereport.api;

import com.monkey.ultimatereport.api.data.ReportLeaderboardEntry;

import java.util.List;

public interface UltimateReportProvider {

    int createPendingReport(String reporter, String target, String reason, boolean silent);

    int getValidReports(String playerName);

    void incrementValidReports(String playerName);

    void resetValidReports(String playerName);

    void resetAllValidReports();

    void decrementValidReports(String playerName, int amount);

    int getMaxValidReports();

    List<ReportData> getAllPendingReports();

    List<ReportData> getAllReportsFor(String player);

    List<ReportLeaderboardEntry> getValidSentReportsLeaderboard(int page, int rowsPerPage);

    void resetPlayerValidSentReports(String playerName);

    void resetAllValidSentReports();

}
