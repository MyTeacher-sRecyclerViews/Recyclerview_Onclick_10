package com.example.recyclerview_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = GridLayoutManager(this, 1)
        val users = addedUsersList()
        refreshAdapter(users)

    }

    private fun refreshAdapter(users: ArrayList<User>) {
        val adapter = CustomAdapter(this, users)
        recyclerView.adapter = adapter
    }

    private fun addedUsersList(): ArrayList<User> {
        val users = ArrayList<User>()

        for (i in 0..30) {
            users.add(User("Android", "$i"))
        }
        return users
    }

    fun openItemDetails(user: User) {
        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show()
    }
}