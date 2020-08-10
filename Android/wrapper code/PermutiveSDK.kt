@file:JvmName("PermutiveSDK")
package com.permutive.choueirigroup.wrapper

import android.content.Context
import com.permutive.android.PageTracker
import com.permutive.android.Permutive
import com.permutive.android.aaid.AaidAliasProvider
import java.util.*

private const val projectId = "<PROJECT ID>"
private const val apiKey = "<API KEY>"

private var createdInstance = false

@Synchronized
fun createPermutive(context: Context): Permutive =
        if (createdInstance) {
            throw IllegalStateException("Permutive has already been created - this should be a singleton")
        } else {
            Permutive(
                context = context,
                projectId = UUID.fromString(projectId),
                apiKey = UUID.fromString(apiKey),
                aliasProviders = listOf(AaidAliasProvider(context))
            )
                .also { createdInstance = true }
        }

//Extension method helpers:
fun Permutive.trackPage(properties: Pageview): PageTracker =
    trackPage(properties.toEventProperties())

fun PageTracker.trackVideoPlay(properties: VideoPlay) {
    track("VideoPlay", properties.toEventProperties())
}

fun PageTracker.trackVideoProgress(properties: VideoProgress) {
    track("VideoProgress", properties.toEventProperties())
}

fun PageTracker.trackVideoEvent(properties: VideoEvent) {
    track("VideoEvent", properties.toEventProperties())
}

fun PageTracker.trackVideoLoad(properties: VideoLoad) {
    track("VideoLoad", properties.toEventProperties())
}

fun PageTracker.trackVideoAdPlay(properties: VideoAdPlay) {
    track("VideoAdPlay", properties.toEventProperties())
}

fun PageTracker.trackVideoAdProgress(properties: VideoAdProgress) {
    track("VideoAdProgress", properties.toEventProperties())
}

fun PageTracker.trackVideoAdEvent(properties: VideoAdEvent) {
    track("VideoAdEvent", properties.toEventProperties())
}

fun PageTracker.trackVideoAdClick(properties: VideoAdClick) {
    track("VideoAdClick", properties.toEventProperties())
}

