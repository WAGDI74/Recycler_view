package com.example.resycler_view


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class Recycler_adapter() :RecyclerView.Adapter<Recycler_adapter.ViewHolder>() {

    private var titles = arrayOf("Meal One","Meal Two","Meal Three","Meal Four","Meal Five","Meal Six","Meal Seven","Meal Eight")

    private var details = arrayOf("Item One Details","Item Two Details","Item Three Details","Item Four Details","Item Five Details","Item Six Details","Item Seven Details","Item Eight Details")

    private var images = intArrayOf(R.drawable.food,)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout , parent , false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemdetail.text = details[position]
        holder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    inner class ViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){
        var itemImage : ImageView
        var itemTitle : TextView
        var itemdetail : TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemdetail = itemView.findViewById(R.id.item_details)

            itemView.setOnClickListener {
                val  position:Int = adapterPosition

                Toast.makeText(itemView.context,"you clicked on ${titles[position]}",Toast.LENGTH_LONG).show()
            }
        }
    }


}