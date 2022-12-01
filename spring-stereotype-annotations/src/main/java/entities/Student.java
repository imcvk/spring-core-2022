package entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Student {
    @Value("12121")
    private int rollNo;
    @Value("Ramesh")
    private String name;
    @Value("#{friendList}")
    private List friendList;

    public List getFriendList() {
        return friendList;
    }

    public void setFriendList(List friendList) {
        this.friendList = friendList;
    }

    public Student() {
    }

    public Student(int rollNo, String name, List friendList) {
        this.rollNo = rollNo;
        this.name = name;
        this.friendList = friendList;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", friendList=" + friendList +
                '}';
    }
}
