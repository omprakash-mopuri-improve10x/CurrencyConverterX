package com.omprakash.currencyconverterx;

import org.junit.Test;

import static org.junit.Assert.*;

import com.google.gson.Gson;
import com.omprakash.currencyconverterx.model.Currency;
import com.omprakash.currencyconverterx.network.CurrencyApi;
import com.omprakash.currencyconverterx.network.CurrencyService;

import java.io.IOException;

import retrofit2.Call;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test

    public void fetchCurrencies () throws IOException {
        CurrencyApi currencyApi = new CurrencyApi();
        CurrencyService currencyService = currencyApi.createCurrencyService();
        Call<Currency> call = currencyService.fetchCurrencies();
        Currency currency = call.execute().body();
        assertNotNull(currency);
        System.out.println(new Gson().toJson(currency));
    }
}