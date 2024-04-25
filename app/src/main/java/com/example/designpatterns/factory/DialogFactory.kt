package com.example.designpatterns.factory

import android.app.Dialog

object DialogFactory {

    fun createDialog(type : String) : MyDialog {
        return when (type){
            DialogEnum.CREATE_DIALOG.name -> MyDialog.CreateDialog
            else -> {
                MyDialog.ExitDialog
            }
        }
    }

}