Feature: Nobel Yayin İnsan Kaynakları


  Scenario: Ürünü Satan Kişiye Mesaj Gönderme Doğrulaması
    Given Kijiji websitesine eriş.
    And Adres olarak Hamiton seç.
    And Açılan sayfada Cars and vehicles seçeneği başlığındaki Cars and trucks a tıkla.
    And Price aralığını 5555 ile 5559 olarak doldur ve ara.
    And Gelen sonuçlarda en üstteki seçeneğe tıkla.
    Then Açılan sayfadaki mesaj gönder butonuna tıkla.

