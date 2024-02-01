package com.test.topappbarandlightdarktheme

import android.health.connect.datatypes.units.Length
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {

    lateinit var toolbar:MaterialToolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolbar)
        toolbar.overflowIcon = AppCompatResources.getDrawable(this,R.drawable.baseline_more_vert_24)
        toolbar.setNavigationOnClickListener {
            Toast.makeText(applicationContext,"Navigation Icon is clicked",Toast.LENGTH_SHORT).show()
        }
        toolbar.setOnMenuItemClickListener{ item->
            when(item.itemId){
                R.id.settings -> Toast.makeText(applicationContext,"Setting clicked",Toast.LENGTH_SHORT).show()
                R.id.share -> Toast.makeText(applicationContext,"Share clicked",Toast.LENGTH_SHORT).show()
                R.id.edit -> Toast.makeText(applicationContext,"edit clicked",Toast.LENGTH_SHORT).show()
                R.id.signOut -> Toast.makeText(applicationContext,"Sign out clicked",Toast.LENGTH_SHORT).show()
            }
            return@setOnMenuItemClickListener true
        }
    }
}