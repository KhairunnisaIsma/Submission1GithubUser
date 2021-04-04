package com.mobile.githubuser

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class UserAdapter(private val userList: ArrayList<User>): RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    class UserViewHolder(inflater: LayoutInflater, parent:ViewGroup):
        RecyclerView.ViewHolder(inflater.inflate(R.layout.layout_user_list,parent,false)) {

        var avatarView: CircleImageView = itemView.findViewById(R.id.image_view1)
        var nama: TextView = itemView.findViewById(R.id.name_githubuser)
        var username: TextView = itemView.findViewById(R.id.username_githubuser)

    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
       val user = userList[position]
        holder.avatarView.setImageResource(user.avatar)
        holder.nama.text = user.nama
        holder.username.text = user.username
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailUserActivity::class.java)
            intent.putExtra("user",user)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return UserViewHolder(inflater,parent)
    }
}