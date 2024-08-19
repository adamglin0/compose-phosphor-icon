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

public val LightGroup.Bread: ImageVector
    get() {
        if (_bread != null) {
            return _bread!!
        }
        _bread = Builder(name = "Bread", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.0f, 80.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -38.0f, -38.0f)
                lineTo(48.0f, 42.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -14.0f, 73.32f)
                lineTo(34.0f, 200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(200.0f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(214.0f, 115.32f)
                arcTo(38.07f, 38.07f, 0.0f, false, false, 238.0f, 80.0f)
                close()
                moveTo(46.0f, 200.0f)
                lineTo(46.0f, 118.0f)
                curveToRelative(0.66f, 0.0f, 1.33f, 0.0f, 2.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 0.0f, -52.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 0.0f, 52.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.67f, 0.0f, 1.34f, 0.0f, 2.0f, 0.0f)
                lineTo(146.0f, 200.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(48.0f, 202.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 46.0f, 200.0f)
                close()
                moveTo(200.0f, 106.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.67f, 0.0f, 1.34f, 0.0f, 2.0f, 0.0f)
                lineTo(202.0f, 200.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(157.84f, 202.0f)
                arcToRelative(14.71f, 14.71f, 0.0f, false, false, 0.16f, -2.0f)
                lineTo(158.0f, 115.32f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 171.68f, 54.0f)
                lineTo(200.0f, 54.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 0.0f, 52.0f)
                close()
            }
        }
        .build()
        return _bread!!
    }

private var _bread: ImageVector? = null
