package com.example.voroshilovak_pr_31_03

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Contacts : AppCompatActivity() {

    lateinit var image: ImageView
    lateinit var name: TextView
    lateinit var age: TextView
    lateinit var info: TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        val arguments = intent.extras
        val id = arguments!!.getInt("id")

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_contacts)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        image = findViewById(R.id.id_img)
        name = findViewById(R.id.id_name)
        age = findViewById(R.id.id_age)
        info = findViewById(R.id.id_info)


        when (id) {
            1 -> {
                image.setImageResource(R.drawable.man1)
                name.setText(R.string.john)
                age.setText("21")
                info.setText(R.string.thx)
            }
            2 -> {
                image.setImageResource(R.drawable.man2)
                name.setText(R.string.james)
                age.setText("29")
                info.setText(R.string.waiting)
            }
            3 -> {
                image.setImageResource(R.drawable.man3)
                name.setText(R.string.ron)
                age.setText("33")
                info.setText(R.string.thx)
            }
            4 -> {
                image.setImageResource(R.drawable.man4)
                name.setText(R.string.joy)
                age.setText("30")
                info.setText(R.string.thx)
            }
            5 -> {
                image.setImageResource(R.drawable.man5)
                name.setText(R.string.joy)
                age.setText("32")
                info.setText(R.string.thx)
            }
        }


    }
    fun Back(view: View) {
        val intent = Intent(this@Contacts, Chats::class.java)
        startActivity(intent)
        finish()
    }
}