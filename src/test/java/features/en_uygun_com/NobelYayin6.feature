Feature: Nobel Yayin İnsan Kaynakları


  Scenario: Ürün İlanını Twitter'da Paylaş Doğrulaması
    Given Kijiji websitesine eriş.
    And Adres olarak Hamiton seç.
    And Açılan sayfada Cars and vehicles seçeneği başlığındaki Cars and trucks a tıkla.
    And Price aralığını 5555 ile 5559 olarak doldur ve ara.
    And Gelen sonuçlarda en üstteki seçeneğe tıkla.
    Then Açılan sayfadaki twitter logosuna tıkla.

  Scenario: Ürün İlanını Pinterest'te Paylaş Doğrulaması
    Given Kijiji websitesine eriş.
    And Adres olarak Hamiton seç.
    And Açılan sayfada Cars and vehicles seçeneği başlığındaki Cars and trucks a tıkla.
    And Price aralığını 5555 ile 5559 olarak doldur ve ara.
    And Gelen sonuçlarda en üstteki seçeneğe tıkla.
    Then Açılan sayfadaki pinterest butonuna tıkla.

  Scenario: Ürün İlanını E-mail İle Paylaş Doğrulaması
    Given Kijiji websitesine eriş.
    And Adres olarak Hamiton seç.
    And Açılan sayfada Cars and vehicles seçeneği başlığındaki Cars and trucks a tıkla.
    And Price aralığını 5555 ile 5559 olarak doldur ve ara.
    And Gelen sonuçlarda en üstteki seçeneğe tıkla.
    Then Açılan sayfadaki email butonuna tıkla.

  Scenario: Ürün İlanını Yazdır Doğrulaması
    Given Kijiji websitesine eriş.
    And Adres olarak Hamiton seç.
    And Açılan sayfada Cars and vehicles seçeneği başlığındaki Cars and trucks a tıkla.
    And Price aralığını 5555 ile 5559 olarak doldur ve ara.
    And Gelen sonuçlarda en üstteki seçeneğe tıkla.
    Then Açılan sayfadaki yazdırma logosuna tıkla.