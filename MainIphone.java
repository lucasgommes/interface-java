package ChallengeIphone;

import ChallengeIphone.interfaces.InternetBrowser;

public class MainIphone {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.Call();
        iphone.Play();
        iphone.ShowPage();

        InternetBrowser browser = new Iphone();
        browser.AddNewTab();
    }
}
