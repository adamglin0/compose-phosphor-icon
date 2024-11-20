package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.ClockClockwise: ImageVector
    get() {
        if (_clockClockwise != null) {
            return _clockClockwise!!
        }
        _clockClockwise = Builder(name = "ClockClockwise", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.0f, 80.0f)
                verticalLineToRelative(41.21f)
                lineToRelative(34.17f, 20.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.34f, 20.58f)
                lineToRelative(-40.0f, -24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 116.0f, 128.0f)
                lineTo(116.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(224.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(7.37f)
                curveToRelative(-4.21f, -4.67f, -8.58f, -9.31f, -13.29f, -14.08f)
                arcToRelative(100.0f, 100.0f, 0.0f, true, false, -2.07f, 143.44f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.48f, -17.46f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, true, 1.53f, -109.06f)
                curveTo(187.61f, 80.2f, 193.0f, 86.0f, 198.23f, 92.0f)
                lineTo(184.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(236.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 52.0f)
                close()
            }
        }
        .build()
        return _clockClockwise!!
    }

private var _clockClockwise: ImageVector? = null
