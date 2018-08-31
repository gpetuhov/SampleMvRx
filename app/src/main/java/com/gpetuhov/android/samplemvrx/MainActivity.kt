package com.gpetuhov.android.samplemvrx

import android.os.Bundle
import com.airbnb.mvrx.BaseMvRxActivity

// MainActivity contains no business logic and just holds fragments
class MainActivity : BaseMvRxActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
