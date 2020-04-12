package com.example.mathhelper

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView


class BdAdapter : RecyclerView.Adapter<BdAdapter.MH> () {

    var number : Int? = 0
    var equation : String? = ""

    fun BdAdapter (num : Int)
    {
        number = num
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MH {
        val context = parent.context
        val id = R.layout.list
        val inflater = LayoutInflater.from(context) //создание нового представления

        val view = inflater.inflate(id, parent, false)
        return MH(view)
    }

    override fun onBindViewHolder(holder: MH, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return number!!
    }

    class MH(itemView: View) : RecyclerView.ViewHolder (itemView) {

        var equation: EditText? = null


        fun MH(itemView: View) {
           // super(itemView)
            equation = itemView.findViewById<EditText>(R.id.equation)
        }


        fun bind(i: Int) {
            //element.setText (String.valueOf ( i )  );
//            name.setText ( person.getName () );
        }
    }
}