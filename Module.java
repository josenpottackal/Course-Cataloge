public class Module {
	
	private String name;
	private int level;
	private String departmentCode;
	private int code;
	private String departmentName;
	
	public Module(int level, int code, String name, String departmentCode) {
		this.name = name;
		this.level = level;
		this.departmentCode = departmentCode;
		this.code = code;
		this.departmentName = departmentCode+"Department";
	}
	
	public Module(int level, int code, String name, String departmentCode, String departmentName) {
		this.name = name;
		this.level = level;
		this.departmentCode = departmentCode;
		this.code = code;
		this.departmentName = departmentName;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) throws Exception {
		this.level = level;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int moduleCode) {
		this.code = moduleCode;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer(departmentCode);
		sb.append(":");
		sb.append(level);
		sb.append("-");
		sb.append(code);
		sb.append(" ");
		sb.append(name);
		sb.append(" (");
		sb.append(departmentName);
		sb.append(")\n");
		return sb.toString();
	}
}
