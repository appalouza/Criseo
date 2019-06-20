package com.example.criseo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "TEST";

    public ImageButton launchImg;
    public ImageButton testbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //ajoute les entrées de menu_test à l'ActionBar
        getMenuInflater().inflate(R.menu.menu_activity_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {

        switch (item.getItemId()) {
            case R.id.ajoutPhoto:
                Intent intent = new Intent(MainActivity.this, recyclerImg.class);
                Log.d(TAG, "showImage: ");
                startActivity(intent);
                // EX : call intent if you want to swich to other activity
                return true;
            case R.id.ajoutMusique:
                musique();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void photo() {

    }

    private void musique() {

    }

    /**
     *
     */

    @OnClick(R.id.launchImg)
    public void showImage(){
        Intent intent = new Intent(MainActivity.this, recyclerImg.class);
        Log.d(TAG, "showImage: ");
        startActivity(intent);
    }
}
