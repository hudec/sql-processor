package org.sqlproc.sample.tutorial.model;

import java.util.Calendar;

public class Person extends PersonBase {
    public Person() {
    }

    public Person(Gender sex, Ssn ssn) {
        super(sex, ssn);
    }

    public Integer getAge() {
        if (getBirthDate() == null) {
            return null;
        }
        Calendar birth = Calendar.getInstance();
        birth.setTime(getBirthDate());

        Calendar today = Calendar.getInstance();
        // I wish we could use joda instead of this ugly
        int age = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR);

        Calendar birthDay = Calendar.getInstance();
        birthDay.set(Calendar.YEAR, today.get(Calendar.YEAR));
        birthDay.set(Calendar.MONTH, birth.get(Calendar.MONTH));
        birthDay.set(Calendar.DAY_OF_MONTH, birth.get(Calendar.DAY_OF_MONTH));
        birthDay.set(Calendar.HOUR_OF_DAY, 0);
        birthDay.set(Calendar.MINUTE, 0);
        birthDay.set(Calendar.SECOND, 0);
        birthDay.set(Calendar.MILLISECOND, 0);
        boolean birthDayIsAfter = birthDay.compareTo(today) > 0;
        if (birthDayIsAfter) {
            age -= 1;
        }

        return age;
    }

    public void setAge(int year, int month, int day) {
        Calendar birthDay = Calendar.getInstance();
        birthDay.set(Calendar.YEAR, year);
        birthDay.set(Calendar.MONTH, month);
        birthDay.set(Calendar.DAY_OF_MONTH, day);
        birthDay.set(Calendar.HOUR_OF_DAY, 0);
        birthDay.set(Calendar.MINUTE, 0);
        birthDay.set(Calendar.SECOND, 0);
        birthDay.set(Calendar.MILLISECOND, 0);
        setBirthDate(birthDay.getTime());
    }
}
