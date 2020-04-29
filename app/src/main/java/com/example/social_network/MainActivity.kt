package com.example.social_network

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), NewsListAdapter.ItemClickListener {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: NewsListAdapter
    private val KEY_RECYCLER_STATE = "recycler_state"

    companion object {
        private var mBundleRecyclerViewState: Bundle? = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager =
                LinearLayoutManager(this)

        adapter =
                NewsListAdapter(
                        listener = this
                )
        adapter.newsList = newsGenerator()
        recyclerView.setAdapter(adapter)
    }

    override fun onPause() {
        super.onPause()
        mBundleRecyclerViewState = Bundle()
        val listState = recyclerView.layoutManager!!.onSaveInstanceState()
        if (mBundleRecyclerViewState != null) {
            mBundleRecyclerViewState!!.putParcelable(KEY_RECYCLER_STATE, listState)
        }
    }

    override fun onResume() {
        super.onResume()
        if (mBundleRecyclerViewState != null) {
            val listState =
                    mBundleRecyclerViewState!!.getParcelable<Parcelable>(
                            KEY_RECYCLER_STATE
                    )
            recyclerView.layoutManager!!.onRestoreInstanceState(listState)
        }
    }

    private fun newsGenerator(): List<News> {
        val list: MutableList<News> = ArrayList()
        val news = News(DBUtil.items.size, R.drawable.a2, R.drawable.p1, "Damir Moldabayev", "yesterday at 7:49", "asd jlaskdj lakd lkasjdl kjsdlfk jlsdk jldskf jlsdkjf lksdjf lksdl kf", false, 545, 123, 2200)
        list?.add(news)
        return DBUtil.items
    }

    override fun itemClick(position: Int, item: News?) {
        val intent = Intent(this@MainActivity, NewsDetailActivity::class.java)
        intent.putExtra("news", item)
        startActivity(intent)
    }
}
