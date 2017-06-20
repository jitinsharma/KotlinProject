package io.github.jitinsharma.kotlinproject

import android.app.Application
import com.android.volley.RequestQueue

/**
 * Created by jsharma on 20/06/17.
 */
class MApplication : Application() {
    var requestQueue : RequestQueue? = null

    override fun onCreate() {
        super.onCreate()
    }
}