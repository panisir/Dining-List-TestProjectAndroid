package com.example.user.projekardemir;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.net.URI;
import java.text.ParseException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class MainActivity extends AppCompatActivity{




      @Override
      protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Button kardemir_btn= (Button) findViewById(R.id.btn_kardemirsite);
            RelativeLayout RLgiris= (RelativeLayout) findViewById(R.id.RLgiris);
            RLgiris.setBackgroundColor(Color.parseColor("#FB8C00"));

            kardemir_btn.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                        Uri kardemirlink=Uri.parse("https://www.kardemir.com/");
                        Intent intentlink=new Intent(Intent.ACTION_VIEW, kardemirlink);
                        startActivity(intentlink);
                  }
            });



         }

      public void gecis(View v){
            if(v.getId()==R.id.btn_aylikliste){
                  //aylik liste ye geçilecek
                  Intent intent=new Intent(getApplicationContext(),aylik_liste.class);
                  startActivity(intent);
            }
            else if(v.getId()==R.id.btn_hakkinda){
                  //hakkinda bölümü bilgiler girilecek
                  Intent intent=new Intent(getApplicationContext(),Hakkinda.class);
                  startActivity(intent);

            }

      }

      @Override
      public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
      }

      @Override
      public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                  return true;
            }

            return super.onOptionsItemSelected(item);
      }
}
