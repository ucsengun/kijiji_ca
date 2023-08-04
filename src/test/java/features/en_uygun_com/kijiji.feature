Feature: Nobel Yayin Feature

  Scenario:
    Given
    When Websayfasını aşağıya doğru kaydır.
    And Ana sayfanın site haritası kısmında yer alan İnsan Kaynakları butonuna tıkla.
    And Açılan kayıt formundaki bütün girdileri boş bırak.
    And Kayıt formunun alt kısmında yer alan Gönder butonuna tıkla.
    Then favorilere ekle

