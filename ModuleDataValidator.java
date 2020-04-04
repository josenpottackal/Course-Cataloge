public class ModuleDataValidator {
	
	private static final int levelLowerLimit = 3;
	private static final int levelUpperLimit = 6;
	private static final int moduleCodeLowerLimit = 100;
	private static final int moduleCodeUpperLimit = 999;
	private static final String deptCodeRegex = "[a-zA-z]{2}";
	
	// level must be in range levelLowerLimit and levelUpperLimit
	public static boolean validateLevel(int level) {
		return (level >= levelLowerLimit && level <= levelUpperLimit);
	}
	
	// module code must be in range moduleCodeLowerLimit and moduleCodeUpperLimit
	public static boolean validateCode(int code) {
		return (code >= moduleCodeLowerLimit && code <= moduleCodeUpperLimit);
	}

	// department code must be valid 2 letter code
	public static boolean validateDeptCode(String deptCode) {
		return deptCode.matches(deptCodeRegex) &&
				(deptCode.toLowerCase().equals("ma") || deptCode.toLowerCase().equals("cs"));
	}
	
	public static String getDepartmentFromCode(String deptCode) {
		return deptCode.toLowerCase().equals("ma")? "Mathematics" : "Computer Science";
	}

}
