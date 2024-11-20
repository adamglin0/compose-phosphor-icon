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

public val LightGroup.Bird: ImageVector
    get() {
        if (_bird != null) {
            return _bird!!
        }
        _bird = Builder(name = "Bird", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.0f, 68.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 174.0f, 68.0f)
                close()
                moveTo(238.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.67f, 5.0f)
                lineTo(214.0f, 99.21f)
                lineTo(214.0f, 120.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, true, 112.0f, 222.0f)
                lineTo(24.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -10.93f, -22.75f)
                lineToRelative(0.07f, -0.09f)
                lineTo(98.0f, 97.35f)
                lineTo(98.0f, 76.89f)
                curveTo(98.0f, 44.57f, 123.89f, 18.15f, 155.72f, 18.0f)
                lineTo(156.0f, 18.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, true, 55.51f, 41.13f)
                lineTo(235.33f, 75.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 238.0f, 80.0f)
                close()
                moveTo(221.18f, 80.0f)
                lineTo(203.0f, 67.88f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.48f, -3.48f)
                arcTo(46.0f, 46.0f, 0.0f, false, false, 156.0f, 30.0f)
                horizontalLineToRelative(-0.23f)
                curveTo(130.53f, 30.12f, 110.0f, 51.16f, 110.0f, 76.89f)
                lineTo(110.0f, 99.52f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.39f, 3.85f)
                lineTo(22.43f, 206.78f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 24.0f, 210.0f)
                lineTo(51.86f, 210.0f)
                lineToRelative(71.53f, -85.84f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.22f, 7.68f)
                lineTo(67.48f, 210.0f)
                lineTo(112.0f, 210.0f)
                arcToRelative(90.1f, 90.1f, 0.0f, false, false, 90.0f, -90.0f)
                lineTo(202.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.67f, -5.0f)
                close()
            }
        }
        .build()
        return _bird!!
    }

private var _bird: ImageVector? = null
