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
    private TextView starButtonText;
    private ImageView starButtonImage;
    private TextView starButtonNumber;

    private View hashButton;
    private TextView hashButtonText;
    private ImageView hashButtonImage;
    private TextView hashButtonNumber;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dialer, container, false);

        oneButton = (View) view.findViewById(R.id.one);
        oneButtonText = (TextView) oneButton.findViewById(R.id.button_text);
        oneButtonText.setVisibility(View.INVISIBLE);
        oneButtonText.setText(getResources().getString(R.string.button_one_text));
        oneButtonImage = (ImageView) oneButton.findViewById(R.id.button_icon);
        oneButtonImage.setVisibility(View.INVISIBLE);
        oneButtonNumber = (TextView) oneButton.findViewById(R.id.button_number);
        oneButtonNumber.setText(getResources().getString(R.string.button_one_num));


        twoButton = (View) view.findViewById(R.id.two);
        twoButtonText = (TextView) twoButton.findViewById(R.id.button_text);
        twoButtonText.setVisibility(View.VISIBLE);
        twoButtonText.setText(getResources().getString(R.string.button_two_text));
        twoButtonImage = (ImageView) twoButton.findViewById(R.id.button_icon);
        twoButtonImage.setVisibility(View.INVISIBLE);
        twoButtonNumber = (TextView) twoButton.findViewById(R.id.button_number);
        twoButtonNumber.setText(getResources().getString(R.string.button_two_num));

        threeButton = (View) view.findViewById(R.id.three);
        threeButtonText = (TextView) threeButton.findViewById(R.id.button_text);
        threeButtonText.setVisibility(View.VISIBLE);
        threeButtonText.setText(getResources().getString(R.string.button_three_text));
        threeButtonImage = (ImageView) threeButton.findViewById(R.id.button_icon);
        threeButtonImage.setVisibility(View.INVISIBLE);
        threeButtonNumber = (TextView) threeButton.findViewById(R.id.button_number);
        threeButtonNumber.setText(getResources().getString(R.string.button_three_num));

        fourButton = (View) view.findViewById(R.id.four);
        fourButtonText = (TextView) fourButton.findViewById(R.id.button_text);
        fourButtonText.setVisibility(View.VISIBLE);
        fourButtonText.setText(getResources().getString(R.string.button_four_text));
        fourButtonImage = (ImageView) fourButton.findViewById(R.id.button_icon);
        fourButtonImage.setVisibility(View.INVISIBLE);
        fourButtonNumber = (TextView) fourButton.findViewById(R.id.button_number);
        fourButtonNumber.setText(getResources().getString(R.string.button_four_num));

        fiveButton = (View) view.findViewById(R.id.five);
        fiveButtonText = (TextView) fiveButton.findViewById(R.id.button_text);
        fiveButtonText.setVisibility(View.VISIBLE);
        fiveButtonText.setText(getResources().getString(R.string.button_five_text));
        fiveButtonImage = (ImageView) fiveButton.findViewById(R.id.button_icon);
        fiveButtonImage.setVisibility(View.INVISIBLE);
        fiveButtonNumber = (TextView) fiveButton.findViewById(R.id.button_number);
        fiveButtonNumber.setText(getResources().getString(R.string.button_five_num));

        sixButton = (View) view.findViewById(R.id.six);
        sixButtonText = (TextView) sixButton.findViewById(R.id.button_text);
        sixButtonText.setVisibility(View.VISIBLE);
        sixButtonText.setText(getResources().getString(R.string.button_six_text));
        sixButtonImage = (ImageView) sixButton.findViewById(R.id.button_icon);
        sixButtonImage.setVisibility(View.INVISIBLE);
        sixButtonNumber = (TextView) sixButton.findViewById(R.id.button_number);
        sixButtonNumber.setText(getResources().getString(R.string.button_six_num));

        sevenButton = (View) view.findViewById(R.id.seven);
        sevenButtonText = (TextView) sevenButton.findViewById(R.id.button_text);
        sevenButtonText.setVisibility(View.VISIBLE);
        sevenButtonText.setText(getResources().getString(R.string.button_seven_text));
        sevenButtonImage = (ImageView) sevenButton.findViewById(R.id.button_icon);
        sevenButtonImage.setVisibility(View.INVISIBLE);
        sevenButtonNumber = (TextView) sevenButton.findViewById(R.id.button_number);
        sevenButtonNumber.setText(getResources().getString(R.string.button_seven_num));

        eightButton = (View) view.findViewById(R.id.eight);
        eightButtonText = (TextView) eightButton.findViewById(R.id.button_text);
        eightButtonText.setVisibility(View.VISIBLE);
        eightButtonText.setText(getResources().getString(R.string.button_eight_text));
        eightButtonImage = (ImageView) eightButton.findViewById(R.id.button_icon);
        eightButtonImage.setVisibility(View.INVISIBLE);
        eightButtonNumber = (TextView) eightButton.findViewById(R.id.button_number);
        eightButtonNumber.setText(getResources().getString(R.string.button_eight_num));

        nineButton = (View) view.findViewById(R.id.nine);
        nineButtonText = (TextView) nineButton.findViewById(R.id.button_text);
        nineButtonText.setVisibility(View.VISIBLE);
        nineButtonText.setText(getResources().getString(R.string.button_nine_text));
        nineButtonImage = (ImageView) nineButton.findViewById(R.id.button_icon);
        nineButtonImage.setVisibility(View.INVISIBLE);
        nineButtonNumber = (TextView) nineButton.findViewById(R.id.button_number);
        nineButtonNumber.setText(getResources().getString(R.string.button_nine_num));

        zeroButton = (View) view.findViewById(R.id.zero);
        zeroButtonText = (TextView) zeroButton.findViewById(R.id.button_text);
        zeroButtonText.setVisibility(View.VISIBLE);
        zeroButtonText.setText(getResources().getString(R.string.button_zero_text));
        zeroButtonImage = (ImageView) zeroButton.findViewById(R.id.button_icon);
        zeroButtonImage.setVisibility(View.INVISIBLE);
        zeroButtonNumber = (TextView) zeroButton.findViewById(R.id.button_number);
        zeroButtonNumber.setText(getResources().getString(R.string.button_zero_num));

        starButton = (View) view.findViewById(R.id.star);
        starButtonText = (TextView) starButton.findViewById(R.id.button_text);
        starButtonText.setVisibility(View.VISIBLE);
        starButtonText.setVisibility(View.GONE);
        starButtonImage = (ImageView) starButton.findViewById(R.id.button_icon);
        starButtonImage.setVisibility(View.GONE);
        starButtonNumber = (TextView) starButton.findViewById(R.id.button_number);
        starButtonNumber.setText(getResources().getString(R.string.button_star_num));

        hashButton = (View) view.findViewById(R.id.hashtag);
        hashButtonText = (TextView) hashButton.findViewById(R.id.button_text);
        hashButtonText.setVisibility(View.VISIBLE);
        hashButtonText.setVisibility(View.GONE);
        hashButtonImage = (ImageView) hashButton.findViewById(R.id.button_icon);
        hashButtonImage.setVisibility(View.GONE);
        hashButtonNumber = (TextView) hashButton.findViewById(R.id.button_number);
        hashButtonNumber.setText(getResources().getString(R.string.button_hush_num));

        return view;
    }
}
