

jButtonOK.setText("Ok");// Set Text
jButtonNamesOK.setVisible(false); // show button
jButtonNamesOK.setEnabled(true); // Enable to react to event (makes gray)
jTextFieldNames.requestFocus(true);
jPanel1.requestFocusInWindow(); // Focus on on something else then on  texfield

jTextFieldNames.getText().isEmpty(); //
jTextFieldNames.getText().lenght();


// convert datatypes
float numValueFloat =  Float.parseFloat(jTextFieldNames.getText()); // From String To Number
int numValueInt = Integer.parseInt(jTextFieldNames.getText());
String.valueOf(numValue) // toNumber from String
Double.toString(numValueFloat)


--->>>jTextArea
jTextAreaUserNames.append(jTextFieldNames.getText() + "\n"); // append text
jTextAreaUserNames.setText("");                              //lear All text area


-->>>jList
String name[] = {"Name Named","YourName YouNamed"};
    jList1.setListData(name);