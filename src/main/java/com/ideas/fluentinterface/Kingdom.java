package com.ideas.fluentinterface;

public class Kingdom {
     final boolean hasExistingAlliance;
    final boolean atWar;
     final int availableResources;
     final boolean sharesBorder;

    public Kingdom(boolean hasExistingAlliance, boolean atWar, int availableResources, boolean sharesBorder) {
        this.hasExistingAlliance = hasExistingAlliance;
        this.atWar = atWar;
        this.availableResources = availableResources;
        this.sharesBorder = sharesBorder;
    }

    public boolean canFormAlliance() {
        return !hasExistingAlliance && !atWar && availableResources >= 100 && sharesBorder;
    }
}
