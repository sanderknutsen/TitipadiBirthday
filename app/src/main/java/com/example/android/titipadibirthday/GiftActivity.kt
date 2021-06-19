package com.example.android.titipadibirthday

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.android.titipadibirthday.adapter.ItemAdapter
import com.example.android.titipadibirthday.data.Datasource

class GiftActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gift)

        val myDataset = Datasource().loadEnhet()
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)

        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
    }
}