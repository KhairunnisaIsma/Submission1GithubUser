package com.mobile.githubuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class DetailUserActivity : AppCompatActivity() {
    private lateinit var avaGithub: CircleImageView
    private lateinit var usernameGithub: TextView
    private lateinit var namaGithub: TextView
    private lateinit var repositoryGithub: TextView
    private lateinit var followersGithub: TextView
    private lateinit var followingGithub: TextView
    private lateinit var companyGithub: TextView
    private lateinit var locationGithub: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_user)

        avaGithub = findViewById(R.id.image_detail)
        usernameGithub = findViewById(R.id.username_detail)
        namaGithub = findViewById(R.id.nama_detail)
        repositoryGithub = findViewById(R.id.repository_detail)
        followersGithub = findViewById(R.id.followers_detail)
        followingGithub = findViewById(R.id.following_detail)
        companyGithub = findViewById(R.id.company_detail)
        locationGithub = findViewById(R.id.location_detail)

        intent.getParcelableExtra<User>("user")?.apply {

            avaGithub.setImageResource(avatar)
            usernameGithub.text = username
            namaGithub.text = nama
            repositoryGithub.text = repository
            followersGithub.text = followers
            followingGithub.text = following
            companyGithub.text = company
            locationGithub.text = location
        }
        val backButton = findViewById<ImageButton>(R.id.back_button)

        backButton.setOnClickListener { onBackPressed() }

    }
}