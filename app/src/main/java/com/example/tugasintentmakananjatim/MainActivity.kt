package com.example.tugasintentmakananjatim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val testMakanan = createListMakanan()
        rv_makanan.layoutManager = LinearLayoutManager(this )
        rv_makanan.setHasFixedSize(true)
        rv_makanan.adapter = MakananAdapter(testMakanan,{itemMakanan : DataMakanan -> itemMakananCliked(itemMakanan)})
    }

    private fun itemMakananCliked(itemMakanan : DataMakanan) {
        val showDetailActivityIntent= Intent(this, DetailMakananActvity:: class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, itemMakanan.makanan)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, itemMakanan.deskrip)
        startActivity(showDetailActivityIntent)
    }
    private fun createListMakanan(): List<DataMakanan> {
        val partList = ArrayList<DataMakanan>()
        partList.add(DataMakanan("Rujak Soto", "Banyuwangi", R.drawable.makan2,
            "Rujak soto merupakan Makanan khas Banyuwangi, seperti namanya makanan ini merupakan campuran dari rujak petis yang disiram dengan kuah soto tak lupa ditambahkan isian soto itu sendiri" ))
       partList.add(DataMakanan("Rujak Cingur", "Surabaya", R.drawable.rujakci,
            "Rujak Cingur merupakan makanan khas Kots Surabaya. adapun komponen rujak cingur yaitu memakai petis san kacang tanah. isian rujak cingur sendiri buah-buahan, sayuran, dan tidak lupa Cingur sapi " ))
       partList.add(DataMakanan("Bonggolan", "Gresik", R.drawable.b,
       "Bonggolan merupakan makanan khas Gresik. komponen Bonggolan yaitu adonan tepung yang dicampurkan dengan ikan. hasil akhir dari Bonggolan yaitu berbentuk seperti cireng ikan" ))
       partList.add(DataMakanan("Nasi Tempong", "Banyuwangi", R.drawable.sego,
          "Nasi Tempong merupakan Makanan khas Banyuwangi, sama halnya dengan nasi yang lainnya tetapi sambal dari nasi tempong ini sungguh luar biasa pedas" ))
        partList.add(DataMakanan("Semanggi", "Banyuwangi", R.drawable.semanggi,
          "Semanggi merupakan Makanan khas Surabaya, semanggi ini berupa kerupuk kuning yang atasnya terdapat macam macam sayuran seperti kecambah, daun ketela, bunga Semanggi lalu disiram dengan bumbu kacang" ))
        return partList
    }

}
