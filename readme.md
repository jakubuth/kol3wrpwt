# Zadanie Domowe – Klasy Abstrakcyjne i Dziedziczenie w Java

## Ważne Uwagi

1. **Praca musi być samodzielna!**  
   Rozwiąż zadanie bez konsultacji z innymi. Rozmowy z kolegami, zadawanie pytań i odpowiadanie na pytania dotyczące tego zadania (zarówno w trakcie jego rozwiązywania, jak i po ukończeniu) będą uznane za brak samodzielności. Skutkuje to **brakiem możliwości otrzymania plusa za aktywność na ćwiczeniach**.

2. **Pomaganie innym**, nawet po ukończeniu zadania, również spowoduje utratę uzyskanego wcześniej plusa.

3. Zadanie należy rozwiązać w środowisku **IntelliJ IDEA**.

4. **Zrzut ekranu na dowód samodzielności:**
   - Otwórz dysk `z:` w swoim systemie.
   - Na zrzucie ekranu powinny być widoczne: 
     - wszystkie testy przechodzące (w zakładce testów IntelliJ IDEA, po rozwinięciu opcji `Show Passed`),  
     - Twój identyfikator użytkownika (login z systemu).  

5. Po wykonaniu zrzutu ekranu, **wyślij swoje rozwiązanie na GitHub**.

---

## Treść Zadań

# Wymagania do zadań programistycznych w języku Java

## Zadanie 1: Operacje arytmetyczne
Napisz metodę, która przyjmuje dwie liczby całkowite jako parametry i zwraca tablicę wyników zawierającą:
- Sumę,
- Różnicę,
- Iloczyn,
- Iloraz (jeśli dzielenie przez zero jest niemożliwe, zwróć 0).

---

## Zadanie 2: Sumowanie liczb
Napisz metodę, która przyjmuje dowolną liczbę argumentów (`varargs`) i zwraca sumę wszystkich liczb.

---

## Zadanie 3: Liczby pierwsze
Napisz metodę, która sprawdza, czy dana liczba całkowita jest liczbą pierwszą.  
Metoda zwraca `true`, jeśli liczba jest pierwsza, w przeciwnym razie `false`.

---

## Zadanie 5: Liczby parzyste i nieparzyste
Napisz metodę, która przyjmuje tablicę liczb całkowitych i zwraca tablicę dwuwymiarową:
- Pierwszy wiersz zawiera liczby parzyste,
- Drugi wiersz zawiera liczby nieparzyste.

---

## Zadanie 6: Znajdowanie minimum i maksimum
Napisz metodę, która przyjmuje dowolną liczbę argumentów (`varargs`) i zwraca tablicę zawierającą:
- Minimalną wartość,
- Maksymalną wartość.

---

## Zadanie 7: Klasy dziedziczące
Utwórz abstrakcyjną klasę `Vehicle` z abstrakcyjną metodą `move(String destination)`.  
Następnie utwórz klasy dziedziczące:
- `Car`, który implementuje metodę jako "Car is driving to [destination]",
- `Bicycle`, który implementuje metodę jako "Bicycle is cycling to [destination]".

---

## Zadanie 8: Obliczenia na prostokącie
Utwórz klasę `Rectangle` z dwoma metodami:
- `calculateArea(double width, double height)` - oblicza pole prostokąta,
- `calculatePerimeter(double width, double height)` - oblicza obwód prostokąta.

---

## Zadanie 9: Suma wierszy w macierzy
Napisz metodę, która przyjmuje tablicę dwuwymiarową liczb całkowitych i zwraca tablicę zawierającą sumy wierszy tej macierzy.

---

## Zadanie 10: Interfejsy
Utwórz interfejs `Shape` z dwoma metodami:
- `calculateArea()` - zwraca pole figury,
- `calculatePerimeter()` - zwraca obwód figury.

Następnie utwórz klasę `Square`, która implementuje ten interfejs i przyjmuje długość boku jako parametr konstruktora.

## Zadanie 11: Praca z plikami w Javie

Napisz klasę FileHandler , która:

1. Przyjmuje tekst jako parametr wejściowy.
2. Zapisuje ten tekst do pliku o nazwie `output.txt`.
3. Odczytuje dane z pliku i zwraca je jako string.

# Zadanie 12: Sortowanie po różnych polach

Napisz program, który:

1. Zawiera klasę `Person` reprezentującą osobę, która ma pola:
    - `name` (String),
    - `age` (int),
    - `salary` (double).

2. Zawiera klasę `PersonSorter`, która implementuje metody sortujące po różnych polach:
    - Sortowanie po nazwisku (alfabetycznie),
    - Sortowanie po wieku (rosnąco),
    - Sortowanie po wynagrodzeniu (malejąco).

3. Metody sortujące w klasie `PersonSorter` powinny przyjmować listę osób jako parametr i zwracać nową posortowaną listę, nie modyfikując oryginalnej listy.