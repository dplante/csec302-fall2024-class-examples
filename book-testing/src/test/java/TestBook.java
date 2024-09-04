import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

import dev.csec302.Book;

import org.junit.jupiter.api.Test;

class TestBook {
    private Book book;

    @BeforeEach 
    void setUp() {
        book = new Book("Dune", "Frank Herbert", 412);

    }

    @Test
    void testOpen() {
        assertEquals(true, book.openBook());
    }

    @Test
    void testClose() {
        assertEquals(false, book.closeBook());
    }

    @Test 
    void testBookmarkPage() {
        assertEquals(false, book.bookmarkPage());
    }

    @Test
    void testBookmarkPageWhenOpen() {
        assertEquals(false, book.openToBookmark());
        book.openBook();
        assertEquals(true, book.bookmarkPage());
        // jumbled two test cases
        book.closeBook();
        assertEquals(true, book.openToBookmark());
        assertEquals(1, book.getPageNumber());
    }

    @Test
    void testBookmarkBadPage() {
        // Edge case where out of bounds page number is passed in
        book.openBook();
        assertEquals(false, book.turnToPage(500));
        assertEquals(false, book.bookmarkPage());
    }


}

