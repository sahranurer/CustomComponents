package com.example.customcomponents

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class HeaderTitle constructor(context: Context, attributeSet: AttributeSet?) : ConstraintLayout(context) {
    private var titleTextView:TextView? = null
    private var backImageView:ImageView? = null

init {
     val view = inflate(context,R.layout.custom_view_header_title,this)
     titleTextView = view.findViewById(R.id.text_title)

    val attrs = context.obtainStyledAttributes(attributeSet,R.styleable.HeaderTitle)
    titleTextView?.text = attrs.getString(R.styleable.HeaderTitle_title_)
    backImageView?.visibility =  if (attrs.getBoolean(R.styleable.HeaderTitle_isVisibilityBack,false)) View.VISIBLE else View.GONE

    attrs.recycle()
}



}