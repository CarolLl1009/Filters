package com.example.filters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.filters.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mbinding : ActivityMainBinding

    private val numbersList = listOf("one", "five",
            "two", "three", "four")
    private val instanceList = listOf(null, 1, "two",
            3.0, "four")
    private val numbersMap = mapOf("key1" to 1,
            "key2" to 2, "key3" to 3, "key11" to 11)
    private val unsortedList = listOf(7, 8, 5, 3, 2, 4)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mbinding.root)
        mbinding.btPar.setOnClickListener {
            val par = unsortedList.filter{it % 2 == 0}
            mbinding.tvFilter.setText(par.toString())

        }
        mbinding.btLength.setOnClickListener {
            val largo = numbersList.filter { it.length > 3 }
            mbinding.tvFilter.setText(largo.toString())
        }
        mbinding.btNoNull.setOnClickListener {
            val notNull = instanceList.filterNotNull()
            mbinding.tvFilter.setText(notNull.toString())
        }

    }


}