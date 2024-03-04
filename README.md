# Zusätzliche Übungsaufgaben OOP2

Schreiben Sie für alle Aufgaben JUnit Tests. Schreiben Sie die Tests zuerst und dann die Implementation. Orientieren Sie sich dazu an den AB und UB der Lerneinheiten.

Für alle Aufgaben gilt: Sie können alle Java-Mittel, welche Sie bereits kennengelernt haben, verwenden, ausser es ist ausdrücklich etwas anderes vermerkt.

Schreiben Sie Ihre Lösungen der Aufgaben in das Aufgaben-Package des Assignements, also z.B. `exceptions`, oder `collections`. Sie finden dort für jede Aufgabe ein eigenes Package: z.B. `aufgabe1`, `aufgabe2`, etc.

## Aufgaben

### 1. Exceptions
1. Schreiben Sie eine Klasse `MyIntParser`, welche die statische Methode `parse(String string)` besitzt. Parsen Sie den String mithilfe der Klasse `Integer` zu einem `int` und geben Sie diesen `int` Wert zurück. Fangen Sie die mögliche `NumberFormatException` ab und geben Sie im Fehlerfall stattdessen `0` zurück.
2. Schreiben Sie eine `NumberScanner` Klasse. Diese Klasse hat eine statische Methode `readInt()`, welche einen `int` liest und zurückgibt. Bei jedem Aufruf soll in dieser Methode ein neuer `java.util.Scanner` erzeugt werden. Mit diesem Scanner wird von `System.in` gelesen und nach dem Lesen und vor dem Verlassen der Methode wird der Scanner gleich wieder geschlossen. Sorgen Sie dafür, dass der Scanner immer geschlossen wird, auch wenn eine Exception geworfen wird.
3. Modifizieren Sie Ihre Klasse `MyIntParser` von oben. Schreiben Sie eine eigene **checked** Exception `WrongInputException` und werfen Sie diese Exception, falls etwas schiefläuft. Was müssen Sie alles verändern?
4. Bauen Sie das Szenario der LE01, Folien 19-22 mit **checked** Exceptions nach. Experimentieren Sie damit.


### 2. Collections
1. Variable Anzahl von Parametern (Varargs). Schreiben Sie eine Methode, die das Maximum einer beliebig langen Folge von int-Parametern berechnet und als Funktionswert zurückgibt.
2. Anagramme. Zwei Wörter sind Anagramme, wenn sie aus denselben Buchstaben in beliebiger anderer Reihenfolge bestehen (z.B. `"Maus"` und `"Saum"`). Schreiben Sie eine Methode `isAnagram(s1, s2)`, die prüft, ob die beiden Strings `s1` und `s2` Anagramme sind und das Ergebnis als `boolean`-Wert zurückgibt. Groß- und Kleinschreibung soll ignoriert werden.
3. Datenstruktur Stack. Schreiben Sie eine Klasse Stack für den Typ `int`. Diese Klassen soll zwei Operationen besitzen: `void push(int number)` und `int pop()`. Implementieren Sie den Stack mit einem Array. Der Stack hat eine fixe Kapazität von 100 Elementen. Mehr Informationen zum Stack finden Sie hier: https://en.wikipedia.org/wiki/Stack_(abstract_data_type) 
4. Arrays kopieren. In einer früheren Übung haben Sie die Klasse `Stack` mit einer fixen Kapazität von 100 Elementen geschrieben. Schreiben Sie den Stack so um, dass er nun mit einer beliebig vielen Elementen umgehen kann. Erweitern Sie die Klasse um die Methode `size`.
5. Schreiben Sie ein Programm, dass 6 zufällig generierte Lotto Zahlen (1 bis 49) ausgibt. Bedenken Sie dabei, jede Zahl darf nur einmal vorkommen! In diesem Programm soll es eine Methode geben, welche die folgende Signatur hat: `public Set<Integer> lotto()`. Verwenden Sie eine Set-Implementation, welche die Einfüge-Ordnung beibehält.
6. Ihr Programm soll eine Funktion enthalten, die einzelne römische Ziffern in die entsprechende Dezimalzahl umwandelt. Folgende Umrechnungstabelle soll implementiert werden: `I=1;V=5;X=10;L=50;C=100;D=500;M=1000`. Brauchen Sie zur Implementation dieses Programms eine `Map`. Schreiben Sie weiter eine Methode `allKeys`, welche die Liste der römischen Zahlen in der richtigen Reihenfolge ausgibt, also: `["I", "V", "X", "L", "C", "D", "M"]`.
7. Schreiben Sie eine eigene Klasse `Book`. Diese Klasse besitzt die beiden Attribute `title` (String) und `price` (float). Implementieren Sie in dieser Klasse das `java.lang.Comparable` Interface. Achten Sie darauf, dass es richtig parametrisiert ist. Wenn eine Liste von Büchern sortiert wird, dann soll aufsteigend nach dem Preis sortiert werden.
8. Datenstrukturen: Implementieren Sie eine eigene Klasse `Hashtable`. Diese Klasse soll das Interface `MinimalMap` implementieren. Auf diesem Interface sind folgende Methoden definiert: `void clear()`, `int size()`, `V put(K key, V value)` und `V get(K key)`. Die Klasse `Hashtable` soll intern einen `Object`-Array der Grösse 100 verwenden. Kollisionen müssen nicht behandelt werden. Tipp: Verwenden Sie die Methode `hashCode` der Keys und den einfachen Algorithmus zur Verteilung im Array, welcher auf den Folien der Lerneinheit 2 beschrieben ist.


### 3. Generics
1. Vergleiche. Implementieren Sie eine statische generische Methode `diff(s1, s2)`. Der generische Typ soll das `Comparable`-Interface implementieren. Die Methode liefert die folgende Werte:
  - Eine negative Zahl, wenn s1 < s2
  - 0 wenn, s1 == s2
  - Eine positive Zahl, wenn s1 > s2
2. Generics anwenden. In einer früheren Übung haben Sie die Klasse `Stack` für den `int`-Typ geschrieben. Schreiben Sie diese Klasse um, so dass Sie für beliebige Typen verwendbar ist. Verwenden Sie nun eine List statt einem Array zum Speichern der Elemente im innern des Stacks.
3. Datenstrukturen und Generics. Definieren Sie ein eigenes Interface `Set` und schreiben Sie eine Klasse `SetImpl`, welches dieses Interface implementiert. Das Interface enthält drei Methoden: `boolean add(T element)`, `boolean contains(T element)` und `List<T> elements()` (hier gibt es keine definierte Ordnung, aber die Liste soll nicht modifizierbar sein). Verwenden Sie zur Implementation der Klasse `SetImpl` die Datenstruktur `List`.
4. Generische Methoden. Schreiben Sie eine generische Methode `max(a)`, welche das grösste Element der Liste `a` zurückgibt. Die Elemente können von beliebigem Typ sein, müssen aber das Interface `Comparable<T>` implementiert haben.
5. Eine generische Klasse `GenericTyp1<Q>` definiert ein privates Attribut `objekt` vom Typ des Typparameters `Q`. Die Klasse soll nur über den parameterlosen Standard-Konstruktor verfügen und zur Aufnahme und Bereitstellung von Objekten die Methoden `setObjekt()` und `getObjekt()` definieren. Bilden Sie z.B. Instanzen der Klasse vom Typ `Integer` und `String` und zeigen Sie, dass eine Instanz der Klasse vom Typ Integer nur Objekte vom Typ Integer aufnehmen kann. Das Gleiche gilt für Instanzen vom Typ String.
6. Definieren Sie analog zur obigen Aufgabe eine generische Klasse `GenericTyp2<S>`, deren Konstruktor eine Referenz auf ein Objekt vom Typ des Typparameters `S` übergeben bekommt. Damit wird die Methode `setObjekt()` zur Aufnahme von Objekten nicht mehr benötigt. Sorgen Sie dafür, dass nur Objekte, welche das Interface `java.io.Serializable` implementieren in der Klasse `GenericTyp2` gespeichert werden können. Schreiben Sie zum Testen eine eigene Klasse, welche das `Serializable` Interface implementiert.
7. Schreiben Sie eine generische Methode, welche Varargs vom Typ `A` als Parameter nimmt, und ein `Set<A>` zurückgibt. Ist ein Element in der Parameterliste mehrfach enthalten, so soll eine `IllegalArgumentException` geworfen werden. Es kommt also nur ein Set zurück, wenn es in der Parameterliste keine Duplikate gibt. 


### 4. Lambdas und Methodenreferenzen
1. Schreiben Sie eine Lambda-Expression, welche sich dem Interface `java.util.function.Consumer` zuweisen lässt. Also z.B. `Consumer<Tomato> tomatoConsumer = ...`. Lösen Sie diese Übung auch für die folgenden Interfaces aus dem `java.util.function` Package: `BiConsumer`, `Supplier`, `UnaryOperator` und `Function`. Für diese Aufgabe braucht es keinen JUnit Test. Führen Sie die Lambda-Expressions jeweils in der Main-Methode aus, also `tomatoConsumer.accept(...)`.
2. Definieren Sie das generische funktionale Interface: `interface RechenOperation<X,Y> {  Y operation(X x1, X x2);  }`. Erzeugen Sie mehrere Lambda-Expressions vom Typ des Interface, um verschiedene Rechenoperationen durchzuführen. Speichern Sie die Referenzen der Operationen jeweils in einer Referenz vom Typ der `RechenOperation` ab.
3. Schreiben Sie eine Methode `StringSorter.reverse(String[] s)`, welche einen String Array mit der `Arrays.sort(array, comparator)` Methode sortiert. Der sortierte String Array wird zurückgegeben. Die Strings sollen lexikografisch, aber in absteigender Reihenfolge sortiert werden. Benutzen Sie dazu eine Lambda-Expression.
4. Sortieren eines String Arrays, wie oben. Die Strings sollen lexikografisch, aber case-insensitiv sortiert werden. Benutzen Sie zum Sortieren eine Methodenreferenz aus der Klasse String.
5. Schreiben Sie ein funktionales Interface `HalloJava`, welches die folgende Zuweisung und Aufruf zulässt: `HalloJava gruss = System.out::println; gruss.hallo("Hallo Java mit Methoden-Referenzen!");`. Für diese Aufgabe braucht es keinen JUnit Test.


### 5. Streams
Lösen Sie die folgenden Aufgaben mit Streams.
1. Schreiben Sie eine Klasse `Farbstift`. Die Klasse hat einen Konstruktor `Farbstift(String farbe, String productId)` und die Operationen `String getFarbe()` und `String getProductId()`. Erzeugen Sie eine Liste von Farbstiften mit verschiedenen Farben, pro Farbe gibt es eine `productId`. Zwei Farbstifte sind gleich, wenn sie die gleiche `productId` haben. Lösen Sie die folgenden Aufgaben mit Streams. Schreiben Sie die Lösung direkt in die Testklasse: 
   - Geben Sie vorkommenden Farben als Menge aus
   - Geben Sie alle Produkt-ID's sortiert aus
   - Geben Sie die Produkt-ID der grünen und roten Farbstifte sortiert und ohne Duplikate aus
   - Zählen Sie die Anzahl der roten Stifte
2. Wir erzeugen einen endlichen Stream von Strings. Schreiben Sie eine Klasse `Strings` und darin eine statische Operation `double lengthAverage(String[] strings)`, welche die durchschnittliche Länge der vorkommenden Strings berechnet. Tipp: Konsultieren Sie dazu die PL.
3. Schreiben Sie eine Klasse `Person`. Diese Klasse enthält den Namen einer Person. Es gibt also einen Konstruktor `Person(String name)` und die Methode `String getName()`. Erzeugen Sie eine Liste von Personen. Gruppieren Sie die Personen dieser Liste in zwei Gruppen: Die Gruppe mit einer ungeraden Länge des Namens und die mit der geraden Länge. Schreiben Sie eine statische Operation `Map<Boolean, List<Person>> group(List<Person> persons)` in die Klasse `Person`. Brauchen Sie dazu ausschliesslich Streams. Tipp: PL, Grouping.
4. Erzeugen Sie einen Stream von ganzen Zahlen von 1 bis 100. Summieren Sie diese Zahlen mit der Terminal-Operation `reduce`. Schreiben Sie Ihre Stream-Lösung direkt in eine Testklasse.
5. Erzeugen Sie einen Stream von Listen von ganzen Zahlen, also z.B.: `[[19, 2], [2, 3, 5], [2, 7, 11, 2]]`. Geben Sie die Menge der vorkommenden Zahlen als Set aus: `{ 2, 3, 5, 7, 11, 19}`. Verwenden Sie eine Set-Implementation, welche eine natürliche Ordnung verwendet. Schreiben Sie dazu die statische Methode `Set<Integer> Mapper.flat(List<List<Integer>> lists)`
6. Gleiche Aufgabe wie oben, aber jetzt mit einem Array von `int`-Arrays. Geben Sie die Zahlen statt als Set als geordneter `int`-Array zurück. Schreiben Sie diese statische Methode ebenfalls in die Klasse `Mapper`.
7. Erfinden Sie eine eigene Aufgabe analog der Transaction-Trader Aufgabe in den AB. Gegeben ist also eine Klasse (z.B. Transaction), welche eine Referenz auf eine andere Klasse (z.B. Trader) hat. Führen Sie Filtrierungen, Transformationen, etc. auf einem Stream solcher Elemente aus.

### 6. bis 8. JavaFX
Die Übung Tasky bietet viele Gelegenheiten zum Üben, darum gibt es zu JavaFX keine zusätzlichen Übungen.

### 9. I/O
1. Gehen Sie die Übung Tasky 7 nochmals durch. Lesen Sie Ihre Lösung des Übung. Falls Sie diese Übung nicht gemacht haben, programmieren Sie den Teil, welcher das File schreibt und liest. Dieser Teil der Aufgabe kann losgelöst vom Rest von Tasky gelöst werden. Überprüfen Sie Ihre Lösung mit der Videobesprechung.
2. Betrachten Sie den Code der Klasse `ch.fhnw.oop2.le.WordCountUtil` aus dem AB2 der LE10. Die Methode `readAllLines` verwendet die Methode `Files.readAllLines`. Schreiben Sie die Methode um, so dass sie einen `BufferedReader` verwendet. Achten Sie darauf, dass alle Resssourcen wieder geschlossen werden.
3. Lösen Sie die **Aufgabe 4 der Probe-MSP (LE10)**. Ersetzen Sie dann die Seperatoren in der Text-Datei. Verwenden Sie z.B. Kommas, oder Tabs. Verarbeiten Sie die Datei erneut.
4. Lesen Sie die Datei des Buches **Krieg und Frieden** (War and Peace, siehe `solution`) ein, Zeile für Zeile. Sie müssen nichts mit der jeweiligen Zeile machen, zählen Sie einfach die Anzahl der Zeilen. Achten Sie jeweils darauf, dass die Ressourcen wieder geschlossen werden. Programmieren Sie diese Aufgabe mit:
   - Der `Scanner` Klasse, brauchen Sie dazu `hasNextLine` und `nextLine`
   - Wieder mit der `Scanner` Klasse, brauchen aber jetzt `useDelimiter` und `tokens`
   - `BufferedReader` mit der `readLine` Methode
   - `BufferedReader` mit der `lines` Methode
   - Welcher Ansatz ist am schnellsten? Welche Variante finden Sie die bequemste, eleganteste?
5. Bauen Sie die Aufgabe 4 so um, dass sie ausschliesslich mit der `Scanner` Klasse funktioniert (also ohne eine Klasse des `io` Packages auskommt und kein `String.split` verwendet). Ist das bezüglich dem Aspekt Performance sinvoll?
6. Schreiben Sie eine Klasse mit einer Methode der folgenden Signatur: `public static Set<String> listZipContents(Path zipFile)`. Diese Methode liest den Inhalt einer ZIP-Datei und gibt als eine Menge von Strings zurück. Sorgen Sie auch hier dafür, dass alle Ressourcen geschlossen werden. Tipp: Lesen Sie das Kapitel 9.2.5 der PL.
 
### 10. Threads
Für die Lerneinheit 10 gibt es keine zusätzlichen Übungen.

### Basiswissen OOP1 (basics)
1. Array invertieren. Schreiben Sie eine Methode `invert(a)`, die die Reihenfolge der Elemente eines Arrays `a` umkehrt.
2. Iterator-Form der for-Anweisung (enhanced for loop). Schreiben Sie eine Methode `int negativeValues(int[] a) {...}`
die die Iterator-Form der for-Anweisung benutzt, um die Anzahl der negativen Elemente im Array a zu berechnen und als Funktionswert zurückzugeben.
3. Schreiben Sie eine Methode `int sum(int[][] a) {...}`, welche die Iterator-Form der for-Anweisung benutzt, um die Elemente des zweidimensionalen Arrays `a` aufzuaddieren und als Funktionswert zurückzugeben.
4. Domainnamen spiegeln. Schreiben Sie eine Methode `domain(adr)`, die eine E-Mail-Adresse `adr` als Parameter bekommt und den darin vorkommenden Domainnamen in seine Bestandteile zerlegt, in umgekehrter Reihenfolge wieder zusammensetzt und als String zurückgibt. Die Adresse `"hermann.maier@students.uni-linz.ac.at"` soll zum Ergebnis `"at.ac.uni-linz.students"` führen.
5. Namen umformatieren. Schreiben Sie ein Programm, das eine Liste von Namen (erster Vorname, zweiter Vorname, Nachname) laut folgenden Beispielen umformatiert: 
  - `Martin Rolf Ammerbacher` => `Ammerbacher, Martin R.`
  - `Roman Andreas Weizenhuber` => `Weizenhuber, Roman A.`
6. Ausgaberoutine mit variabler Anzahl von Parametern. Schreiben Sie eine Methode `static void print (String s, int[] val) {...}`, die den String `s` am Bildschirm ausgibt, vorher aber alle Vorkommen von `"$i"` in `s` durch `val[i]` ersetzt (`"$0"` soll z.B. durch `val[0]` ersetzt werden). Ist `i` größer als `val.length-1`, soll `"$i"` durch den leeren String ersetzt werden.
7. Vererbung. Schreiben Sie eine Klassenhierarchie für verschiedene Fahrzeuge (Fahrrad, Moped, Motorrad, PKW, LKW, ...). Überlegen Sie sich sinnvolle Attribute und Methoden. Welche Klassen sind abstrakt und welche konret?
8. Enumerationstypen, Unfallstatistik. Implementieren Sie einen Enumerationstyp für Wochentage sowie eine Klasse zur Verwaltung einer Unfallstatistik der laufenden Woche. Es soll eine Methode geben, um die Anzahl der Unfälle für einen bestimmten Wochentag zu inkrementieren, sowie eine Methode, um die Anzahl der Unfälle an einem bestimmten Wochentag abzufragen. Schreiben Sie wie immer JUnit-Tests.
9. Enumerationstypen, Arithmetische Operationen. Implementieren Sie eine Methode `int compute(int x, Operator op, int y) {...}`, die zwei Zahlen `x` und `y` gemäß der Operation `op` verknüpft und das Ergebnis liefert. `Operator` soll ein Enumerationstyp sein und die vier arithmetischen Operatoren (`+`, `-`, `*` und `/`) darstellen.


### Zum Knobeln
1. Lauflängencodierung. Die Lauflängencodierung (run length encoding) ist eine Komprimierungstechnik, bei der jede Zeichenfolge, die aus mehr als 2 gleichen Zeichen besteht, durch das Zeichen und die Länge der Folge codiert wird. Die Eingabe `"ABBCCCKKKKKKK"` wird zum Beispiel zu `"ABBC3K7"`. Schreiben Sie eine Methode, die einen Buchstaben-String nach diesem Verfahren codiert.
2. Mustersuche (Pattern Matching). Suchmuster werden oft durch eine Zeichenfolge beschrieben, die den Platzhalter `*` enthält. Ein `*` bedeutet eine möglicherweise leere Folge beliebiger Zeichen. Das Suchmuster `"T*.java"` passt also zum Text `"Test.java"`, aber auch zu `"T.java"`. Schreiben Sie eine Methode `static boolean matches(String t, String pat) {...}`, die prüft, ob das Muster `pat` zum Text `t` passt. Zur Vereinfachung dürfen Sie annehmen, dass `*` in `pat` höchstens einmal vorkommt.
