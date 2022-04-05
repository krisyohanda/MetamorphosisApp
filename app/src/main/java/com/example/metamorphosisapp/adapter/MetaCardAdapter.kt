package com.example.metamorphosisapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.metamorphosisapp.R
import com.example.metamorphosisapp.const.Layout
import com.example.metamorphosisapp.data.DataSource

class MetaCardAdapter(
    private val context: Context?,
    private val layout: Int
): RecyclerView.Adapter<MetaCardAdapter.MetaCardViewHolder>() {

    class MetaCardViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        val imageView: ImageView? = view?.findViewById(R.id.image_view)
        val tvName: TextView? = view?.findViewById(R.id.tv_name)
        val tvDesc: TextView? = view?.findViewById(R.id.tv_desc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MetaCardViewHolder {
        val layoutType = if (layout == Layout.GRID) R.layout.grid_list_item else R.layout.vertical_horizontal_list_item

        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(layoutType, parent, false)


        return MetaCardViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int = DataSource.metas.size

    override fun onBindViewHolder(holder: MetaCardViewHolder, position: Int) {
        val data = DataSource.metas[position]

        holder.imageView!!.setImageResource(data.imageResourceId)

        holder.tvName!!.text = data.name

        val resources = context?.resources

        holder.tvDesc!!.text = resources?.getString(R.string.desc_meta, data.desc)
    }
}