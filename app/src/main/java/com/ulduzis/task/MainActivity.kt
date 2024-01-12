package com.ulduzis.task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import com.google.firebase.crashlytics.FirebaseCrashlytics

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* val crashButton = Button(this)
        crashButton.text = "Test Crash"
        FirebaseCrashlytics.getInstance().log("Main Activity onCreate")
        crashButton.setOnClickListener {
            throw RuntimeException("Test Crash") // Force a crash
        }

        addContentView(crashButton, ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT))*/
    }


    override fun onResume() {
        super.onResume()
        FirebaseCrashlytics.getInstance().log("Main Activity onCreate")
    }
}