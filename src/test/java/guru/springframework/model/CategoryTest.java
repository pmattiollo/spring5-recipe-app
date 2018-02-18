package guru.springframework.model;

import org.junit.Before;
import org.junit.Test;

public class CategoryTest {

    Category category;

    @Before
    public void setUp() {
        category = new Category();
    }

    @Test
    public void getId() {
        category.setId(4L);
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getRecipes() {
    }
}