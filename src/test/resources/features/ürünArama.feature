Feature: ürün arama

  Scenario Outline: ürün ara ve listele
    Given kullanıcı giriş giris butonuna tıklamalı
    And üye girişi sayfasına gelebilmeli "<username>" ve "<password>" ile giriş yapabilmeli
    And arama alanına "<ürün>" yaz
    And "<kategori>" seç
    When "<sıralama Sekli>" ne göre sıralamayı sec
    Then gelen ürün listesinde "<marka>" iceren kac tane ürün var sıfırdan büyük mü
    Examples:
      | username                | password | ürün  | kategori        | sıralama Sekli  | marka         |
      | ahmeterbay020@gmail.com | Ae123456 | kalem | Kurşun Kalemler | İsme göre [A-Z] | Bic Evolution |