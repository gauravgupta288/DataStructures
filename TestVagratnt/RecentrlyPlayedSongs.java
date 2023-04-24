package TestVagratnt;

import java.util.LinkedHashMap;
import java.util.Map;

public class RecentrlyPlayedSongs {
    private final int capacity;
    private Map<String, LinkedHashMap<String, Long>> store;

    public RecentrlyPlayedSongs(int capacity) {
        this.capacity = capacity;
        this.store = new LinkedHashMap<>();
    }

    public void addSong(String user, String song, Long timestamp) {
        LinkedHashMap<String, Long> songs = store.getOrDefault(user, new LinkedHashMap<>());

        if (songs.containsKey(song)) {
            songs.remove(song);
        }

        if (songs.size() == capacity) {
            songs.remove(songs.keySet().iterator().next());
        }

        songs.put(song, timestamp);
        store.put(user, songs);
    }

    public void getRecentSongs(String user) {
        LinkedHashMap<String, Long> songs = store.getOrDefault(user, new LinkedHashMap<>());

        for (Map.Entry<String, Long> entry : songs.entrySet()) {
            System.out.println("Song: " + entry.getKey() + ", Last played: " + entry.getValue());
        }
    }
}
