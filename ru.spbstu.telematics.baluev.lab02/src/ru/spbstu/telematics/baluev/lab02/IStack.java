package ru.spbstu.telematics.baluev.lab02;

public interface IStack {
	
	 /**
     * �������� ������� �� �����. ������� ���������
     * @return
     */
    Object pop();

    /**
     * ������ ������� � ����.
     * @param o
     */
    void push(Object o);

    /**
     * ���������� ������ �������
     * @return
     */
    int size();
}
