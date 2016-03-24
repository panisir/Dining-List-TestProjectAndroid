package com.example.user.projekardemir;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class OrderXMLHandler extends DefaultHandler {
      boolean currentElement=false;
      String CurrentValue="";

      String List_id;
      ProductInfo productInfo;
      ArrayList<ProductInfo> yemeklist;


      public String getList_id(){return List_id;}

      public ArrayList<ProductInfo>getYemeklist(){
            return yemeklist;
      }
      public void startElement(String uri, String localName, String qName,
                               Attributes attributes) throws SAXException{
            currentElement=true;
            if(qName.equals("yemekler")){
                  yemeklist=new ArrayList<ProductInfo>();
            }
            else if(qName.equals("yemek")){
                  productInfo=new ProductInfo();
            }
      }
      public void endElement (String uri,String localName,String qName)
                throws SAXException{
            currentElement=false;
            if (qName.equalsIgnoreCase("OrderId"))
                  List_id=CurrentValue.trim();
                     //gün seçimi buradada
            if(qName.equalsIgnoreCase("tarih"))       //yapılabilir
                  productInfo.setTarih(CurrentValue.trim());
            else if(qName.equalsIgnoreCase("Yemek1"))
                  productInfo.setYemek1(CurrentValue.trim());
            else if(qName.equalsIgnoreCase("yemek2"))
                  productInfo.setYemek2(CurrentValue.trim());
            else if(qName.equalsIgnoreCase("yemek3"))
                  productInfo.setYemek3(CurrentValue.trim());
            else if(qName.equalsIgnoreCase("yemek4"))
                  productInfo.setYemek4(CurrentValue.trim());
            else if(qName.equalsIgnoreCase("yemek5"))
                  productInfo.setYemek5(CurrentValue.trim());
            else if(qName.equalsIgnoreCase("yemek6"))
                  productInfo.setYemek6(CurrentValue.trim());
            else if(qName.equalsIgnoreCase("yemek7"))
                  productInfo.setYemek7(CurrentValue.trim());
            else if(qName.equalsIgnoreCase("yemek"))
                  yemeklist.add(productInfo);

            CurrentValue="";
      }
      public void characters(char[] ch, int start, int length)
                throws SAXException {

            if (currentElement) {
                  CurrentValue = CurrentValue + new String(ch, start, length);
            }

      }

}