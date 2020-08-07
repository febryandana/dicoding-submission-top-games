package com.febryandana.topgames

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GameAdapter(private val listGame: ArrayList<Game>) : RecyclerView.Adapter<GameAdapter.GameViewHolder>() {
    inner class GameViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPoster: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvPlatform: TextView = itemView.findViewById(R.id.tv_item_platform)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_games, parent, false)
        return GameViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listGame.size
    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        val game = listGame[position]

        Glide.with(holder.itemView.context)
            .load(game.poster)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPoster)

        holder.tvName.text = game.name
        holder.tvPlatform.text = game.platform

        val moveContext = holder.itemView.context
        holder.itemView.setOnClickListener {
            Toast.makeText(moveContext, listGame[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()
            val moveDetail = Intent(moveContext, DetailActivity::class.java)
            moveDetail.putExtra(DetailActivity.EXTRA_NAME, game.name)
            moveDetail.putExtra(DetailActivity.EXTRA_POSTER, game.poster)
            moveDetail.putExtra(DetailActivity.EXTRA_PLATFORM, game.platform)
            moveDetail.putExtra(DetailActivity.EXTRA_RELEASE, game.release)
            moveDetail.putExtra(DetailActivity.EXTRA_SCORE, game.score)
            moveDetail.putExtra(DetailActivity.EXTRA_DETAIL, game.detail)
            moveContext.startActivity(moveDetail)
        }
    }
}