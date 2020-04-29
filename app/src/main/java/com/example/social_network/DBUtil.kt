package com.example.social_network

import java.util.*

class DBUtil {

    companion object {
        var items: MutableList<News> = ArrayList()

        init {
            items.add(News(items.size, R.drawable.a2, R.drawable.p1, "Damir Moldabayev", "yesterday at 7:49", "asd jlaskdj lakd lkasjdl kjsdlfk jlsdk jldskf jlsdkjf lksdjf lksdl kf", false, 545, 123, 2200))
            items.add(News(items.size, R.drawable.a3, R.drawable.p2, "Ruslan Safarov", "yesterday at 7:49", "asd jlaskdj lakd lkasjdl kjsdlfk jlsdk jldskf jlsdkjf lksdjf lksdl kf", false, 545, 123, 2200))
            items.add(News(items.size, R.drawable.a4, R.drawable.p3, "Nurmash Smatov", "yesterday at 7:49", "asd jlaskdj lakd lkasjdl kjsdlfk jlsdk jldskf jlsdkjf lksdjf lksdl kf", false, 545, 123, 2200))
            items.add(News(items.size, R.drawable.a2, R.drawable.p4, "Ruslan Safarov", "yesterday at 7:49", "asd jlaskdj lakd lkasjdl kjsdlfk jlsdk jldskf jlsdkjf lksdjf lksdl kf", false, 545, 123, 2200))
            items.add(News(items.size, R.drawable.a3, R.drawable.p5, "Damir Moldabayev", "yesterday at 7:49", "asd jlaskdj lakd lkasjdl kjsdlfk jlsdk jldskf jlsdkjf lksdjf lksdl kf", false, 545, 123, 2200))
            items.add(News(items.size, R.drawable.a4, R.drawable.p6, "Nurmash Smatov", "yesterday at 7:49", "asd jlaskdj lakd lkasjdl kjsdlfk jlsdk jldskf jlsdkjf lksdjf lksdl kf", false, 545, 123, 2200))
            items.add(News(items.size, R.drawable.a2, R.drawable.p7, "Ruslan Safarov", "yesterday at 7:49", "asd jlaskdj lakd lkasjdl kjsdlfk jlsdk jldskf jlsdkjf lksdjf lksdl kf", false, 545, 123, 2200))
            items.add(News(items.size, R.drawable.a3, R.drawable.p8, "Damir Moldabayev", "yesterday at 7:49", "asd jlaskdj lakd lkasjdl kjsdlfk jlsdk jldskf jlsdkjf lksdjf lksdl kf", false, 545, 123, 2200))
            items.add(News(items.size, R.drawable.a4, R.drawable.p9, "Nurmash Smatov", "yesterday at 7:49", "asd jlaskdj lakd lkasjdl kjsdlfk jlsdk jldskf jlsdkjf lksdjf lksdl kf", false, 545, 123, 2200))
            items.add(News(items.size, R.drawable.a2, R.drawable.p2, "Ruslan Safargaliev", "yesterday at 7:49", "asd jlaskdj lakd lkasjdl kjsdlfk jlsdk jldskf jlsdkjf lksdjf lksdl kf", false, 545, 123, 2200))
            items.add(News(items.size, R.drawable.a3, R.drawable.p1, "Damir Moldabayev", "yesterday at 7:49", "asd jlaskdj lakd lkasjdl kjsdlfk jlsdk jldskf jlsdkjf lksdjf lksdl kf", false, 545, 123, 2200))
        }
    }
}