package com.sample.daggerworkmanagersample

import android.app.Activity
import android.os.Bundle
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        hello_button.setOnClickListener {
            WorkManager.getInstance().enqueue(
                OneTimeWorkRequestBuilder<UIUpdaterWorker>().build()
            )
        }
    }
}
