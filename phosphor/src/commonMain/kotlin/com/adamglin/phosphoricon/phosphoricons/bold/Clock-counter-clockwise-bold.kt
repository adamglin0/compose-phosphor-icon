package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Clock-counter-clockwise-bold`: ImageVector
    get() {
        if (`_clock-counter-clockwise-bold` != null) {
            return `_clock-counter-clockwise-bold`!!
        }
        `_clock-counter-clockwise-bold` = Builder(name = "Clock-counter-clockwise-bold",
                defaultWidth = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f,
                viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.0f, 80.0f)
                verticalLineToRelative(41.21f)
                lineToRelative(34.17f, 20.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.34f, 20.58f)
                lineToRelative(-40.0f, -24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 116.0f, 128.0f)
                verticalLineTo(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(128.0f, 28.0f)
                arcTo(99.38f, 99.38f, 0.0f, false, false, 57.24f, 57.34f)
                curveToRelative(-4.69f, 4.74f, -9.0f, 9.37f, -13.24f, 14.0f)
                verticalLineTo(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(57.77f)
                curveTo(63.0f, 86.0f, 68.37f, 80.22f, 74.26f, 74.26f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, true, 1.58f, 109.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.48f, 17.46f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 128.0f, 28.0f)
                close()
            }
        }
        .build()
        return `_clock-counter-clockwise-bold`!!
    }

private var `_clock-counter-clockwise-bold`: ImageVector? = null
