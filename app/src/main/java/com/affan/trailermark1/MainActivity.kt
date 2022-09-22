package com.affan.trailermark1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.affan.trailermark1.databinding.ActivityMainBinding
import com.affan.trailermark1.model.VideoResponse
import com.affan.trailermark1.network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(), MainView {

    private lateinit var binding : ActivityMainBinding
    private lateinit var mainPresenter: MainPresenter


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainPresenter = MainPresenter(this)
        mainPresenter.getData()

    }


    override fun onGetDataSucces(videoKey : String) {
        binding.ytTrailer.play(videoKey)
    }

}