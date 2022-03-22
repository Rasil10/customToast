# CustomToast
Library to show simple, lightweight, beautiful and Editable Toast for your Android project

# Usages
val customToast = CustomToast(context)


customToast.showSuccessToast("Success Toast :) ")

customToast.showErrorToast("Error Toast :( ")

customToast.showInfoToast("Informative Toast :p ")


# OPTIONAL 
// Gravity of Toast to show

customToast.gravity = Gravity.BOTTOM // Gravity Options

// Hide Icon of Toast.

customToast.hideIcon = true // false


// Hide Header of Toast.

customToast.hideHeader = true // false


// Change Background Color of Toast

 customToast.showSuccessToast(
            "Success Custom Toast message",
            ContextCompat.getColor(this,R.color.colorOfYourChoice)
        )
        
customToast.showErrorToast(
            "Error Custom Toast message",
            ContextCompat.getColor(this,R.color.colorOfYourChoice)
        )
        
 customToast.showInfoToast(
            "Informative Custom Toast message",
            ContextCompat.getColor(this,R.color.purple_500)
        )


![Screenshot_20220322-121338_Custom Toast](https://user-images.githubusercontent.com/17877939/159421448-a54358f0-e2a5-47ab-9c0e-60bce617b4c0.jpg)
      
![Screenshot_20220322-121349_Custom Toast](https://user-images.githubusercontent.com/17877939/159421553-68746dbb-7475-4722-af53-1ad268fbf291.jpg)

![Screenshot_20220322-121400_Custom Toast](https://user-images.githubusercontent.com/17877939/159421715-f8fdd9da-8fc5-4dd6-81b9-b5dfb001ff97.jpg)




