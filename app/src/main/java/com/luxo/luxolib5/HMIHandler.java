package com.luxo.luxolib5;
import android.util.Log;
public class HMIHandler {
    private static final String TAG = "HMIHandler";
    private static HMIHandler instance;

    private int fanSpeed = 0; // Example state: fan speed

    // Private constructor to enforce singleton pattern
    private HMIHandler() {}

    // Method to get the singleton instance
    public static HMIHandler getInstance() {
        if (instance == null) {
            instance = new HMIHandler();
        }
        return instance;
    }

    // Static method for Unity to access the singleton instance
    public static HMIHandler getHandler() {
        return getInstance();
    }

    // Example method to set fan speed
    public void setFanSpeed(int speed) {
        if (speed < 0 || speed > 5) { // Example validation
            Log.e(TAG, "Invalid fan speed: " + speed);
            return;
        }
        this.fanSpeed = speed;
        Log.d(TAG, "Fan speed set to: " + fanSpeed);
    }

    // Example method to get fan speed
    public int getFanSpeed() {
        Log.d(TAG, "Getting current fan speed: " + fanSpeed);
        return fanSpeed;
    }

    // Example method to simulate temperature control
    public void setTemperature(float temperature) {
        Log.d(TAG, "Setting temperature to: " + temperature);
    }
}
