package com.assignment3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PingMedian {

    public static double pingHost(String host) throws IOException, InterruptedException {
        List<Double> times = new ArrayList<Double>();
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (System.getProperty("os.name").startsWith("Windows")) {
            processBuilder.command("cmd.exe", "/c", "ping", "-n", "10", host);
        } else {
            processBuilder.command("sh", "-c", "ping -c 10 " + host);
        }
        Process process = processBuilder.start();
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.contains("time=")) {
                double time = Double.parseDouble(line.split("time=")[1].split(" ")[0].replaceAll("ms", ""));

                times.add(time);
            }
        }
        process.waitFor();
        Collections.sort(times);
        if (times.size() % 2 == 0) {
            return (times.get(times.size() / 2) + times.get(times.size() / 2 - 1)) / 2;
        } else {
            return times.get(times.size() / 2);
        }
    }

    public static void main(String[] args) {
        String host = "google.com";
        try {
            double median = pingHost(host);
            System.out.println("Median ping time to " + host + ": " + median + " ms");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
