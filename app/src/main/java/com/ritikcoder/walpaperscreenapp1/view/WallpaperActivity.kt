package com.ritikcoder.walpaperscreenapp1.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ritikcoder.walpaperscreenapp1.R
import com.ritikcoder.walpaperscreenapp1.adapter.WallPaperAdapter
import com.ritikcoder.walpaperscreenapp1.model.WallPaperData

class WallpaperActivity : AppCompatActivity() {

    /**Set Adapter**/
    private lateinit var wallPaperAdapter: WallPaperAdapter
    private lateinit var wallImgList: ArrayList<WallPaperData>
    private lateinit var wallPaperRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wallpaper)

        /** get id **/
        wallPaperRecyclerView= findViewById(R.id.recyclerViewForWallpaper)
        wallImgList= ArrayList()
        wallPaperAdapter= WallPaperAdapter(this, wallImgList)
        val layoutManager= GridLayoutManager(applicationContext, 2)
        layoutManager.orientation= LinearLayoutManager.VERTICAL
        wallPaperRecyclerView.layoutManager= layoutManager

        wallPaperRecyclerView.adapter= wallPaperAdapter

        wallPaperList()

    }

    private fun wallPaperList() {
        wallImgList.add(WallPaperData(R.drawable.screen11))
        wallImgList.add(WallPaperData(R.drawable.screen1))
        wallImgList.add(WallPaperData(R.drawable.screen12))
        wallImgList.add(WallPaperData(R.drawable.screen2))
        wallImgList.add(WallPaperData(R.drawable.screen3))
        wallImgList.add(WallPaperData(R.drawable.screen7))
        wallImgList.add(WallPaperData(R.drawable.screen4))
        wallImgList.add(WallPaperData(R.drawable.screen8))
        wallImgList.add(WallPaperData(R.drawable.screen5))
        wallImgList.add(WallPaperData(R.drawable.screen9))
        wallImgList.add(WallPaperData(R.drawable.screen6))
        wallImgList.add(WallPaperData(R.drawable.screen10))
        wallImgList.add(WallPaperData(R.drawable.wallpaper1))
        wallImgList.add(WallPaperData(R.drawable.wallpaper2))
        wallImgList.add(WallPaperData(R.drawable.wallpaper3))
        wallImgList.add(WallPaperData(R.drawable.wallpaper4))
        wallImgList.add(WallPaperData(R.drawable.wallpaper5))
        wallImgList.add(WallPaperData(R.drawable.wallpaper6))
        wallImgList.add(WallPaperData(R.drawable.wallpaper7))
        wallImgList.add(WallPaperData(R.drawable.wallpaper8))
        wallImgList.add(WallPaperData(R.drawable.wallpaper9))
        wallImgList.add(WallPaperData(R.drawable.wallpaper10))
        wallImgList.add(WallPaperData(R.drawable.wallpaper11))
        wallImgList.add(WallPaperData(R.drawable.wallpaper12))
        wallImgList.add(WallPaperData(R.drawable.wallpaper13))
        wallImgList.add(WallPaperData(R.drawable.wallpaper14))
        wallImgList.add(WallPaperData(R.drawable.wallpaper15))
        wallImgList.add(WallPaperData(R.drawable.wallpaper16))
        wallImgList.add(WallPaperData(R.drawable.wallpaper17))
        wallImgList.add(WallPaperData(R.drawable.wallpaper18))
        wallImgList.add(WallPaperData(R.drawable.wallpaper19))
        wallImgList.add(WallPaperData(R.drawable.wallpaper20))
        wallImgList.add(WallPaperData(R.drawable.wallpaper21))
        wallImgList.add(WallPaperData(R.drawable.wallpaper22))
        wallImgList.add(WallPaperData(R.drawable.wallpaper23))
        wallImgList.add(WallPaperData(R.drawable.wallpaper24))
        wallImgList.add(WallPaperData(R.drawable.wallpaper25))
        wallImgList.add(WallPaperData(R.drawable.wallpaper26))
        wallImgList.add(WallPaperData(R.drawable.wallpaper27))
        wallImgList.add(WallPaperData(R.drawable.wallpaper28))
        wallImgList.add(WallPaperData(R.drawable.wallpaper29))
        wallImgList.add(WallPaperData(R.drawable.wallpaper29))
        wallImgList.add(WallPaperData(R.drawable.wallpaper29))
        wallImgList.add(WallPaperData(R.drawable.wallpaper30))
        wallImgList.add(WallPaperData(R.drawable.wallpaper31))
        wallImgList.add(WallPaperData(R.drawable.wallpaper32))
        wallImgList.add(WallPaperData(R.drawable.wallpaper33))
        wallImgList.add(WallPaperData(R.drawable.wallpaper34))
        wallImgList.add(WallPaperData(R.drawable.wallpaper35))
        wallImgList.add(WallPaperData(R.drawable.wallpaper36))
        wallImgList.add(WallPaperData(R.drawable.wallpaper37))
        wallImgList.add(WallPaperData(R.drawable.wallpaper38))
        wallImgList.add(WallPaperData(R.drawable.wallpaper39))
        wallImgList.add(WallPaperData(R.drawable.wallpaper40))
        wallImgList.add(WallPaperData(R.drawable.wallpaper41))
        wallImgList.add(WallPaperData(R.drawable.wallpaper42))
        wallImgList.add(WallPaperData(R.drawable.wallpaper43))
        wallImgList.add(WallPaperData(R.drawable.wallpaper44))
        wallImgList.add(WallPaperData(R.drawable.wallpaper45))
        wallImgList.add(WallPaperData(R.drawable.wallpaper46))
        wallImgList.add(WallPaperData(R.drawable.wallpaper47))
        wallImgList.add(WallPaperData(R.drawable.wallpaper48))
        wallImgList.add(WallPaperData(R.drawable.wallpaper49))
        wallImgList.add(WallPaperData(R.drawable.wallpaper50))
        wallImgList.add(WallPaperData(R.drawable.wallpaper51))
        wallImgList.add(WallPaperData(R.drawable.wallpaper52))
        wallImgList.add(WallPaperData(R.drawable.wallpaper53))
        wallImgList.add(WallPaperData(R.drawable.wallpaper54))
        wallImgList.add(WallPaperData(R.drawable.wallpaper55))
        wallImgList.add(WallPaperData(R.drawable.wallpaper56))
        wallImgList.add(WallPaperData(R.drawable.wallpaper57))
        wallImgList.add(WallPaperData(R.drawable.wallpaper58))
        wallImgList.add(WallPaperData(R.drawable.wallpaper59))
        wallImgList.add(WallPaperData(R.drawable.wallpaper60))
        wallImgList.add(WallPaperData(R.drawable.wallpaper61))
        wallImgList.add(WallPaperData(R.drawable.wallpaper62))
        wallImgList.add(WallPaperData(R.drawable.wallpaper63))
        wallImgList.add(WallPaperData(R.drawable.wallpaper64))
        wallImgList.add(WallPaperData(R.drawable.wallpaper65))
        wallImgList.add(WallPaperData(R.drawable.wallpaper66))
        wallImgList.add(WallPaperData(R.drawable.wallpaper67))
        wallImgList.add(WallPaperData(R.drawable.wallpaper68))
        wallImgList.add(WallPaperData(R.drawable.wallpaper69))
        wallImgList.add(WallPaperData(R.drawable.wallpaper70))
        wallImgList.add(WallPaperData(R.drawable.wallpaper71))
        wallImgList.add(WallPaperData(R.drawable.wallpaper72))
        wallImgList.add(WallPaperData(R.drawable.wallpaper73))
        wallImgList.add(WallPaperData(R.drawable.wallpaper74))
        wallImgList.add(WallPaperData(R.drawable.wallpaper75))
        wallImgList.add(WallPaperData(R.drawable.wallpaper76))
        wallImgList.add(WallPaperData(R.drawable.wallpaper77))
        wallImgList.add(WallPaperData(R.drawable.wallpaper78))
        wallImgList.add(WallPaperData(R.drawable.wallpaper79))
        wallImgList.add(WallPaperData(R.drawable.wallpaper80))
        wallImgList.add(WallPaperData(R.drawable.wallpaper81))
        wallImgList.add(WallPaperData(R.drawable.wallpaper82))
        wallImgList.add(WallPaperData(R.drawable.wallpaper83))
        wallImgList.add(WallPaperData(R.drawable.wallpaper84))
        wallImgList.add(WallPaperData(R.drawable.wallpaper85))
        wallImgList.add(WallPaperData(R.drawable.wallpaper86))
        wallImgList.add(WallPaperData(R.drawable.wallpaper87))
        wallImgList.add(WallPaperData(R.drawable.wallpaper88))
        wallImgList.add(WallPaperData(R.drawable.wallpaper89))
        wallImgList.add(WallPaperData(R.drawable.wallpaper90))
        wallImgList.add(WallPaperData(R.drawable.wallpaper91))
    }
}