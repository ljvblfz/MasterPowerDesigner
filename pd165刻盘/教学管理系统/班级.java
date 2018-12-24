/***********************************************************************
 * Module:  班级.java
 * Author:  coco
 * Purpose: Defines the Class 班级
 ***********************************************************************/

import java.util.*;

/** @pdOid 510f5ca1-138c-40ac-92a8-971c7875157a */
public class 班级 {
   /** @pdOid b9b74315-1ae8-4cd2-88fd-484c23396524 */
   public java.lang.String 班级号;
   /** @pdOid b0497b77-eade-43a2-add2-6124753cec67 */
   public java.lang.String 班级名称;
   /** @pdOid d2a9ddcd-b3b8-47ac-83b4-bcc050a47b40 */
   public double 人数;
   
   /** @pdRoleInfo migr=no name=学生 assc=班级学生 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<学生> 学生;
   /** @pdRoleInfo migr=no name=评价 assc=班级评价 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<评价> 评价;
   /** @pdRoleInfo migr=no name=专业 assc=专业班级 mult=1..1 side=A */
   public 专业 专业;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<学生> get学生() {
      if (学生 == null)
         学生 = new java.util.HashSet<学生>();
      return 学生;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator学生() {
      if (学生 == null)
         学生 = new java.util.HashSet<学生>();
      return 学生.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new学生 */
   public void set学生(java.util.Collection<学生> new学生) {
      removeAll学生();
      for (java.util.Iterator iter = new学生.iterator(); iter.hasNext();)
         add学生((学生)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new学生 */
   public void add学生(学生 new学生) {
      if (new学生 == null)
         return;
      if (this.学生 == null)
         this.学生 = new java.util.HashSet<学生>();
      if (!this.学生.contains(new学生))
      {
         this.学生.add(new学生);
         new学生.set班级(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old学生 */
   public void remove学生(学生 old学生) {
      if (old学生 == null)
         return;
      if (this.学生 != null)
         if (this.学生.contains(old学生))
         {
            this.学生.remove(old学生);
            old学生.set班级((班级)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll学生() {
      if (学生 != null)
      {
         学生 old学生;
         for (java.util.Iterator iter = getIterator学生(); iter.hasNext();)
         {
            old学生 = (学生)iter.next();
            iter.remove();
            old学生.set班级((班级)null);
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
         new评价.set班级(this);      
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
            old评价.set班级((班级)null);
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
            old评价.set班级((班级)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public 专业 get专业() {
      return 专业;
   }
   
   /** @pdGenerated default parent setter
     * @param new专业 */
   public void set专业(专业 new专业) {
      if (this.专业 == null || !this.专业.equals(new专业))
      {
         if (this.专业 != null)
         {
            专业 old专业 = this.专业;
            this.专业 = null;
            old专业.remove班级(this);
         }
         if (new专业 != null)
         {
            this.专业 = new专业;
            this.专业.add班级(this);
         }
      }
   }

}