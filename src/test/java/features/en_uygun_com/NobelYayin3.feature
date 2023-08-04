Feature: Nobel Yayin İnsan Kaynakları


  Scenario: Ürünü Favorilere Ekleme Doğrulaması
    Given Nobel Yayin websitesine eriş.
    And Websayfasını aşağıya doğru kaydır.
    And Ana sayfanın site haritası kısmında yer alan İnsan Kaynakları butonuna tıkla.
    And Açılan kayıt formundaki bütün girdileri yazarken geçersiz ad ile doldur.
    Then Kayıt formunun alt kısmında yer alan Gönder butonuna tıkla.
