package hyk.springframework.springbootrecipeapp.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Htoo Yanant Khin
 */
class CategoryTest {
    Category category;

    @BeforeEach
    void setUp() {
        category = new Category();
    }

    @Test
    void getId() {
        Long id = 1L;
        category.setId(id);
        assertEquals(id, category.getId());
    }
}