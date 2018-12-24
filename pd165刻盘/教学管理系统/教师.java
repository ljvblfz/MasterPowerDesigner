/***********************************************************************
 * Module:  教师.java
 * Author:  coco
 * Purpose: Defines the Class 教师
 ***********************************************************************/

import java.util.*;

/** @pdOid 9f225b91-cb69-4076-9003-2042d50373ea */
public class 教师 {
   /** @pdOid f654cf4f-d687-4ac3-900b-63a90274aad4 */
   public java.lang.String 教师号;
   /** @pdOid 2b91a6d7-3ad8-434d-a738-1ea2bdd95598 */
   public java.lang.String 教师姓名;
   /** @pdOid c90aaa56-ec7a-4c7b-902c-a9ac8a0a94e4 */
   public java.lang.String 教师性别;
   /** @pdOid 391eeab9-50ed-48b6-810e-6d8b1198f90e */
   public java.lang.String 职称;
   /** @pdOid 893632f2-9721-4fd2-9915-023a7c93451e */
   public java.util.Date 教师出生日期;
   /** @pdOid 861d3d19-a7d8-49e0-9fa6-0ee3968fad75 */
   public java.lang.String 教师政治面貌;
   /** @pdOid a2405fb5-715c-4550-b23f-248c43fe5ffd */
   public java.lang.String 教师身份证号;
   /** @pdOid 9c5b2144-85ae-4d7e-81b9-0124ffb64e05 */
   public java.lang.String 教师档案编号;
   
   /** @pdRoleInfo migr=no name=评价 assc=教师评价 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<评价> 评价;
   /** @pdRoleInfo migr=no name=教室 assc=教师管理教室 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<教室> 教室;
   /** @pdRoleInfo migr=no name=排课 assc=教师排课 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<排课> 排课;
   /** @pdRoleInfo migr=no name=选课 assc=教师选课 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<选课> 选课;
   /** @pdRoleInfo migr=no name=系部 assc=系部教师 mult=1..1 side=A */
   public 系部 系部;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<评价> get评价() {
      if (评价 == null)
         评价 = new java.util.HashSet<评价>();
      return 评价;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator评价() {
      if (评价 == null)
         评价 = new java.util.HashSet<评价>();
      return 评价.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new评价 */
   public void set评价(java.util.Collection<评价> new评价) {
      removeAll评价();
      for (java.util.Iterator iter = new评价.iterator(); iter.hasNext();)
         add评价((评价)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new评价 */
   public void add评价(评价 new评价) {
      if (new评价 == null)
         return;
      if (this.评价 == null)
         this.评价 = new java.util.HashSet<评价>();
      if (!this.评价.contains(new评价))
      {
         this.评价.add(new评价);
         new评价.set教师(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old评价 */
   public void remove评价(评价 old评价) {
      if (old评价 == null)
         return;
      if (this.评价 != null)
         if (this.评价.contains(old评价))
         {
            this.评价.remove(old评价);
            old评价.set教师((教师)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll评价() {
      if (评价 != null)
      {
         评价 old评价;
         for (java.util.Iterator iter = getIterator评价(); iter.hasNext();)
         {
            old评价 = (评价)iter.next();
            iter.remove();
            old评价.set教师((教师)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<教室> get教室() {
      if (教室 == null)
         教室 = new java.util.HashSet<教室>();
      return 教室;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator教室() {
      if (教室 == null)
         教室 = new java.util.HashSet<教室>();
      return 教室.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new教室 */
   public void set教室(java.util.Collection<教室> new教室) {
      removeAll教室();
      for (java.util.Iterator iter = new教室.iterator(); iter.hasNext();)
         add教室((教室)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new教室 */
   public void add教室(教室 new教室) {
      if (new教室 == null)
         return;
      if (this.教室 == null)
         this.教室 = new java.util.HashSet<教室>();
      if (!this.教室.contains(new教室))
      {
         this.教室.add(new教室);
         new教室.set教师(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old教室 */
   public void remove教室(教室 old教室) {
      if (old教室 == null)
         return;
      if (this.教室 != null)
         if (this.教室.contains(old教室))
         {
            this.教室.remove(old教室);
            old教室.set教师((教师)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll教室() {
      if (教室 != null)
      {
         教室 old教室;
         for (java.util.Iterator iter = getIterator教室(); iter.hasNext();)
         {
            old教室 = (教室)iter.next();
            iter.remove();
            old教室.set教师((教师)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<排课> get排课() {
      if (排课 == null)
         排课 = new java.util.HashSet<排课>();
      return 排课;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator排课() {
      if (排课 == null)
         排课 = new java.util.HashSet<排课>();
      return 排课.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new排课 */
   public void set排课(java.util.Collection<排课> new排课) {
      removeAll排课();
      for (java.util.Iterator iter = new排课.iterator(); iter.hasNext();)
         add排课((排课)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new排课 */
   public void add排课(排课 new排课) {
      if (new排课 == null)
         return;
      if (this.排课 == null)
         this.排课 = new java.util.HashSet<排课>();
      if (!this.排课.contains(new排课))
      {
         this.排课.add(new排课);
         new排课.set教师(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old排课 */
   public void remove排课(排课 old排课) {
      if (old排课 == null)
         return;
      if (this.排课 != null)
         if (this.排课.contains(old排课))
         {
            this.排课.remove(old排课);
            old排课.set教师((教师)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll排课() {
      if (排课 != null)
      {
         排课 old排课;
         for (java.util.Iterator iter = getIterator排课(); iter.hasNext();)
         {
            old排课 = (排课)iter.next();
            iter.remove();
            old排课.set教师((教师)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<选课> get选课() {
      if (选课 == null)
         选课 = new java.util.HashSet<选课>();
      return 选课;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator选课() {
      if (选课 == null)
         选课 = new java.util.HashSet<选课>();
      return 选课.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new选课 */
   public void set选课(java.util.Collection<选课> new选课) {
      removeAll选课();
      for (java.util.Iterator iter = new选课.iterator(); iter.hasNext();)
         add选课((选课)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new选课 */
   public void add选课(选课 new选课) {
      if (new选课 == null)
         return;
      if (this.选课 == null)
         this.选课 = new java.util.HashSet<选课>();
      if (!this.选课.contains(new选课))
      {
         this.选课.add(new选课);
         new选课.set教师(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old选课 */
   public void remove选课(选课 old选课) {
      if (old选课 == null)
         return;
      if (this.选课 != null)
         if (this.选课.contains(old选课))
         {
            this.选课.remove(old选课);
            old选课.set教师((教师)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll选课() {
      if (选课 != null)
      {
         选课 old选课;
         for (java.util.Iterator iter = getIterator选课(); iter.hasNext();)
         {
            old选课 = (选课)iter.next();
            iter.remove();
            old选课.set教师((教师)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public 系部 get系部() {
      return 系部;
   }
   
   /** @pdGenerated default parent setter
     * @param new系部 */
   public void set系部(系部 new系部) {
      if (this.系部 == null || !this.系部.equals(new系部))
      {
         if (this.系部 != null)
         {
            系部 old系部 = this.系部;
            this.系部 = null;
            old系部.remove教师(this);
         }
         if (new系部 != null)
         {
            this.系部 = new系部;
            this.系部.add教师(this);
         }
      }
   }

}