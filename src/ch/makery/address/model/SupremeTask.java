package ch.makery.address.model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SupremeTask {
	private final SimpleStringProperty id;
	private final SimpleStringProperty item;
	private final SimpleStringProperty billingProfile;
	private final SimpleStringProperty proxy;
	private final SimpleStringProperty mode;
	
	//Status Information
	private final SimpleStringProperty status;
	private final SimpleStringProperty statusRunning;
	private final SimpleStringProperty foundItem;
	private final SimpleStringProperty fetchingVariants;
	private final SimpleStringProperty addingToCart;
	private final SimpleStringProperty checkout;
	private final SimpleStringProperty checkedOut;
	private final SimpleStringProperty reCaptchaToken;
	private final SimpleStringProperty startTimer;
	private final SimpleStringProperty itemNotFound;
	
	public SupremeTask() {
        this(null, null, null, null, null, null);
    }
	
	public SupremeTask(String id, String item, String billingProfile, String proxy, String status, String mode) {
			this.id =  new SimpleStringProperty(id);
			this.item =  new SimpleStringProperty(item);
			this.billingProfile = new SimpleStringProperty(billingProfile);
			this.proxy =  new SimpleStringProperty(proxy);
			this.status =  new SimpleStringProperty(status);
			this.mode =  new SimpleStringProperty(mode);
			this.statusRunning = new SimpleStringProperty("Running");
			this.foundItem = new SimpleStringProperty("Item found");
			this.itemNotFound = new SimpleStringProperty("Item not found");
			this.addingToCart = new SimpleStringProperty("Adding to cart...");
			this.fetchingVariants = new SimpleStringProperty("Fetching variants.");
			this.checkout = new SimpleStringProperty("Checking out");
			this.reCaptchaToken = new SimpleStringProperty("Captcha required");
			this.checkedOut = new SimpleStringProperty("Check your email");
			this.startTimer = new SimpleStringProperty("Launching at: " + keywordInfo.getKeywordInfo().getStartTimer());
		}

		public String getId( ) {
			return id.get();
		}
		
		
		public StringProperty getIdProperty( ) {
			return id;
		}
		
		public StringProperty getIemProperty( ) {
			return item;
		}

		public StringProperty getBillingProperty( ) {
			return billingProfile;
		}
		
		public StringProperty getModeProperty() {
			return mode;
		}
		
		public StringProperty getProxyProperty( ) {
			return proxy;
		}
		
		public StringProperty getItemNotFoundProperty( ) {
			return itemNotFound;
		}
		
		public StringProperty getFetchingVariantsProperty( ) {
			return fetchingVariants;
		}
		
		public StringProperty getStatusProperty( ) {
			return status;
		}
		
		public StringProperty getStartTimerProperty( ) {
			return startTimer;
		}
		
		public StringProperty getStatusRunningProperty( ) {
			return statusRunning;
		}
		
		public StringProperty getFoundItemProperty( ) {
			return foundItem;
		}
		
		public StringProperty getRecaptchaTokenProperty( ) {
			return reCaptchaToken;
		}
		
		public StringProperty getAddingToCartProperty( ) {
			return addingToCart;
		}
		
		public StringProperty getCheckoutProperty( ) {
			return checkout;
		}
		
		public StringProperty getCheckedOutProperty() {
			return checkedOut;
		}
		
		public void setId(String id) {
			this.id.set(id);
		}
		
		public String getIem( ) {
			return item.get();
		}
		
		public String getMode( ) {
			return mode.get();
		}
		
		public void setMode(String mode) {
			this.mode.set(mode);
		}
		
		public void setItem(String item) {
			this.item.set(item);
		}
		

		public String getBillingProfile( ) {
			return billingProfile.get();
		}
		
		public void setBillingProfile(String billingProfile) {
			this.billingProfile.set(billingProfile);
		}
		
		public String getProxy( ) {
			return proxy.get();
		}
		
		public void setProxy(String proxy) {
			this.proxy.set(proxy);
		}
		
		@Override
		public String toString() {
			return "SupremeTask [id=" + id + ", item=" + item + ", billingProfile=" + billingProfile + ", proxy="
					+ proxy + ", mode=" + mode + ", status=" + status + ", statusRunning=" + statusRunning + "]";
		}

		public String getStatus( ) {
			return status.get();
		}
		
		public void setStatus(String status) {
			this.status.set(status);
		}
}
