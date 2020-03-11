package com.example.tugasintentmakananjatim

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail_makanan.*

class DetailMakananActvity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_makanan)

        var intentThatStaredThisActivity = getIntent()

        if (intentThatStaredThisActivity.hasExtra(Intent.EXTRA_TEXT)){
            var part_id = intentThatStaredThisActivity.getStringExtra(Intent.EXTRA_TEXT)
            id_makanan.text = part_id
            var part2= intentThatStaredThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            id_deskrip.text = part2
        }
    }
}