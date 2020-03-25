package dev.gilmario.ti.reciclerviewdemo1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val listFruits = listOf("Mango","Apple","Banana","Lemon","Pear", "Orange")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        my_recycler_view.setBackgroundColor(Color.BLUE)

        //setar o Layout da RecyclerView
        my_recycler_view.layoutManager = LinearLayoutManager(this)

        //Depois de setar o Layout, nós precisamos de um adptador para layout e enviar a lista para esse adpatador
        my_recycler_view.adapter = MyRecycleViewAdpater(listFruits, {selectedFruititem:String->listItemClick(selectedFruititem)})


    }

    private fun listItemClick(fruit : String) {
        Toast.makeText(this, "item clicado"+fruit, Toast.LENGTH_LONG);
    }



}
