package src;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeoutException;

import javax.swing.Timer;

public class elevator {

	public static int lbl0queue=0;
	public static int lbl0queue0=0;
	public static String lbl0inside="[]";

	public static int lbl1all=0;
	public static int lbl1queue=0;
	public static String lbl1inside="[]";

	public static int lbl2all=0;
	public static int lbl2queue=0;
	public static String lbl2inside="[]";

	public static int lbl3all=0;
	public static int lbl3queue=0;
	public static String lbl3inside="[]";

	public static int lbl4all=0;
	public static int lbl4queue=0;
	public static String lbl4inside="[]";

	public static boolean lblAactive=false;
	public static boolean lblAmode=false;
	public static int lblAfloor=0;
	public static int lblAdestination=0;
	public static boolean lblAdirection=false;
	public static int lblAcapacity=10;
	public static int lblAcount_inside=0;
	public static String lblAinside="[]";
	
	public static boolean lblBactive=false;
	public static boolean lblBmode=false;
	public static int lblBfloor=0;
	public static int lblBdestination=0;
	public static boolean lblBdirection=false;
	public static int lblBcapacity=10;
	public static int lblBcount_inside=0;
	public static String lblBinside="[]";
	
	public static boolean lblCactive=false;
	public static boolean lblCmode=false;
	public static int lblCfloor=0;
	public static int lblCdestination=0;
	public static boolean lblCdirection=false;
	public static int lblCcapacity=10;
	public static int lblCcount_inside=0;
	public static String lblCinside="[]";
	
	public static boolean lblDactive=false;
	public static boolean lblDmode=false;
	public static int lblDfloor=0;
	public static int lblDdestination=0;
	public static boolean lblDdirection=false;
	public static int lblDcapacity=10;
	public static int lblDcount_inside=0;
	public static String lblDinside="[]";
	
	public static boolean lblEactive=false;
	public static boolean lblEmode=false;
	public static int lblEfloor=0;
	public static int lblEdestination=0;
	public static boolean lblEdirection=false;
	public static int lblEcapacity=10;
	public static int lblEcount_inside=0;
	public static String lblEinside="[]";
	
	public static int a=0;
	
	public static int x=0;
	public static int y=0;
	public static int z=0;
	public static int t=0;
	
	public static int lblexitCount=0;

	public static Random r = new Random();
	
	public static Thread login;
	
	public static Thread elv1;
	public static Thread elv2;
	public static Thread elv3;
	public static Thread elv4;
	public static Thread elv5;
	
	public static Thread exit;
	
	public static Thread kontrol;
	public static Thread kontrol2;
	
	public static Thread live;

	public static int one0=0;
	public static int two0=0;
	public static int three0=0;
	public static int four0=0;
	
	
	
	
	public static void start() {
		
		login = new Thread(){

			public void run(){
				
				while(true){
					
					int x=r.nextInt(10)+1;
					lbl0queue += x;
					
					
					lbl0inside=passengerLogin(x);
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						// TODO: handle exception
					}

			}
				
				}

			};
			exit = new Thread(){
				public void run(){
					
					while(true){
						
						try {
							Thread.sleep(1000);
						} catch (Exception e11) {
							// TODO Auto-generated catch block
							
						}
						
						int y=r.nextInt(5)+1;
						int[] diziE = new int[4];
						diziE=passengerExit(y);
						if(lbl1all > diziE[0])
						{
							lbl1queue += diziE[0];
						}
						if(lbl2all > diziE[1])
						{
							lbl2queue += diziE[1];
						}
						if(lbl3all > diziE[2])
						{
							lbl3queue += diziE[2];
						}
						if(lbl4all > diziE[3])
						{
							lbl4queue += diziE[3];
						}
						
						
						
						lbl1inside="[["+lbl1queue+", "+"0]]";
						lbl2inside="[["+lbl2queue+", "+"0]]";
						lbl3inside="[["+lbl3queue+", "+"0]]";
						lbl4inside="[["+lbl4queue+", "+"0]]";
						
						
						
						
						
						
				
					}

				}
				};
				elv1 = new Thread(){
						public void run(){
							
							while(true){
								
								if(one0>10){
									x=10;
								}
								if(one0<=10){
									x=one0%11;
								}
								lblAactive=true;
								lblAmode=true;
								lblAfloor=0;
								lblAdestination=1;
								lblAdirection=true;
								lblAcapacity=10;
								lblAcount_inside=x;
								lblAinside="["+"("+x+","+"1"+")"+"]";
								
								lbl0queue -= x;
								
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								
								lbl1all += x;
								one0 -= x;
								
								a=lbl1queue;
								lbl1queue -= lbl1queue%11;
								lbl1all -= a%11;
								
								
								lblAactive=true;
								lblAmode=true;
								lblAfloor=1;
								lblAdestination=0;
								lblAdirection=false;
								lblAcapacity=10;
								lblAcount_inside=a%11;
								lblAinside="["+"("+a%11+","+0+")"+"]";
								
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								
								lblexitCount += a%11;
								
								if(two0>10){
									y=10;
								}
								if(two0<=10){
									y=two0%11;
								}
								lblAfloor=0;
								lblAdestination=2;
								lblAdirection=true;
								lblAcapacity=10;
								lblAcount_inside=y;
								lblAinside="["+"("+y+","+"2"+")"+"]";
								
								lbl0queue -= y;
								
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								
								lblAfloor=1;
								lblAdestination=2;
								
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								
								lbl2all += y;
								two0 -= y;
								
								a=lbl2queue;
								lbl2queue -= lbl2queue%11;
								lbl2all -= a%11;
								
								lblAactive=true;
								lblAmode=true;
								lblAfloor=2;
								lblAdestination=0;
								lblAdirection=false;
								lblAcapacity=10;
								lblAcount_inside=a%11;
								lblAinside="["+"("+a%11+","+0+")"+"]";
								
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								
								lblAfloor=1;
								
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								
								lblexitCount += a%11;
								
								if(three0>10){
									z=10;
								}
								if(three0<=10){
									z=three0%11;
								}
								lblAfloor=0;
								lblAdestination=3;
								lblAdirection=true;
								lblAcapacity=10;
								lblAcount_inside=z;
								lblAinside="["+"("+z+","+"3"+")"+"]";
								
								lbl0queue -= z;
								
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								
								lblAfloor=1;
								
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								
								lblAfloor=2;
								
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								
								lbl3all += z;
								three0 -= z;
								
								a=lbl3queue;
								lbl3queue -= lbl3queue%11;
								lbl3all -= a%11;
								
								lblAactive=true;
								lblAmode=true;
								lblAfloor=3;
								lblAdestination=0;
								lblAdirection=false;
								lblAcapacity=10;
								lblAcount_inside=a%11;
								lblAinside="["+"("+a%11+","+0+")"+"]";
								
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								
								lblAfloor=2;
								
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								lblAfloor=1;
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								
								lblexitCount += a%11;
								
								if(four0>10){
									t=10;
								}
								if(four0<=10){
									t=four0%11;
								}
								lblAfloor=0;
								lblAdestination=4;
								lblAdirection=true;
								lblAcapacity=10;
								lblAcount_inside=t;
								lblAinside="["+"("+t+","+"4"+")"+"]";
								
								lbl0queue -= t;
								
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								lblAfloor=1;
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								lblAfloor=2;
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								lblAfloor=3;
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								
								lbl4all += t;
								four0 -= t;
								
								a=lbl4queue;
								lbl4queue -= lbl4queue%11;
								lbl4all -= a%11;
								
								
								lblAactive=true;
								lblAmode=true;
								lblAfloor=4;
								lblAdestination=0;
								lblAdirection=false;
								lblAcapacity=10;
								lblAcount_inside=a%11;
								lblAinside="["+"("+a%11+","+0+")"+"]";
								
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								lblAfloor=3;
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								lblAfloor=2;
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								lblAfloor=1;
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								lblAfloor=0;
								lblexitCount += a%11;
								
									
									}
												
									
							
							

						}
						};
				
				elv2 = new Thread(){
					public void run(){

						while(true){
							try {
								Thread.sleep(20);
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							
							if(lblBactive==true){
								if(one0>10){
									x=10;
								}
								if(one0<=10){
									x=one0%11;
								}
							lblBactive=true;
							lblBmode=true;
							lblBfloor=0;
							lblBdestination=1;
							lblBdirection=true;
							lblBcapacity=10;
							lblBcount_inside=x;
							lblBinside="["+"("+x+","+"1"+")"+"]";
							
							lbl0queue -= x;
							
							try {
								Thread.sleep(200);
							} catch (Exception e) {
								// TODO: handle exception
							}
							
							lbl1all += x;
							one0 -= x;
							
							int a=lbl1queue;
							lbl1queue -= lbl1queue%11;
							lbl1all -= a%11;
							
							
							lblBactive=true;
							lblBmode=true;
							lblBfloor=1;
							lblBdestination=0;
							lblBdirection=false;
							lblBcapacity=10;
							lblBcount_inside=a%11;
							lblBinside="["+"("+a%11+","+0+")"+"]";
							
							try {
								Thread.sleep(200);
							} catch (Exception e) {
								// TODO: handle exception
							}
							
							lblexitCount += a%11;
							
							if(two0>10){
								y=10;
							}
							if(two0<=10){
								y=two0%11;
							}
							lblBfloor=0;
							lblBdestination=2;
							lblBdirection=true;
							lblBcapacity=10;
							lblBcount_inside=y;
							lblBinside="["+"("+y+","+"2"+")"+"]";
							
							lbl0queue -= y;
							
							try {
								Thread.sleep(200);
							} catch (Exception e) {
								// TODO: handle exception
							}
							lblBfloor=1;
							try {
								Thread.sleep(200);
							} catch (Exception e) {
								// TODO: handle exception
							}
							
							
							
							lbl2all += y;
							two0 -= y;
							
							a=lbl2queue;
							lbl2queue -= lbl2queue%11;
							lbl2all -= a%11;
							
							lblBactive=true;
							lblBmode=true;
							lblBfloor=2;
							lblBdestination=0;
							lblBdirection=false;
							lblBcapacity=10;
							lblBcount_inside=a%11;
							lblBinside="["+"("+a%11+","+0+")"+"]";
							
							try {
								Thread.sleep(200);
							} catch (Exception e) {
								// TODO: handle exception
							}
							lblBfloor=1;
							try {
								Thread.sleep(200);
							} catch (Exception e) {
								// TODO: handle exception
							}
							
							lblexitCount += a%11;
							
							if(three0>10){
								z=10;
							}
							if(three0<=10){
								z=three0%11;
							}
							lblBfloor=0;
							lblBdestination=3;
							lblBdirection=true;
							lblBcapacity=10;
							lblBcount_inside=z;
							lblBinside="["+"("+z+","+"3"+")"+"]";
							
							lbl0queue -= z;
							
							try {
								Thread.sleep(200);
							} catch (Exception e) {
								// TODO: handle exception
							}
							lblBfloor=1;
							try {
								Thread.sleep(200);
							} catch (Exception e) {
								// TODO: handle exception
							}
							lblBfloor=2;
							try {
								Thread.sleep(200);
							} catch (Exception e) {
								// TODO: handle exception
							}
							
							lbl3all += z;
							three0 -= z;
							
							a=lbl3queue;
							lbl3queue -= lbl3queue%11;
							lbl3all -= a%11;
							
							lblBactive=true;
							lblBmode=true;
							lblBfloor=3;
							lblBdestination=0;
							lblBdirection=false;
							lblBcapacity=10;
							lblBcount_inside=a%11;
							lblBinside="["+"("+a%11+","+0+")"+"]";
							
							try {
								Thread.sleep(200);
							} catch (Exception e) {
								// TODO: handle exception
							}
							lblBfloor=2;
							try {
								Thread.sleep(200);
							} catch (Exception e) {
								// TODO: handle exception
							}
							lblBfloor=1;
							try {
								Thread.sleep(200);
							} catch (Exception e) {
								// TODO: handle exception
							}
							
							lblexitCount += a%11;
							
							if(four0>10){
								t=10;
							}
							if(four0<=10){
								t=four0%11;
							}
							lblBfloor=0;
							lblBdestination=4;
							lblBdirection=true;
							lblBcapacity=10;
							lblBcount_inside=t;
							lblBinside="["+"("+t+","+"4"+")"+"]";
							
							lbl0queue -= t;
							
							try {
								Thread.sleep(200);
							} catch (Exception e) {
								// TODO: handle exception
							}
							lblBfloor=1;
							try {
								Thread.sleep(200);
							} catch (Exception e) {
								// TODO: handle exception
							}
							lblBfloor=2;
							try {
								Thread.sleep(200);
							} catch (Exception e) {
								// TODO: handle exception
							}
							lblBfloor=3;
							try {
								Thread.sleep(200);
							} catch (Exception e) {
								// TODO: handle exception
							}
							
							lbl4all += t;
							four0 -= t;
							
							a=lbl4queue;
							lbl4queue -= lbl4queue%11;
							lbl4all -= a%11;
							
							
							lblBactive=true;
							lblBmode=true;
							lblBfloor=4;
							lblBdestination=0;
							lblBdirection=false;
							lblBcapacity=10;
							lblBcount_inside=a%11;
							lblBinside="["+"("+a%11+","+0+")"+"]";
							
							try {
								Thread.sleep(200);
							} catch (Exception e) {
								// TODO: handle exception
							}
							lblBfloor=3;
							try {
								Thread.sleep(200);
							} catch (Exception e) {
								// TODO: handle exception
							}
							lblBfloor=2;
							try {
								Thread.sleep(200);
							} catch (Exception e) {
								// TODO: handle exception
							}
							lblBfloor=1;
							try {
								Thread.sleep(200);
							} catch (Exception e) {
								// TODO: handle exception
							}
							lblBfloor=0;
							
							lblexitCount += a%11;
							
							}
								
						}
							



					}
					};
					
					elv3 = new Thread(){
						public void run(){
							
							while(true){
								try {
									Thread.sleep(20);
								} catch (InterruptedException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
								if(lblCactive==true){
									if(one0>10){
										x=10;
									}
									if(one0<=10){
										x=one0%11;
									}
								lblCactive=true;
								lblCmode=true;
								lblCfloor=0;
								lblCdestination=1;
								lblCdirection=true;
								lblCcapacity=10;
								lblCcount_inside=x;
								lblCinside="["+"("+x+","+"1"+")"+"]";
								
								lbl0queue -= x;
								
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								
								lbl1all += x;
								one0 -= x;
								
								int a=lbl1queue;
								lbl1queue -= lbl1queue%11;
								lbl1all -= a%11;
								
								
								lblCactive=true;
								lblCmode=true;
								lblCfloor=1;
								lblCdestination=0;
								lblCdirection=false;
								lblCcapacity=10;
								lblCcount_inside=a%11;
								lblCinside="["+"("+a%11+","+0+")"+"]";
								
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								
								lblexitCount += a%11;
								if(two0>10){
									y=10;
								}
								if(two0<=10){
									y=two0%11;
								}
								lblCfloor=0;
								lblCdestination=2;
								lblCdirection=true;
								lblCcapacity=10;
								lblCcount_inside=y;
								lblCinside="["+"("+y+","+"2"+")"+"]";
								
								lbl0queue -= y;
								
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								lblCfloor=1;
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								
								
								
								lbl2all += y;
								two0 -= y;
								
								a=lbl2queue;
								lbl2queue -= lbl2queue%11;
								lbl2all -= a%11;
								
								lblCactive=true;
								lblCmode=true;
								lblCfloor=2;
								lblCdestination=0;
								lblCdirection=false;
								lblCcapacity=10;
								lblCcount_inside=a%11;
								lblCinside="["+"("+a%11+","+0+")"+"]";
								
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								lblCfloor=1;
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								
								lblexitCount += a%11;
								
								if(three0>10){
									z=10;
								}
								if(three0<=10){
									z=three0%11;
								}
								lblCfloor=0;
								lblCdestination=3;
								lblCdirection=true;
								lblCcapacity=10;
								lblCcount_inside=z;
								lblCinside="["+"("+z+","+"3"+")"+"]";
								
								lbl0queue -= z;
								
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								lblCfloor=1;
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								lblCfloor=2;
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								
								lbl3all += z;
								three0 -= z;
								
								a=lbl3queue;
								lbl3queue -= lbl3queue%11;
								lbl3all -= a%11;
								
								lblCactive=true;
								lblCmode=true;
								lblCfloor=3;
								lblCdestination=0;
								lblCdirection=false;
								lblCcapacity=10;
								lblCcount_inside=a%11;
								lblCinside="["+"("+a%11+","+0+")"+"]";
								
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								lblCfloor=2;
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								lblCfloor=1;
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								
								lblexitCount += a%11;
								
								if(four0>10){
									t=10;
								}
								if(four0<=10){
									t=four0%11;
								}
								lblCfloor=0;
								lblCdestination=4;
								lblCdirection=true;
								lblCcapacity=10;
								lblCcount_inside=t;
								lblCinside="["+"("+t+","+"4"+")"+"]";
								
								lbl0queue -= t;
								
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								lblCfloor=1;
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								lblCfloor=2;
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								lblCfloor=3;
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								
								lbl4all += t;
								four0 -= t;
								
								a=lbl4queue;
								lbl4queue -= lbl4queue%11;
								lbl4all -= a%11;
								
								
								lblCactive=true;
								lblCmode=true;
								lblCfloor=4;
								lblCdestination=0;
								lblCdirection=false;
								lblCcapacity=10;
								lblCcount_inside=a%11;
								lblCinside="["+"("+a%11+","+0+")"+"]";
								
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								lblCfloor=3;
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								lblCfloor=2;
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								lblCfloor=1;
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								lblCfloor=0;
								
								lblexitCount += a%11;
								
								}
									
							}
						

						}
						};
						
						elv4 = new Thread(){
							public void run(){
								
								while(true){
									try {
										Thread.sleep(20);
									} catch (InterruptedException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									
									if(lblDactive==true){
										if(one0>10){
											x=10;
										}
										if(four0<=10){
											x=one0%11;
										}
									lblDactive=true;
									lblDmode=true;
									lblDfloor=0;
									lblDdestination=1;
									lblDdirection=true;
									lblDcapacity=10;
									lblDcount_inside=x;
									lblDinside="["+"("+x+","+"1"+")"+"]";
									
									lbl0queue -= x;
									
									try {
										Thread.sleep(200);
									} catch (Exception e) {
										// TODO: handle exception
									}
									
									lbl1all += x;
									one0 -= x;
									
									int a=lbl1queue;
									lbl1queue -= lbl1queue%11;
									lbl1all -= a%11;
									
									
									lblDactive=true;
									lblDmode=true;
									lblDfloor=1;
									lblDdestination=0;
									lblDdirection=false;
									lblDcapacity=10;
									lblDcount_inside=a%11;
									lblDinside="["+"("+a%11+","+0+")"+"]";
									
									try {
										Thread.sleep(200);
									} catch (Exception e) {
										// TODO: handle exception
									}
									
									lblexitCount += a%11;
									
									if(two0>10){
										y=10;
									}
									if(two0<=10){
										y=two0%11;
									}
									lblDfloor=0;
									lblDdestination=2;
									lblDdirection=true;
									lblDcapacity=10;
									lblDcount_inside=y;
									lblDinside="["+"("+y+","+"2"+")"+"]";
									
									lbl0queue -= y;
									
									try {
										Thread.sleep(200);
									} catch (Exception e) {
										// TODO: handle exception
									}
									lblDfloor=1;
									try {
										Thread.sleep(200);
									} catch (Exception e) {
										// TODO: handle exception
									}
									
									
									
									lbl2all += y;
									two0 -= y;
									
									a=lbl2queue;
									lbl2queue -= lbl2queue%11;
									lbl2all -= a%11;
									
									lblDactive=true;
									lblDmode=true;
									lblDfloor=2;
									lblDdestination=0;
									lblDdirection=false;
									lblDcapacity=10;
									lblDcount_inside=a%11;
									lblDinside="["+"("+a%11+","+0+")"+"]";
									
									try {
										Thread.sleep(200);
									} catch (Exception e) {
										// TODO: handle exception
									}
									lblDfloor=1;
									try {
										Thread.sleep(200);
									} catch (Exception e) {
										// TODO: handle exception
									}
									
									lblexitCount += a%11;
									
									if(three0>10){
										z=10;
									}
									if(three0<=10){
										z=three0%11;
									}
									lblDfloor=0;
									lblDdestination=3;
									lblDdirection=true;
									lblDcapacity=10;
									lblDcount_inside=z;
									lblDinside="["+"("+z+","+"3"+")"+"]";
									
									lbl0queue -= z;
									
									try {
										Thread.sleep(200);
									} catch (Exception e) {
										// TODO: handle exception
									}
									lblDfloor=1;
									try {
										Thread.sleep(200);
									} catch (Exception e) {
										// TODO: handle exception
									}
									lblDfloor=2;
									try {
										Thread.sleep(200);
									} catch (Exception e) {
										// TODO: handle exception
									}
									
									lbl3all += z;
									three0 -= z;
									
									a=lbl3queue;
									lbl3queue -= lbl3queue%11;
									lbl3all -= a%11;
									
									lblDactive=true;
									lblDmode=true;
									lblDfloor=3;
									lblDdestination=0;
									lblDdirection=false;
									lblDcapacity=10;
									lblDcount_inside=a%11;
									lblDinside="["+"("+a%11+","+0+")"+"]";
									
									try {
										Thread.sleep(200);
									} catch (Exception e) {
										// TODO: handle exception
									}
									lblDfloor=2;
									try {
										Thread.sleep(200);
									} catch (Exception e) {
										// TODO: handle exception
									}
									lblDfloor=1;
									try {
										Thread.sleep(200);
									} catch (Exception e) {
										// TODO: handle exception
									}
									
									lblexitCount += a%11;
									
									if(four0>10){
										t=10;
									}
									if(four0<=10){
										t=four0%11;
									}
									lblDfloor=0;
									lblDdestination=4;
									lblDdirection=true;
									lblDcapacity=10;
									lblDcount_inside=t;
									lblDinside="["+"("+t+","+"4"+")"+"]";
									
									lbl0queue -= t;
									
									try {
										Thread.sleep(200);
									} catch (Exception e) {
										// TODO: handle exception
									}
									lblDfloor=1;
									try {
										Thread.sleep(200);
									} catch (Exception e) {
										// TODO: handle exception
									}
									lblDfloor=2;
									try {
										Thread.sleep(200);
									} catch (Exception e) {
										// TODO: handle exception
									}
									lblDfloor=3;
									try {
										Thread.sleep(200);
									} catch (Exception e) {
										// TODO: handle exception
									}
									
									lbl4all += t;
									four0 -= t;
									
									a=lbl4queue;
									lbl4queue -= lbl4queue%11;
									lbl4all -= a%11;
									
									
									lblDactive=true;
									lblDmode=true;
									lblDfloor=4;
									lblDdestination=0;
									lblDdirection=false;
									lblDcapacity=10;
									lblDcount_inside=a%11;
									lblDinside="["+"("+a%11+","+0+")"+"]";
									
									try {
										Thread.sleep(200);
									} catch (Exception e) {
										// TODO: handle exception
									}
									lblDfloor=3;
									try {
										Thread.sleep(200);
									} catch (Exception e) {
										// TODO: handle exception
									}
									lblDfloor=2;
									try {
										Thread.sleep(200);
									} catch (Exception e) {
										// TODO: handle exception
									}
									lblDfloor=1;
									try {
										Thread.sleep(200);
									} catch (Exception e) {
										// TODO: handle exception
									}
									lblDfloor=0;
									
									lblexitCount += a%11;
										
								}
								}
							

							}
							};
							
							elv5 = new Thread(){
								public void run(){
									
									while(true){
										try {
											Thread.sleep(20);
										} catch (InterruptedException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										
										if(lblEactive==true){
											if(one0>10){
												x=10;
											}
											if(one0<=10){
												x=one0%11;
											}
										lblEactive=true;
										lblEmode=true;
										lblEfloor=0;
										lblEdestination=1;
										lblEdirection=true;
										lblEcapacity=10;
										lblEcount_inside=x;
										lblEinside="["+"("+x+","+"1"+")"+"]";
										
										lbl0queue -= x;
										
										try {
											Thread.sleep(200);
										} catch (Exception e) {
											// TODO: handle exception
										}
										
										lbl1all += x;
										one0 -= x;
										
										int a=lbl1queue;
										lbl1queue -= lbl1queue%11;
										lbl1all -= a%11;
										
										
										lblEactive=true;
										lblEmode=true;
										lblEfloor=1;
										lblEdestination=0;
										lblEdirection=false;
										lblEcapacity=10;
										lblEcount_inside=a%11;
										lblEinside="["+"("+a%11+","+0+")"+"]";
										
										try {
											Thread.sleep(200);
										} catch (Exception e) {
											// TODO: handle exception
										}
										
										lblexitCount += a%11;
										if(two0>10){
											y=10;
										}
										if(two0<=10){
											y=two0%11;
										}
										lblEfloor=0;
										lblEdestination=2;
										lblEdirection=true;
										lblEcapacity=10;
										lblEcount_inside=y;
										lblEinside="["+"("+y+","+"2"+")"+"]";
										
										lbl0queue -= y;
										
										try {
											Thread.sleep(200);
										} catch (Exception e) {
											// TODO: handle exception
										}
										lblEfloor=1;
										try {
											Thread.sleep(200);
										} catch (Exception e) {
											// TODO: handle exception
										}
										
										
										
										lbl2all += y;
										two0 -= y;
										
										a=lbl2queue;
										lbl2queue -= lbl2queue%11;
										lbl2all -= a%11;
										
										lblEactive=true;
										lblEmode=true;
										lblEfloor=2;
										lblEdestination=0;
										lblEdirection=false;
										lblEcapacity=10;
										lblEcount_inside=a%11;
										lblEinside="["+"("+a%11+","+0+")"+"]";
										
										try {
											Thread.sleep(200);
										} catch (Exception e) {
											// TODO: handle exception
										}
										lblEfloor=1;
										try {
											Thread.sleep(200);
										} catch (Exception e) {
											// TODO: handle exception
										}
										
										lblexitCount += a%11;
										if(three0>10){
											z=10;
										}
										if(three0<=10){
											z=three0%11;
										}
										lblEfloor=0;
										lblEdestination=3;
										lblEdirection=true;
										lblEcapacity=10;
										lblEcount_inside=z;
										lblEinside="["+"("+z+","+"3"+")"+"]";
										
										lbl0queue -= z;
										
										try {
											Thread.sleep(200);
										} catch (Exception e) {
											// TODO: handle exception
										}
										lblEfloor=1;
										try {
											Thread.sleep(200);
										} catch (Exception e) {
											// TODO: handle exception
										}
										lblEfloor=2;
										try {
											Thread.sleep(200);
										} catch (Exception e) {
											// TODO: handle exception
										}
										
										lbl3all += z;
										three0 -= z;
										
										a=lbl3queue;
										lbl3queue -= lbl3queue%11;
										lbl3all -= a%11;
										
										lblEactive=true;
										lblEmode=true;
										lblEfloor=3;
										lblEdestination=0;
										lblEdirection=false;
										lblEcapacity=10;
										lblEcount_inside=a%11;
										lblEinside="["+"("+a%11+","+0+")"+"]";
										
										try {
											Thread.sleep(200);
										} catch (Exception e) {
											// TODO: handle exception
										}
										lblEfloor=2;
										try {
											Thread.sleep(200);
										} catch (Exception e) {
											// TODO: handle exception
										}
										lblEfloor=1;
										try {
											Thread.sleep(200);
										} catch (Exception e) {
											// TODO: handle exception
										}
										
										lblexitCount += a%11;
										if(four0>10){
											t=10;
										}
										if(four0<=10){
											t=four0%11;
										}
										lblEfloor=0;
										lblEdestination=4;
										lblEdirection=true;
										lblEcapacity=10;
										lblEcount_inside=t;
										lblEinside="["+"("+t+","+"4"+")"+"]";
										
										lbl0queue -= t;
										
										try {
											Thread.sleep(200);
										} catch (Exception e) {
											// TODO: handle exception
										}
										lblEfloor=1;
										try {
											Thread.sleep(200);
										} catch (Exception e) {
											// TODO: handle exception
										}
										lblEfloor=2;
										try {
											Thread.sleep(200);
										} catch (Exception e) {
											// TODO: handle exception
										}
										lblEfloor=3;
										try {
											Thread.sleep(200);
										} catch (Exception e) {
											// TODO: handle exception
										}
										lbl4all += t;
										four0 -= t;
										
										a=lbl4queue;
										lbl4queue -= lbl4queue%11;
										lbl4all -= a%11;
										
										
										lblEactive=true;
										lblEmode=true;
										lblEfloor=4;
										lblEdestination=0;
										lblEdirection=false;
										lblEcapacity=10;
										lblEcount_inside=a%11;
										lblEinside="["+"("+a%11+","+0+")"+"]";
										
										try {
											Thread.sleep(200);
										} catch (Exception e) {
											// TODO: handle exception
										}
										lblEfloor=3;
										try {
											Thread.sleep(200);
										} catch (Exception e) {
											// TODO: handle exception
										}
										lblEfloor=2;
										try {
											Thread.sleep(200);
										} catch (Exception e) {
											// TODO: handle exception
										}
										lblEfloor=1;
										try {
											Thread.sleep(200);
										} catch (Exception e) {
											// TODO: handle exception
										}
										lblEfloor=0;
										lblexitCount += a%11;
										
										}
											
									}
								

								}
								};
								
								
											
											kontrol = new Thread(){
												public void run(){
													
													
													while(true){
														
														if(elv1.isAlive()==false){
															elv1.start();
															lblAactive=true;
														}
														try {
															Thread.sleep(5);
														} catch (InterruptedException e) {
															// TODO Auto-generated catch block
															e.printStackTrace();
														}
														if(lbl0queue0 > 20 && elv2.isAlive()==false){
															elv2.start();
															lblBactive=true;
														}
														try {
															Thread.sleep(5);
														} catch (InterruptedException e) {
															// TODO Auto-generated catch block
															e.printStackTrace();
														}
														if(lbl0queue0 > 40 && elv3.isAlive()==false){
															elv3.start();
															lblCactive=true;
														}
														try {
															Thread.sleep(5);
														} catch (InterruptedException e) {
															// TODO Auto-generated catch block
															e.printStackTrace();
														}
														if(lbl0queue0 > 60 && elv4.isAlive()==false){
															elv4.start();
															lblDactive=true;
														}
														try {
															Thread.sleep(5);
														} catch (InterruptedException e) {
															// TODO Auto-generated catch block
															e.printStackTrace();
														}
														if(lbl0queue0 > 80 && elv5.isAlive()==false){
															elv5.start();
															lblEactive=true;
														}
														
														if(lbl0queue <=20){
															lblBactive=false;
															lblCactive=false;
															lblDactive=false;
															lblEactive=false;
															
															lblBmode=false;
															lblCmode=false;
															lblDmode=false;
															lblEmode=false;
														}
														if(lbl0queue <=40){
															lblCactive=false;
															lblDactive=false;
															lblEactive=false;
															
															lblCmode=false;
															lblDmode=false;
															lblEmode=false;
														}
														if(lbl0queue <=60){
															lblDactive=false;
															lblEactive=false;
															
															lblDmode=false;
															lblEmode=false;
														}
														if(lbl0queue <=80){
															lblEactive=false;
															
															lblEmode=false;
														}
														
														
													
														if(lbl0queue0 > 20){
															
															lblBactive=true;
														}
														
														if(lbl0queue0 > 40){
															
															lblCactive=true;
														}
														
														if(lbl0queue0 > 60){
															
															lblDactive=true;
														}
														
														if(lbl0queue0 > 80){
															
															lblEactive=true;
														}
														
														
														
													}
													
												}
											};
										
										
										
										live = new Thread(){
											public void run(){
												
											try {
												while(true){
													
													Thread.sleep(20);
													lbl0queue0=one0+two0+three0+four0;
													if(lbl0queue0 < 0){lbl0queue0=0;}
													ekran.Floor0Data.get(0).setText(""+lbl0queue0);
													ekran.Floor0Data.get(1).setText(""+lbl0inside);

											
													ekran.Floor1Data.get(0).setText(""+lbl1all);
													ekran.Floor1Data.get(1).setText(""+lbl1queue);
													ekran.Floor1Data.get(2).setText(lbl1inside);

													ekran.Floor2Data.get(0).setText(""+lbl2all);
													ekran.Floor2Data.get(1).setText(""+lbl2queue);
													ekran.Floor2Data.get(2).setText(lbl2inside);

													ekran.Floor3Data.get(0).setText(""+lbl3all);
													ekran.Floor3Data.get(1).setText(""+lbl3queue);
													ekran.Floor3Data.get(2).setText(lbl3inside);

												    ekran.Floor4Data.get(0).setText(""+lbl4all);
													ekran.Floor4Data.get(1).setText(""+lbl4queue);
													ekran.Floor4Data.get(2).setText(lbl4inside);

												    
													ekran.ElvDataA.get(0).setText(""+lblAactive);
													if(lblAmode==true){ekran.ElvDataA.get(1).setText("working");}
													else if(lblAmode==false){ekran.ElvDataA.get(1).setText("idle");}
													ekran.ElvDataA.get(2).setText(""+lblAfloor);
													ekran.ElvDataA.get(3).setText(""+lblAdestination);
													if(lblAdirection==true){ekran.ElvDataA.get(4).setText("up");}
													else if(lblAdirection==false){ekran.ElvDataA.get(4).setText("down");}
													ekran.ElvDataA.get(5).setText(""+lblAcapacity);
													ekran.ElvDataA.get(6).setText(""+lblAcount_inside);
													ekran.ElvDataA.get(7).setText(""+lblAinside);
													
													
													ekran.ElvDataB.get(0).setText(""+lblBactive);
													if(lblBmode==true){ekran.ElvDataB.get(1).setText("working");}
													else if(lblBmode==false){ekran.ElvDataB.get(1).setText("idle");}
													ekran.ElvDataB.get(2).setText(""+lblBfloor);
													ekran.ElvDataB.get(3).setText(""+lblBdestination);
													if(lblBdirection==true){ekran.ElvDataB.get(4).setText("up");}
													else if(lblBdirection==false){ekran.ElvDataB.get(4).setText("down");}
													ekran.ElvDataB.get(5).setText(""+lblBcapacity);
													ekran.ElvDataB.get(6).setText(""+lblBcount_inside);
													ekran.ElvDataB.get(7).setText(""+lblBinside);
													
													
													ekran.ElvDataC.get(0).setText(""+lblCactive);
													if(lblCmode==true){ekran.ElvDataC.get(1).setText("working");}
													else if(lblCmode==false){ekran.ElvDataC.get(1).setText("idle");}
													ekran.ElvDataC.get(2).setText(""+lblCfloor);
													ekran.ElvDataC.get(3).setText(""+lblCdestination);
													if(lblCdirection==true){ekran.ElvDataC.get(4).setText("up");}
													else if(lblCdirection==false){ekran.ElvDataC.get(4).setText("down");}
													ekran.ElvDataC.get(5).setText(""+lblCcapacity);
													ekran.ElvDataC.get(6).setText(""+lblCcount_inside);
													ekran.ElvDataC.get(7).setText(""+lblCinside);
													
													
													ekran.ElvDataD.get(0).setText(""+lblDactive);
													if(lblDmode==true){ekran.ElvDataD.get(1).setText("working");}
													else if(lblDmode==false){ekran.ElvDataD.get(1).setText("idle");}
													ekran.ElvDataD.get(2).setText(""+lblDfloor);
													ekran.ElvDataD.get(3).setText(""+lblDdestination);
													if(lblDdirection==true){ekran.ElvDataD.get(4).setText("up");}
													else if(lblDdirection==false){ekran.ElvDataD.get(4).setText("down");}
													ekran.ElvDataD.get(5).setText(""+lblDcapacity);
													ekran.ElvDataD.get(6).setText(""+lblDcount_inside);
													ekran.ElvDataD.get(7).setText(""+lblDinside);
													
													
													ekran.ElvDataE.get(0).setText(""+lblEactive);
													if(lblEmode==true){ekran.ElvDataE.get(1).setText("working");}
													else if(lblEmode==false){ekran.ElvDataE.get(1).setText("idle");}
													ekran.ElvDataE.get(2).setText(""+lblEfloor);
													ekran.ElvDataE.get(3).setText(""+lblEdestination);
													if(lblEdirection==true){ekran.ElvDataE.get(4).setText("up");}
													else if(lblEdirection==false){ekran.ElvDataE.get(4).setText("down");}
													ekran.ElvDataE.get(5).setText(""+lblEcapacity);
													ekran.ElvDataE.get(6).setText(""+lblEcount_inside);
													ekran.ElvDataE.get(7).setText(""+lblEinside);
													
													ekran.lblexitCountdata.get(0).setText(""+lblexitCount);
												}
												
											
											} catch (Exception e11) {
												// TODO Auto-generated catch block
												
											}

											}
											};
		
		
		
		
        
        
        
	}


	protected static int[] passengerExit(int y) {
		// TODO Auto-generated method stub
		
		int[] dizis=new int[4];
		
		dizis[0]=0;
		dizis[1]=0;
		dizis[2]=0;
		dizis[3]=0;
		


			dizis[0]=r.nextInt(y);
			y-=dizis[0];
		if(y>0){
			dizis[1]=r.nextInt(y);
			y-=dizis[1];
		}
		if(y>0){
			dizis[2]=r.nextInt(y);
			y-=dizis[2];
		}
		if(y>0){
			dizis[3]=r.nextInt(y);
			y-=dizis[3];
		}
		
			int[] dizia=new int[4];
			
			ArrayList<Integer> dizi = new ArrayList<Integer>();
			
			for(int i=0;i<4;i++){
				dizi.add(dizis[i]);
			}
			
			int f=r.nextInt(4);
			dizia[0]=dizi.get(f);
			dizi.remove(f);
			
			int s=r.nextInt(3);
			dizia[1]=dizi.get(s);
			dizi.remove(s);
			
			int a=r.nextInt(2);
			dizia[2]=dizi.get(a);
			dizi.remove(a);
			
			dizia[3]=dizi.get(0);
			
		
		
		return dizia;
	}


	protected static String passengerLogin(int x) {
		// TODO Auto-generated method stub
		
		if(x>0){
		int[] dizis = new int[x];
		
		for(int i=0;i<x;i++){
			dizis[i]=r.nextInt(4)+1;
		}
		for(int i=0;i<x;i++){
			if(dizis[i]==1){one0++;}
			else if(dizis[i]==2){two0++;}
			else if(dizis[i]==3){three0++;}
			else if(dizis[i]==4){four0++;}
		}
		String a="["+"["+one0+","+"1"+"] ,"+"["+two0+","+"2"+"] ,"+"["+three0+","+"3"+"] ,"+"["+four0+","+"4"+"]"+"]";
		return a;
		}
		else
		return null;
	}


	

}



/*
			try {
        		ekran.ElvDataB.get(0).setText(""+j);
    			j++;
    			Thread.sleep(200);
    		} catch (Exception e1) {
    			// TODO Auto-generated catch block
    			e1.printStackTrace();
    		}
        	
        	
        	
			
        	try {
        		ekran.ElvDataA.get(0).setText(""+i);
    			i++;
    			Thread.sleep(500);
    		} catch (Exception e1) {
    			// TODO Auto-generated catch block
    			e1.printStackTrace();
    		}
*/






/*t1 = new Thread(){
public void run(){
try {
	for(;j<100;j++){
	ekran.ElvDataB.get(0).setText(""+j);
	Thread.sleep(200);
	}
	
} catch (Exception e11) {
	// TODO Auto-generated catch block
	e11.printStackTrace();
}



}
};



t2 = new Thread(){
public void run(){

try {
	for(;i<100;i++){
	ekran.ElvDataA.get(0).setText(""+i);
	Thread.sleep(500);
	}

} catch (Exception e1) {
	// TODO Auto-generated catch block
	Throwable e11 = null;
	e11.printStackTrace();
}

}
};*/