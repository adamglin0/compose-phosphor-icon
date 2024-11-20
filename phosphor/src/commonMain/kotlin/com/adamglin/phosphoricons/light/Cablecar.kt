package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.CableCar: ImageVector
    get() {
        if (_cableCar != null) {
            return _cableCar!!
        }
        _cableCar = Builder(name = "CableCar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.91f, 31.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.0f, -4.85f)
                lineTo(15.0f, 66.1f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 16.0f, 78.0f)
                arcToRelative(6.53f, 6.53f, 0.0f, false, false, 1.07f, -0.09f)
                lineTo(122.0f, 59.17f)
                lineTo(122.0f, 98.0f)
                lineTo(64.0f, 98.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -30.0f, 30.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 30.0f, 30.0f)
                lineTo(192.0f, 222.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 30.0f, -30.0f)
                lineTo(222.0f, 128.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -30.0f, -30.0f)
                lineTo(134.0f, 98.0f)
                lineTo(134.0f, 57.0f)
                lineTo(241.05f, 37.91f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 245.91f, 31.0f)
                close()
                moveTo(102.0f, 162.0f)
                lineTo(102.0f, 110.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(52.0f)
                close()
                moveTo(64.0f, 110.0f)
                lineTo(90.0f, 110.0f)
                verticalLineToRelative(52.0f)
                lineTo(46.0f, 162.0f)
                lineTo(46.0f, 128.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 64.0f, 110.0f)
                close()
                moveTo(192.0f, 210.0f)
                lineTo(64.0f, 210.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -18.0f, -18.0f)
                lineTo(46.0f, 174.0f)
                lineTo(210.0f, 174.0f)
                verticalLineToRelative(18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 192.0f, 210.0f)
                close()
                moveTo(210.0f, 128.0f)
                verticalLineToRelative(34.0f)
                lineTo(166.0f, 162.0f)
                lineTo(166.0f, 110.0f)
                horizontalLineToRelative(26.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 210.0f, 128.0f)
                close()
            }
        }
        .build()
        return _cableCar!!
    }

private var _cableCar: ImageVector? = null
