package com.kc.customview.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

import com.kc.customview.R;
import com.kc.customview.model.MyItems;

public class CustomItemView extends CardView {

    private ImageView leftImageView;
    private TextView textView;
    private ImageView chevronImage;

    TypedArray valueArray;

    public CustomItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        valueArray = context.obtainStyledAttributes(R.styleable.CustomItemView);
        init();

    }

    private void init() {
        instantiateViews();
        setValues();

    }

    private void setValues() {
        String name  = valueArray.getString(R.styleable.CustomItemView_text);
        Drawable image = valueArray.getDrawable(R.styleable.CustomItemView_image);
        Drawable imageChev = valueArray.getDrawable(R.styleable.CustomItemView_chevron_image);

        textView.setText(name);
        leftImageView.setImageDrawable(image);

        if(imageChev == null)
            chevronImage.setVisibility(View.GONE);
        else
            chevronImage.setImageDrawable(imageChev);

    }

    private void instantiateViews() {
        inflate(getContext(), R.layout.item_layout, this);
    }

    public void setupAttributes(MyItems item) {
        leftImageView.setImageResource(item.getImage());
        textView.setText(item.getText());
        if (item.isShowChevron()) {
            chevronImage.setVisibility(VISIBLE);
        }
        leftImageView.setColorFilter(item.getForegroundColor());
    }

}
