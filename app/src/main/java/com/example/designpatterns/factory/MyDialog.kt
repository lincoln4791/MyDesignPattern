package com.example.designpatterns.factory

import android.app.Dialog

sealed class MyDialog{
    object CreateDialog : MyDialog()
    object ExitDialog : MyDialog()
}
