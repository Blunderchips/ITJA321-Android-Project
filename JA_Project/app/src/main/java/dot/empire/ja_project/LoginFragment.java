package dot.empire.ja_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 *
 * @author Matthew Van der Bijl (xq9x3wv31)
 */
public class LoginFragment extends Fragment implements View.OnClickListener {

    private View parent;
    /**
     * Username.
     */
    private TextView txtName;
    /**
     * Password.
     */
    private TextView txtPasswd;

    /**
     * Required empty public constructor.
     */
    public LoginFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    // Inflate the layout for this fragment
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.parent = inflater.inflate(R.layout.layout_login, container, false);

        Button btnLogin = parent.findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);

        this.txtName = parent.findViewById(R.id.txtName);
        this.txtPasswd = parent.findViewById(R.id.txtPasswd);

        return parent;
    }

    @Override
    public void onClick(View view) {
        String name = txtName.getText().toString().trim();
        String passwd = txtPasswd.getText().toString().trim();

        if ((name.equals("bob") &&
                passwd.equals("1234"))
                || true) {
            Toast.makeText(parent.getContext(), String.format("Welcome %s!", name),
                    Toast.LENGTH_LONG).show();

//            FragmentTransaction transition = getFragmentManager().beginTransaction();
//            transition.replace(view.getId(), new ItemFragment());
//            transition.commit();
            view.getContext().startActivity(new Intent(view.getContext(), Order.class));
        }
    }
}
