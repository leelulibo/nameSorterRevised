//package UnitTests;
//
//import org.example.NameSorter;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//public class NameSorterTest {
//
//    @Test
//    public void testSortByLastName() {
//        // Test sorting by last name
//        NameSorter sorter = new NameSorter();
//        String[] unsortedNames = {"Janet Parsons", "Vaugh Lewis", "Adonis Julius Archer"};
//        String[] sortedNames = sorter.sortByLastName(unsortedNames);
//        assertArrayEquals(new String[]{"Adonis Julius Archer", "Vaugh Lewis", "Janet Parsons"}, sortedNames);
//    }
//
//    @Test
//    public void testSortByGivenNames() {
//        // Test sorting by given names
//        NameSorter sorter = new NameSorter();
//        String[] unsortedNames = {"Janet Parsons", "Vaugh Lewis", "Adonis Julius Archer"};
//        String[] sortedNames = sorter.sortByGivenNames(unsortedNames);
//        assertArrayEquals(new String[]{"Adonis Julius Archer", "Janet Parsons", "Vaugh Lewis"}, sortedNames);
//    }
//
//    @Test
//    public void testSortByMultipleGivenNames() {
//        // Test sorting by multiple given names
//        NameSorter sorter = new NameSorter();
//        String[] unsortedNames = {"Janet Parsons", "Vaugh Lewis", "Adonis Julius Archer"};
//        String[] sortedNames = sorter.sortByMultipleGivenNames(unsortedNames);
//        assertArrayEquals(new String[]{"Adonis Julius Archer", "Janet Parsons", "Vaugh Lewis"}, sortedNames);
//    }
//}
