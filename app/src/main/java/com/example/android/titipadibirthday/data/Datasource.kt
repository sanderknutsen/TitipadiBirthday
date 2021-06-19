package com.example.android.titipadibirthday.data

import com.example.android.titipadibirthday.R
import com.example.android.titipadibirthday.model.Enhet

class Datasource {
    fun loadEnhet(): List<Enhet> {
        return listOf<Enhet>(
            Enhet(R.string.text1, R.drawable.image1),
            Enhet(R.string.text2, R.drawable.image2),
            Enhet(R.string.text3, R.drawable.image3),
            Enhet(R.string.text4, R.drawable.image4),
            Enhet(R.string.text5, R.drawable.image5),
            Enhet(R.string.text6, R.drawable.image6),
            Enhet(R.string.text7, R.drawable.image7)
        )
    }
}