package com.example.layouttest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listCharacters.setOnItemClickListener { list, item,index, id ->
            if (index == 0) {
                Toast.makeText(this, "1", Toast.LENGTH_SHORT).show()
                imageView.setImageResource(R.drawable.spongebob)
            }
            else if (index == 1) {
                Toast.makeText(this, "2", Toast.LENGTH_SHORT).show()
                imageView.setImageResource(R.drawable.sandy)
            }
            else if (index == 2) {
                Toast.makeText(this, "3", Toast.LENGTH_SHORT).show()
                imageView.setImageResource(R.drawable.patrick)
            }
            else if (index == 3) {
                Toast.makeText(this, "4", Toast.LENGTH_SHORT).show()
                imageView.setImageResource(R.drawable.squedword)
            }
        }
    }
    fun radioButtonClick(view: View) {
        //same as view.id == R.id.rb1

        if (view == rbSponge) {
            Toast.makeText(this, "1", Toast.LENGTH_SHORT).show()
            imageView.setImageResource(R.drawable.spongebob)
        }
        else if (view == rbSandy) {
            Toast.makeText(this, "2", Toast.LENGTH_SHORT).show()
            imageView.setImageResource(R.drawable.sandy)
        }
        else if (view == rbPatrick) {
            Toast.makeText(this, "3", Toast.LENGTH_SHORT).show()
            imageView.setImageResource(R.drawable.patrick)
        }
        else if (view == rbSquid) {
            Toast.makeText(this, "4", Toast.LENGTH_SHORT).show()
            imageView.setImageResource(R.drawable.squedword)
        }
    }
}
