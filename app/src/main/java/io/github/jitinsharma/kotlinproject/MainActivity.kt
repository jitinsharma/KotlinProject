package io.github.jitinsharma.kotlinproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.text.TextUtils
import android.widget.EditText
import android.widget.ImageView
import io.github.jitinsharma.kotlinproject.network.UserRequest

class MainActivity : AppCompatActivity() {
    var repoList : RecyclerView? = null
    var searchView : EditText? = null
    var searchButton : ImageView? = null
    var userRequest : UserRequest? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindViews()
        searchButton?.setOnClickListener {
            if (!TextUtils.isEmpty(searchView?.text)) {
                callGitHubService(searchView?.text.toString())
            }
        }
    }

    fun bindViews() {
        repoList = findViewById(R.id.repoList) as RecyclerView?
        searchView = findViewById(R.id.searchView) as EditText?
        searchButton = findViewById(R.id.searchButton) as ImageView?
    }

    fun callGitHubService(user : String) {
        userRequest = UserRequest()
    }
}
