package hus.oop.mynumbersystem;

import java.util.ArrayList;
import java.util.List;

public class NumberSystemController {
    private ANumber originalNumber;
    private List<NumberSystemConverter> converters; // Danh sách các converter theo observer pattern

    public NumberSystemController() {
        this.converters = new ArrayList<NumberSystemConverter>();
    }

    /**
     * Thêm vào converter để quan sát số ban đầu.
     * 
     * @param converter
     */
    public void registerConverter(NumberSystemConverter converter) {
        this.onStateChanged();
        this.converters.add(converter);
    }

    /**
     * Hủy quan sát số ban đầu của converter.
     * 
     * @param converter
     */
    public void unregisterConverter(NumberSystemConverter converter) {
        this.onStateChanged();
        this.converters.remove(converter);
    }

    /**
     * Khi có sự thay đổi trạng thái (biểu diễn số hoặc cơ số), thông báo cho tất cả
     * các converter đang ký quan sát để cập nhật lại trạng thái theo dữ liệu mới.
     */
    public void notifyConverters() {
        for (NumberSystemConverter numberSystemConverter : converters) {
            numberSystemConverter.update(originalNumber);
        }
    }

    public String getNumberPresentation() {
        return this.originalNumber.getNumberPresentation();
    }

    public void setNumberPresentation(String numberPresentation) {
        this.onStateChanged();
        this.originalNumber.setNumberPresentation(numberPresentation);
    }

    public int getRadix() {
        return this.originalNumber.getRadix();
    }

    public void setRadix(int radix) {
        this.onStateChanged();
        this.originalNumber.setRadix(radix);
    }

    /**
     * Được gọi khi có sự thay đổi về trạng thái (biểu diến số hoặc cơ số),
     * hàm này sẽ gọi hàm để thông báo cho tất cả các observer đang ký quan sát
     * cập nhật lại trạng thái.
     */
    private void onStateChanged() {
        this.notifyConverters();
    }
}
