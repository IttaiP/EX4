package exercise.find.roots;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SuccessActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.success);

        Intent intent = getIntent();
        long num = intent.getLongExtra("original_number", 0);
        long root1 = intent.getLongExtra("root1", 0);
        long root2 = intent.getLongExtra("root2", 0);
        long elapsed = intent.getLongExtra("elapsed", 0);


        TextView text =  findViewById(R.id.TextSucces);
        String showString = String.valueOf(root1)+'*'+String.valueOf(root2)+"="+String.valueOf(num);
        text.setText(showString);

        text =  findViewById(R.id.elapsed);
        showString = String.valueOf(elapsed)+" miliseconds for calculation";
        text.setText(showString);



    }
}
