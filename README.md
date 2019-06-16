# Material Toast

The usual Toasty, but with steroids :P

### Gradle

###### Groovy

- App module build.gradle file

```
implementation 'com.javiersc:materialtoast:1.0.1'
```

- Root build.gradle file (When this library is added to jCenter it will not be necessary)

```
allprojects {
    repositories {
         ...
         maven { url  "https://dl.bintray.com/javiersegoviacordoba/MaterialToast" } // Add this
    }
}
```

###### Kotlin DSL

- App module build.gradle.kts file

```
implementation("com.javiersc:materialtoast:1.0.1")
```

- Root build.gradle.kts file (When this library is added to jCenter it will not be necessary)

```
allprojects {
    repositories {
         ...
         maven("https://dl.bintray.com/javiersegoviacordoba/MaterialToast") // Add this
    }
}
```

### Status toasts
<br/>


| Normal                                                 | Success                                                |
|:-------------------------------------------------------|:-------------------------------------------------------|
| <img src="screenshots/screenshot (1).png" height="80"> | <img src="screenshots/screenshot (2).png" height="80"> |

| Warning                                                | Error                                                  |
|:-------------------------------------------------------|:-------------------------------------------------------|
| <img src="screenshots/screenshot (3).png" height="80"> | <img src="screenshots/screenshot (4).png" height="80"> |

###### Usage:

```
MaterialToast.normal(context, "Your text").show()

// You can use the Context extension function too
normal("Your text").show()

// Or if this is not the context
context.normal("Your text).show()
```

Similarly, you can use the other states with `warning(...)`, `error(...)`, etc.
For status toasts you can customize only the icon and duration.

They include default icons and a `Toast.LENGTH_LONG` duration.

### Stylized toasts

<br/>

| Example 1                                              | Example 2                                              |
|:-------------------------------------------------------|:-------------------------------------------------------|
| <img src="screenshots/screenshot (5).png" height="80"> | <img src="screenshots/screenshot (6).png" height="80"> |

| Example 3                                              |
|:-------------------------------------------------------|
| <img src="screenshots/screenshot (7).png" height="80"> |
 
###### Usage:

Create a `Stylized` and pass it as parameter of the stylized function.

Example 2 stylized:

```
val myStylized = Stylized().apply {
    message = textStylized
    messageColor = ContextCompat.getColor(this@MainActivity, R.color.stylizedText2)
    icon = ContextCompat.getDrawable(this@MainActivity, R.drawable.ic_stylized_2)
    iconTint = ContextCompat.getColor(this@MainActivity, R.color.stylizedIcon2)
    backgroundColor = ContextCompat.getColor(this@MainActivity, R.color.stylizedBackground2)
    strokeWidth = 2.dp
    strokeColor = ContextCompat.getColor(this@MainActivity, R.color.stylizedStroke2)
    shape = ToastShape.CUT
    radius = 8f.dp
}
stylized(myStylized).show()

// You can use the Context extension function too
stylized(myStylizedToast).show()

// Or if this is not the context
context.stylized(myStylizedToast).show()
```

##### Stylized properties

| Property        | Type       | Default value            | Values                       |
|:----------------|:-----------|:-------------------------|:-----------------------------|
| message         | String     | ""                       |                              |
| messageColor    | Int        | "#000000".toColorInt()   |                              |
| messageSize     | Float      | 14f.sp                   |                              |
| typeface        | Typeface   | Typeface.DEFAULT         |                              |
| icon            | Drawable?  | null                     |                              |
| iconTint        | Int        | "#000000".toColorInt()   |                              |
| backgroundColor | Int        | "#DFFFFFFF".toColorInt() |                              |
| elevation       | Float      | 0f                       |                              |
| strokeColor     | Int        | "#DFFFFFFF".toColorInt() |                              |
| strokeWidth     | Int        | 0                        |                              |
| radius          | Float      | 16f.dp                   |                              |
| offsetY         | Float      | 6f.dp                    |                              |
| shape           | ToastShape | ToastShape.ROUNDED       | ROUNDED and CUT              |
| duration        | Int        | Toast.LENGTH_LONG        | LENGTH_LONG and LENGTH_SHORT |

## App

Check [app module](app/src/main/java/com/javiersc/materialtoastdemo/MainActivity.kt) to see the code or compile this project to see in action

<br/><img src="screenshots/screenshot.png" height="450">

## Bonus

To programmatically change the dimensional values you can use some extensions included in this library. These extensions convert your values to pixels in an elegant way

For example, for a `Float` value equal to 4 dp
```
val myRadius: Float = 4f.dp 
val myTextSize: Float = 4f.sp
```
Similarly, for `Int` values

```
val myNumber: Int = 4.dp
```
