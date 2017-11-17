package ma.ac.uit.ensa.complexlistviewitems;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class complexTextView extends ArrayAdapter<Complex_Objects>
{
    private ArrayList<Complex_Objects> ComplexObjects_Array;
    private Context context;
    private int resource;


    public complexTextView(Context context, ArrayList<Complex_Objects> ComplexObjects_Array)
    {
        super(context, 0,ComplexObjects_Array);

    }

    @Override
    public View getView(int position, View ConvertView, ViewGroup parent)
    {
        Complex_Objects myComplexObjects;

        if (ConvertView == null)
        {
            ConvertView = LayoutInflater.from(getContext()).inflate(R.layout.complexlayout, parent, false);

            myComplexObjects = new Complex_Objects(null, null, null);

            myComplexObjects.linearLayout = (LinearLayout) ConvertView.findViewById(R.id.linearLayout);
            myComplexObjects.myImage = (ImageView) ConvertView.findViewById(R.id.imageView);
            myComplexObjects.myTextView = (TextView) ConvertView.findViewById(R.id.textView2);

            ConvertView.setTag(myComplexObjects);
        }
        else
        {
            myComplexObjects = (Complex_Objects) ConvertView.getTag();
            ConvertView.setTag(myComplexObjects);
        }
        return ConvertView;
    }

}
