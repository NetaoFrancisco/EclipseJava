package TiposGenericos;

public class TestetandoGenerics {

		public static void main(String args[]) {
	
		CacheGenerico<String> cacheNome = new CacheGenerico<>();
		CacheGenerico<Integer> cachePortfolio = new CacheGenerico<>();
		CacheGenerico<Double> cachePCacheGenericoDouble = new CacheGenerico<Double>();
		
		cacheNome.setValue("Impacta");
		cachePortfolio.setValue(80);
		cachePCacheGenericoDouble.setValue(80.8);
		
		
		
		System.out.println("Nome: "+ cacheNome.getValue());
		System.out.println("Portifolio "+ cachePortfolio.getValue());
		System.out.printf("Portifolio  "+ cachePCacheGenericoDouble.getValue());
		}
}