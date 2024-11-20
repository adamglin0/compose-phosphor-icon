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

public val LightGroup.MedalMilitary: ImageVector
    get() {
        if (_medalMilitary != null) {
            return _medalMilitary!!
        }
        _medalMilitary = Builder(name = "MedalMilitary", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(207.0f, 42.0f)
                lineTo(49.0f, 42.0f)
                arcTo(15.0f, 15.0f, 0.0f, false, false, 34.0f, 57.0f)
                verticalLineToRelative(49.21f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, false, 8.79f, 13.65f)
                lineTo(109.19f, 150.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, false, 37.62f, 0.0f)
                lineToRelative(66.4f, -30.18f)
                arcTo(15.0f, 15.0f, 0.0f, false, false, 222.0f, 106.21f)
                lineTo(222.0f, 57.0f)
                arcTo(15.0f, 15.0f, 0.0f, false, false, 207.0f, 42.0f)
                close()
                moveTo(162.0f, 54.0f)
                verticalLineToRelative(76.0f)
                lineToRelative(-34.0f, 15.45f)
                lineTo(94.0f, 130.0f)
                lineTo(94.0f, 54.0f)
                close()
                moveTo(46.0f, 106.21f)
                lineTo(46.0f, 57.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                lineTo(82.0f, 54.0f)
                verticalLineToRelative(70.5f)
                lineTo(47.76f, 108.94f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 46.0f, 106.21f)
                close()
                moveTo(162.0f, 192.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, -34.0f, -34.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 162.0f, 192.0f)
                close()
                moveTo(210.0f, 106.21f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.76f, 2.73f)
                lineTo(174.0f, 124.5f)
                lineTo(174.0f, 54.0f)
                horizontalLineToRelative(33.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _medalMilitary!!
    }

private var _medalMilitary: ImageVector? = null
