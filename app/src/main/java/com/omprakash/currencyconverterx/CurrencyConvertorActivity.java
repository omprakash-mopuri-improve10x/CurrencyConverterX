package com.omprakash.currencyconverterx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.omprakash.currencyconverterx.databinding.ActivityCurrencyConvertorBinding;

import java.util.ArrayList;

public class CurrencyConvertorActivity extends AppCompatActivity {

    private ActivityCurrencyConvertorBinding binding;
    private ArrayList<String> currencies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCurrencyConvertorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setCurrencies();
        setupFromSpinner();
        setupToSpinner();
    }

    private void setCurrencies() {
        currencies = new ArrayList<>();
        currencies.add("Australian dollar (AUD)");
        currencies.add("Bulgarian Lev (BGN)");
        currencies.add("Brazilian real (BRL)");
        currencies.add("Canadian Dollar (CAD)");
        currencies.add("Swiss franc (CHF)");
        currencies.add("Chinese yuan renminbi (CNY)");
        currencies.add("Czech koruna (CZK)");
        currencies.add("Danish Krone (DKK)");
        currencies.add("Euro (EUR)");
        currencies.add("British pound sterling (GBP)");
        currencies.add("Hong Kong Dollar (HKD)");
        currencies.add("Croatian Kuna (HRK)");
        currencies.add("Hungarian forint (HUF)");
        currencies.add("Indonesian rupiah (IDR)");
        currencies.add("Israeli New Sheqel (Ils)");
        currencies.add("Indian Rupee (INR)");
        currencies.add("Iceland Krona (ISK)");
        currencies.add("Japanese yen (JPY)");
        currencies.add("Mexican peso (MXN)");
        currencies.add("Malaysian ringgit (MYR)");
        currencies.add("Norwegian krone (NOK)");
        currencies.add("New Zealand dollar(NZD)");
        currencies.add("Philippine peso (PHP)");
        currencies.add("Polish Zloty (PLN)");
        currencies.add("Romanian new leu (RON)");
        currencies.add("Russian Ruble (RUB)");
        currencies.add("Swedish Krona (SEK)");
        currencies.add("Singapore dollar (SGD)");
        currencies.add("Thai Baht (THB)");
        currencies.add("Turkish currency (TRY)");
        currencies.add("United States Dollar (USD)");
        currencies.add("South African rand (ZAR)");
    }

    private void setupFromSpinner() {
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, currencies);
        binding.fromSp.setAdapter(arrayAdapter);
        binding.fromSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void setupToSpinner() {
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, currencies);
        binding.toSp.setAdapter(arrayAdapter);
        binding.toSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}