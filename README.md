Utworzyć System Zażądzania produkatami:

Założenia:
- Baza danych zawierjąca wszystkie produkty w magazynie (może być to Lista)
- Umożliwąca wykonywanie podstawowych operacji:
    - dodawanie nowych produktów
    - usuwanie
    - wyszukiwanie
    - edycja*
    - podsumowanie infromacji o stanie magazynu



abstract class Product{
id <- musi być final <- utworzyć osobą klasę na generowanie id,
nazwa,
cena,
typ
}


Utworzyć System prostego sklepu:

Założenia:
- Komunikuje się z bazą danych by pobrac info o produktach i stanie
- Klient może przegladać asortyment dostępnych produktów
- Klient może dodać dostpne produkty do koszyka i kupić
- **dodaj plugin Key promoter X**

---

Utworzyć klasę shop która będzie komunikować się z bazą danych (w niej ma być logika związana z działaniem sklepu)
W stylu aktywnego menu (np: while/do while jak w kółko i krzyżyk)

Utworzyć klasę która będzie obłsugiwać wprowadzone przez użytkownika komendy

---
**Updates:**
- added unique ID generator