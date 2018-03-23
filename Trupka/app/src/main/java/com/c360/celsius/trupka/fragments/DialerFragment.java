package com.c360.celsius.trupka.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.c360.celsius.trupka.R;

/**
 * Created by dennisshar on 23/02/2018.
 */

public class DialerFragment extends Fragment {

    public final static String TAG = "DialerFragment";

    private View oneButton;
    private TextView oneButtonText;
    private ImageView oneButtonImage;
    private TextView oneButtonNumber;

    private View twoButton;
    private TextView twoButtonText;
    private ImageView twoButtonImage;
    private TextView twoButtonNumber;

    private View threeButton;
    private TextView threeButtonText;
    private ImageView threeButtonImage;
    private TextView threeButtonNumber;

    private View fourButton;
    private TextView fourButtonText;
    private ImageView fourButtonImage;
    private TextView fourButtonNumber;

    private View fiveButton;
    private TextView fiveButtonText;
    private ImageView fiveButtonImage;
    private TextView fiveButtonNumber;

    private View sixButton;
    private TextView sixButtonText;
    private ImageView sixButtonImage;
    private TextView sixButtonNumber;

    private View sevenButton;
    private TextView sevenButtonText;
    private ImageView sevenButtonImage;
    private TextView sevenButtonNumber;

    private View eightButton;
    private TextView eightButtonText;
    private ImageView eightButtonImage;
    private TextView eightButtonNumber;

    private View nineButton;
    private TextView nineButtonText;
    private ImageView nineButtonImage;
    private TextView nineButtonNumber;

    private View zeroButton;
    private TextView zeroButtonText;
    private ImageView zeroButtonImage;
    private TextView zeroButtonNumber;

    private View starButton;
    private View hashButton;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dialer, container, false);

        oneButton = (View) view.findViewById(R.id.one);
        oneButtonText = (TextView) oneButton.findViewById(R.id.button_text);
        oneButtonText.setVisibility(View.INVISIBLE);
        oneButtonImage = (ImageView) oneButton.findViewById(R.id.button_icon);
        oneButtonImage.setVisibility(View.VISIBLE);
        oneButtonNumber = (TextView) oneButton.findViewById(R.id.button_number);

        twoButton = (View) view.findViewById(R.id.two);
        twoButtonText = (TextView) twoButton.findViewById(R.id.button_text);
        twoButtonText.setVisibility(View.VISIBLE);
        twoButtonImage = (ImageView) twoButton.findViewById(R.id.button_icon);
        twoButtonImage.setVisibility(View.INVISIBLE);
        twoButtonNumber = (TextView) twoButton.findViewById(R.id.button_number);

        threeButton = (View) view.findViewById(R.id.three);
        threeButtonText = (TextView) threeButton.findViewById(R.id.button_text);
        threeButtonText.setVisibility(View.VISIBLE);
        threeButtonImage = (ImageView) threeButton.findViewById(R.id.button_icon);
        threeButtonImage.setVisibility(View.INVISIBLE);
        threeButtonNumber = (TextView) threeButton.findViewById(R.id.button_number);

        fourButton = (View) view.findViewById(R.id.four);
        fourButtonText = (TextView) fourButton.findViewById(R.id.button_text);
        fourButtonText.setVisibility(View.VISIBLE);
        fourButtonImage = (ImageView) fourButton.findViewById(R.id.button_icon);
        fourButtonImage.setVisibility(View.INVISIBLE);
        fourButtonNumber = (TextView) fourButton.findViewById(R.id.button_number);

        fiveButton = (View) view.findViewById(R.id.five);
        fiveButtonText = (TextView) fiveButton.findViewById(R.id.button_text);
        fiveButtonText.setVisibility(View.VISIBLE);
        fiveButtonImage = (ImageView) fiveButton.findViewById(R.id.button_icon);
        fiveButtonImage.setVisibility(View.INVISIBLE);
        fiveButtonNumber = (TextView) fiveButton.findViewById(R.id.button_number);

        sixButton = (View) view.findViewById(R.id.six);
        sixButtonText = (TextView) sixButton.findViewById(R.id.button_text);
        sixButtonText.setVisibility(View.VISIBLE);
        sixButtonImage = (ImageView) sixButton.findViewById(R.id.button_icon);
        sixButtonImage.setVisibility(View.INVISIBLE);
        sixButtonNumber = (TextView) sixButton.findViewById(R.id.button_number);

        sevenButton = (View) view.findViewById(R.id.seven);
        sevenButtonText = (TextView) sevenButton.findViewById(R.id.button_text);
        sevenButtonText.setVisibility(View.VISIBLE);
        sevenButtonImage = (ImageView) sevenButton.findViewById(R.id.button_icon);
        sevenButtonImage.setVisibility(View.INVISIBLE);
        sevenButtonNumber = (TextView) sevenButton.findViewById(R.id.button_number);

        eightButton = (View) view.findViewById(R.id.eight);
        eightButtonText = (TextView) eightButton.findViewById(R.id.button_text);
        eightButtonText.setVisibility(View.VISIBLE);
        eightButtonImage = (ImageView) eightButton.findViewById(R.id.button_icon);
        eightButtonImage.setVisibility(View.INVISIBLE);
        eightButtonNumber = (TextView) eightButton.findViewById(R.id.button_number);

        nineButton = (View) view.findViewById(R.id.nine);
        nineButtonText = (TextView) nineButton.findViewById(R.id.button_text);
        nineButtonText.setVisibility(View.VISIBLE);
        nineButtonImage = (ImageView) nineButton.findViewById(R.id.button_icon);
        nineButtonImage.setVisibility(View.INVISIBLE);
        nineButtonNumber = (TextView) nineButton.findViewById(R.id.button_number);

        zeroButton = (View) view.findViewById(R.id.zero);
        zeroButtonText = (TextView) zeroButton.findViewById(R.id.button_text);
        zeroButtonText.setVisibility(View.VISIBLE);
        zeroButtonImage = (ImageView) zeroButton.findViewById(R.id.button_icon);
        zeroButtonImage.setVisibility(View.INVISIBLE);
        zeroButtonNumber = (TextView) zeroButton.findViewById(R.id.button_number);

        starButton = (View) view.findViewById(R.id.star);
        hashButton = (View) view.findViewById(R.id.hashtag);

        return view;
    }
}
