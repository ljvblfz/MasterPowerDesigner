/***********************************************************************
 * Module:  系部.java
 * Author:  coco
 * Purpose: Defines the Class 系部
 ***********************************************************************/

import java.util.*;

/** @pdOid 36b386fc-6d39-419b-ae78-7181debb9302 */
public class 系部 {
   /** @pdOid 05ab1ee5-5666-4123-a272-4e52ab451c1d */
   public java.lang.String 系部号;
   /** @pdOid c8aa1520-e6a6-4e95-b329-ccfd95f6edaf */
   public java.lang.String 系部名称;
   /** @pdOid 22a6b770-7816-4cb6-a1fa-92f952d492e2 */
   public java.lang.String 办公地点;
   /** @pdOid 6591f888-63d7-493b-b9c8-b2e0126e15f6 */
   public java.lang.String 电话;
   
   /** @pdRoleInfo migr=no name=课程 assc=系部课程 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<课程> 课程;
   /** @pdRoleInfo migr=no name=教师 assc=系部教师 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<教师> 教师;
   /** @pdRoleInfo migr=no name=专业 assc=系部专业 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<专业> 专业;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<课程> get课程() {
      if (课程 == null)
         课程 = new java.util.HashSet<课程>();
      return 课程;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator课程() {
      if (课程 == null)
         课程 = new java.util.HashSet<课程>();
      return 课程.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new课程 */
   public void set课程(java.util.Collection<课程> new课程) {
      removeAll课程();
      for (java.util.Iterator iter = new课程.iterator(); iter.hasNext();)
         add课程((课程)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new课程 */
   public void add课程(课程 new课程) {
      if (new课程 == null)
         return;
      if (this.课程 == null)
         this.课程 = new java.util.HashSet<课程>();
      if (!this.课程.contains(new课程))
      {
         this.课程.add(new课程);
         new课程.set系部(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old课程 */
   public void remove课程(课程 old课程) {
      if (old课程 == null)
         return;
      if (this.课程 != null)
         if (this.课程.contains(old课程))
         {
            this.课程.remove(old课程);
            old课程.set系部((系部)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll课程() {
      if (课程 != null)
      {
         课程 old课程;
         for (java.util.Iterator iter = getIterator课程(); iter.hasNext();)
         {
            old课程 = (课程)iter.next();
            iter.remove();
            old课程.set系部((系部)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<教师> get教师() {
      if (教师 == null)
         教师 = new java.util.HashSet<教师>();
      return 教师;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator教师() {
      if (教师 == null)
         教师 = new java.util.HashSet<教师>();
      return 教师.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new教师 */
   public void set教师(java.util.Collection<教师> new教师) {
      removeAll教师();
      for (java.util.Iterator iter = new教师.iterator(); iter.hasNext();)
         add教师((教师)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new教师 */
   public void add教师(教师 new教师) {
      if (new教师 == null)
         return;
      if (this.教师 == null)
         this.教师 = new java.util.HashSet<教师>();
      if (!this.教师.contains(new教师))
      {
         this.教师.add(new教师);
         new教师.set系部(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old教师 */
   public void remove教师(教师 old教师) {
      if (old教师 == null)
         return;
      if (this.教师 != null)
         if (this.教师.contains(old教师))
         {
            this.教师.remove(old教师);
            old教师.set系部((系部)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll教师() {
      if (教师 != null)
      {
         教师 old教师;
         for (java.util.Iterator iter = getIterator教师(); iter.hasNext();)
         {
            old教师 = (教师)iter.next();
            iter.remove();
            old教师.set系部((系部)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<专业> get专业() {
      if (专业 == null)
         专业 = new java.util.HashSet<专业>();
      return 专业;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator专业() {
      if (专业 == null)
         专业 = new java.util.HashSet<专业>();
      return 专业.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new专业 */
   public void set专业(java.util.Collection<专业> new专业) {
      removeAll专业();
      for (java.util.Iterator iter = new专业.iterator(); iter.hasNext();)
         add专业((专业)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new专业 */
   public void add专业(专业 new专业) {
      if (new专业 == null)
         return;
      if (this.专业 == null)
         this.专业 = new java.util.HashSet<专业>();
      if (!this.专业.contains(new专业))
      {
         this.专业.add(new专业);
         new专业.set系部(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old专业 */
   public void remove专业(专业 old专业) {
      if (old专业 == null)
         return;
      if (this.专业 != null)
         if (this.专业.contains(old专业))
         {
            this.专业.remove(old专业);
            old专业.set系部((系部)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll专业() {
      if (专业 != null)
      {
         专业 old专业;
         for (java.util.Iterator iter = getIterator专业(); iter.hasNext();)
         {
            old专业 = (专业)iter.next();
            iter.remove();
            old专业.set系部((系部)null);
         }
      }
   }

}