package bit.minisys.minicc.parser.standardAST;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("FloatConstant")
public class ASTFloatConstant extends ASTExpression{
	public Double value;
	public Integer tokenId;
	
	public ASTFloatConstant() {
		super("FloatConstant");
	}
	public ASTFloatConstant(Double value,Integer tokenId) {
		super("FloatConstant");
		this.value = value;
		this.tokenId = tokenId;
	}
}
