package com.bridgelabz.moodAnalyze;
import com.bridgelabz.moodAnalyze.MoodAnalyze;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzeTest
{
    @Test
    public void happyOrSadMood() throws Exception
    {
        MoodAnalyze moodAnalyze = new MoodAnalyze();
        String message = moodAnalyze.analyseMood("Im in happy mood");
        Assert.assertEquals("happy",message);
    }
}
