package de.lindenvalley.scalevideoview;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;

import de.lindenvalley.lib.ScalableType;
import de.lindenvalley.lib.ScaleTextureView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ScaleTextureView scaleView1 = (ScaleTextureView) findViewById(R.id.scale_view1);
        ScaleTextureView scaleView2 = (ScaleTextureView) findViewById(R.id.scale_view2);
        ScaleTextureView scaleView3 = (ScaleTextureView) findViewById(R.id.scale_view3);

        try {
            load(scaleView1, ScalableType.FIT_XY, R.raw.sample);
            load(scaleView2, ScalableType.CENTER_CROP, R.raw.sample);
            load(scaleView3, ScalableType.RIGHT_CENTER, R.raw.sample);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load(final ScaleTextureView scaleView, ScalableType type, int raw) throws IOException {
        scaleView.setRawData(raw);
        scaleView.setLooping(true);
        scaleView.setScalableType(type);
        scaleView.prepare(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                scaleView.setVisibility(View.VISIBLE);
                scaleView.start();
            }
        });
    }
}
