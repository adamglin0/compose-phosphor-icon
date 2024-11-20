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

public val LightGroup.PenNibStraight: ImageVector
    get() {
        if (_penNibStraight != null) {
            return _penNibStraight!!
        }
        _penNibStraight = Builder(name = "PenNibStraight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.54f, 124.77f)
                arcToRelative(1.91f, 1.91f, 0.0f, false, false, -0.15f, -0.28f)
                lineTo(190.0f, 70.42f)
                lineTo(190.0f, 32.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(80.0f, 18.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 66.0f, 32.0f)
                lineTo(66.0f, 70.44f)
                lineToRelative(-30.4f, 54.05f)
                arcToRelative(1.91f, 1.91f, 0.0f, false, false, -0.15f, 0.28f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 1.27f, 14.5f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, true, 0.08f, 0.11f)
                lineToRelative(86.44f, 112.28f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.51f, 0.0f)
                lineToRelative(86.43f, -112.28f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, true, 0.08f, -0.11f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 220.54f, 124.77f)
                close()
                moveTo(80.0f, 30.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                lineTo(178.0f, 66.0f)
                lineTo(78.0f, 66.0f)
                lineTo(78.0f, 32.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 80.0f, 30.0f)
                close()
                moveTo(128.0f, 146.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 128.0f, 146.0f)
                close()
                moveTo(209.63f, 132.12f)
                lineTo(134.0f, 230.38f)
                lineTo(134.0f, 157.29f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, -12.0f, 0.0f)
                verticalLineToRelative(73.07f)
                lineTo(46.37f, 132.12f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.2f, -1.93f)
                lineTo(75.52f, 78.0f)
                horizontalLineToRelative(105.0f)
                lineToRelative(29.34f, 52.19f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 209.63f, 132.12f)
                close()
            }
        }
        .build()
        return _penNibStraight!!
    }

private var _penNibStraight: ImageVector? = null
