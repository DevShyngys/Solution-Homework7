package src.iterator;

import java.util.ArrayList;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        Season season1 = new Season();
        season1.addEpisode(new Episode("Episode 1", 1200));
        season1.addEpisode(new Episode("Episode 2", 1300));

        Season season2 = new Season();
        season2.addEpisode(new Episode("Episode 3", 1400));
        season2.addEpisode(new Episode("Episode 4", 1100));

        List<Season> series = new ArrayList<>();
        series.add(season1);
        series.add(season2);

        EpisodeIterator bingeIterator = new BingeIterator(series);

        while (bingeIterator.hasNext()) {
            System.out.println(bingeIterator.next().getTitle());
        }
    }
}
