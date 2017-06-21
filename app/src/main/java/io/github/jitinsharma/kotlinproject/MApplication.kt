package io.github.jitinsharma.kotlinproject

import android.app.Application
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley

/**
 * Created by jsharma on 20/06/17.
 */
class MApplication : Application() {
    var requestQueue : RequestQueue? = null

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    fun <T> addToRequestQueue(request: Request<T>) {
        if (requestQueue == null) {
            requestQueue = Volley.newRequestQueue(this)
        }
        requestQueue?.add(request)
    }

    companion object {
        @get:Synchronized var instance : MApplication? = null
            private set
    }

}