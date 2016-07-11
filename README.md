# WaveProgressView

most powerful wave load view , you can custom  any style  by yourself .


The effect：

<img src="http://fanrunqi.github.io/images/WaveProgressView/7.gif" width = "380" height = "585"  />

# Usage

## dependency

> Gradle
```
compile 'cn.fanrunqi:waveprogress:1.0.0'
```
> Maven
```
<dependency>
  <groupId>cn.fanrunqi</groupId>
  <artifactId>waveprogress</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```

## layout


```
<cn.fanrunqi.waveprogress.WaveProgressView
                android:id="@+id/waveProgressbar"
                android:background="@drawable/circle"
                 <!--android:background="@drawable/bg_a"-->
                android:layout_width="130dp"
                android:layout_height="130dp" />
```

> "android:background" attribute is Use to define the shape of the view.

> you can use the shape.xml

```
<?xml version="1.0" encoding="utf-8"?>
<shape
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="oval">
    <solid android:color="#DDDDDD"/>
    <size android:width="150dp"
          android:height="150dp"/>

</shape>
```

> or ,use a picture like [xxx.png](https://github.com/fanrunqi/WaveProgressView/blob/master/app/src/main/res/drawable/bg_a.png)
.

**for scale the image without distortion，your photo should be square**.

## code


```
waveProgressbar.setCurrent(int currentProgress,String currentText); // 77, "788M/1024M"
waveProgressbar.setMaxProgress(int maxProgress);
waveProgressbar.setText(String mTextColor,int mTextSize);//"#FFFF00", 41
waveProgressbar.setWaveColor(String mWaveColor); //"#5b9ef4"

waveProgressbar.setWave(float mWaveHight,float mWaveWidth);
waveProgressbar.setmWaveSpeed(int mWaveSpeed);//The larger the value, the slower the vibration


```
