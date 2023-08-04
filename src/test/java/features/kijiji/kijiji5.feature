Feature: Kijiji Ürün Sayfası


  Scenario: Ürün İlanını Twitter'da Paylaş Doğrulaması
    Given Kijiji websitesine eriş.
    And Adres olarak Hamiton seç.
    And Açılan sayfada Cars and vehicles seçeneği başlığındaki Cars and trucks a tıkla.
    And Price aralığını beş bin beş yüz elli beş ile beş bin beş yüz elli dokuz olarak doldur ve ara.
    And Gelen sonuçlarda en üstteki seçeneğe tıkla.
    Then Açılan sayfadaki twitter logosuna tıkla.
