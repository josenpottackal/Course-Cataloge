import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ModuleCatalog {

	private List<Module> modules;
	
	// Constructor with modules ArrayList
	public ModuleCatalog() {  
		modules = new ArrayList<Module>();
	}
	
	// 	Method which returns all modules in ArrayList "modules"
	public List<Module> getAllModules(){	
		return this.modules;
	}
	
	// Method which returns modules by level
	public List<Module> getModulesByLevel(int level){	
		List<Module> moduelsByLevel = modules.stream()
	        .filter(module -> module.getLevel() == level)
	        .collect(Collectors.toList());

		return moduelsByLevel;
	}
	
	// Method which returns modules by deptCode
	public List<Module> getModulesByDeptCode(String deptCode){	
		List<Module> moduelsByDeptCode = modules.stream()
	        .filter(module -> module.getDepartmentCode().equals(deptCode))
	        .collect(Collectors.toList());

		return moduelsByDeptCode;
	}
	
	// Method which tests dor unique code and returns boolean value
	public boolean uniqueCode(int code){	 
	    for (Module module: modules){
	        if (module.getCode() == code) {
	            return false;
	        }
	    }
		return true;
	}
	
	// Method which allows for new methods to be added
	public boolean addModule(int level, int code, String name, String deptCode) {
		try {
			if (ModuleDataValidator.validateLevel(level)
				&& ModuleDataValidator.validateDeptCode(deptCode)
				&& ModuleDataValidator.validateCode(code)
				&& uniqueCode(code)) {
				modules.add(new Module(level, code, name, deptCode, ModuleDataValidator.getDepartmentFromCode(deptCode)));
				return true;
			}
		} catch (Exception e) {
			return false;
		}
		return false;
	}
	
	// Returns String Output 
	public String formatCatalogList(List<Module> modules) {
		return modules.stream()
				.map(Module::toString)
				.collect(Collectors.joining(""));
	}
}
