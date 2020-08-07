package com.febryandana.topgames

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvGame: RecyclerView
    private var list: ArrayList<Game> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Top Game"
        rvGame = findViewById(R.id.rv_games)
        rvGame.setHasFixedSize(true)
        list.addAll(GameData.listData)
        showRecycleList()
    }

    private fun showRecycleList() {
        rvGame.layoutManager = LinearLayoutManager(this)
        rvGame.adapter = GameAdapter(list)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_about, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.menu_about){
            val about = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(about)
        }
        return super.onOptionsItemSelected(item)
    }
}