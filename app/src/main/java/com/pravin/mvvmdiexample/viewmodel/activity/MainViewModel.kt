package com.pravin.mvvmdiexample.viewmodel.activity

import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR
import com.pravin.mvvmdiexample.data.model.manager.DataManager
import com.pravin.mvvmdiexample.di.annotation.ActivityContext
import com.pravin.mvvmdiexample.view.navigator.MainActivityNavigator
import com.pravin.mvvmdiexample.viewmodel.base.BaseViewModel
import java.io.Serializable
import javax.inject.Inject

/**
 * Created by Pravin Divraniya on 11/20/2017.
 */
@ActivityContext
class MainViewModel @Inject constructor(dataManager: DataManager):
        BaseViewModel<MainActivityNavigator>(dataManager),Serializable{
    private var frgTitle = ""

    @Bindable
    fun getFrgTitle() = frgTitle

    fun setFrgTitle(value:String){
        frgTitle = value
        notifyPropertyChanged(BR.frgTitle)
    }
}