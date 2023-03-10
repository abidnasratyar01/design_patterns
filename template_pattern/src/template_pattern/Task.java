package template_pattern;

public abstract class Task {
	private AuditTrail auditTrail;

	public Task() {
		auditTrail = new AuditTrail();
	}
	
	public Task(AuditTrail audioTrail) {
		this.auditTrail = audioTrail;
	}
	
	public void execute() {
		auditTrail.record();
		
		 doExecute();
	}
	
	protected abstract void doExecute();
}
