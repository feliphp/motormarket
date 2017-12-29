package motormarket.com.mx.motormarket;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.VideoView;
import android.widget.MediaController;
import android.util.Log;
import android.media.MediaPlayer;
import android.view.View;

import motormarket.com.mx.motormarket.R;

public class Video extends ActionBarActivity {

    String TAG = "com.example.VideoPlayer";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        final VideoView videoView =
                (VideoView) findViewById(R.id.videoView1);

        videoView.setVideoPath(
                "http://motormarket.com.mx/serviceIOS/mp4/NissanConcept.mp4");

        MediaController mediaController = new
                MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener()  {
      @Override
            public void onPrepared(MediaPlayer mp) {
                Log.i(TAG, "Duration = " +
                videoView.getDuration());
                }
            });

        videoView.start();
    }

    public void regresar(View v){
        Intent secundario= new Intent(this, MainActivity.class);
        startActivity(secundario);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.video, menu);
        return true;
    }

    @Override protected void onStart() {

        super.onStart(); final VideoView videoView = (VideoView) findViewById(R.id.videoView1);

        videoView.setVideoPath( "http://motormarket.com.mx/serviceIOS/mp4/NissanConcept.mp4");

        videoView.start();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
