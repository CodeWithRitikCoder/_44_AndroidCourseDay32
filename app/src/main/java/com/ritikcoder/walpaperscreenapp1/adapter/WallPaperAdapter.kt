package com.ritikcoder.walpaperscreenapp1.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.ritikcoder.walpaperscreenapp1.MainActivity
import com.ritikcoder.walpaperscreenapp1.R
import com.ritikcoder.walpaperscreenapp1.model.WallPaperData

class WallPaperAdapter (var c: Context, var wallImageList: ArrayList<WallPaperData>)
    :RecyclerView.Adapter<WallPaperAdapter.WallPaperViewHolder>(){

    inner class WallPaperViewHolder(val v: View): RecyclerView.ViewHolder(v){
        val wallPaperImg: ImageView= v.findViewById(R.id.imageViewForWallpaper)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WallPaperViewHolder {
        val inflate= LayoutInflater.from(parent.context)
        val v= inflate.inflate(R.layout.wallpaper_item, parent, false)
        return WallPaperViewHolder(v)
    }

    override fun getItemCount(): Int = wallImageList.size

    override fun onBindViewHolder(holder: WallPaperViewHolder, position: Int) {
        val newListWall= wallImageList[position]
        holder.wallPaperImg.setImageResource(newListWall.wallImg)
        holder.wallPaperImg.setOnClickListener {
            val wallInt= Intent(c, MainActivity::class.java)
            wallInt.putExtra("wallImg", newListWall.wallImg)
            c.startActivity(wallInt)
        }
    }

}