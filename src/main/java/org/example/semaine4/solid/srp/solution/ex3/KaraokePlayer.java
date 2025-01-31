package org.example.semaine4.solid.srp.solution.ex3;

import org.example.semaine4.solid.srp.violation.ex3.AudioPlayer;
import org.example.semaine4.solid.srp.violation.ex3.AudioRecorder;
import org.example.semaine4.solid.srp.violation.ex3.VideoPlayer;

public class KaraokePlayer {

    private String state;
    private AudioPlayer audioPlayer;
    private VideoPlayer videoPlayer;
    private AudioRecorder audioRecorder;
    private LyricsParser lyricsParser;
    private TimingsParser timingsParser;
    private LyricsTextPlayer lyricsTextPlayer;
    private RecordingsManager recordingsManager;

    public KaraokePlayer(AudioPlayer audioPlayer, VideoPlayer videoPlayer, AudioRecorder audioRecorder,
                         LyricsParser lyricsParser, TimingsParser timingsParser,
                         LyricsTextPlayer lyricsTextPlayer, RecordingsManager recordingsManager) {
        this.audioPlayer = audioPlayer;
        this.videoPlayer = videoPlayer;
        this.audioRecorder = audioRecorder;
        this.lyricsParser = lyricsParser;
        this.timingsParser = timingsParser;
        this.lyricsTextPlayer = lyricsTextPlayer;
        this.recordingsManager = recordingsManager;
        this.state = "IDLE";
    }

    public void playKaraoke(String lyricsFile, String timingsFile, String videoFile) {
        lyricsParser.parse(lyricsFile);
        timingsParser.parse(timingsFile);
        lyricsTextPlayer.displayLyrics();
        state = "PLAY_KARAOKE";
        System.out.println("Lecture du karaoké.");
    }

    public void pause() {
        state = "PAUSED";
        System.out.println("Lecture mise en pause.");
    }

    public void stop() {
        state = "IDLE";
        System.out.println("Lecture arrêtée.");
    }
}

