package io.github.jitinsharma.kotlinproject.network

import android.util.Log
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest

/**
 * Created by jsharma on 19/06/17.
 */

class UserRequest {
    //https://api.github.com/users/jitinsharma/repos

    fun getUserRepos(user: String) {
        var stringRequest = StringRequest(Request.Method.GET, getUrl(user), Response.Listener { r ->

        }, Response.ErrorListener { e ->
            Log.d("TAG", e.toString())
        })
    }

    fun getUrl(user: String) : String {
        return "https://api.github.com/users/$user/repos"
    }
}