package greenglobal.lastdemo.entity;



import org.zkoss.bind.ValidationContext;
import org.zkoss.bind.validator.AbstractValidator;


public class UserValidator extends AbstractValidator {
	public void validate(ValidationContext ctx) {
		validateEmail(ctx,(String) ctx.getValidatorArg("email"));
		
	}
	private void validateEmail(final ValidationContext ctx,String email) {
		System.out.println(email);
		if (email == null) {
			addInvalidMessage(ctx,"Địa chỉ email không được bỏ trống.");
		}else{
			if(!email.trim().matches(".+@.+\\.[a-z]+")) {
				addInvalidMessage(ctx,"Địa chỉ email không đúng định dạng.");
			}
		}
		
	}
	
	
}
