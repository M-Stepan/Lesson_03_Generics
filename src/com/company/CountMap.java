package com.company;
import java.util.Map;

public interface CountMap<T> {

    // добавляет элемент в этот контейнер.
    void add(T item);

    //Возвращает количество добавлений данного элемента
    int getCount(T item);

    //Удаляет элемент и контейнера и возвращает количество его добавлений(до удаления)
    int remove(T item);

    //количество разных элементов
    int size();

    //Добавить все элементы из source в текущий контейнер, при совпадении ключей,     суммировать значения
    void addAll(CountMap<T> source);

    //Вернуть java.util.Map. ключ - добавленный элемент, значение - количество его добавлений
    Map<? extends T, Integer> toMap();

    //Тот же самый контракт как и toMap(), только всю информацию записать в destination
    void toMap(Map<? super T, Integer> destination);
}