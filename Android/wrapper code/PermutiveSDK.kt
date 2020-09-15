@file:JvmName("PermutiveSDK")
package com.permutive.choueirigroup.wrapper

import android.content.Context
import android.net.Uri
import com.permutive.android.PageTracker
import com.permutive.android.Permutive
import com.permutive.android.aaid.AaidAliasProvider
import java.util.*

private const val projectId = "f3a06674-ebb9-4b9d-ba8f-0052018c0687"
private const val apiKey = "4cb3c61b-8d82-42ab-b17b-29ee6b4d5548"

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
@JvmOverloads
fun Permutive.trackPage(pageView: Pageview,
                        title: String? = null,
                        url: Uri? = null,
                        referrer: Uri? = null): PageTracker =
    trackPage(
        pageView.toEventProperties(),
        title = title,
        url = url,
        referrer = referrer)

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

