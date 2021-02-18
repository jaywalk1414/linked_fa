package dark.suit.owl.linkedfa.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import dark.suit.owl.linkedfa.R;

public class ChatDirect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_direct);

        ImageView addNewChat = findViewById(R.id.image_chat_new);
        Button closeChat = findViewById(R.id.close_chat_btn);

        addNewChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(ChatDirect.this, "First Of all Follow Someone" , Toast.LENGTH_LONG).show();

            }
        });

        closeChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ChatDirect.this.finish();

            }
        });


    }
}