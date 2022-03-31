Gestion des stagiaires----------------------
Url     : http://codes-sources.commentcamarche.net/source/100929-gestion-des-stagiairesAuteur  : tlili_soufDate    : 28/02/2015
Licence :
=========

Ce document intitulé « Gestion des stagiaires » issu de CommentCaMarche
(codes-sources.commentcamarche.net) est mis à disposition sous les termes de
la licence Creative Commons. Vous pouvez copier, modifier des copies de cette
source, dans les conditions fixées par la licence, tant que cette note
apparaît clairement.

Description :
=============

Salut,durant mon stage au sein de la société Poste Tunisienne je propose
<br />
comme application &quot;gestion des stagiaires&quot; dont a quatres tâches princ
ipales:
<br />ajouter,rechercher,modifier,supprimer un stagiaire.
<br />
<br 
/>package dataBase; 
<br />
<br />import java.sql.Connection;
<br />import ja
va.sql.ResultSet;
<br />import java.sql.SQLException;
<br />import java.sql.St
atement;
<br />import javax.swing.JOptionPane;
<br />import javax.swing.table.
DefaultTableModel;
<br />
<br />public class Gestion_DB_Stagiaire {
<br /> St
ring query;
<br /> Statement statement;
<br /> ResultSet rset;
<br /> Connect
ion connexion;
<br /> public Gestion_DB_Stagiaire(){
<br />  DB_Connection.con
nect();
<br />  connexion=DB_Connection.getConnexion();
<br />  rset=null;
<b
r /> }
<br /> public DefaultTableModel rechercher(String entree){
<br />  
<b
r />  DefaultTableModel dt = new DefaultTableModel();
<br />  
<br />  try{
<
br />   dt.addColumn(&quot;CIN&quot;);
<br />   dt.addColumn(&quot;Nom&quot;);

<br />   dt.addColumn(&quot;Prenom&quot;);
<br />   dt.addColumn(&quot;Date na
issance&quot;);
<br />   dt.addColumn(&quot;Université&quot;);
<br />   dt.add
Column(&quot;Specialité&quot;);
<br />   String[] tab=entree.split(&quot; &quot
;);
<br />   statement=connexion.createStatement();
<br />   
<br />   for(in
t i=0,longeur=tab.length;i&lt;longeur;i++){
<br />    query=&quot;SELECT * FROM
 ajout WHERE CINStagiaire='&quot;+tab[i]+&quot;' OR nomStagiaire='&quot;+tab[i]+
&quot;' OR prenomStagiaire='&quot;+tab[i]+&quot;'&quot;;
<br />    rset=stateme
nt.executeQuery(query);
<br />   }
<br />   
<br />   while(rset.next()){
<b
r />    Object []tableau={rset.getString(&quot;CINStagiaire&quot;),rset.getStrin
g(&quot;nomStagiaire&quot;),rset.getString(&quot;prenomStagiaire&quot;),
<br />
      rset.getString(&quot;naissanceStagiaire&quot;),rset.getString(&quot;univer
siteStagiaire&quot;),rset.getString(&quot;specialtyStagiaire&quot;)};
<br />   
 dt.addRow(tableau);
<br />    
<br />    
<br />   }
<br />   
<br />   

<br />  }
<br />  
<br />  catch(SQLException ex){
<br />   ex.printStackTrac
e();
<br />   JOptionPane.showMessageDialog(null,&quot;Not Found&quot;,&quot;Me
ssage d?avertissement&quot;,JOptionPane.ERROR_MESSAGE);
<br />   
<br />  }
<
br />  
<br />  return dt;
<br /> }
<br /> public void ajouterStagiaire(Strin
g cin,String nom,String prenom,String naissance,String universite,String special
ty){
<br />  try{
<br />   statement=connexion.createStatement();
<br />   qu
ery=&quot;INSERT INTO ajout  VALUES('&quot;+cin+&quot;','&quot;+nom+&quot;','&qu
ot;+prenom+&quot;','&quot;+naissance+&quot;','&quot;+universite+&quot;','&quot;+
specialty+&quot;')&quot;;
<br />   statement.executeUpdate(query);
<br />   JO
ptionPane.showMessageDialog(null,&quot;Successfull Add&quot;,&quot;Message d?ave
rtissement&quot;,JOptionPane.INFORMATION_MESSAGE);
<br />  }
<br />  catch(SQL
Exception ex){
<br />   ex.printStackTrace();
<br />   JOptionPane.showMessage
Dialog(null,&quot;ERROR ADD INTO DB&quot;,&quot;Message d?avertissement&quot;,JO
ptionPane.ERROR_MESSAGE);
<br />   
<br />  }
<br /> }
<br /> public void su
pprimerStagiaire(String cin){
<br />  try{
<br />   
<br />   statement=conne
xion.createStatement();
<br />   query=&quot;DELETE FROM ajout WHERE CINStagiai
re='&quot;+cin+&quot;'&quot;;
<br />   statement.executeUpdate(query);
<br /> 
  JOptionPane.showMessageDialog(null,&quot;Successfull DELETE&quot;,&quot;Messag
e d?avertissement&quot;,JOptionPane.INFORMATION_MESSAGE);
<br />  }
<br />  ca
tch(SQLException ex){
<br />   ex.printStackTrace();
<br />   JOptionPane.show
MessageDialog(null,&quot;ERROR&quot;,&quot;Message d?avertissement&quot;,JOption
Pane.ERROR_MESSAGE);
<br />   
<br />  }
<br /> }
<br /> public void modifie
rStagiaire(String[] contenu){
<br />  try{
<br />   
<br />   statement=conne
xion.createStatement();
<br />   query=&quot;UPDATE ajout SET nomStagiaire='&qu
ot;+contenu[1]+&quot;',prenomStagiaire='&quot;+contenu[2]+&quot;' ,naissanceStag
iaire='&quot;+contenu[3]+&quot;',universiteStagiaire='&quot;+contenu[4]+&quot;',
specialtyStagiaire='&quot;+contenu[5]+&quot;'WHERE CINStagiaire='&quot;+contenu[
0]+&quot;'&quot;;
<br />   statement.executeUpdate(query);
<br />   JOptionPan
e.showMessageDialog(null,&quot;Successfull ALTER&quot;,&quot;Message d?avertisse
ment&quot;,JOptionPane.INFORMATION_MESSAGE);
<br />  }
<br />  catch(SQLExcept
ion ex){
<br />   ex.printStackTrace();
<br />   JOptionPane.showMessageDialog
(null,&quot;ERROR&quot;,&quot;Message d?avertissement&quot;,JOptionPane.ERROR_ME
SSAGE);
<br />   
<br />  }
<br /> }
<br /> 
<br /> 
<br /> public boolean
 verifier(String login,String password){
<br />  boolean test=false;
<br />  S
tring log = null,pass=null;
<br />  try{
<br />   statement=connexion.createSt
atement();
<br />   query=&quot;SELECT login,password FROM personnel&quot;;
<b
r />   rset=statement.executeQuery(query);
<br />   while(rset.next()|| (test==
true)){
<br />    log=rset.getString(&quot;login&quot;);
<br />    pass=rset.g
etString(&quot;password&quot;);
<br />    if(log.equals(login) && pass.equals(p
assword))
<br />     test=true;  
<br />   }
<br />  }
<br />  catch(SQLExce
ption ex){
<br />   
<br />  }
<br />  return test;
<br />
<br /> }
<br />
 
<br />}
