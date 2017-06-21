package io.github.jitinsharma.kotlinproject.network

import android.util.Log
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import io.github.jitinsharma.kotlinproject.MApplication

/**
 * Created by jsharma on 19/06/17.
 */

class UserRequest {
    val TAG: String = UserRequest::class.java.simpleName
    //https://api.github.com/users/jitinsharma/repos

    fun getUserRepos(user: String, completionHandler: (response: String?) -> Unit) {
        val stringRequest = StringRequest(Request.Method.GET, getUrl(user), Response.Listener { r ->

            Log.d(TAG, "Response: " + r.toString())
            completionHandler(r.toString())

        }, Response.ErrorListener { e ->
            Log.d(TAG, "Error: " + e.toString())
            completionHandler(null)
        })
        MApplication.instance?.addToRequestQueue(stringRequest)
    }

    private fun getUrl(user: String): String {
        return "https://api.github.com/users/$user/repos"
    }
}