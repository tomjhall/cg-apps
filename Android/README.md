# Instructions for Android SDK Deployment

Permutive recommends using Kotlin for the deployment of the Permutive SDK.
Please review the kotlin_usage.txt as well as the EventSchema.kt and PermutiveSDK.kt files within this repo in combination with the below steps.

## Step 1
Download the libraries into your project [Link](https://developer.permutive.com/docs/android#download)

```
//for androidx library version
implementation "com.permutive.android:core:1.4.4"
//Google Ad Library
implementation "com.permutive.android:google-ads:1.4.4"
//SDK Wrapper code
import com.permutive.choueirigroup.wrapper.*;
```

## Step 2
Initialise the SDK - [Link](https://developer.permutive.com/docs/android#initialise-the-sdk)

```
import PermutiveSDK
val permutive = createPermutive(this)
```

## Step 2.5
Enable debug logging while in debug mode to track any issue in logcat

```
permutive.setDeveloperMode(true)
```

## Step 3
Create the pageview and/or an video objects when you are ready to start tracking an event. 
We recommend creating this right before you are ready to submit the event to Permutive.

```
val pageView: Pageview = createSamplePageviewEvent()
val videoPlayEvent: VideoPlay = createSampleVideoPlayEvent()
```

## Step 4
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
       
## Step 4
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
page.trackVideoPlay(X)
page.trackVideoProgress(X)
page.trackVideoEvent(X)
page.trackVideoLoad(X)
page.trackVideoAdPlay(X)
page.trackVideoAdProgress(X)
page.trackVideoAdEvent(X)
page.trackVideoAdClick(X)
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

## Step 5
Targeting with Google Ads - [Link](https://developer.permutive.com/docs/android#custom-targeting-with-google-ads)

```
val adRequest = PublisherAdRequest.Builder().buildWithPermutiveTargeting(permutive)
```
