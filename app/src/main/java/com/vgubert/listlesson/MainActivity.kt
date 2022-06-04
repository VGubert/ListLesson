package com.vgubert.listlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.vgubert.listlesson.adapter.UserAdapter
import com.vgubert.listlesson.databinding.ActivityMainBinding
import com.vgubert.listlesson.model.UserModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: UserAdapter
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }
    private fun init() {
        recyclerView = binding.rvUser
        adapter = UserAdapter(this)
        recyclerView.adapter = adapter
        adapter.setList(myUser())
    }

    fun myUser(): ArrayList<UserModel> {
        val userList = ArrayList<UserModel>()

        val user = UserModel("Hetfield", "James")
        userList.add(user)

        val user2 = UserModel("Ulrich", "Lars")
        userList.add(user2)

        val user3 = UserModel("Hammett", "Kirk")
        userList.add(user3)

        val user4 = UserModel("Trujillo ", "Robert")
        userList.add(user4)

        return userList
    }
}