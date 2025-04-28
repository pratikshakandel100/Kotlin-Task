package com.pratiksha.firstapp



import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var profileIcon: ImageView
    private lateinit var settingsButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // Make sure your XML file is named activity_main.xml

        profileIcon = findViewById(R.id.profileIcon)
        settingsButton = findViewById(R.id.settingsButton)

        profileIcon.setOnClickListener {
            Toast.makeText(this, "Profile clicked", Toast.LENGTH_SHORT).show()
        }

        settingsButton.setOnClickListener {
            Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show()
        }

        // Setting click listeners for each card
        setupCardListeners()
    }

    private fun setupCardListeners() {
        val textCard = findViewById<androidx.gridlayout.widget.GridLayout>(R.id.gridLayout).getChildAt(0)
        val addressCard = findViewById<androidx.gridlayout.widget.GridLayout>(R.id.gridLayout).getChildAt(1)
        val characterCard = findViewById<androidx.gridlayout.widget.GridLayout>(R.id.gridLayout).getChildAt(2)
        val bankCard = findViewById<androidx.gridlayout.widget.GridLayout>(R.id.gridLayout).getChildAt(3)
        val passwordCard = findViewById<androidx.gridlayout.widget.GridLayout>(R.id.gridLayout).getChildAt(4)
        val logisticsCard = findViewById<androidx.gridlayout.widget.GridLayout>(R.id.gridLayout).getChildAt(5)

        textCard.setOnClickListener {
            Toast.makeText(this, "Text Card clicked", Toast.LENGTH_SHORT).show()
        }

        addressCard.setOnClickListener {
            Toast.makeText(this, "Address Card clicked", Toast.LENGTH_SHORT).show()
        }

        characterCard.setOnClickListener {
            Toast.makeText(this, "Character Card clicked", Toast.LENGTH_SHORT).show()
        }

        bankCard.setOnClickListener {
            Toast.makeText(this, "Bank Card clicked", Toast.LENGTH_SHORT).show()
        }

        passwordCard.setOnClickListener {
            Toast.makeText(this, "Password Card clicked", Toast.LENGTH_SHORT).show()
        }

        logisticsCard.setOnClickListener {
            Toast.makeText(this, "Logistics Card clicked", Toast.LENGTH_SHORT).show()
        }
    }
}
