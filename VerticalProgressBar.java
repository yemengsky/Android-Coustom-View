import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/**
 * Function: VerticalProgressBar<br/>
 * Date: 2015-1-18 下午9:00:21 <br/>
 * 
 * @author YeMeng
 */
public class VerticalProgressBar extends ProgressBar {

	public VerticalProgressBar(Context context) {
		super(context);
	}

	public VerticalProgressBar(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public VerticalProgressBar(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	protected synchronized void onDraw(Canvas canvas) {
		// 旋转
		canvas.rotate(-90);
		canvas.translate(-this.getHeight(), 0);
		super.onDraw(canvas);
	}
}
