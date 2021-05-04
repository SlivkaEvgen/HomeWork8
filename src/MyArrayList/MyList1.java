package MyArrayList;

public interface MyList1<E> {
    void add(E element); //добавляет элемент в конец
    void remove(int index); //удаляет элемент под индексом
    void clear();           //очищает коллекцию
    int size();             //возвращает размер коллекции
    E get(int index);       //возвращает элемент под индексом
}