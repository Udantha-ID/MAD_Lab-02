package com.example.labtest02.Activities

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.labtest02.R

class DashbordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dashbord)
        val Extraction = findViewById<ConstraintLayout>(R.id.movieCard1)
        val BattleShip = findViewById<ConstraintLayout>(R.id.movieCard2)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Extraction.setOnClickListener{
            // Navigate to the next activity (LoginActivity in this case)
            val intent = Intent(this, FilmActivity::class.java)
            startActivity(intent)
            //finish()  // Optional: to prevent going back to this activity
        }

        BattleShip.setOnClickListener{
            // Navigate to the next activity (LoginActivity in this case)
            val intent = Intent(this, Film2Activity::class.java)
            startActivity(intent)
            //finish()  // Optional: to prevent going back to this activity
        }

    }
}