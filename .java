import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListExample {
    public static void main(String[] args) {
        // 1. Створити новий ArrayList, додати кілька кольорів і вивести колекцію
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println("Initial list of colors: " + colors);

        // 2. Ітерація через всі елементи ArrayList
        System.out.println("Iterating through the list:");
        for (String color : colors) {
            System.out.println(color);
        }

        // 3. Вставити елемент у ArrayList на першу позицію
        colors.add(0, "Yellow");
        System.out.println("After inserting Yellow at the first position: " + colors);

        // 4. Отримати елемент за заданим індексом
        String element = colors.get(2);
        System.out.println("Element at index 2: " + element);

        // 5. Оновити певний елемент масиву на заданий елемент
        colors.set(1, "Purple");
        System.out.println("After updating element at index 1 to Purple: " + colors);

        // 6. Видалити третій елемент з ArrayList
        colors.remove(2);
        System.out.println("After removing the third element: " + colors);

        // 7. Пошук елемента в ArrayList
        boolean containsGreen = colors.contains("Green");
        System.out.println("Does the list contain Green? " + containsGreen);

        // 8. Сортування ArrayList
        Collections.sort(colors);
        System.out.println("Sorted list of colors: " + colors);

        // 9. Копіювання одного ArrayList в інший
        ArrayList<String> newColors = new ArrayList<>(colors);
        System.out.println("Copied list: " + newColors);

        // 10. Реверс елементів у ArrayList
        Collections.reverse(colors);
        System.out.println("Reversed list of colors: " + colors);

        // 11. Порівняння двох ArrayList
        boolean areEqual = colors.equals(newColors);
        System.out.println("Are the two lists equal? " + areEqual);

        // 12. Очищення ArrayList
        colors.clear();
        System.out.println("After clearing the list: " + colors);

        // 13. Перевірка, чи ArrayList порожній
        boolean isEmpty = colors.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);

        // 14. Збільшення розміру ArrayList
        colors.ensureCapacity(20);
        colors.add("Pink");
        colors.add("Black");
        System.out.println("List after increasing capacity and adding elements: " + colors);

        // 15. Зменшення ємності ArrayList до поточного розміру
        colors.trimToSize();
        System.out.println("Trimmed list capacity to current size.");
    }
}
