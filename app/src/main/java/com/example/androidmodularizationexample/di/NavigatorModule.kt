package com.example.androidmodularizationexample.di

import com.archax.lib.navigation.*
import com.example.androidmodularizationexample.navigator.*
import dagger.*
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class NavigatorModule {

    @Provides
    fun provideFeatureUserNavigation(): IFeatureUserNavigation {
        return FeatureUserNavigationImp()
    }

    @Provides
    fun provideFeatureGuestNavigation(): IFeatureGuestNavigation {
        return FeatureGuestNavigationImp()
    }
}