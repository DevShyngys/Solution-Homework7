package src.iterator;
import java.util.List;

public class BingeIterator implements EpisodeIterator {
    private List<Season> seasons;
    private int seasonIndex = 0;
    private EpisodeIterator currentIterator;

    public BingeIterator(List<Season> seasons) {
        this.seasons = seasons;
        this.currentIterator = (EpisodeIterator) seasons.get(seasonIndex).iterator();
    }

    @Override
    public boolean hasNext() {
        if (currentIterator.hasNext()) {
            return true;
        } else {
            if (seasonIndex + 1 < seasons.size()) {
                seasonIndex++;
                currentIterator = (EpisodeIterator) seasons.get(seasonIndex).iterator();
                return currentIterator.hasNext();
            }
            return false;
        }
    }

    @Override
    public Episode next() {
        return currentIterator.next();
    }
}