package com.affan.trailermark1

import com.affan.trailermark1.model.VideoResponse
import com.affan.trailermark1.network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*

class MainPresenter (private val mainView: MainView) {

    fun getData(){
        ApiClient.instance.getVideoResponse(Dataku.movieID,Dataku.apiKey)
            .enqueue(object : Callback<VideoResponse> {
                override fun onResponse(
                    call: Call<VideoResponse>,
                    response: Response<VideoResponse>
                ) {
                    val body = response.body()!!
                    val bb = response.body()!!
                    val read = Scanner("Official Trailer")


//                    for (i in bb.results!!.indices){
//                        if (bb.results )
//                    }

                    // Official Trailer ada di index 29
//                    body.results?.get(29)?.key
//                        ?.let {
//                            mainView.onGetDataSucces(it)
//                        }
                }

                override fun onFailure(call: Call<VideoResponse>, t: Throwable) {
                    TODO("Not yet implemented")
                }

            })
    }

}