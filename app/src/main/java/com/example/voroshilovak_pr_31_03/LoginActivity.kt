package com.example.voroshilovak_pr_31_03

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class LoginActivity : AppCompatActivity() {

    lateinit var email:EditText
    lateinit var password: EditText
    lateinit var pref: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        email = findViewById(R.id.input_email)
        password = findViewById(R.id.input_password)


        pref = getPreferences(MODE_PRIVATE)
        email.setText(pref.getString("input_email", ""))
        password.setText(pref.getString("input_password", ""))
    }

    fun Login(view: View) {
        if (email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()) {

            if (email.text.toString() == "ects" && password.text.toString() == "ects2025") {
                pref = getPreferences(MODE_PRIVATE)
                val ed = pref.edit()
                ed.putString("input_email", email.text.toString())
                ed.putString("input_password", password.text.toString())
                ed.apply()

                val intent = Intent(this@LoginActivity, Chats::class.java)
                startActivity(intent)
                finish()
            }
            else{
                val alert = AlertDialog.Builder(this)
                    .setTitle("Ошибка")
                    .setMessage("Неверная почта или пароль")
                    .setPositiveButton("Ok", null)
                    .create()
                    .show()
            }
        }
        else{
            val alert = AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("У вас есть незаполненные поля")
                .setPositiveButton("Ok", null)
                .create()
                .show()
        }
    }
}