package com.arabi.progressloader;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;


public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        progressBar = (ProgressBar) this.findViewById(R.id.progressBar);

        progressBar.setVisibility(View.VISIBLE);
//        new ProgressTask().execute();


    }


//    private class ProgressTask extends AsyncTask<String, String, String> {
//
//
//
//        @Override
//        protected void onPreExecute(){
//            progressBar.setVisibility(View.VISIBLE);
//        }
//
//        @Override
//        protected String doInBackground(String... params) {
//            //my stuff is here
//            String result = "result";
//
//            return result;
//
//        }
//
//        @Override
//        protected void onPostExecute(String result) {
//            progressBar.setVisibility(View.GONE);
//        }
//    }
}

