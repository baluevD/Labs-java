package ru.spbstu.telematics.Baluev.lab02;

public interface IStack {
	
	 /**
     * Забирает элемент из стека. Элемент удаляется
     * @return
     */
    Object pop();

    /**
     * Кладет элемент в стек.
     * @param o
     */
    void push(Object o);

    /**
     * Возвращает размер очереди
     * @return
     */
    int size();
}