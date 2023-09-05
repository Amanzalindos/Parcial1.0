package com.example.parcial1;

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner

import org.junit.Test;
import org.junit.runner.Assert.*
import static org.junit.Assert.*;
import org.junit.Rule
import org.junit.runner.RunWith
import androidx.test.ext.junit.rules.ActivityScenarioRule

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest {

    @get:Rule var activityTestScenarioRule = activityScenarioRule<MainActivity>()


    @Test
    fun ingresoDeDatos(){
        OnView(withId(R.id.etnombre))

    }

}