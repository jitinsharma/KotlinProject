package io.github.jitinsharma.kotlinproject

import android.util.Log
import com.google.gson.Gson
import io.github.jitinsharma.kotlinproject.model.UserModel
import org.json.JSONArray
import java.util.*

/**
 * Created by jsharma on 21/06/17.
 */

class ResponseParser{
    val TAG : String = ResponseParser::class.java.simpleName

    fun getRepoObjects(response : String) : ArrayList<UserModel> {
        Log.d(TAG, response)
        val gson = Gson()
        val array = JSONArray(response)
        val userModels = (0..(array.length()))
                .map { array.getJSONObject(it) }
                .mapTo(ArrayList<UserModel>()) { gson.fromJson(it.toString(), UserModel::class.java) }
        return userModels
    }

}