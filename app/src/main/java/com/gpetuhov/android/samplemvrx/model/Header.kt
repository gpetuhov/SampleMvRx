package com.gpetuhov.android.samplemvrx.model

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import android.widget.TextView
import com.airbnb.epoxy.CallbackProp
import com.airbnb.epoxy.ModelView
import com.airbnb.epoxy.TextProp
import com.gpetuhov.android.samplemvrx.R

@ModelView(autoLayout = ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
class Header @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    private val titleView: TextView

    init {
        inflate(context, R.layout.header_view, this)
        titleView = findViewById(R.id.title)
        orientation = VERTICAL
    }

    @TextProp
    fun setTitle(title: CharSequence) {
        titleView.text = title
    }

    @CallbackProp
    fun setOnClick(clickListener: OnClickListener?) {
        setOnClickListener(clickListener)
    }
}