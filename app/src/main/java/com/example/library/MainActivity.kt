package com.example.library

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var flag="";
        val spVal :Spinner = findViewById(R.id.type1);
        val bt:Button = findViewById(R.id.btn);
        var tv :TextView = findViewById(R.id.name);

        var options = arrayOf("book type","Crime","Horror","Fairy tales", "War","Romantic");


        spVal.adapter =
            ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options);
        spVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = options.get(p2);
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }



        }
        bt.setOnClickListener{
            val x: Int =30;
            val y: Int =17;
            val z: Int =12;
            val d: Int =16;
            val k: Int =13;

            if(flag=="Crime"){
                tv.text= x.toString();

            }else if(flag=="Horror"){
                tv.text= y.toString();


            }else if(flag=="Fairy tales"){
                tv.text= z.toString();

            }else if (flag=="War"){
                tv.text= d.toString();

            }else if(flag=="Romantic"){
                tv.text= k.toString();

            }else if (flag=="book type"){
                tv.text ="please select" ;
            }
        }
    }

    }
