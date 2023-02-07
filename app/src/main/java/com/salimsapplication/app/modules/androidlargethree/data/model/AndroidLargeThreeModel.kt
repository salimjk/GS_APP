package com.salimsapplication.app.modules.androidlargethree.`data`.model

import com.salimsapplication.app.R
import com.salimsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidLargeThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLOGIN: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEMAIL: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPASSWORD: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMotdepasseou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_mot_de_passe_ou)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_no_account_sig)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameOneValue: String? = null
)
