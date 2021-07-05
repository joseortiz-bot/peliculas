package com.example.jose_kotlin.di

import android.content.Context
import com.example.jose_kotlin.MainActivity
import com.example.jose_kotlin.di.modules.ApiModule
import com.example.jose_kotlin.di.modules.AppModule
import com.example.jose_kotlin.ui.detail.DetailFragment
import com.example.jose_kotlin.ui.home.HomeFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, ApiModule::class])
interface AppComponent {

    // Factory to create instances of the AppComponent
    @Component.Factory
    interface Factory {
        // With @BindsInstance, the Context passed in will be available in the graph
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(activity: MainActivity)
    fun inject(fragment: HomeFragment)
    fun inject(fragment: DetailFragment)


}