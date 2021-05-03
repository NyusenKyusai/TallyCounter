/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallycounter;

import java.awt.event.*;
import counterapplication.*;

class IncrementButtonHandler implements ActionListener {
    
    private Counter counter;
    private TallyCounter view;
    
    public IncrementButtonHandler(Counter c, TallyCounter a) {
        counter = c;
        view = a;
    }
    
    @Override
    public void actionPerformed(ActionEvent event){
        counter.increment();
        view.update();
    }
}
