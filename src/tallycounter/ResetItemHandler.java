/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallycounter;

import java.awt.event.*;
import counterapplication.*;

class ResetItemHandler implements ActionListener {
    
    private Counter counter;
    private TallyCounter view;
    
    public ResetItemHandler(Counter c, TallyCounter a) {
        counter = c;
        view = a;
    }
    
    public void actionPerformed(ActionEvent event){
        counter.reset();
        view.update();
    }
}
