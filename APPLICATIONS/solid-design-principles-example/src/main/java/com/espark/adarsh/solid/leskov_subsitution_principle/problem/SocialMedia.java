package com.espark.adarsh.solid.leskov_subsitution_principle.problem;

public abstract class SocialMedia {

    //@support WhatsApp,Facebook,Instagram
    public abstract  void chatWithFriend();

    //@support Facebook,Instagram
    public abstract void publishPost(Object post);

    //@support WhatsApp,Facebook,Instagram
    public abstract  void sendPhotosAndVideos();

    //@support WhatsApp,Facebook
    public abstract  void groupVideoCall(String... users);
}
