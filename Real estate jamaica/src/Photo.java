
public class Photo {
	
	Photo   pic ; 
	Photo   capture ;
	public Photo getPic() {
		return pic;
	}
	public void setPic(Photo pic) {
		this.pic = pic;
	}
	public Photo getCapture() {
		return capture;
	}
	public void setCapture(Photo capture) {
		this.capture = capture;
	}
	@Override
	public String toString() {
		return "Photo [pic=" + pic + ", capture=" + capture + ", getPic()=" + getPic() + ", getCapture()="
				+ getCapture() + "]";
	}
	public Photo(Photo pic, Photo capture) {
		super();
		this.pic = pic;
		this.capture = capture;
	}    


}
