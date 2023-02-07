package com.salimsapplication.app.modules.androidlargethree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.salimsapplication.app.modules.androidlargethree.`data`.model.AndroidLargeThreeModel
import org.koin.core.KoinComponent

class AndroidLargeThreeVM : ViewModel(), KoinComponent {
  val androidLargeThreeModel: MutableLiveData<AndroidLargeThreeModel> =
      MutableLiveData(AndroidLargeThreeModel())

  var navArguments: Bundle? = null
}
