/***********************************************************************
 * Module:  班级.java
 * Author:  Administrator
 * Purpose: Defines the Class 班级
 ***********************************************************************/

import java.util.*;

/** @pdOid f260cc76-420d-41df-83a2-7ee50900e011 */
public class 班级 {
   /** @pdOid d85368a6-decf-4ab7-9837-13abd7240714 */
   public java.lang.String 班级号;
   /** @pdOid 7ed784a7-aef8-4781-b621-bffb401c6d48 */
   public java.lang.String 班级名称;
   /** @pdOid 34d87f34-92e2-4d58-af79-2f194bd6019f */
   public double 人数;
   
   /** @pdRoleInfo migr=no name=学生 assc=班级学生 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<学生> 学生;
   
   
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

}