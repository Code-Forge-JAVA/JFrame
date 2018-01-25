

jButtonOK.setText("Ok MDFK");// Set Text
jButtonNamesOK.setVisible(false); // show button
jButtonNamesOK.setEnabled(true); // Enable to react to event (makes gray)
jTextFieldNames.requestFocus(true);
jPanel1.requestFocusInWindow(); // Focus on on something else then on  texfield

jTextFieldNames.getText().isEmpty() //
jTextFieldNames.getText().lenght()


float numValue =  Float.parseFloat(jTextFieldNames.getText()) // From String To Number
String.valueOf(numValue) // toNumber from String


--->>>jTextArea
jTextAreaUserNames.append(jTextFieldNames.getText() + "\n"); // append text
jTextAreaUserNames.setText("");                              //lear All text area