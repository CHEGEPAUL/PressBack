package com.chegegikonyo.pressback

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
         private var doubleBackToExitPressedOnce = false
        override fun onBackPressed(){
            if (doubleBackToExitPressedOnce){
                super.onBackPressed()
                return
            }
            this.doubleBackToExitPressedOnce = true
            Toast.makeText(this,"please click BACK to exit",Toast.LENGTH_SHORT).show()
            Handler().postDelayed(Runnnable{})



    }
}