package de.chojo.repbot.config.elements;

@SuppressWarnings({"FieldMayBeFinal", "FieldCanBeLocal"})
public class AnalyzerSettings {
    private int historySize = 100;
    private int voiceMembers = 10;
    private int latestMaxHours = 12;
    private float minFuzzyScore = 0.9f;

    public int latestMaxHours() {
        return latestMaxHours;
    }

    public float minFuzzyScore() {
        return minFuzzyScore;
    }

    public int historySize() {
        return Math.min(historySize, 100);
    }

    public int voiceMembers() {
        return voiceMembers;
    }
}
