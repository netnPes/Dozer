package DirectMapping;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

public class TestDirectMapping {

	
	public static void main(String[] args) {
		DozerBeanMapper mapper = new DozerBeanMapper();
		Source src = new Source();
		src.setAttr1("attr1");
		src.setAttr2("attr2");
		//mapper.setMappingFiles(mappingFileUrls);
		
		Destination desc = mapper.map(src, Destination.class);
		System.out.println(desc.attr1+"  "+"   "+desc.attr2);

	}

}
