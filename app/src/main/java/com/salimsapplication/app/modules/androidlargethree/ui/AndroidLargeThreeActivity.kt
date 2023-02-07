package com.salimsapplication.app.modules.androidlargethree.ui

import androidx.activity.viewModels
import com.salimsapplication.app.R
import com.salimsapplication.app.appcomponents.base.BaseActivity
import com.salimsapplication.app.databinding.ActivityAndroidLargeThreeBinding
import com.salimsapplication.app.modules.androidlargethree.`data`.viewmodel.AndroidLargeThreeVM
import kotlin.String
import kotlin.Unit

class AndroidLargeThreeActivity :
    BaseActivity<ActivityAndroidLargeThreeBinding>(R.layout.activity_android_large_three) {
  private val viewModel: AndroidLargeThreeVM by viewModels<AndroidLargeThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidLargeThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ANDROID_LARGE_THREE_ACTIVITY"

  }
}
