/***********************************************************************
 * Module:  课程.java
 * Author:  coco
 * Purpose: Defines the Class 课程
 ***********************************************************************/

import java.util.*;

/** @pdOid 329821ef-789f-4388-96ea-6b9baf346e03 */
public class 课程 {
   /** @pdOid 0f46cebc-9175-491e-b819-49865d245817 */
   public java.lang.String 课程号;
   /** @pdOid 87cc7a02-b04e-4fc7-ad45-989cf1f5dcd8 */
   public java.lang.String 课程名称;
   /** @pdOid d1100f47-dd8e-48d1-b9ae-55dedf0637b0 */
   public java.lang.String 开课系部;
   /** @pdOid aac2c325-9982-4fa0-8104-264095166c6e */
   public java.lang.String 课程简介;
   
   /** @pdRoleInfo migr=no name=开课计划 assc=课程开课计划 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<开课计划> 开课计划;
   /** @pdRoleInfo migr=no name=评价 assc=课程评价 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<评价> 评价;
   /** @pdRoleInfo migr=no name=排课 assc=课程排课 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<排课> 排课;
   /** @pdRoleInfo migr=no name=考试安排 assc=课程考试安排 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<考试安排> 考试安排;
   /** @pdRoleInfo migr=no name=选课 assc=课程选课 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<选课> 选课;
   public java.util.Collection 成绩;
   /** @pdRoleInfo migr=no name=系部 assc=系部课程 mult=1..1 side=A */
   public 系部 系部;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<开课计划> get开课计划() {
      if (开课计划 == null)
         开课计划 = new java.util.HashSet<开课计划>();
      return 开课计划;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator开课计划() {
      if (开课计划 == null)
         开课计划 = new java.util.HashSet<开课计划>();
      return 开课计划.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new开课计划 */
   public void set开课计划(java.util.Collection<开课计划> new开课计划) {
      removeAll开课计划();
      for (java.util.Iterator iter = new开课计划.iterator(); iter.hasNext();)
         add开课计划((开课计划)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new开课计划 */
   public void add开课计划(开课计划 new开课计划) {
      if (new开课计划 == null)
         return;
      if (this.开课计划 == null)
         this.开课计划 = new java.util.HashSet<开课计划>();
      if (!this.开课计划.contains(new开课计划))
      {
         this.开课计划.add(new开课计划);
         new开课计划.set课程(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old开课计划 */
   public void remove开课计划(开课计划 old开课计划) {
      if (old开课计划 == null)
         return;
      if (this.开课计划 != null)
         if (this.开课计划.contains(old开课计划))
         {
            this.开课计划.remove(old开课计划);
            old开课计划.set课程((课程)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll开课计划() {
      if (开课计划 != null)
      {
         开课计划 old开课计划;
         for (java.util.Iterator iter = getIterator开课计划(); iter.hasNext();)
         {
            old开课计划 = (开课计划)iter.next();
            iter.remove();
            old开课计划.set课程((课程)null);
         }
      }
   }
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
         new评价.set课程(this);      
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
            old评价.set课程((课程)null);
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
            old评价.set课程((课程)null);
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
         new排课.set课程(this);      
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
            old排课.set课程((课程)null);
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
            old排课.set课程((课程)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<考试安排> get考试安排() {
      if (考试安排 == null)
         考试安排 = new java.util.HashSet<考试安排>();
      return 考试安排;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator考试安排() {
      if (考试安排 == null)
         考试安排 = new java.util.HashSet<考试安排>();
      return 考试安排.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new考试安排 */
   public void set考试安排(java.util.Collection<考试安排> new考试安排) {
      removeAll考试安排();
      for (java.util.Iterator iter = new考试安排.iterator(); iter.hasNext();)
         add考试安排((考试安排)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new考试安排 */
   public void add考试安排(考试安排 new考试安排) {
      if (new考试安排 == null)
         return;
      if (this.考试安排 == null)
         this.考试安排 = new java.util.HashSet<考试安排>();
      if (!this.考试安排.contains(new考试安排))
      {
         this.考试安排.add(new考试安排);
         new考试安排.set课程(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old考试安排 */
   public void remove考试安排(考试安排 old考试安排) {
      if (old考试安排 == null)
         return;
      if (this.考试安排 != null)
         if (this.考试安排.contains(old考试安排))
         {
            this.考试安排.remove(old考试安排);
            old考试安排.set课程((课程)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll考试安排() {
      if (考试安排 != null)
      {
         考试安排 old考试安排;
         for (java.util.Iterator iter = getIterator考试安排(); iter.hasNext();)
         {
            old考试安排 = (考试安排)iter.next();
            iter.remove();
            old考试安排.set课程((课程)null);
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
         new选课.set课程(this);      
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
            old选课.set课程((课程)null);
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
            old选课.set课程((课程)null);
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
            old系部.remove课程(this);
         }
         if (new系部 != null)
         {
            this.系部 = new系部;
            this.系部.add课程(this);
         }
      }
   }

}