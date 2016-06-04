package com.example.wangy.espressotest.tests;

import android.app.Activity;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.example.wangy.espressotest.MainActivity;
import com.example.wangy.espressotest.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by wangy on 5/30/2016.
 */
        @RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivitytest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testText() {
//        String expectedText = "Hello World!";
//        onView(withId(R.id.textView)).check(matches(withText(expectedText)));
    }

    @Test
    public void sayHello() {
        //String expectedText = "Does this work??";
        onView(withId(R.id.editText)).perform(typeText("CSE 110"), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click(), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.button2)).perform(click(), ViewActions.closeSoftKeyboard());
        String expectedText = "011 ESC";
        onView(withId(R.id.textView)).check(matches(withText(expectedText)));
    }



}
