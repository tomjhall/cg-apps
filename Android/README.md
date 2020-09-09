# Instructions for Android SDK Deployment

Permutive recommends using Kotlin for the deployment of the Permutive SDK.
Please review the kotlin_usage.txt as well as the EventSchema.kt and PermutiveSDK.kt files within this repo in combination with the below steps.

## Download
Download the libraries into your project [Link](https://developer.permutive.com/docs/android#download)

```
//for androidx library version
implementation "com.permutive.android:core:1.5.1"
//Google Ad Library
implementation "com.permutive.android:google-ads:1.5.1"
//SDK Wrapper code
import com.permutive.choueirigroup.wrapper.*;
```

## Initialize the SDK
Initialise the SDK - [Link](https://developer.permutive.com/docs/android#initialise-the-sdk)

```
import PermutiveSDK
val permutive = createPermutive(this)
```

## Add additional Aliases
Add additional Aliases [OPTIONAL] 

Please ensure to use the same tag for the identity used on app and web.
```
val customAliases = listOf(
         Alias.create(tag="app-name",id="918635528918")
         )
   )
permutive.setIdentity(customAliases)
```

##  Set Developer Mode On
Enable debug logging while in debug mode to track any issue in logcat

```
permutive.setDeveloperMode(true)
```

## Create Pageview and/or Video Objects
Create the pageview and/or an video objects when you are ready to start tracking an event. 
We recommend creating this right before you are ready to submit the event to Permutive.

```
val pageView: Pageview = createPageviewEvent() //create a pageview object
val videoPlayEvent: VideoPlay = createVideoPlayEvent() //create a video object
```

## Track a Pageview Event
Track an Pageview Event - [Link](https://developer.permutive.com/docs/android#event-tracking)
```
val page = permutive.trackPage(pageView)
```

[Optional]
When a user moves half way down the page you can update the article debt.
```
 page.updatePercentageViewed(0.5f)
```

[Optional]
When the article / activity is moved to the background make sure to call;
```
page.pause()
page.resume()
```  

[Required]
When the user has finished with the page, make sure to call
```
page.close()
```
       
## Track a Video Event
Track an Video Event - [Link](https://developer.permutive.com/docs/android#event-tracking)

Ensure a page object has been created
```
val page = permutive.trackPage(pageView)
```

Track a video event when required. For example, the reference below should be send when the user presses play on the video itself.
```
val videoPlayEvent: VideoPlay = createSampleVideoPlayEvent()
page.trackVideoPlay(videoPlayEvent)
```

You can track other Video events with similar methods:
```
//Track a vidoe playing on the page:
val videoPlayEvent: VideoPlay = createVideoPlayEvent()
page.trackVideoPlay(videoPlayEvent)

//You can track other Video events with similar methods:
val videoPlayEvent: VideoProgress = createVideoProgressEvent()
page.trackVideoPlay(videoPlayEvent)

val videoPlayEvent: VideoEvent = createVideoEvent()
page.trackVideoPlay(VideoEvent)

val videoPlayEvent: VideoLoad = createVideoLoadEvent()
page.trackVideoPlay(VideoLoad)

val videoPlayEvent: VideoAdPlay = createVideoAdPlayEvent()
page.trackVideoPlay(VideoAdPlay)

val videoPlayEvent: VideoAdEvent = createVideoAdEvent()
page.trackVideoPlay(VideoAdEvent)

val videoPlayEvent: VideoAdClick = createVideoAdClickEvent()
page.trackVideoPlay(VideoAdClick)

val videoPlayEvent: VideoAdProgress = createVideoAdClickEvent()
page.trackVideoPlay(VideoAdProgress)
```

[Optional]
When the video / activity is moved to the background make sure to call;
```
page.pause()
page.resume()
```  

[Required]
When the user has finished with the page, make sure to call
```
page.close()
```

## Targeting with Google Ads for Display Ads
Targeting with Google Ads - [Link](https://developer.permutive.com/docs/android#custom-targeting-with-google-ads)

```
val adRequest = PublisherAdRequest.Builder().buildWithPermutiveTargeting(permutive)
```

## Get Segments to Target Video with Key Values
Targeting trough key value pairs

See below as an example of how you could include the Permutive segments at the right location. Please note that this is only an example and might need to be adjusted for your setup.

```
val currentSegments = permutive.currentSegments //List<Int>
currentSegments.forEach {
  log("The user is in segment: $it")
}
var tagURL = '...'; // your advertising.tag or advertising.schedule 
tagURL = tagURL.replace(/(cust_params[^&]+)/, '$1' + currentSegments);
```

