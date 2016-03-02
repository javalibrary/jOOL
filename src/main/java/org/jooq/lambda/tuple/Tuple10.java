/**
 * Copyright (c) 2014-2016, Data Geekery GmbH, contact@datageekery.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jooq.lambda.tuple;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;

import org.jooq.lambda.Seq;                
import org.jooq.lambda.function.Function1;
import org.jooq.lambda.function.Function10;

/**
 * A tuple of degree 10.
 *
 * @author Lukas Eder
 */
public class Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> implements Tuple, Comparable<Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>>, Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    public final T1 v1;
    public final T2 v2;
    public final T3 v3;
    public final T4 v4;
    public final T5 v5;
    public final T6 v6;
    public final T7 v7;
    public final T8 v8;
    public final T9 v9;
    public final T10 v10;

    public T1 v1() {
        return v1;
    }

    public T2 v2() {
        return v2;
    }

    public T3 v3() {
        return v3;
    }

    public T4 v4() {
        return v4;
    }

    public T5 v5() {
        return v5;
    }

    public T6 v6() {
        return v6;
    }

    public T7 v7() {
        return v7;
    }

    public T8 v8() {
        return v8;
    }

    public T9 v9() {
        return v9;
    }

    public T10 v10() {
        return v10;
    }

    public Tuple10(Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> tuple) {
        this.v1 = tuple.v1;
        this.v2 = tuple.v2;
        this.v3 = tuple.v3;
        this.v4 = tuple.v4;
        this.v5 = tuple.v5;
        this.v6 = tuple.v6;
        this.v7 = tuple.v7;
        this.v8 = tuple.v8;
        this.v9 = tuple.v9;
        this.v10 = tuple.v10;
    }

    public Tuple10(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
        this.v5 = v5;
        this.v6 = v6;
        this.v7 = v7;
        this.v8 = v8;
        this.v9 = v9;
        this.v10 = v10;
    }

    /**
     * Concatenate a value to this tuple.
     */
    public final <T11> Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> concat(T11 value) {
        return new Tuple11<>(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, value);
    }

    /**
     * Concatenate a tuple to this tuple.
     */
    public final <T11> Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> concat(Tuple1<T11> tuple) {
        return new Tuple11<>(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, tuple.v1);
    }

    /**
     * Concatenate a tuple to this tuple.
     */
    public final <T11, T12> Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> concat(Tuple2<T11, T12> tuple) {
        return new Tuple12<>(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, tuple.v1, tuple.v2);
    }

    /**
     * Concatenate a tuple to this tuple.
     */
    public final <T11, T12, T13> Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> concat(Tuple3<T11, T12, T13> tuple) {
        return new Tuple13<>(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, tuple.v1, tuple.v2, tuple.v3);
    }

    /**
     * Concatenate a tuple to this tuple.
     */
    public final <T11, T12, T13, T14> Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> concat(Tuple4<T11, T12, T13, T14> tuple) {
        return new Tuple14<>(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, tuple.v1, tuple.v2, tuple.v3, tuple.v4);
    }

    /**
     * Concatenate a tuple to this tuple.
     */
    public final <T11, T12, T13, T14, T15> Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> concat(Tuple5<T11, T12, T13, T14, T15> tuple) {
        return new Tuple15<>(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, tuple.v1, tuple.v2, tuple.v3, tuple.v4, tuple.v5);
    }

    /**
     * Concatenate a tuple to this tuple.
     */
    public final <T11, T12, T13, T14, T15, T16> Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> concat(Tuple6<T11, T12, T13, T14, T15, T16> tuple) {
        return new Tuple16<>(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, tuple.v1, tuple.v2, tuple.v3, tuple.v4, tuple.v5, tuple.v6);
    }

    /**
     * Split this tuple into two tuples of degree 0 and 10.
     */
    public final Tuple2<Tuple0, Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>> split0() {
        return new Tuple2<>(limit0(), skip0());
    }

    /**
     * Split this tuple into two tuples of degree 1 and 9.
     */
    public final Tuple2<Tuple1<T1>, Tuple9<T2, T3, T4, T5, T6, T7, T8, T9, T10>> split1() {
        return new Tuple2<>(limit1(), skip1());
    }

    /**
     * Split this tuple into two tuples of degree 2 and 8.
     */
    public final Tuple2<Tuple2<T1, T2>, Tuple8<T3, T4, T5, T6, T7, T8, T9, T10>> split2() {
        return new Tuple2<>(limit2(), skip2());
    }

    /**
     * Split this tuple into two tuples of degree 3 and 7.
     */
    public final Tuple2<Tuple3<T1, T2, T3>, Tuple7<T4, T5, T6, T7, T8, T9, T10>> split3() {
        return new Tuple2<>(limit3(), skip3());
    }

    /**
     * Split this tuple into two tuples of degree 4 and 6.
     */
    public final Tuple2<Tuple4<T1, T2, T3, T4>, Tuple6<T5, T6, T7, T8, T9, T10>> split4() {
        return new Tuple2<>(limit4(), skip4());
    }

    /**
     * Split this tuple into two tuples of degree 5 and 5.
     */
    public final Tuple2<Tuple5<T1, T2, T3, T4, T5>, Tuple5<T6, T7, T8, T9, T10>> split5() {
        return new Tuple2<>(limit5(), skip5());
    }

    /**
     * Split this tuple into two tuples of degree 6 and 4.
     */
    public final Tuple2<Tuple6<T1, T2, T3, T4, T5, T6>, Tuple4<T7, T8, T9, T10>> split6() {
        return new Tuple2<>(limit6(), skip6());
    }

    /**
     * Split this tuple into two tuples of degree 7 and 3.
     */
    public final Tuple2<Tuple7<T1, T2, T3, T4, T5, T6, T7>, Tuple3<T8, T9, T10>> split7() {
        return new Tuple2<>(limit7(), skip7());
    }

    /**
     * Split this tuple into two tuples of degree 8 and 2.
     */
    public final Tuple2<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, Tuple2<T9, T10>> split8() {
        return new Tuple2<>(limit8(), skip8());
    }

    /**
     * Split this tuple into two tuples of degree 9 and 1.
     */
    public final Tuple2<Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>, Tuple1<T10>> split9() {
        return new Tuple2<>(limit9(), skip9());
    }

    /**
     * Split this tuple into two tuples of degree 10 and 0.
     */
    public final Tuple2<Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, Tuple0> split10() {
        return new Tuple2<>(limit10(), skip10());
    }

    /**
     * Limit this tuple to degree 0.
     */
    public final Tuple0 limit0() {
        return new Tuple0();
    }

    /**
     * Limit this tuple to degree 1.
     */
    public final Tuple1<T1> limit1() {
        return new Tuple1<>(v1);
    }

    /**
     * Limit this tuple to degree 2.
     */
    public final Tuple2<T1, T2> limit2() {
        return new Tuple2<>(v1, v2);
    }

    /**
     * Limit this tuple to degree 3.
     */
    public final Tuple3<T1, T2, T3> limit3() {
        return new Tuple3<>(v1, v2, v3);
    }

    /**
     * Limit this tuple to degree 4.
     */
    public final Tuple4<T1, T2, T3, T4> limit4() {
        return new Tuple4<>(v1, v2, v3, v4);
    }

    /**
     * Limit this tuple to degree 5.
     */
    public final Tuple5<T1, T2, T3, T4, T5> limit5() {
        return new Tuple5<>(v1, v2, v3, v4, v5);
    }

    /**
     * Limit this tuple to degree 6.
     */
    public final Tuple6<T1, T2, T3, T4, T5, T6> limit6() {
        return new Tuple6<>(v1, v2, v3, v4, v5, v6);
    }

    /**
     * Limit this tuple to degree 7.
     */
    public final Tuple7<T1, T2, T3, T4, T5, T6, T7> limit7() {
        return new Tuple7<>(v1, v2, v3, v4, v5, v6, v7);
    }

    /**
     * Limit this tuple to degree 8.
     */
    public final Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> limit8() {
        return new Tuple8<>(v1, v2, v3, v4, v5, v6, v7, v8);
    }

    /**
     * Limit this tuple to degree 9.
     */
    public final Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> limit9() {
        return new Tuple9<>(v1, v2, v3, v4, v5, v6, v7, v8, v9);
    }

    /**
     * Limit this tuple to degree 10.
     */
    public final Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> limit10() {
        return this;
    }

    /**
     * Skip 0 degrees from this tuple.
     */
    public final Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> skip0() {
        return this;
    }

    /**
     * Skip 1 degrees from this tuple.
     */
    public final Tuple9<T2, T3, T4, T5, T6, T7, T8, T9, T10> skip1() {
        return new Tuple9<>(v2, v3, v4, v5, v6, v7, v8, v9, v10);
    }

    /**
     * Skip 2 degrees from this tuple.
     */
    public final Tuple8<T3, T4, T5, T6, T7, T8, T9, T10> skip2() {
        return new Tuple8<>(v3, v4, v5, v6, v7, v8, v9, v10);
    }

    /**
     * Skip 3 degrees from this tuple.
     */
    public final Tuple7<T4, T5, T6, T7, T8, T9, T10> skip3() {
        return new Tuple7<>(v4, v5, v6, v7, v8, v9, v10);
    }

    /**
     * Skip 4 degrees from this tuple.
     */
    public final Tuple6<T5, T6, T7, T8, T9, T10> skip4() {
        return new Tuple6<>(v5, v6, v7, v8, v9, v10);
    }

    /**
     * Skip 5 degrees from this tuple.
     */
    public final Tuple5<T6, T7, T8, T9, T10> skip5() {
        return new Tuple5<>(v6, v7, v8, v9, v10);
    }

    /**
     * Skip 6 degrees from this tuple.
     */
    public final Tuple4<T7, T8, T9, T10> skip6() {
        return new Tuple4<>(v7, v8, v9, v10);
    }

    /**
     * Skip 7 degrees from this tuple.
     */
    public final Tuple3<T8, T9, T10> skip7() {
        return new Tuple3<>(v8, v9, v10);
    }

    /**
     * Skip 8 degrees from this tuple.
     */
    public final Tuple2<T9, T10> skip8() {
        return new Tuple2<>(v9, v10);
    }

    /**
     * Skip 9 degrees from this tuple.
     */
    public final Tuple1<T10> skip9() {
        return new Tuple1<>(v10);
    }

    /**
     * Skip 10 degrees from this tuple.
     */
    public final Tuple0 skip10() {
        return new Tuple0();
    }

    /**
     * Apply this tuple as arguments to a function.
     */
    public final <R> R map(Function10<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? extends R> function) {
        return function.apply(this);
    }

    /**
     * Apply attribute 1 as argument to a function and return a new tuple with the substituted argument.
     */
    public final <U1> Tuple10<U1, T2, T3, T4, T5, T6, T7, T8, T9, T10> map1(Function1<? super T1, ? extends U1> function) {
        return Tuple.tuple(function.apply(v1), v2, v3, v4, v5, v6, v7, v8, v9, v10);
    }

    /**
     * Apply attribute 2 as argument to a function and return a new tuple with the substituted argument.
     */
    public final <U2> Tuple10<T1, U2, T3, T4, T5, T6, T7, T8, T9, T10> map2(Function1<? super T2, ? extends U2> function) {
        return Tuple.tuple(v1, function.apply(v2), v3, v4, v5, v6, v7, v8, v9, v10);
    }

    /**
     * Apply attribute 3 as argument to a function and return a new tuple with the substituted argument.
     */
    public final <U3> Tuple10<T1, T2, U3, T4, T5, T6, T7, T8, T9, T10> map3(Function1<? super T3, ? extends U3> function) {
        return Tuple.tuple(v1, v2, function.apply(v3), v4, v5, v6, v7, v8, v9, v10);
    }

    /**
     * Apply attribute 4 as argument to a function and return a new tuple with the substituted argument.
     */
    public final <U4> Tuple10<T1, T2, T3, U4, T5, T6, T7, T8, T9, T10> map4(Function1<? super T4, ? extends U4> function) {
        return Tuple.tuple(v1, v2, v3, function.apply(v4), v5, v6, v7, v8, v9, v10);
    }

    /**
     * Apply attribute 5 as argument to a function and return a new tuple with the substituted argument.
     */
    public final <U5> Tuple10<T1, T2, T3, T4, U5, T6, T7, T8, T9, T10> map5(Function1<? super T5, ? extends U5> function) {
        return Tuple.tuple(v1, v2, v3, v4, function.apply(v5), v6, v7, v8, v9, v10);
    }

    /**
     * Apply attribute 6 as argument to a function and return a new tuple with the substituted argument.
     */
    public final <U6> Tuple10<T1, T2, T3, T4, T5, U6, T7, T8, T9, T10> map6(Function1<? super T6, ? extends U6> function) {
        return Tuple.tuple(v1, v2, v3, v4, v5, function.apply(v6), v7, v8, v9, v10);
    }

    /**
     * Apply attribute 7 as argument to a function and return a new tuple with the substituted argument.
     */
    public final <U7> Tuple10<T1, T2, T3, T4, T5, T6, U7, T8, T9, T10> map7(Function1<? super T7, ? extends U7> function) {
        return Tuple.tuple(v1, v2, v3, v4, v5, v6, function.apply(v7), v8, v9, v10);
    }

    /**
     * Apply attribute 8 as argument to a function and return a new tuple with the substituted argument.
     */
    public final <U8> Tuple10<T1, T2, T3, T4, T5, T6, T7, U8, T9, T10> map8(Function1<? super T8, ? extends U8> function) {
        return Tuple.tuple(v1, v2, v3, v4, v5, v6, v7, function.apply(v8), v9, v10);
    }

    /**
     * Apply attribute 9 as argument to a function and return a new tuple with the substituted argument.
     */
    public final <U9> Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, U9, T10> map9(Function1<? super T9, ? extends U9> function) {
        return Tuple.tuple(v1, v2, v3, v4, v5, v6, v7, v8, function.apply(v9), v10);
    }

    /**
     * Apply attribute 10 as argument to a function and return a new tuple with the substituted argument.
     */
    public final <U10> Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, U10> map10(Function1<? super T10, ? extends U10> function) {
        return Tuple.tuple(v1, v2, v3, v4, v5, v6, v7, v8, v9, function.apply(v10));
    }

    @Override
    @Deprecated
    public final Object[] array() {
        return toArray();
    }

    @Override
    public final Object[] toArray() {
        return new Object[] { v1, v2, v3, v4, v5, v6, v7, v8, v9, v10 };
    }

    @Override
    @Deprecated
    public final List<?> list() {
        return toList();
    }

    @Override
    public final List<?> toList() {
        return Arrays.asList(toArray());
    }

    @Override
    public final Seq<?> toSeq() {
        return Seq.seq(toList());
    }

    @Override
    public final Map<String, ?> toMap() {
        return toMap(i -> "v" + (i + 1));
    }

    @Override
    public final <K> Map<K, ?> toMap(Function<? super Integer, ? extends K> keyMapper) {
        Map<K, Object> result = new LinkedHashMap<>();
        Object[] array = toArray();

        for (int i = 0; i < array.length; i++)
            result.put(keyMapper.apply(i), array[i]);

        return result;
    }

    public final <K> Map<K, ?> toMap(
        Supplier<? extends K> keySupplier1, 
        Supplier<? extends K> keySupplier2, 
        Supplier<? extends K> keySupplier3, 
        Supplier<? extends K> keySupplier4, 
        Supplier<? extends K> keySupplier5, 
        Supplier<? extends K> keySupplier6, 
        Supplier<? extends K> keySupplier7, 
        Supplier<? extends K> keySupplier8, 
        Supplier<? extends K> keySupplier9, 
        Supplier<? extends K> keySupplier10
    ) {
        Map<K, Object> result = new LinkedHashMap<>();
        
        result.put(keySupplier1.get(), v1);
        result.put(keySupplier2.get(), v2);
        result.put(keySupplier3.get(), v3);
        result.put(keySupplier4.get(), v4);
        result.put(keySupplier5.get(), v5);
        result.put(keySupplier6.get(), v6);
        result.put(keySupplier7.get(), v7);
        result.put(keySupplier8.get(), v8);
        result.put(keySupplier9.get(), v9);
        result.put(keySupplier10.get(), v10);
        
        return result;
    }

    public final <K> Map<K, ?> toMap(
        K key1, 
        K key2, 
        K key3, 
        K key4, 
        K key5, 
        K key6, 
        K key7, 
        K key8, 
        K key9, 
        K key10
    ) {
        Map<K, Object> result = new LinkedHashMap<>();
        
        result.put(key1, v1);
        result.put(key2, v2);
        result.put(key3, v3);
        result.put(key4, v4);
        result.put(key5, v5);
        result.put(key6, v6);
        result.put(key7, v7);
        result.put(key8, v8);
        result.put(key9, v9);
        result.put(key10, v10);
        
        return result;
    }

    /**
     * The degree of this tuple: 10.
     */
    @Override
    public final int degree() {
        return 10;
    }

    @Override
    @SuppressWarnings("unchecked")
    public final Iterator<Object> iterator() {
        return (Iterator<Object>) list().iterator();
    }

    @Override
    public int compareTo(Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> other) {
        int result = 0;

        result = Tuples.compare(v1, other.v1); if (result != 0) return result;
        result = Tuples.compare(v2, other.v2); if (result != 0) return result;
        result = Tuples.compare(v3, other.v3); if (result != 0) return result;
        result = Tuples.compare(v4, other.v4); if (result != 0) return result;
        result = Tuples.compare(v5, other.v5); if (result != 0) return result;
        result = Tuples.compare(v6, other.v6); if (result != 0) return result;
        result = Tuples.compare(v7, other.v7); if (result != 0) return result;
        result = Tuples.compare(v8, other.v8); if (result != 0) return result;
        result = Tuples.compare(v9, other.v9); if (result != 0) return result;
        result = Tuples.compare(v10, other.v10); if (result != 0) return result;

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Tuple10))
            return false;

        @SuppressWarnings({ "unchecked", "rawtypes" })
        final Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> that = (Tuple10) o;

        if (!Objects.equals(v1, that.v1)) return false;
        if (!Objects.equals(v2, that.v2)) return false;
        if (!Objects.equals(v3, that.v3)) return false;
        if (!Objects.equals(v4, that.v4)) return false;
        if (!Objects.equals(v5, that.v5)) return false;
        if (!Objects.equals(v6, that.v6)) return false;
        if (!Objects.equals(v7, that.v7)) return false;
        if (!Objects.equals(v8, that.v8)) return false;
        if (!Objects.equals(v9, that.v9)) return false;
        if (!Objects.equals(v10, that.v10)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((v1 == null) ? 0 : v1.hashCode());
        result = prime * result + ((v2 == null) ? 0 : v2.hashCode());
        result = prime * result + ((v3 == null) ? 0 : v3.hashCode());
        result = prime * result + ((v4 == null) ? 0 : v4.hashCode());
        result = prime * result + ((v5 == null) ? 0 : v5.hashCode());
        result = prime * result + ((v6 == null) ? 0 : v6.hashCode());
        result = prime * result + ((v7 == null) ? 0 : v7.hashCode());
        result = prime * result + ((v8 == null) ? 0 : v8.hashCode());
        result = prime * result + ((v9 == null) ? 0 : v9.hashCode());
        result = prime * result + ((v10 == null) ? 0 : v10.hashCode());

        return result;
    }

    @Override
    public String toString() {
        return "("
             +        v1
             + ", " + v2
             + ", " + v3
             + ", " + v4
             + ", " + v5
             + ", " + v6
             + ", " + v7
             + ", " + v8
             + ", " + v9
             + ", " + v10
             + ")";
    }

    @Override
    public Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> clone() {
        return new Tuple10<>(this);
    }
}
