package com.example.ronin.controller;

import com.example.ronin.client.Charts;
import com.example.ronin.client.Gosuslugi;
import com.example.ronin.client.ScrfClient;

public class ThreadSystem extends Thread {
    private final Gosuslugi gosuslugi;
    private final ScrfClient scrfClient;
    private final Charts charts;

    public ThreadSystem(Gosuslugi gosuslugi, ScrfClient scrfClient, Charts charts) {
        this.gosuslugi = gosuslugi;
        this.scrfClient = scrfClient;
        this.charts = charts;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            gosuslugi.get();
            scrfClient.get();
            charts.get();
        }
    }
}
