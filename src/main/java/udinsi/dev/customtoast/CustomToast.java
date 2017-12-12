package udinsi.dev.customtoast;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Dede on 11/12/2017.
 */

public class CustomToast{

    public static Toast makeText(Context context, String message, int time){
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.custom_toast, null);

        TextView text = (TextView) layout.findViewById(R.id.text);

        text.setText(message);
        Toast toast = new Toast(context);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(time);
        toast.setView(layout);
        return toast;
    }

    public static Toast makeText(Context context, String message, int time, int gravity){
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.custom_toast, null);

        TextView text = (TextView) layout.findViewById(R.id.text);
        text.setText(message);
        Toast toast = new Toast(context);
        toast.setGravity(gravity, 0, 0);
        toast.setDuration(time);
        toast.setView(layout);
        return toast;
    }

    public static Toast makeText(Context context, String message, int time, int gravity,
                                 int backgroundColor, int textColor){
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.custom_toast, null);

        TextView text = (TextView) layout.findViewById(R.id.text);
        LinearLayout customToast = (LinearLayout) layout.findViewById(R.id.custom_toast);
        GradientDrawable bgShape = (GradientDrawable)customToast.getBackground();

        bgShape.setColor(backgroundColor);
        text.setTextColor(textColor);

        text.setText(message);
        Toast toast = new Toast(context);
        toast.setGravity(gravity, 0, 0);
        toast.setDuration(time);
        toast.setView(layout);
        return toast;
    }
}
