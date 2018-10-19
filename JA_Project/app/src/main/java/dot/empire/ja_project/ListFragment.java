package dot.empire.ja_project;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;

/**
 * A simple {@link Fragment} subclass. Activities that contain this fragment must implement the to
 * handle interaction events. Uses {@Link AlertDialog}.
 *
 * @author Matthew Van der Bijl (xq9x2wv31)
 * @see android.app.AlertDialog.Builder
 */
public class ListFragment extends Fragment implements AdapterView.OnItemClickListener {

    /**
     * Available food and prices.
     */
    private String[] food;

    public ListFragment() {
        this.food = new String[]{
                String.format("R%.2f %s", 2.14f, "Hotdog"),
                String.format("R%.2f %s", 32.41f, "Sushi"),
                String.format("R%.2f %s", 42.77f, "Beverage"),
                String.format("R%.2f %s", 22.84f, "Coffee"),
                String.format("R%.2f %s", 52.46f, "Chips"),
        };
        Arrays.sort(food); // Why not
    }

    // 2.8
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(view.getContext(),
                R.layout.list_item, food);

        ListView listView = view.findViewById(R.id.listview);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        // Toast.makeText(view.getContext(), String.format("%s has food ordered", food[i].split(" ")[1]), Toast.LENGTH_SHORT).show();
        new AlertDialog.Builder(view.getContext()).setTitle("Item purchased")
                .setMessage(String.format("%s has food ordered", food[i].split(" ")[1]))
                .setIcon(android.R.drawable.ic_dialog_info)
                .show();
    }
    // End 2.8
}
