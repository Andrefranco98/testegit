package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

const val PARAM1_NAME ="nome"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, R.string.welcome, Toast.LENGTH_SHORT).show()

    }

    fun button1(view: View) {
        var edit1: EditText = findViewById<EditText>(R.id.editTextTextPersonName)
        Toast.makeText(this, edit1.text, Toast.LENGTH_SHORT).show()
        findViewById<TextView>(R.id.txt1).setText(edit1.text)
    }

    fun button2(view: View) {
        var edit1: EditText = findViewById<EditText>(R.id.editTextTextPersonName)
        val intent = Intent(this, MainActivity2::class.java).apply {
            putExtra(PARAM1_NAME, edit1.text.toString())
        }
        startActivity(intent)
    }

    fun onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    fun onOptionsItemSelected(item:MenuItem ) {
        switch(item.getItemId()) {
            case R . id . bookmark_menu :
            Toast.makeText(this, "You have selected Bookmark Menu", Toast.LENGTH_SHORT).show();
            return true;
            case R . id . save_menu :
            Toast.makeText(this, "You have selected Save Menu", Toast.LENGTH_SHORT).show();
            return true;
            case R . id . search_menu :
            Toast.makeText(this, "You have selected Search Menu", Toast.LENGTH_SHORT).show();
            return true;
            case R . id . share_menu :
            Toast.makeText(this, "You have selected Share Menu", Toast.LENGTH_SHORT).show();
            return true;
            case R . id . delete_menu :
            Toast.makeText(this, "You have selected Delete Menu", Toast.LENGTH_SHORT).show();
            return true;
            case R . id . print_menu :
            Toast.makeText(this, "You have selected Print menu", Toast.LENGTH_SHORT).show();
            return true;
            default: super.onOptionsItemSelected

        }

    }
}
