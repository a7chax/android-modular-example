package com.example.androidmodularizationexample.navigator

import android.app.Activity
import com.archax.guest.GuestActivity
import com.archax.lib.navigation.IFeatureGuestNavigation
import javax.inject.Inject

class FeatureGuestNavigationImp @Inject constructor() :IFeatureGuestNavigation   {
    override fun goToGuestActivity(activity: Activity) {
        activity.startActivity(GuestActivity.getIntent(activity));
    }
}