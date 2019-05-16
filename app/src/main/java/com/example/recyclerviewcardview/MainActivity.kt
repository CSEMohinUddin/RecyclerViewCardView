package com.example.recyclerviewcardview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutCompat
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Reycler=findViewById<RecyclerView>(R.id.rvMusicList)
        Reycler.layoutManager=LinearLayoutManager(this,LinearLayout.VERTICAL,false)
        val MusicList=ArrayList<DataSetItemView>()
        MusicList.add(DataSetItemView(R.drawable.a,"Linking Park","In the end"))
        MusicList.add(DataSetItemView(R.drawable.b,"Linking Park","The sun rise"))
        MusicList.add(DataSetItemView(R.drawable.c,"Linking Park","Dark wave"))
        MusicList.add(DataSetItemView(R.drawable.d,"Linking Park","Time to End"))
        MusicList.add(DataSetItemView(R.drawable.happyrock,"Linking Park","Life is game"))
        MusicList.add(DataSetItemView(R.drawable.a,"Linking Park","In the end"))
        MusicList.add(DataSetItemView(R.drawable.b,"Linking Park","The sun rise"))
        MusicList.add(DataSetItemView(R.drawable.c,"Linking Park","Dark wave"))
        MusicList.add(DataSetItemView(R.drawable.d,"Linking Park","Time to End"))
        MusicList.add(DataSetItemView(R.drawable.happyrock,"Linking Park","Life is game"))
        MusicList.add(DataSetItemView(R.drawable.a,"Linking Park","In the end"))
        MusicList.add(DataSetItemView(R.drawable.b,"Linking Park","The sun rise"))
        MusicList.add(DataSetItemView(R.drawable.c,"Linking Park","Dark wave"))
        MusicList.add(DataSetItemView(R.drawable.d,"Linking Park","Time to End"))
        MusicList.add(DataSetItemView(R.drawable.happyrock,"Linking Park","Life is game"))
        val adapter=RecycleAdpter(MusicList)
        Reycler.adapter=adapter

    }
}
