package org.example.models;

public class Event{
    public Tournament tournament;
    public Season season;
    public RoundInfo roundInfo;
    public String customId;
    public Status status;
    public int winnerCode;
    public HomeTeam homeTeam;
    public AwayTeam awayTeam;
    public HomeScore homeScore;
    public AwayScore awayScore;
    public Time time;
    public Changes changes;
    public boolean hasGlobalHighlights;
    public boolean hasEventPlayerStatistics;
    public boolean hasEventPlayerHeatMap;
    public int detailId;
    public boolean crowdsourcingDataDisplayEnabled;
    public int id;
    public boolean crowdsourcingEnabled;
    public int startTimestamp;
    public String slug;
    public boolean finalResultOnly;
    public boolean feedLocked;
    public boolean isEditor;
    public int homeRedCards;
    public int awayRedCards;

    public Event() {
    }

    public Event(Tournament tournament, Season season, RoundInfo roundInfo, String customId, Status status, int winnerCode, HomeTeam homeTeam, AwayTeam awayTeam, HomeScore homeScore, AwayScore awayScore, Time time, Changes changes, boolean hasGlobalHighlights, boolean hasEventPlayerStatistics, boolean hasEventPlayerHeatMap, int detailId, boolean crowdsourcingDataDisplayEnabled, int id, boolean crowdsourcingEnabled, int startTimestamp, String slug, boolean finalResultOnly, boolean feedLocked, boolean isEditor, int homeRedCards, int awayRedCards) {
        this.tournament = tournament;
        this.season = season;
        this.roundInfo = roundInfo;
        this.customId = customId;
        this.status = status;
        this.winnerCode = winnerCode;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.time = time;
        this.changes = changes;
        this.hasGlobalHighlights = hasGlobalHighlights;
        this.hasEventPlayerStatistics = hasEventPlayerStatistics;
        this.hasEventPlayerHeatMap = hasEventPlayerHeatMap;
        this.detailId = detailId;
        this.crowdsourcingDataDisplayEnabled = crowdsourcingDataDisplayEnabled;
        this.id = id;
        this.crowdsourcingEnabled = crowdsourcingEnabled;
        this.startTimestamp = startTimestamp;
        this.slug = slug;
        this.finalResultOnly = finalResultOnly;
        this.feedLocked = feedLocked;
        this.isEditor = isEditor;
        this.homeRedCards = homeRedCards;
        this.awayRedCards = awayRedCards;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public RoundInfo getRoundInfo() {
        return roundInfo;
    }

    public void setRoundInfo(RoundInfo roundInfo) {
        this.roundInfo = roundInfo;
    }

    public String getCustomId() {
        return customId;
    }

    public void setCustomId(String customId) {
        this.customId = customId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getWinnerCode() {
        return winnerCode;
    }

    public void setWinnerCode(int winnerCode) {
        this.winnerCode = winnerCode;
    }

    public HomeTeam getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(HomeTeam homeTeam) {
        this.homeTeam = homeTeam;
    }

    public AwayTeam getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(AwayTeam awayTeam) {
        this.awayTeam = awayTeam;
    }

    public HomeScore getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(HomeScore homeScore) {
        this.homeScore = homeScore;
    }

    public AwayScore getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(AwayScore awayScore) {
        this.awayScore = awayScore;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Changes getChanges() {
        return changes;
    }

    public void setChanges(Changes changes) {
        this.changes = changes;
    }

    public boolean isHasGlobalHighlights() {
        return hasGlobalHighlights;
    }

    public void setHasGlobalHighlights(boolean hasGlobalHighlights) {
        this.hasGlobalHighlights = hasGlobalHighlights;
    }

    public boolean isHasEventPlayerStatistics() {
        return hasEventPlayerStatistics;
    }

    public void setHasEventPlayerStatistics(boolean hasEventPlayerStatistics) {
        this.hasEventPlayerStatistics = hasEventPlayerStatistics;
    }

    public boolean isHasEventPlayerHeatMap() {
        return hasEventPlayerHeatMap;
    }

    public void setHasEventPlayerHeatMap(boolean hasEventPlayerHeatMap) {
        this.hasEventPlayerHeatMap = hasEventPlayerHeatMap;
    }

    public int getDetailId() {
        return detailId;
    }

    public void setDetailId(int detailId) {
        this.detailId = detailId;
    }

    public boolean isCrowdsourcingDataDisplayEnabled() {
        return crowdsourcingDataDisplayEnabled;
    }

    public void setCrowdsourcingDataDisplayEnabled(boolean crowdsourcingDataDisplayEnabled) {
        this.crowdsourcingDataDisplayEnabled = crowdsourcingDataDisplayEnabled;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isCrowdsourcingEnabled() {
        return crowdsourcingEnabled;
    }

    public void setCrowdsourcingEnabled(boolean crowdsourcingEnabled) {
        this.crowdsourcingEnabled = crowdsourcingEnabled;
    }

    public int getStartTimestamp() {
        return startTimestamp;
    }

    public void setStartTimestamp(int startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public boolean isFinalResultOnly() {
        return finalResultOnly;
    }

    public void setFinalResultOnly(boolean finalResultOnly) {
        this.finalResultOnly = finalResultOnly;
    }

    public boolean isFeedLocked() {
        return feedLocked;
    }

    public void setFeedLocked(boolean feedLocked) {
        this.feedLocked = feedLocked;
    }

    public boolean isEditor() {
        return isEditor;
    }

    public void setEditor(boolean editor) {
        isEditor = editor;
    }

    public int getHomeRedCards() {
        return homeRedCards;
    }

    public void setHomeRedCards(int homeRedCards) {
        this.homeRedCards = homeRedCards;
    }

    public int getAwayRedCards() {
        return awayRedCards;
    }

    public void setAwayRedCards(int awayRedCards) {
        this.awayRedCards = awayRedCards;
    }

    @Override
    public String toString() {
        return "Event{" +
                "tournament=" + tournament +
                ", season=" + season +
                ", roundInfo=" + roundInfo +
                ", customId='" + customId + '\'' +
                ", status=" + status +
                ", winnerCode=" + winnerCode +
                ", homeTeam=" + homeTeam +
                ", awayTeam=" + awayTeam +
                ", homeScore=" + homeScore +
                ", awayScore=" + awayScore +
                ", time=" + time +
                ", changes=" + changes +
                ", hasGlobalHighlights=" + hasGlobalHighlights +
                ", hasEventPlayerStatistics=" + hasEventPlayerStatistics +
                ", hasEventPlayerHeatMap=" + hasEventPlayerHeatMap +
                ", detailId=" + detailId +
                ", crowdsourcingDataDisplayEnabled=" + crowdsourcingDataDisplayEnabled +
                ", id=" + id +
                ", crowdsourcingEnabled=" + crowdsourcingEnabled +
                ", startTimestamp=" + startTimestamp +
                ", slug='" + slug + '\'' +
                ", finalResultOnly=" + finalResultOnly +
                ", feedLocked=" + feedLocked +
                ", isEditor=" + isEditor +
                ", homeRedCards=" + homeRedCards +
                ", awayRedCards=" + awayRedCards +
                '}';
    }
}
