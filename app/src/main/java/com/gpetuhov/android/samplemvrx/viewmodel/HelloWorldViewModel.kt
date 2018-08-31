package com.gpetuhov.android.samplemvrx.viewmodel

import com.airbnb.mvrx.MvRxState
import com.gpetuhov.android.samplemvrx.core.MvRxViewModel

// Keeps current state
data class HelloWorldState(val title: String = "Hello World") : MvRxState

// This is ViewModel. It holds state.
class HelloWorldViewModel(initialState: HelloWorldState) : MvRxViewModel<HelloWorldState>(initialState) {
    // When setState is called, EpoxyRecyclerView gets updated automatically
    fun getMoreExcited() = setState { copy(title = "$title!") }
}
