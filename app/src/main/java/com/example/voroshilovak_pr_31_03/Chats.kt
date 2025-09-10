package com.example.voroshilovak_pr_31_03

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Chats : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_chats)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun Back(view: View) {
        val intent = Intent(this@Chats, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }

    lateinit var man1: ConstraintLayout
    lateinit var man2: ConstraintLayout
    lateinit var man3: ConstraintLayout
    lateinit var man4: ConstraintLayout
    lateinit var man5: ConstraintLayout

    fun MoreInfo(view: View) {

        val selectedId = view.id.toString()
        man1 = findViewById(R.id.man1)
        man2 = findViewById(R.id.man2)
        man3 = findViewById(R.id.man3)
        man4 = findViewById(R.id.man4)
        man5 = findViewById(R.id.man5)


        when (selectedId) {
            man1.id.toString() -> {
                val intent = Intent(this@Chats, Contacts::class.java)
                intent.putExtra("id", 1)
                startActivity(intent)
                finish()
            }
            man2.id.toString() -> {
                val intent = Intent(this@Chats, Contacts::class.java)
                intent.putExtra("id", 2)
                startActivity(intent)
                finish()
            }
            man3.id.toString() -> {
                val intent = Intent(this@Chats, Contacts::class.java)
                intent.putExtra("id", 3)
                startActivity(intent)
                finish()
            }
            man4.id.toString() -> {
                val intent = Intent(this@Chats, Contacts::class.java)
                intent.putExtra("id", 4)
                startActivity(intent)
                finish()
            }
            man5.id.toString() -> {
                val intent = Intent(this@Chats, Contacts::class.java)
                intent.putExtra("id", 5)
                startActivity(intent)
                finish()
            }
        }
    }
}