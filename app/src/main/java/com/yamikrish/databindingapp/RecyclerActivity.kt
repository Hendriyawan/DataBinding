package com.yamikrish.databindingapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.yamikrish.databindingapp.RecyclerRAdapter
import com.yamikrish.databindingapp.model.User
import kotlinx.android.synthetic.main.activity_recycler.*
import android.support.v7.widget.DividerItemDecoration
import com.yamikrish.databindingapp.R.id.recyclerView

/* 
 * Created by Yamini on 24/12/18.
 */
class RecyclerActivity : AppCompatActivity() {

    private var userList = ArrayList<User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        loadData()
        setAdapter()
    }

    private fun loadData() {
        userList.add(User("Riya", "+919876543210", ""))
        userList.add(User("Percy", "+919876543210", ""))
        userList.add(User("Ron", "+919876543210", ""))
        userList.add(User("Prachi", "+919876543210", ""))
        userList.add(User("Leo", "+919876543210", ""))
        userList.add(User("Luke", "+919876543210", ""))
        userList.add(User("Sadie", "+919876543210", ""))
        userList.add(User("Magnus", "+919876543210", ""))
        userList.add(User("Apollo", "+919876543210", ""))

    }

    private fun setAdapter() {
        recyclerView?.apply {
            layoutManager = LinearLayoutManager(this@RecyclerActivity)
            addItemDecoration(DividerItemDecoration(this@RecyclerActivity, DividerItemDecoration.VERTICAL))
            adapter = RecyclerRAdapter(this@RecyclerActivity, userList)
        }
    }
}
