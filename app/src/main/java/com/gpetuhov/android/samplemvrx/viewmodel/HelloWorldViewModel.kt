package com.gpetuhov.android.samplemvrx.viewmodel

import com.airbnb.mvrx.MvRxState
import com.gpetuhov.android.samplemvrx.core.MvRxViewModel

data class HelloWorldState(val title: String = "Hello World") : MvRxState

class HelloWorldViewModel(initialState: HelloWorldState) : MvRxViewModel<HelloWorldState>(initialState) {
    fun getMoreExcited() = setState { copy(title = "$title!") }
}
