package com.espark.adarsh;

public class ApplicationMain {
    public static void main(String[] args) {

        Mailer.send(mailer -> mailer.to("adarshkumar@singh")
                .subject("sample")
                .body("welcome espark  ")
                .from("radha@singh"));
    }
}
