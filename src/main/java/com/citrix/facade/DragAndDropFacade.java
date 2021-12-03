package com.citrix.facade;

import com.citrix.pages.DragAndDropPage;
import com.citrix.pages.HomePage;

public class DragAndDropFacade {

    public DragAndDropFacade navigateToDragAndDropPage() {
        new HomePage()
                .clickOnViews()
                .clickOnMenuItem("Drag and Drop");
        return this;
    }

    public DragAndDropPage getDragAndDropPage() {
        return new DragAndDropPage();
    }
}
