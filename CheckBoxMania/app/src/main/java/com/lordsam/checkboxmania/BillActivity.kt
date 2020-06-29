package com.lordsam.checkboxmania

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_bill.view.*
import kotlinx.android.synthetic.main.card_item.view.*

class BillActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bill)

        val bundle = intent.extras!!
        val args = intent.getBundleExtra("items")
        val listOfItems = args!!.getSerializable("arr")
        val gst = bundle.getInt("gst")
        val amount = bundle.getInt("amount")
        val lv = findViewById<ListView>(R.id.lisView)

//        val listAdapter = ListAdapter(this, listOfItems)
//        lv.adapter = listAdapter

    }

    class ListAdapter(context :Context, list :ArrayList<Item>) :BaseAdapter(){
        var mctx :Context
        var myList : ArrayList<Item>

        init {
            this.mctx = context
            this.myList = list
        }
        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            val item = myList[p0]
            val inflater = mctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val cardView = inflater.inflate(R.layout.card_item, null, true)
            cardView.textViewItems.text = item.itemName
            cardView.textViewPriceCard.text = item.itemPrize.toString()
            cardView.textViewAmountCard.text = item.itemSize.toString()
            cardView.textViewTotalCard.text = item.totalAmount.toString()
            return  cardView
        }

        override fun getItem(p0: Int): Any {
            return "item"
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getCount(): Int {
            return myList.size
        }

    }
}