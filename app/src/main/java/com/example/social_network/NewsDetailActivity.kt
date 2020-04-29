package com.example.social_network

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.social_network.MainActivity

class NewsDetailActivity : AppCompatActivity() {
    private lateinit var avatar: ImageView
    private lateinit var tvAuthor: TextView
    private lateinit var tvDate: TextView
    private lateinit var tvText: TextView
    private lateinit var contentImg: ImageView
    private lateinit var imgLike: ImageView
    private lateinit var tvLike: TextView
    private lateinit var tvRedir: TextView
    private lateinit var tvViews: TextView
    private lateinit var back: ImageView
    private var isLiked: Boolean = false
    private var likesCount: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_detail)
        back = findViewById(R.id.back)
        avatar = findViewById(R.id.avatar)
        tvAuthor = findViewById(R.id.tvAuthor)
        tvDate = findViewById(R.id.tvDate)
        tvText = findViewById(R.id.text)
        contentImg = findViewById(R.id.contentImg)
        imgLike = findViewById(R.id.imgLike1)
        tvLike = findViewById(R.id.tvLike1)
        tvRedir = findViewById(R.id.tvRedir)
        tvViews = findViewById(R.id.tvViews)
        val news = intent.getParcelableExtra<Parcelable>("news") as News
        isLiked = news.isLiked
        likesCount = news.likesNo

        Glide.with(this)
                .load(news.avaURL)
                .into(avatar)

        avatar.setImageResource(news.avaURL)
        contentImg.setImageResource(news.contentImgURL)
        if (news.isLiked) {
            imgLike.setImageResource(R.drawable.liked)
        } else {
            imgLike.setImageResource(R.drawable.like)
        }
        tvLike.setText(Integer.toString(news.likesNo))
        tvAuthor.setText(news.author)
        tvDate.setText(news.date)
        tvText.setText(news.text)
        imgLike.setOnClickListener(View.OnClickListener {
            if (news.isLiked) {
                news.isLiked = false
                imgLike.setImageResource(R.drawable.like)
                news.likesNo = news.likesNo - 1
                tvLike.setText(Integer.toString(news.likesNo))
                val toast = Toast.makeText(applicationContext,
                        "Like removed!",
                        Toast.LENGTH_SHORT)
                toast.setGravity(Gravity.CENTER, 0, 0)
                toast.show()
            } else {
                news.isLiked = true
                imgLike.setImageResource(R.drawable.liked)
                news.likesNo = news.likesNo + 1
                tvLike.setText(Integer.toString(news.likesNo))
                val toast = Toast.makeText(applicationContext,
                        "Liked!",
                        Toast.LENGTH_SHORT)
                toast.setGravity(Gravity.CENTER, 0, 0)
                toast.show()
            }
        })
        back.setOnClickListener(View.OnClickListener {
            DBUtil.items[news.id] = news
            val intent = Intent(this@NewsDetailActivity, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            intent.putExtra("position", news.id)
            startActivity(intent)
        })
    }
}