# CustomToast

Custom your toast

### Step 1. Add the JitPack repository to your build file
#### Add it in your root build.gradle at the end of repositories:
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
### Step 2. Add the dependency
```
dependencies {
	compile 'com.github.Mafmudin:CustomToast:v1.0'
}
```

#### How to use Custom Toast
* i make it in 3 method you can use to build a custom toast
```
CustomToas.makeText(Context context, String message, int time).show();
```
first method you can use with default theme of toast

```
CustomToast.makeText(Context context, String message, int time, int gravity).show();
```
2nd method you can use to add the gravity, it will move your toast follow the gravity value that you input in this method

```
CustomToast.makeText(Context context, String message, int time, int gravity,
                                 int backgroundColor, int textColor).show();
```
3th method, you can add text color and background color to your toast
  
