package com.gpetuhov.android.samplemvrx

import com.airbnb.mvrx.fragmentViewModel
import com.gpetuhov.android.samplemvrx.core.BaseFragment
import com.gpetuhov.android.samplemvrx.core.simpleController
import com.gpetuhov.android.samplemvrx.model.header
import com.gpetuhov.android.samplemvrx.viewmodel.HelloWorldViewModel

// This is our main fragment.
// Because of all the extension functions and function literals with receivers in BaseFragment,
// code in MainFragment is short and concise.
class MainFragment : BaseFragment() {
    private val viewModel: HelloWorldViewModel by fragmentViewModel()

    override fun epoxyController() = simpleController(viewModel) { state ->
        header {
            id("header")
            title(state.title)
            onClick { _ -> viewModel.getMoreExcited() }
        }
    }
}