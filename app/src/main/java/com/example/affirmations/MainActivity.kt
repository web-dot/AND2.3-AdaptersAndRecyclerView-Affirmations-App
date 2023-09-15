package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // getting TextView reference using resource id
        val textView: TextView = findViewById(R.id.textView)

        /**
         * getting the size of the affirmations list by calling Datasoirce.loadAffirmations(),
         * converting it to a string and assigning it as the `text` of `textView`
         * */
        textView.text = Datasource().loadAffirmations().size.toString()
    }
}