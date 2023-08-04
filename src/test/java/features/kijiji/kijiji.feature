Feature: Kijiji Ürün Sayfası


  Scenario: Ürünü Satan Kişiye Mesaj Gönderme Doğrulaması
    Given Kijiji websitesine eriş.
    And Adres olarak Hamiton seç.
    And Açılan sayfada Cars and vehicles seçeneği başlığındaki Cars and trucks a tıkla.
    And Price aralığını beş bin beş yüz elli beş ile beş bin beş yüz elli dokuz olarak doldur ve ara.
    And Gelen sonuçlarda en üstteki seçeneğe tıkla.
    And Açılan sayfadaki mesaj gönder butonuna tıkla.
    Then Giriş penceresinin açıldığını doğrula.
