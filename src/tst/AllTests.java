package tst;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({InstanciacaoQuickSort.class,
				Ordenacao.class,
				Particionamento.class})
public class AllTests {

}