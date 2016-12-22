ScaleVideoView
===========
Android Studio version: 2.2.3
Gradle version: 2.2.3

The Latest Version
------------------
VersionCode 1
VersionName "1.0"

Project description
-------------------
This library implements the Video Scaling for TextureView

 ![](https://github.com/brezenhem/ScaleVideoView/blob/master/screen1.png)
 
 Scaling types available:

    FIT_XY,
    FIT_START,
    FIT_CENTER,
    FIT_END,

    LEFT_TOP,
    LEFT_CENTER,
    LEFT_BOTTOM,
    CENTER_TOP,
    CENTER,
    CENTER_BOTTOM,
    RIGHT_TOP,
    RIGHT_CENTER,
    RIGHT_BOTTOM,

    LEFT_TOP_CROP,
    LEFT_CENTER_CROP,
    LEFT_BOTTOM_CROP,
    CENTER_TOP_CROP,
    CENTER_CROP,
    CENTER_BOTTOM_CROP,
    RIGHT_TOP_CROP,
    RIGHT_CENTER_CROP,
    RIGHT_BOTTOM_CROP,

    START_INSIDE,
    CENTER_INSIDE,
    END_INSIDE
 
How to use
----------
```
To use the widget, simply add this code to your xml layout:

    <de.lindenvalley.lib.ScaleTextureView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:id="@+id/scale_view"/>
        
ScaleTextureView scaleView = (ScaleTextureView) findViewById(R.id.scale_view);

scaleView.setRawData(raw);
scaleView.setLooping(true);
scaleView.setScalableType(ScalableType.CENTER_CROP);

scaleView.prepare(new MediaPlayer.OnPreparedListener() {
    @Override
    public void onPrepared(MediaPlayer mp) {
        scaleView.setVisibility(View.VISIBLE);
        scaleView.start();
    }
});
```
