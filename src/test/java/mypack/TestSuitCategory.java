package mypack;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(SlowTest.class)
@ExcludeCategory(FastTest.class)
@SuiteClasses({TestCaseA.class,TestCaseB.class})
public class TestSuitCategory {

}
