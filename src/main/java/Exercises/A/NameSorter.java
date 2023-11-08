/*
 * © 2021 iteratec GmbH
 *
 * This file is distributed under the 3-clause BSD license.
 * See file LICENSE.md for details.
 */
package Exercises.A;

import java.util.Comparator;
import java.util.List;

public class NameSorter implements Sorter {

    @Override
    public List<Student> sort(List<Student> students) {
        NameComparator comparator = new NameComparator();
        students.sort(comparator);
        return students;
    }

    public static class NameComparator implements Comparator<Student>
    {
        public int compare(Student s1, Student s2)
        {
            return s1.name.compareTo(s2.name);
        }
    }
}
