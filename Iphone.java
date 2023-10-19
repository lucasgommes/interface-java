package ChallengeIphone;

import ChallengeIphone.interfaces.InternetBrowser;
import ChallengeIphone.interfaces.PlayerMusic;
import ChallengeIphone.interfaces.TelephoneCall;

public class Iphone implements TelephoneCall, PlayerMusic, InternetBrowser {

    public void ShowPage() {
        System.out.println("Showing web page.");
    }


    public void AddNewTab() {
        System.out.println("New tab added.");
    }


    public void UpdatePage() {
        System.out.println("Updating page.");
    }


    public void Play() {
        System.out.println("Music started.");
    }


    public void Pause() {
        System.out.println("Music paused.");
    }


    public void SelectMusic() {
        System.out.println("Selected music");
    }


    public void Call() {
        System.out.println("Call started.");
    }


    public void AnswerCall() {
        System.out.println("Call receive");
    }


    public void StartMailVoice() {
        System.out.println("Start main voice");
    }
}
