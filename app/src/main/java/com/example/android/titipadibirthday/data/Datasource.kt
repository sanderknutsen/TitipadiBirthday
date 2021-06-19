package com.example.android.titipadibirthday.data

import com.example.android.titipadibirthday.R
import com.example.android.titipadibirthday.model.Enhet

class Datasource {
    fun loadEnhet(): List<Enhet> {
        return listOf<Enhet>(
            Enhet(R.string.text1),
            Enhet(R.string.text2),
            Enhet(R.string.text3),
            Enhet(R.string.text4),
            Enhet(R.string.text5),
            Enhet(R.string.text6),
            Enhet(R.string.text7)
        )
    }
}