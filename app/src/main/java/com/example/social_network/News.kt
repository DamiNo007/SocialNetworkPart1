package com.example.social_network

import android.os.Build
import android.os.Parcel
import android.os.Parcelable
import androidx.annotation.RequiresApi


data class News(
        var id: Int,
        var avaURL: Int,
        var contentImgURL: Int,
        var author: String? = null,
        var date: String? = null,
        var text: String? = null,
        var isLiked: Boolean,
        var likesNo: Int,
        var commentsNo: Int,
        var viewsNo: Int
) : Parcelable {

    @RequiresApi(Build.VERSION_CODES.Q)
    constructor(parcel: Parcel) : this(
            parcel.readInt(),
            parcel.readInt(),
            parcel.readInt(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readBoolean(),
            parcel.readInt(),
            parcel.readInt(),
            parcel.readInt()
    )

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeInt(id)
        dest?.writeInt(avaURL)
        dest?.writeInt(contentImgURL)
        dest?.writeString(author)
        dest?.writeString(date)
        dest?.writeString(text)
        dest?.writeBoolean(isLiked)
        dest?.writeInt(likesNo)
        dest?.writeInt(commentsNo)
        dest?.writeInt(viewsNo)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<News> {
        @RequiresApi(Build.VERSION_CODES.Q)
        override fun createFromParcel(source: Parcel): News {
            return News(source)
        }

        override fun newArray(size: Int): Array<News?> {
            return arrayOfNulls(size)
        }

    }

}