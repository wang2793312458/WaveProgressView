package cn.fanrunqi.waveprogressview;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import cn.fanrunqi.waveprogress.WaveProgressView;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.waveProgressbar)
    WaveProgressView waveProgressbar;
    @InjectView(R.id.waveProgressbar2)
    WaveProgressView waveProgressbar2;
    @InjectView(R.id.waveProgressbar3)
    WaveProgressView waveProgressbar3;
    @InjectView(R.id.waveProgressbar4)
    WaveProgressView waveProgressbar4;
    @InjectView(R.id.bt)
    Button bt;
    private static final int one = 0X0001;
    private int progress;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            progress++;
            switch (msg.what) {
                case one:
                    if (progress <= 77) {
                        waveProgressbar.setCurrent(progress, progress + "%");
                        waveProgressbar3.setCurrent(progress, progress + "%");
                        waveProgressbar4.setCurrent(progress, progress + "%");
                        sendEmptyMessageDelayed(one, 100);
                    }
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        Init();
    }
    private void Init() {
        waveProgressbar2.setCurrent(77, "788M/1024M");
        waveProgressbar2.setWaveColor("#5b9ef4");
        waveProgressbar2.setText("#FFFF00", 41);

        waveProgressbar3.setWaveColor("#f0b55e");
        waveProgressbar4.setWaveColor("#61f25e");

    }

    @OnClick(R.id.bt)
    public void onClick() {
                handler.sendEmptyMessageDelayed(one, 1000);
    }
}
