package src.iterator;

import java.util.ArrayList;
import java.util.List;

public class Season {
    private List<Episode> episodes = new ArrayList<>();

    public void addEpisode(Episode e) {
        episodes.add(e);
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }
}
