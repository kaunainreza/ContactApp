package com.example.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var newRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrContact = ArrayList<ContactModel>()

        arrContact.add(ContactModel(R.drawable.ic_launcher_foreground,"A","95432"))
        arrContact.add(ContactModel(R.drawable.ic_launcher_foreground,"B","98422"))
        arrContact.add(ContactModel(R.drawable.ic_launcher_foreground,"C","95432"))
        arrContact.add(ContactModel(R.drawable.ic_launcher_foreground,"D","265432"))
        arrContact.add(ContactModel(R.drawable.ic_launcher_foreground,"E","95432"))
        arrContact.add(ContactModel(R.drawable.ic_launcher_foreground,"F","934412"))
        arrContact.add(ContactModel(R.drawable.ic_launcher_foreground,"G","948432"))
        arrContact.add(ContactModel(R.drawable.ic_launcher_foreground,"H","165432"))
        arrContact.add(ContactModel(R.drawable.ic_launcher_foreground,"I","942458"))
        arrContact.add(ContactModel(R.drawable.ic_launcher_foreground,"j","951452"))
        arrContact.add(ContactModel(R.drawable.ic_launcher_foreground,"K","9832"))
        arrContact.add(ContactModel(R.drawable.ic_launcher_foreground,"L","9582"))
        arrContact.add(ContactModel(R.drawable.ic_launcher_foreground,"A","95432"))
        arrContact.add(ContactModel(R.drawable.ic_launcher_foreground,"B","98422"))
        arrContact.add(ContactModel(R.drawable.ic_launcher_foreground,"C","95432"))
        arrContact.add(ContactModel(R.drawable.ic_launcher_foreground,"D","265432"))
        arrContact.add(ContactModel(R.drawable.ic_launcher_foreground,"E","95432"))
        arrContact.add(ContactModel(R.drawable.ic_launcher_foreground,"F","934412"))
        arrContact.add(ContactModel(R.drawable.ic_launcher_foreground,"G","948432"))
        arrContact.add(ContactModel(R.drawable.ic_launcher_foreground,"H","165432"))
        arrContact.add(ContactModel(R.drawable.ic_launcher_foreground,"I","942458"))
        arrContact.add(ContactModel(R.drawable.ic_launcher_foreground,"j","951452"))
        arrContact.add(ContactModel(R.drawable.ic_launcher_foreground,"K","9832"))
        arrContact.add(ContactModel(R.drawable.ic_launcher_foreground,"L","9582"))


        newRecyclerView= findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager= GridLayoutManager(this,5)

        val recyclerAdapter = RecyclerContactAdapter(this,arrContact)
        newRecyclerView.adapter = recyclerAdapter
    }
}