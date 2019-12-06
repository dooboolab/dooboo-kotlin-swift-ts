package com.dooboo

import android.widget.Toast
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Callback

class ToastModule(private val reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

    override fun getName(): String {
        return "ToastModule"
    }

    @ReactMethod
    fun show(stringArgument: String) {
        Toast.makeText(reactContext, stringArgument, Toast.LENGTH_LONG).show()
        // TODO: Implement some actually useful functionality
//        callback.invoke("stringArgument: $stringArgument")
    }
}
