# Custom Toast

buat toast dengan tampilan yang berbeda

### langkah 1. tambahkan JitPack repository kedalam file ```build.gradle``` (root project)
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
### Langkah 2. tambahkan dependesi
```
dependencies {
	compile 'com.github.Mafmudin:CustomToast:v1.0'
}
```

#### cara menggunakan Custom Toast
* custom toast dibuat dalam 3 metode yang dapat digunakan , yaitu:

```
CustomToas.makeText(Context context, String message, int time).show();
```
metode pertama digunakan seperti umumnya toast

```
CustomToast.makeText(Context context, String message, int time, int gravity).show();
```
metode kedua, dapat ditambahkan gravity yang dapat digunakan untuk memindah posisi toas sesuai keinginan

```
CustomToast.makeText(Context context, String message, int time, int gravity,
                                 int backgroundColor, int textColor).show();
```
metode ketiga dapat mengubah warna tulisan dan warna latar
  
