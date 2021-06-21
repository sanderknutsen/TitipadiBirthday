package com.example.android.titipadibirthday

import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
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

        val linkButton: Button = findViewById(R.id.link_button)
        linkButton.setOnClickListener {
            val intent = Intent(ACTION_VIEW, Uri.parse("https://florogfjare.no/"))
            startActivity(intent)
        }
    }
}