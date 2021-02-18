package dark.suit.owl.linkedfa.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;

import dark.suit.owl.linkedfa.R;

public class NewPost extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_post);

        Button closeNewPost = findViewById(R.id.close_newpost_btn);
        Button attachPic = findViewById(R.id.attach_pic_newpost_btn);

        closeNewPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NewPost.this.finish();
            }
        });

        attachPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
    }

}