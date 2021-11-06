package com.example.customcomponents

import android.content.Context
import android.util.AttributeSet
import android.util.TypedValue
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import java.util.jar.Attributes

class HeaderTextView constructor(context: Context,attributeSet: AttributeSet?): AppCompatTextView(context,attributeSet) {

    init{
        setTextSize(TypedValue.COMPLEX_UNIT_SP,resources.getDimension(R.dimen.title_header_size))
        setTextColor(ContextCompat.getColor(context,R.color.teal_700))
    }
}