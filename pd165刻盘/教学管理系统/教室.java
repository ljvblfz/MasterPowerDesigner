/***********************************************************************
 * Module:  教室.java
 * Author:  coco
 * Purpose: Defines the Class 教室
 ***********************************************************************/

import java.util.*;

/** @pdOid ee9ca51a-7810-4904-81e2-ccd3ef622d6a */
public class 教室 {
   /** @pdOid 024d3ed4-c98e-42f9-b3c6-08f2198a5a75 */
   public java.lang.String 教室号;
   /** @pdOid 6c0ae5c1-1af3-4247-83ca-8ab109b8267c */
   public java.lang.String 类型;
   /** @pdOid 127eb60b-c34a-4331-bd1a-74b8d77725b7 */
   public double 规格;
   /** @pdOid d998bfdd-d3e6-42e9-93d5-6ec9b0c2981b */
   public java.lang.String 备注;
   
   /** @pdRoleInfo migr=no name=排课 assc=教室排课 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<排课> 排课;
   /** @pdRoleInfo migr=no name=考试安排 assc=教室考试安排 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<考试安排> 考试安排;
   /** @pdRoleInfo migr=no name=教师 assc=教师管理教室 mult=1..1 side=A */
   public 教师 教师;
   
   
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
         new排课.set教室(this);      
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
            old排课.set教室((教室)null);
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
            old排课.set教室((教室)null);
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
         new考试安排.set教室(this);      
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
            old考试安排.set教室((教室)null);
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
            old考试安排.set教室((教室)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public 教师 get教师() {
      return 教师;
   }
   
   /** @pdGenerated default parent setter
     * @param new教师 */
   public void set教师(教师 new教师) {
      if (this.教师 == null || !this.教师.equals(new教师))
      {
         if (this.教师 != null)
         {
            教师 old教师 = this.教师;
            this.教师 = null;
            old教师.remove教室(this);
         }
         if (new教师 != null)
         {
            this.教师 = new教师;
            this.教师.add教室(this);
         }
      }
   }

}