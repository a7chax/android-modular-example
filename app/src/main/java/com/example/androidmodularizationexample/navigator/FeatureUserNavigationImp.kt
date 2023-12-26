package com.example.androidmodularizationexample.navigator

import android.app.Activity
import com.archax.lib.navigation.IFeatureUserNavigation
import com.archax.user.UserActivity
import javax.inject.Inject

class FeatureUserNavigationImp @Inject constructor():IFeatureUserNavigation
{
    override fun goToUserActivity(activity: Activity) {
        activity.startActivity(UserActivity.getIntent(activity));
    }
}