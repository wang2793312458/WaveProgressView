# WaveProgressView

most powerful wave load view , you can custom  any style  by this view .


The effect：

<img src="http://fanrunqi.github.io/images/7.gif" width = "380" height = "585"  />

# Usage

## Step 1

> Copy [WaveProgressView.java](https://github.com/fanrunqi/WaveProgressView/blob/master/library/src/main/java/cn/fanrunqi/library/WaveProgressView.java) to your project.

## Step 2

> use like this.

```
<cn.fanrunqi.library.WaveProgressView
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

## Step 3

> you can set more style in code.

```
waveProgressbar.setCurrent(int currentProgress,String currentText); // 77, "788M/1024M"
waveProgressbar.setMaxProgress(int maxProgress);
waveProgressbar.setText(String mTextColor,int mTextSize);//"#FFFF00", 41
waveProgressbar.setWaveColor(String mWaveColor); //"#5b9ef4"

waveProgressbar.setWave(float mWaveHight,float mWaveWidth);
waveProgressbar.setmWaveSpeed(int mWaveSpeed);//The larger the value, the slower the vibration


```
