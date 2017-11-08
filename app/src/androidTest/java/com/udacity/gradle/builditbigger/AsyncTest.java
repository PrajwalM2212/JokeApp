package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

/**
 * Created by prajwalm on 10/10/17.
 */


@RunWith(AndroidJUnit4.class)
public class AsyncTest {


    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void testAsyncTask() throws Exception {
        try {


            EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(mActivityTestRule.getActivity().getApplicationContext());
            endpointsAsyncTask.execute();

            String joke = endpointsAsyncTask.get(30, TimeUnit.SECONDS);

            assertNotNull(joke);


            assertTrue(joke.length() > 0);
        } catch (Exception e) {

            Log.e("Exception", "time out");

        }
    }
}

