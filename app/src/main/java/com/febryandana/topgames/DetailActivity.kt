package com.febryandana.topgames

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_POSTER = "extra_poster"
        const val EXTRA_PLATFORM = "extra_platform"
        const val EXTRA_RELEASE = "extra_release"
        const val EXTRA_SCORE = "extra_score"
        const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.title="Detail Game"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val tvSetName: TextView = findViewById(R.id.tv_detail_name)
        val imgSetPoster: ImageView = findViewById(R.id.img_detail_poster)
        val tvSetPlatform: TextView = findViewById(R.id.tv_detail_platform)
        val tvSetRelease: TextView = findViewById(R.id.tv_detail_release)
        val tvSetScore: TextView = findViewById(R.id.tv_detail_score)
        val tvSetDetail: TextView = findViewById(R.id.tv_detail_content)

        val tName = intent.getStringExtra(EXTRA_NAME)
        val tPoster = intent.getIntExtra(EXTRA_POSTER, 0)
        val tPlatform = intent.getStringExtra(EXTRA_PLATFORM)
        val tRelease = intent.getStringExtra(EXTRA_RELEASE)
        val tScore = intent.getStringExtra(EXTRA_SCORE)
        val tDetail = intent.getStringExtra(EXTRA_DETAIL)

        tvSetName.text = tName
        Glide.with(this)
            .load(tPoster)
            .apply(RequestOptions())
            .into(imgSetPoster)
        tvSetPlatform.text = tPlatform
        tvSetRelease.text = tRelease
        tvSetScore.text = tScore
        tvSetDetail.text = tDetail
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_about, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.menu_about){
            val about = Intent(this@DetailActivity, AboutActivity::class.java)
            startActivity(about)
        }
        return super.onOptionsItemSelected(item)
    }
}