package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {
    @Test
    public void doInBackgroundTest() throws Exception{
        try {
            EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
            //source2
            String result = endpointsAsyncTask.execute().get(30000, TimeUnit.MILLISECONDS);
            //source1
            assertNotNull(result);
            assertTrue(result.length() > 0);
        } catch (Exception e){
            Log.e("EndpointsAsyncTaskTest", "doInBackgroundTest: failed");
        }
    }
}
