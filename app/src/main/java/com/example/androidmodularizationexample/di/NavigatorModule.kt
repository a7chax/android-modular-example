package com.example.androidmodularizationexample.di

import com.archax.lib.navigation.IFeatureUserNavigation
import com.example.androidmodularizationexample.navigator.FeatureUserNavigationImp
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
}