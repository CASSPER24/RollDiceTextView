package com.ayesigyederrick.practise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    /**
     * This activity allows the user to roll a dice and view the result
     * on the screen.
     */
    class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val roll = findViewById<Button>(R.id.button_roll)
//        val my_number = 1..6
//        roll.setOnClickListener {
//            rand_num.text = my_number.random().toString()
//            Toast.makeText(applicationContext, "Clicked", Toast.LENGTH_SHORT).show()
//        }
        roll.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val rand_num = findViewById<TextView>(R.id.textView)
        rand_num.text = diceRoll.toString()

    }
}

class Dice(val num_sides: Int) {
    fun roll(): Int {
        return (1..num_sides).random()
    }

}
}