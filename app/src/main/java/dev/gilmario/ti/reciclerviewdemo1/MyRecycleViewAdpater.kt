package dev.gilmario.ti.reciclerviewdemo1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class MyRecycleViewAdpater(private val listFruit : List<String>, private val clicarFruta:(String)->Unit) : RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context);
        val layoutItem = layoutInflater.inflate(R.layout.list_item, parent, false)
        return MyViewHolder(layoutItem);
    }

    override fun getItemCount(): Int {
        return listFruit.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(listFruit.get(position), clicarFruta)
    }

}

class MyViewHolder(val view : View) : RecyclerView.ViewHolder(view) {

    fun bind(fruit : String, clicarFruta: (String) -> Unit) {
        view.name_text_view.text = fruit;
        view.setOnClickListener({
            clicarFruta(fruit)
        })
    }

}

