package com.example.androidexperiments

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.androidexperiments.databinding.ActivitySecondBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var diceImage: ImageView
    private lateinit var binding: ActivitySecondBinding

    private val myName: MyName = MyName("Aleks Haecky")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_second)
        binding.myName = myName

//        val rollButton = findViewById<Button>(R.id.btn_roll)
//        diceImage = findViewById(R.id.dice_image)
        binding.doneButton.setOnClickListener {
            addNickName(it)
        }

        binding.nicknameText.setOnClickListener {
            updateNickname(it)
        }

        //rollButton.setOnClickListener {
        //    rollDice()
        //}
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
    }

    private fun addNickName(view: View) {

        val editText = binding.nicknameEdit
        val nickNameTextView = binding.nicknameText

        nickNameTextView.text = editText.text
        editText.visibility = View.GONE

        view.visibility = View.GONE
        val inputMethodManager =
            getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun updateNickname(view: View) {

        binding.apply {
            myName?.nickName = nicknameEdit.text.toString()
            nicknameEdit.visibility = View.GONE
            doneButton.visibility = View.GONE
            nicknameText.visibility = View.VISIBLE

            invalidateAll()
        }

        // Set the focus to the edit text
        binding.nicknameEdit.requestFocus()

        //show the keyboard
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(binding.nicknameEdit, 0)
    }

}
