package com.espark.adarsh.solid.open_close_principle;

public interface NotificationService {

    public void sendOtp(String medium);

    public void sendTransactionReport(String medium);

}
