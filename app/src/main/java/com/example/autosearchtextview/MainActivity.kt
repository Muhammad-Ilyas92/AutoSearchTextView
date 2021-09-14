package com.example.autosearchtextview

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.reflect.Array

class MainActivity : AppCompatActivity() {

/*    val suggestion = arrayOf<String>(   //YAHAN HM N ARRAY bnaya
        "Pakistan",
        "India",
        "Bangladesh",
        "South Africa",
        "New Zeland",
        "Japan",
        "China",
        "America",
    )*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //adpter hamare data ko hold krta hai. r hamari UI Component m display krega.
       // aik bridge ki trhan kam krta hai

        //EXAMPLE 1
     /*   var list: Array<out String> = resources.getStringArray(R.array.country)
        var adapter = ArrayAdapter<String> (this,android.R.layout.simple_expandable_list_item_1,list)
        search.setAdapter(adapter)
        search.threshold = 1*/

        //EXAMPLE 2
        //The another way how to do
        var list: kotlin.Array<String> = arrayOf("India", "Ireland","Afghanistan", "Pakistan", "Iraq", "Iran", "Poland", "America" , "USA", "UK", "Azerbaijan", "SouthAfrica", "Germany","Italy")
        var arradapter = ArrayAdapter<String> (this@MainActivity,android.R.layout.simple_expandable_list_item_1,list)
        search.setAdapter( arradapter)
        search.threshold = 1
    }
}