package dot.empire.ja_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;

/**
 * Food ordering activity.
 * Created 26/09/2018
 *
 * @author Matthew Van der Bijl (xq9x3wv31)
 */
public class Order extends FragmentActivity {

    /**
     * Order button.
     */
    private Button btnOrderfood;
    /**
     * Button to log off.
     */
    private Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        // 2.5
        this.btnOrderfood = findViewById(R.id.btnOrderFood);
        this.btnLogout = findViewById(R.id.btnLogout);

        // 2.6
        this.btnOrderfood.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), List.class));
            }
        });
        this.btnLogout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), MainActivity.class));
            }
        });
    }
}
