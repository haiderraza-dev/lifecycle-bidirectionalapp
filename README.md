# Android Activity Lifecycle & Bidirectional Intent App

This Android application demonstrates the Activity Lifecycle and two-way data communication between MainActivity and SecondActivity using explicit intents and the ActivityResultLauncher API.

## Features

### 1. Bidirectional Data Communication
* Users can enter a message in MainActivity and send it to SecondActivity through an explicit intent.
* The second screen receives and displays the message.
* Users can enter a reply and return it to the main screen using setResult().
* The second activity closes with finish(), and ActivityResultLauncher receives the reply and updates the main screen.

### 2. Activity Lifecycle Monitoring
Both activities log the seven standard lifecycle callback methods:
* onCreate()
* onStart()
* onResume()
* onPause()
* onStop()
* onDestroy()
* onRestart()

Lifecycle events appear in Android Studio's Logcat using the tag `LifecycleCallback`.

## Project Structure
* **Package Name:** `com.example.lifecyclebidirectionalapp`

### Java Files
* `MainActivity.java` — Sends messages to the second screen and receives replies.
* `SecondActivity.java` — Displays incoming messages and returns replies to the main screen.

### Layout Files
* `activity_main.xml` — Contains a message input, send button, and response display.
* `activity_second.xml` — Shows the received message and provides a reply input and button.

## How to View Lifecycle Logs
1. Connect an Android device or start an emulator in Android Studio.
2. Run the application.
3. Open the Logcat window.
4. Search for tag: `LifecycleCallback`.
5. Navigate between screens or use the Home and Back buttons to observe lifecycle events.

Lifecycle callback sequences may vary depending on user actions and Android system behavior. Rotating the device may also recreate an activity.

## Conclusion
This project demonstrates Android Activity Lifecycle callbacks and two-way communication between activities using explicit intents and ActivityResultLauncher. It provides a simple way to understand how Android activities exchange data and respond to lifecycle changes.
