package com.avansas.step_def;

import com.avansas.pages.*;
import com.avansas.utilities.BrowserUtils;
import com.avansas.utilities.ConfigurationReader;
import com.avansas.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class ÜrünAramaStepDef {
    @Given("kullanıcı giriş giris butonuna tıklamalı")
    public void kullanıcı_giriş_giris_butonuna_tıklamalı() throws InterruptedException {
        String url = ConfigurationReader.get("url");

        Driver.get().get(url);

        new MainPage().üyeGirisi.click();
        Thread.sleep(1000);
    }

    @Given("üye girişi sayfasına gelebilmeli {string} ve {string} ile giriş yapabilmeli")
    public void üye_girişi_sayfasına_gelebilmeli_ve_ile_giriş_yapabilmeli(String username, String password) {
         new LoginPage().login(username, password);

    }

    @Given("arama alanına {string} yaz")
    public void arama_alanına_yaz(String ürün) {
        BrowserUtils.waitForVisibility(new MainPage().searchBox, 5);
        new MainPage().searchBox.sendKeys(ürün+ Keys.ENTER);

    }
    @Given("{string} seç")
    public void seç(String kategori) {
        new SearchPage().kategoriSec(kategori).click();

    }

    @When("{string} ne göre sıralamayı sec")
    public void ne_göre_sıralamayı_sec(String sıralamaSekli) {
        new KategoriPage().sıralama.click();
        new  KategoriPage().sıralamaSekli(sıralamaSekli).click();
    }

    @When("gelen ürün listesinde {string} iceren kac tane ürün var sıfırdan büyük mü")
    public void gelen_ürün_listesinde_iceren_kac_tane_ürün_var(String ürünIsmi) {
        System.out.println(new ÜrünPage().arananÜrünListesi(ürünIsmi).size());
        Assert.assertTrue( new ÜrünPage().arananÜrünListesi(ürünIsmi).size()>0);
    }




}
