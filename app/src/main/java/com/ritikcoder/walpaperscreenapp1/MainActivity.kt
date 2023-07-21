package com.ritikcoder.walpaperscreenapp1

import android.annotation.SuppressLint
import android.app.Dialog
import android.app.WallpaperManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    /** set button & images **/
    var bSetWallPaper: Button?= null
    private lateinit var wallImg : ImageView

    //Create a variable of type Dialog.
    lateinit var dialog: Dialog

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initialization of dialog variable.
        dialog= Dialog(this)
        dialog.setContentView(R.layout.message_dialog_box)
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.message_box_bg))
        val okayButton= dialog.findViewById<Button>(R.id.buttonForOkay)

        wallImg= findViewById(R.id.imageViewForWallpaperMainActivity)
        val wallInt= intent.extras
        val newWallImg= wallInt!!.getInt("wallImg")
        wallImg.setImageResource(newWallImg)

        /** creating the instance of the wallpaper **/
        val wallPaperManager= WallpaperManager.getInstance(applicationContext)

        bSetWallPaper= findViewById(R.id.buttonForSetWallpaper)
        bSetWallPaper!!.setOnClickListener {
            try {
                wallPaperManager.setResource(newWallImg)

                //Showing the alert dialog box.
                dialog.show()

            }catch (e: Exception){
                e.printStackTrace()
            }
        }

        okayButton.setOnClickListener {
            dialog.dismiss()
            finish()
        }

    }
}