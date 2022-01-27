package my.panel.category.application.list;

import my.panel.category.constants.MyPanelCategoryPanelCategoryKeys;
import my.panel.category.constants.MyPanelCategoryPortletKeys;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.portal.kernel.model.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author jverweij
 */
@Component(
	immediate = true,
	property = {
		"panel.app.order:Integer=100",
		"panel.category.key=" + MyPanelCategoryPanelCategoryKeys.CONTROL_PANEL_CATEGORY
	},
	service = PanelApp.class
)
public class MyPanelCategoryPanelApp extends BasePanelApp {

	@Override
	public String getPortletId() {
		return MyPanelCategoryPortletKeys.MYPANELCATEGORY;
	}

	@Override
	@Reference(
		target = "(javax.portlet.name=" + MyPanelCategoryPortletKeys.MYPANELCATEGORY + ")",
		unbind = "-"
	)
	public void setPortlet(Portlet portlet) {
		super.setPortlet(portlet);
	}

}