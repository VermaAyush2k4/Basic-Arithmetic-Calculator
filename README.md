# Basic Arithmetic Calculator

Android app for performing arithmetic operations (+, -, ×, ÷) on two numbers

## Features
- Addition of two numbers
- Subtraction of two numbers
- Multiplication of two numbers
- Division of two numbers
- User-friendly interface
- Immediate calculation results
- Clean and modern UI design
- Error handling for invalid inputs

## Project Structure
```
basic(+,-)operationon2numbers/
├── .gradle/              # Gradle build cache
├── .idea/               # Android Studio project settings
├── app/                 # Main application code
│   └── src/main/       # Main source code
│       ├── java/       # Java source files
│       └── res/        # Resources
│           ├── layout/ # Layout files
│           ├── values/ # Strings, colors, dimensions
│           └── drawable/ # Images and drawables
├── build.gradle         # Project-level build configuration
├── gradle/             # Gradle wrapper
├── gradlew             # Gradle wrapper script
├── gradlew.bat         # Windows Gradle wrapper script
├── local.properties    # Local build properties
├── settings.gradle     # Project settings
└── README.md           # Project documentation
```

## Project Setup
1. Clone the repository
2. Open the project in Android Studio
3. Gradle will automatically sync dependencies
4. Build and run the application on an emulator or physical device

## Requirements
- Android Studio 4.0 or higher
- Android SDK with API Level 21 (Android 5.0) or higher
- Java Development Kit (JDK) 8 or higher
- Minimum Android API Level: 21 (Android 5.0)
- Recommended Android API Level: 30 (Android 11)

## Usage
1. Enter two numbers in the input fields
2. Choose the desired operation (addition or subtraction)
3. View the result immediately
4. Clear the input fields using the clear button

## Technical Details
- Built using Android Studio
- Uses Material Design components
- Implements MVVM architecture pattern
- Uses Data Binding for UI updates
- Includes unit tests for core functionality

## Contributing
Feel free to fork this repository and submit pull requests for improvements.

## Support
For any questions or issues, please create an issue in the GitHub repository.
