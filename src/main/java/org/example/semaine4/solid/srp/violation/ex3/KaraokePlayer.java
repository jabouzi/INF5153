package org.example.semaine4.solid.srp.violation.ex3;

public class KaraokePlayer {
    private String state;
    private AudioPlayer audioPlayer;
    private VideoPlayer videoPlayer;
    private AudioRecorder audioRecorder;

    public KaraokePlayer(AudioPlayer audioPlayer, VideoPlayer videoPlayer, AudioRecorder audioRecorder) {
        this.audioPlayer = audioPlayer;
        this.videoPlayer = videoPlayer;
        this.audioRecorder = audioRecorder;
        this.state = "IDLE";
    }

    public void playKaraoke(String lyricsFile, String timingsFile, String videoFile) {
        // Logique pour parser, synchroniser, et afficher les paroles.
        // Utilise des fichiers de synchronisation.
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

    public void playRecording(String recordingFile) {
        System.out.println("Lecture de l'enregistrement.");
    }
}
