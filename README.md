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
id,
nazwa,
cena,
typ
}


Utworzyć System prostego sklepu

Założenia:
- Komunikuje się z bazą danych by pobrac info o produktach i stanie
- Klient może przegladać asortyment dostępnych produktów
- Klient może dodać dostpne produkty do koszyka i kupić

---

**Updates:**
- added unique ID generator