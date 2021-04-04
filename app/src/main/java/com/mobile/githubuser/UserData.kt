package com.mobile.githubuser

import android.content.Context

class UserData (context: Context){
    private val itemUsername = context.resources.getStringArray(R.array.username)
    private val itemNama = context.resources.getStringArray(R.array.name)
    private val itemLocation = context.resources.getStringArray(R.array.location)
    private val itemRepository = context.resources.getStringArray(R.array.repository)
    private val itemCompany = context.resources.getStringArray(R.array.company)
    private val itemFollowers = context.resources.getStringArray(R.array.followers)
    private val itemFollowing = context.resources.getStringArray(R.array.following)
    private val itemAvatar = context.resources.obtainTypedArray(R.array.avatar)

    val userData: ArrayList<User>
        get() {
            val item = arrayListOf<User>()
            for(position in itemUsername.indices) {
                val isi = User(
                    itemUsername[position],
                    itemNama[position],
                    itemLocation[position],
                    itemRepository[position],
                    itemCompany[position],
                    itemFollowers[position],
                    itemFollowing[position],
                    itemAvatar.getResourceId(position, -1)
                )
                item.add(isi)
            }
            return item
        }

}