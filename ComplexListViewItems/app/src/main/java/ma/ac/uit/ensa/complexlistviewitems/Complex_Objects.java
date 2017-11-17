package ma.ac.uit.ensa.complexlistviewitems;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by ouissal on 10/12/17.
 */

class Complex_Objects
{
    //Button myButton;
    ImageView myImage;
    TextView myTextView;
    LinearLayout linearLayout;

    public Complex_Objects(ImageView myImage, TextView myTextView, LinearLayout linearLayout)
    {
        this.myImage =myImage ;
        this.myTextView = myTextView;
        this.linearLayout = linearLayout;

    }

    public void setImage(ImageView myImage)
    {
        this.myImage = myImage;
    }
    public void setTextView (TextView myTextView)
    {
        this.myTextView = myTextView;
    }

    public void setLinearLayout (LinearLayout linearLayout)
    {
        this.linearLayout = linearLayout;
    }

    public ImageView getImage()
    {
        return myImage;
    }
    public TextView getTextView ()
    {
        return myTextView;
    }

    public LinearLayout getLinearLayout (LinearLayout linearLayout)
    {
        return linearLayout;
    }


}
