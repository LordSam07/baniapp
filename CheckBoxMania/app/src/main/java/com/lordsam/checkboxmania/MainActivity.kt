package com.lordsam.checkboxmania

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    val lisOfItems = ArrayList<Item>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val potatoBox = findViewById<CheckBox>(R.id.checkBoxPotato)
        val onionBox = findViewById<CheckBox>(R.id.checkBoxOnion)
        val tomatoBox = findViewById<CheckBox>(R.id.checkBoxTomato)
        val appleBox = findViewById<CheckBox>(R.id.checkBoxApple)
        val orangeBox = findViewById<CheckBox>(R.id.checkBoxOrange)
        val riceBox = findViewById<CheckBox>(R.id.checkBoxRice)
        val grainBox = findViewById<CheckBox>(R.id.checkBoxGrain)
        val oilBox = findViewById<CheckBox>(R.id.checkBoxOil)
        val sugarBox = findViewById<CheckBox>(R.id.checkBoxSugar)
        val gst6Box = findViewById<CheckBox>(R.id.checkBoxGST6)
        val gst18Box = findViewById<CheckBox>(R.id.checkBoxGST18)
        val btnProceed = findViewById<Button>(R.id.buttonProceed)

        potatoBox.setOnClickListener(this)
        onionBox.setOnClickListener(this)
        tomatoBox.setOnClickListener(this)
        appleBox.setOnClickListener(this)
        orangeBox.setOnClickListener(this)
        riceBox.setOnClickListener(this)
        grainBox.setOnClickListener(this)
        oilBox.setOnClickListener(this)
        sugarBox.setOnClickListener(this)
        gst6Box.setOnClickListener(this)
        gst18Box.setOnClickListener(this)
        btnProceed.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {

        when(p0!!.id){
            R.id.checkBoxPotato -> {
                if (checkBoxPotato.isChecked) {
                    editTextTextPotatoSize.setText("1")
                }else{
                    editTextTextPotatoSize.setText("")
                }
            }
            R.id.checkBoxOnion -> {
                if (checkBoxOnion.isChecked) {
                    editTextTextOnionSize.setText("1")
                }else{
                    editTextTextOnionSize.setText("")
                }
            }
            R.id.checkBoxTomato -> {
                if (checkBoxTomato.isChecked) {
                    editTextTextTomatoSize.setText("1")
                }else{
                    editTextTextTomatoSize.setText("")
                }
            }
            R.id.checkBoxApple -> {
                if (checkBoxApple.isChecked) {
                    editTextTextAppleSize.setText("1")
                }else{
                    editTextTextAppleSize.setText("")
                }
            }
            R.id.checkBoxOrange -> {
                if (checkBoxOrange.isChecked) {
                    editTextTextOrangeSize.setText("1")
                }else{
                    editTextTextOrangeSize.setText("")
                }
            }
            R.id.checkBoxRice -> {
                if (checkBoxRice.isChecked) {
                    editTextTextRiceSize.setText("1")
                }else{
                    editTextTextRiceSize.setText("")
                }
            }
            R.id.checkBoxGrain -> {
                editTextTextGrainSize.setText("1")
                if (checkBoxGrain.isChecked) {
                    editTextTextGrainSize.setText("1")
                }else{
                    editTextTextGrainSize.setText("")
                }
            }
            R.id.checkBoxOil -> {
                if (checkBoxOil.isChecked) {
                    editTextTextOilSize.setText("1")
                }else{
                    editTextTextOilSize.setText("")
                }
            }
            R.id.checkBoxSugar -> {
                if (checkBoxSugar.isChecked) {
                    editTextTextSugarSize.setText("1")
                }else{
                    editTextTextSugarSize.setText("")
                }
            }
            R.id.checkBoxGST6 ->{
                if (checkBoxGST6.isChecked)
                    checkBoxGST18.isChecked = false
            }
            R.id.checkBoxGST18 ->{
                if (checkBoxGST18.isChecked){
                    checkBoxGST6.isChecked = false
                }
            }
            R.id.buttonProceed -> {

                var name = ""
                var price = 0
                var size = 0
                var total = 0
                var sum = 0.0
                var gst = 0
                var amount = 0.0
                var temp = 0.0

                if (checkBoxPotato.isChecked){
                    name = "Potato"
                    price = 20
                    size = editTextTextPotatoSize.text.toString().toInt()
                    total = price * size
                    lisOfItems.add(Item(name, price, size, total))
                }
                if (checkBoxOnion.isChecked){
                    name = "Onion"
                    price = 50
                    size = editTextTextOnionSize.text.toString().toInt()
                    total = price * size
                    lisOfItems.add(Item(name, price, size, total))
                }
                if (checkBoxTomato.isChecked){
                    name = "Tomato"
                    price = 40
                    size = editTextTextTomatoSize.text.toString().toInt()
                    total = price * size
                    lisOfItems.add(Item(name, price, size, total))
                }
                if (checkBoxApple.isChecked){
                    name = "Apple"
                    price = 100
                    size = editTextTextAppleSize.text.toString().toInt()
                    total = price * size
                    lisOfItems.add(Item(name, price, size, total))
                }
                if (checkBoxOrange.isChecked){
                    name = "Orange"
                    price = 60
                    size = editTextTextOrangeSize.text.toString().toInt()
                    total = price * size
                    lisOfItems.add(Item(name, price, size, total))
                }
                if (checkBoxRice.isChecked){
                    name = "Rice"
                    price = 36
                    size = editTextTextRiceSize.text.toString().toInt()
                    total = price * size
                    lisOfItems.add(Item(name, price, size, total))
                }
                if (checkBoxGrain.isChecked){
                    name = "Grain"
                    price = 48
                    size = editTextTextGrainSize.text.toString().toInt()
                    total = price * size
                    lisOfItems.add(Item(name, price, size, total))
                }
                if (checkBoxOil.isChecked){
                    name = "Oil"
                    price = 96
                    size = editTextTextOilSize.text.toString().toInt()
                    total = price * size
                    lisOfItems.add(Item(name, price, size, total))
                }
                if (checkBoxSugar.isChecked){
                    name = "Sugar"
                    price = 20
                    size = editTextTextSugarSize.text.toString().toInt()
                    total = price * size
                    lisOfItems.add(Item(name, price, size, total))
                }
                if (checkBoxGST6.isChecked){
                    gst = 6
                }
                if (checkBoxGST18.isChecked){
                    gst = 18
                }
                for (i in lisOfItems){
                    sum += i.totalAmount
                }

                temp = (sum / 100) * gst
                amount = sum + temp

                Toast.makeText(this, "Total :$amount", Toast.LENGTH_LONG).show()

//                val intent = Intent(this, BillActivity::class.java)
//                val args = Bundle()
//                args.putSerializable("arr", lisOfItems)
//                intent.putExtra("items", args)
//                intent.putExtra("gst", gst)
//                intent.putExtra("amount", amount)
//                startActivity(intent)
            }
        }
    }
}