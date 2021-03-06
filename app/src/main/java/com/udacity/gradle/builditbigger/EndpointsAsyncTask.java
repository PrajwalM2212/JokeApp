package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

import com.example.androidlib.JokeActivity;
import com.example.prajwalm.myapplication.backend.myApi.MyApi;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;

import java.io.IOException;

/**
 * Created by prajwalm on 08/10/17.
 */

public class EndpointsAsyncTask extends AsyncTask<Void, Void, String> {
    private static MyApi myApiService = null;
    private Context mContext;

    public EndpointsAsyncTask(Context context) {
        mContext = context;
    }

    @Override
    protected String doInBackground(Void... params) {
        if (myApiService == null) {  // Only do this once
            /**  MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
             new AndroidJsonFactory(), null)
             // options for running against local devappserver
             // - 10.0.2.2 is localhost's IP address in Android emulator
             // - turn off compression when running against local devappserver
             .setRootUrl("http://192.168.1.100:8080/_ah/api/")
             .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
            @Override
            \public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
            abstractGoogleClientRequest.setDisableGZipContent(true);
            }
            });**/

            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
                    .setRootUrl("https://joketellingapp-182307.appspot.com/_ah/api/");

            myApiService = builder.build();
        }

        try {
            return myApiService.getJoke().execute().getData();
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    @Override
    protected void onPostExecute(String result) {

        Intent intent = new Intent(mContext, JokeActivity.class);

        intent.putExtra("JOKE", result);
        mContext.startActivity(intent);

    }
}



