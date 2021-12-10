package com.reactnativecameragalleryaccess

import android.app.Activity
import android.content.Intent
import com.facebook.react.bridge.*
import com.reactnativecameragalleryaccess.camera.CameraActivity

class CameraGalleryAccessModule(reactContext: ReactApplicationContext) :
  ReactContextBaseJavaModule(reactContext), ActivityEventListener {

  var url = 200
  private lateinit var promise: Promise

  override fun getName(): String {
    return "CameraGalleryAccess"
  }

  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @ReactMethod
  fun multiply(a: Int, b: Int, promise: Promise) {

    val intent = Intent(reactApplicationContext, CameraActivity::class.java)

    this.promise = promise

    currentActivity?.startActivityForResult(intent, CAMERA_IMAGE_REQUEST_CODE)

//    promise.resolve(url)

  }


  companion object {
    private const val CAMERA_IMAGE_REQUEST_CODE = 20
  }

  override fun onActivityResult(p0: Activity?, p1: Int, p2: Int, p3: Intent?) {
    promise.resolve(4000)
  }

  override fun onNewIntent(p0: Intent?) {
    TODO("Not yet implemented")
  }
}
