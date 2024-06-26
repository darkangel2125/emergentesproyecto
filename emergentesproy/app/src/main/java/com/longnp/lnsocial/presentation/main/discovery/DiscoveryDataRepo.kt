package com.longnp.lnsocial.presentation.main.discovery

import android.app.Application
import androidx.annotation.RawRes
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.longnp.lnsocial.business.domain.models.discovery.DiscoveryModel
import javax.inject.Inject

class DiscoveryDataRepo
@Inject
constructor(
    private val application: Application,
){
    fun getStoriesData(@RawRes id: Int): List<DiscoveryModel>? {
        return loadMockData(id)
    }

    private fun loadMockData(@RawRes id: Int): List<DiscoveryModel>? {
        val mockData = application.applicationContext.resources.openRawResource(id) //R.raw.stories_data
        val dataString = mockData.bufferedReader().readText()

        val gson = Gson()
        val storiesType = object : TypeToken<List<DiscoveryModel>>() {}.type
        val storiesDataModelList = gson.fromJson<List<DiscoveryModel>>(dataString, storiesType)

        return storiesDataModelList
    }
}