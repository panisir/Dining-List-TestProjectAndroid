package com.example.user.projekardemir;


import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;

import java.io.InputStream;
import java.util.ArrayList;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.AssetManager;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;


public class aylik_liste extends AppCompatActivity {



      @Override
      protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_aylik_liste);
            LinearLayout LLayliklliste= (LinearLayout) findViewById(R.id.LLaylikliste);
            LLayliklliste.setBackgroundColor(Color.parseColor("#FF7043"));
            parseXML();


      }

      @Override
      public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_aylik_liste, menu);
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
      //------------------------------------




      //------------------------------------
      private void parseXML(){
            AssetManager assetManager=getBaseContext().getAssets();
            try {
                  //büyük ihtimalle ay seçimleri burada yapılacak
                  InputStream is = assetManager.open("tablom.xml"); //kendi tablomuzu gireceğiz
                  SAXParserFactory spf = SAXParserFactory.newInstance();
                  SAXParser sp = spf.newSAXParser();
                  XMLReader xr = sp.getXMLReader();

                  OrderXMLHandler myXMLHandler = new OrderXMLHandler();
                  xr.setContentHandler(myXMLHandler);
                  InputSource inStream = new InputSource(is);
                  xr.parse(inStream);

                  String List_id=myXMLHandler.getList_id();//id secimi burada
                  //yapılıyor

                  Log.v("id",List_id );//tam olarak ne işlevi olabilir??
                 final TableRow tr[]=new TableRow[20];

                  int i=0;
                  //TableRow tr= (TableRow) findViewById(R.id.satir1);
                  tr[0]= (TableRow) findViewById(R.id.satir1);
                  tr[0].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                              tr[0].setSelected(true);
                        }
                  });

                  tr[1]= (TableRow) findViewById(R.id.satir2);
                  tr[1].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                              tr[1].setSelected(true);
                        }
                  });

                  tr[2]= (TableRow) findViewById(R.id.satir3);
                  tr[2].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                              tr[2].setSelected(true);
                        }
                  });

                  tr[3]= (TableRow) findViewById(R.id.satir4);
                  tr[3].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                              tr[3].setSelected(true);
                        }
                  });
                  tr[4]= (TableRow) findViewById(R.id.satir5);
                  tr[4].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                              tr[4].setSelected(true);
                        }
                  });
                  tr[5]= (TableRow) findViewById(R.id.satir6);
                  tr[5].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                              tr[5].setSelected(true);
                        }
                  });
                  tr[6]= (TableRow) findViewById(R.id.satir7);
                  tr[6].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                              tr[6].setSelected(true);
                        }
                  });
                  tr[7]= (TableRow) findViewById(R.id.satir8);
                  tr[7].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                              tr[7].setSelected(true);
                        }
                  });
                  tr[8]= (TableRow) findViewById(R.id.satir9);
                  tr[8].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                              tr[8].setSelected(true);
                        }
                  });
                  tr[9]= (TableRow) findViewById(R.id.satir10);
                  tr[9].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                              tr[9].setSelected(true);
                        }
                  });
                  tr[10]= (TableRow) findViewById(R.id.satir11);
                  tr[10].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                              tr[10].setSelected(true);
                        }
                  });
                  tr[11]= (TableRow) findViewById(R.id.satir12);
                  tr[11].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                              tr[11].setSelected(true);
                        }
                  });
                  tr[12]= (TableRow) findViewById(R.id.satir13);
                  tr[12].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                              tr[12].setSelected(true);
                        }
                  });
                  tr[13]= (TableRow) findViewById(R.id.satir14);
                  tr[13].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                              tr[13].setSelected(true);
                        }
                  });
                  tr[14]= (TableRow) findViewById(R.id.satir15);
                  tr[14].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                              tr[14].setSelected(true);
                        }
                  });
                  tr[15]= (TableRow) findViewById(R.id.satir16);
                  tr[15].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                              tr[15].setSelected(true);
                        }
                  });
                  tr[16]= (TableRow) findViewById(R.id.satir17);
                  tr[16].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                              tr[16].setSelected(true);
                        }
                  });
                  tr[17]= (TableRow) findViewById(R.id.satir18);
                  tr[17].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                              tr[17].setSelected(true);
                        }
                  });
                  tr[18]= (TableRow) findViewById(R.id.satir19);
                  tr[18].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                              tr[18].setSelected(true);
                        }
                  });
                  tr[19]= (TableRow) findViewById(R.id.satir20);
                  tr[19].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                              tr[19].setSelected(true);
                        }
                  });



                  TextView tv;


                  ArrayList<ProductInfo> yemeklist=myXMLHandler.getYemeklist();
                  for(ProductInfo productInfo: yemeklist){ //aslında burası görüntüleme bloğu
                        //burayı ayrı bir method olarak alabilirmiyiz ki?
                        //yeni satır aç satır ı string dizi al
                        //for(int i=0;i<8



                        tv=new TextView(this);
                        tv.setPadding(0, 0, 0, 0);
                        tv.setTextColor(Color.parseColor("#1565C0"));
                        tv.setText(productInfo.getTarih());
                        tr[i].addView(tv);



                        tv = new TextView(this);
                        tv.setPadding(40, 0, 0, 0);
                        tv.setTextColor(Color.parseColor("#C62828"));
                        tv.setText(productInfo.getYemek1());
                        tr[i].addView(tv);

                        tv = new TextView(this);
                        tv.setPadding(40, 0, 0, 0);
                        tv.setTextColor(Color.parseColor("#1565C0"));
                        tv.setText(productInfo.getYemek2());
                        tr[i].addView(tv);

                        tv = new TextView(this);
                        tv.setPadding(40, 0, 0, 0);
                        tv.setTextColor(Color.parseColor("#C62828"));
                        tv.setText(productInfo.getYemek3());
                        tr[i].addView(tv);

                        tv = new TextView(this);
                        tv.setPadding(40, 0, 0, 0);
                        tv.setTextColor(Color.parseColor("#1565C0"));
                        tv.setText(productInfo.getYemek4());
                        tr[i].addView(tv);

                        tv = new TextView(this);
                        tv.setPadding(40, 0, 0, 0);
                        tv.setTextColor(Color.parseColor("#C62828"));
                        tv.setText(productInfo.getYemek5());
                        tr[i].addView(tv);

                        tv = new TextView(this);
                        tv.setPadding(40, 0, 0, 0);
                        tv.setTextColor(Color.parseColor("#1565C0"));
                        tv.setText(productInfo.getYemek6());
                        tr[i].addView(tv);

                        tv = new TextView(this);
                        tv.setPadding(40, 0, 0, 0);
                        tv.setTextColor(Color.parseColor("#C62828"));
                        tv.setText(productInfo.getYemek7());
                        tr[i].addView(tv);
                        i++;
                        //
                   }
                  is.close();
            } catch (Exception e){

                  e.printStackTrace();
            }
      }//parsexml

}
