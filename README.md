# SimpleTweet
SimpleTweet is an Android app using Java that allows a user to view their Twitter timeline and post a new tweet. The app utilizes the [Twitter API](https://dev.twitter.com/rest/public).

## Table of Contents
- [Description](#description)
- [Demo](#demo)
- [Installation](#installation)
- [Dependencies](#dependencies)
- [License](#license)

### Description

Some of the main features include:


- [x] User can sign in to Twitter using OAuth login
- [x]	User can view tweets from their home timeline
  - [x] User is displayed the username, name, and body for each tweet
  - [x] User is displayed the [relative timestamp](https://gist.github.com/nesquena/f786232f5ef72f6e10a7) for each tweet "8m", "7h"
- [x] User can refresh tweets timeline by pulling down to refresh
- [x] User can view more tweets as they scroll with infinite pagination
- [x] User can click links in tweets and launch the link in the web browser
- [x] User can **compose and post a new tweet**
  - [x] User can click a “Compose” icon in the Action Bar on the top right
  - [x] User can then enter a new tweet and post this to twitter

### Demo
#### Current Progress Walkthrough

<img src="https://github.com/kabirdhillon7/SimpleTweet/blob/master/Walkthrough%202.gif" width=250><br>

#### Progress 1 Walkthrough
<details>
  <img src="https://github.com/kabirdhillon7/SimpleTweet/blob/master/Walkthrough.gif" width=250><br>
</details>

## Installation

To install and set up the app on your own device, follow these steps:

### Prerequisites
- Android Studio 4.0 or later
- Android SDK and Emulator or physical Android device for testing
- Java Development Kit (JDK) 8 or later installed and configured with Android Studio
- Gradle 4.0 or later for building the project

### Cloning the repository

- Download and install the latest version of Android Studio.
- Clone this repository to your local machine using the following command in your terminal:
```
git clone https://github.com/kabirdhillon7/SimpleTweet.git
```
- Open Android Studio and click on "Open an existing Android Studio project".
- Navigate to the location where you cloned the repository, select the root folder of the project and click "OK".
- Wait for Android Studio to build the project and all its dependencies.
- Connect your Android device to your computer or use the Android emulator.
- In Android Studio, click on the "Run" button or press Shift+F10 to launch the app on your device.

## Dependencies

This app uses the following dependencies:

- [Android Async HTTP](https://github.com/codepath/CPAsyncHttpClient) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Android

## Contact

If you have any questions or feedback, you can reach me through the following channels:

- GitHub: [@kabirdhillon7](https://github.com/kabirdhillon7)
- LinkedIn: [Kabir Dhillon](https://www.linkedin.com/in/kabirdhillon/)

## License

    Copyright [yyyy] [name of copyright owner]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

