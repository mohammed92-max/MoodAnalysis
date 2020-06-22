package com.bridgelabz.moodAnalyze;

public class MoodAnalyze
{
    public String analyseMood(String message)
    {
        if(message.contains("Im in happy mood"))
        {
            return "happy";
        }
        else
            return "SAD";
    }
}
