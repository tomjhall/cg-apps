package com.permutive.choueirigroup.wrapper

import com.permutive.android.EventProperties
import java.util.*

data class Pageview(
    val category: String? = null,
    val dayOfWeek: String? = null,
    val publisher: String? = null,
    val searchTerm: String? = null,
    val subcategories: List<String>? = null,
    val timeOfDay: String? = null,
    val dmpproperty: String? = null,
    val dmtier: String? = null,
    val referrer: String? = null,
    val type: String? = null,
    val url: String? = null,
    val article: Article? = null,
    val browser: Browser? = null,
    val cars: Car? = null,
    val device: Device? = null,
    val music: Music? = null,
    val sports: Sport? = null,
    val broadcastMedia: BroadcastMedia? = null,
    val user: User? = null
) {
    fun toEventProperties(): EventProperties = eventPropertiesFromNullablePairs(
        "category" to category,
        "dayOfWeek" to dayOfWeek,
        "publisher" to publisher,
        "searchTerm" to searchTerm,
        "subcategories" to subcategories,
        "timeOfDay" to timeOfDay,
        "dmpproperty" to dmpproperty,
        "dmtier" to dmtier,
        "referrer" to referrer,
        "type" to type,
        "url" to url,
        "article" to article?.toEventProperties(),
        "browser" to browser?.toEventProperties(),
        "cars" to cars?.toEventProperties(),
        "device" to device?.toEventProperties(),
        "music" to music?.toEventProperties(),
        "sports" to sports?.toEventProperties(),
        "broadcastMedia" to broadcastMedia?.toEventProperties(),
        "user" to user?.toEventProperties(),
        "geo_info" to EventProperties.GEO_INFO,
        "isp_info" to EventProperties.ISP_INFO
    )
}

data class VideoPlay(
    val play_id: String? = null,
    val enriched_data: EnrichedData? = null,
    val video: Video? = null
) {
    fun toEventProperties(): EventProperties = eventPropertiesFromNullablePairs(
        "play_id" to play_id,
        "enriched_data" to enriched_data?.toEventProperties(),
        "video" to video?.toEventProperties()
    )
}

data class VideoProgress(
    val play_id: String? = null,
    val progress: Double? = null,
    val enriched_data: EnrichedData? = null,
    val video: Video? = null
) {
    fun toEventProperties(): EventProperties = eventPropertiesFromNullablePairs(
        "play_id" to play_id,
        "progress" to progress,
        "enriched_data" to enriched_data?.toEventProperties(),
        "video" to video?.toEventProperties()
    )
}

data class VideoEvent(
    val play_id: String? = null,
    val event: String? = null,
    val enriched_data: EnrichedData? = null,
    val video: Video? = null
) {
    fun toEventProperties(): EventProperties = eventPropertiesFromNullablePairs(
        "play_id" to play_id,
        "event" to event,
        "enriched_data" to enriched_data?.toEventProperties(),
        "video" to video?.toEventProperties()
    )
}

data class VideoLoad(
    val play_id: String? = null,
    val enriched_data: EnrichedData? = null,
    val video: Video? = null
) {
    fun toEventProperties(): EventProperties = eventPropertiesFromNullablePairs(
        "play_id" to play_id,
        "enriched_data" to enriched_data?.toEventProperties(),
        "video" to video?.toEventProperties()
    )
}

data class VideoAdPlay(
    val play_id: String? = null,
    val ad: Ad? = null,
    val enriched_data: EnrichedData? = null,
    val video: Video? = null
) {
    fun toEventProperties(): EventProperties = eventPropertiesFromNullablePairs(
        "play_id" to play_id,
        "ad" to ad?.toEventProperties(),
        "enriched_data" to enriched_data?.toEventProperties(),
        "video" to video?.toEventProperties()
    )
}

data class VideoAdEvent(
    val play_id: String? = null,
    val event: String? = null,
    val ad: Ad? = null,
    val enriched_data: EnrichedData? = null,
    val video: Video? = null
) {
    fun toEventProperties(): EventProperties = eventPropertiesFromNullablePairs(
        "play_id" to play_id,
        "event" to event,
        "ad" to ad?.toEventProperties(),
        "enriched_data" to enriched_data?.toEventProperties(),
        "video" to video?.toEventProperties()
    )
}

data class VideoAdClick(
    val play_id: String? = null,
    val ad: Ad? = null,
    val enriched_data: EnrichedData? = null,
    val video: Video? = null
) {
    fun toEventProperties(): EventProperties = eventPropertiesFromNullablePairs(
        "play_id" to play_id,
        "ad" to ad?.toEventProperties(),
        "enriched_data" to enriched_data?.toEventProperties(),
        "video" to video?.toEventProperties()
    )
}

data class VideoAdProgress(
    val play_id: String? = null,
    val progress: Double? = null,
    val ad: Ad? = null,
    val enriched_data: EnrichedData? = null,
    val video: Video? = null
) {
    fun toEventProperties(): EventProperties = eventPropertiesFromNullablePairs(
        "play_id" to play_id,
        "progress" to progress,
        "ad" to ad?.toEventProperties(),
        "enriched_data" to enriched_data?.toEventProperties(),
        "video" to video?.toEventProperties()
    )
}

data class Ad(
    val duration: Int? = null,
    val advertiser_name: String? = null,
    val advertiser_id: Long? = null,
    val order_name: String? = null,
    val order_id: Long? = null,
    val lineitem_name: String? = null,
    val lineitem_id: Long? = null,
    val creative_name: String? = null,
    val creative_id: Long? = null,
    val ad_id: String? = null,
    val title: String? = null,
    val video_type: String? = null
) {
    fun toEventProperties(): EventProperties = eventPropertiesFromNullablePairs(
        "duration" to duration,
        "advertiser_name" to advertiser_name,
        "advertiser_id" to advertiser_id,
        "order_name" to order_name,
        "order_id" to order_id,
        "lineitem_name" to lineitem_name,
        "lineitem_id" to lineitem_id,
        "creative_name" to creative_name,
        "creative_id" to creative_id,
        "ad_id" to ad_id,
        "title" to title,
        "video_type" to video_type
    )
}

data class Video(
    val duration: Double? = null,
    val name: String? = null,
    val video_id: String? = null,
    val description: List<String>? = null,
    val published_at: Date? = null
) {
    fun toEventProperties(): EventProperties = eventPropertiesFromNullablePairs(
        "duration" to duration,
        "name" to name,
        "video_id" to video_id,
        "description" to description,
        "published_at" to published_at
    )
}


data class EnrichedData(
    val tvchannel: String? = null,
    val season: String? = null,
    val episode: String? = null,
    val showGenre: List<String>? = null,
    val subGenre: String? = null,
    val language: String? = null,
    val keywords: List<String>? = null,
    val type: String? = null,
    val category: List<String>? = null,
    val subcategories: List<String>? = null
) {
    fun toEventProperties(): EventProperties = eventPropertiesFromNullablePairs(
        "tvchannel" to tvchannel,
        "season" to season,
        "episode" to episode,
        "showGenre" to showGenre,
        "subGenre" to subGenre,
        "language" to language,
        "keywords" to keywords,
        "type" to type,
        "category" to category,
        "subcategories" to subcategories
    )
}

data class Article(
    val authors: List<String>? = null,
    val category: String? = null,
    val competition: String? = null,
    val country: List<String>? = null,
    val edition: String? = null,
    val id: String? = null,
    val keywords: List<String>? = null,
    val language: String? = null,
    val match: String? = null,
    val player: List<String>? = null,
    val publishedAt: Date? = null,
    val sport: String? = null,
    val subcategories: List<String>? = null,
    val subcategory: String? = null,
    val team: List<String>? = null,
    val topic: String? = null,
    val type: String? = null,
    val title: String? = null
) {
    fun toEventProperties(): EventProperties = eventPropertiesFromNullablePairs(
        "authors" to authors,
        "category" to category,
        "competition" to competition,
        "country" to country,
        "edition" to edition,
        "id" to id,
        "keywords" to keywords,
        "language" to language,
        "match" to match,
        "player" to player,
        "publishedAt" to publishedAt,
        "sport" to sport,
        "subcategories" to subcategories,
        "subcategory" to subcategory,
        "team" to team,
        "topic" to topic,
        "type" to type,
        "title" to title
    )
}

data class Browser(
    val language: String? = null,
    val type: String? = null
) {
    fun toEventProperties(): EventProperties = eventPropertiesFromNullablePairs(
        "language" to language,
        "type" to type
    )
}

data class Car(
    val carbrand: String? = null,
    val carmodel: String? = null
) {
    fun toEventProperties(): EventProperties = eventPropertiesFromNullablePairs(
        "carbrand" to carbrand,
        "carmodel" to carmodel
    )
}

data class Device(
    val brand: String? = null,
    val carrier: String? = null,
    val connectionType: String? = null,
    val type: String? = null
) {
    fun toEventProperties(): EventProperties = eventPropertiesFromNullablePairs(
        "brand" to brand,
        "carrier" to carrier,
        "connectionType" to connectionType,
        "type" to type
    )
}

data class Music(
    val genre: String? = null,
    val streamingHabits: String? = null
) {
    fun toEventProperties(): EventProperties = eventPropertiesFromNullablePairs(
        "genre" to genre,
        "streamingHabits" to streamingHabits
    )
}

data class Sport(
    val country: List<String>? = null,
    val competition: String? = null,
    val match: String? = null,
    val player: List<String>? = null,
    val team: List<String>? = null,
    val sport: String? = null
) {
    fun toEventProperties(): EventProperties = eventPropertiesFromNullablePairs(
        "country" to country,
        "competition" to competition,
        "match" to match,
        "player" to player,
        "team" to team,
        "sport" to sport
    )
}

data class BroadcastMedia(
    val episode: String? = null,
    val keywords: List<String>? = null,
    val language: String? = null,
    val series: String? = null,
    val showID: String? = null,
    val showGenre: List<String>? = null,
    val type: String? = null,
    val genre: String? = null,
    val season: String? = null,
    val showname: String? = null,
    val subGenre: String? = null,
    val tvchannel: String? = null
) {
    fun toEventProperties(): EventProperties = eventPropertiesFromNullablePairs(
        "episode" to episode,
        "keywords" to keywords,
        "language" to language,
        "series" to series,
        "showID" to showID,
        "showGenre" to showGenre,
        "type" to type,
        "genre" to genre,
        "season" to season,
        "showname" to showname,
        "subGenre" to subGenre,
        "tvchannel" to tvchannel
    )
}

data class User(
    val age: String? = null,
    val country: String? = null,
    val gender: String? = null,
    val nationality: String? = null
) {
    fun toEventProperties(): EventProperties = eventPropertiesFromNullablePairs(
        "age" to age,
        "country" to country,
        "gender" to gender,
        "nationality" to nationality
    )
}

private fun Array<Pair<String, Any?>>.filterOutNullValues(): Array<Pair<String, Any>> =
    asSequence()
        .mapNotNull { (k, v) ->
            if (v == null) {
                null
            } else {
                Pair(k, v)
            }
        }
        .toList()
        .toTypedArray()

private fun removeNulls(array: Array<out Pair<String, Any?>>): Array<Pair<String, Any>> =
    array
        .asSequence()
        .mapNotNull { (k, v) ->
            if (v == null) {
                null
            } else {
                Pair(k, v)
            }
        }
        .toList()
        .toTypedArray()

private fun eventPropertiesFromNullablePairs(vararg pairs: Pair<String, Any?>): EventProperties =
    EventProperties.from(*removeNulls(pairs))

