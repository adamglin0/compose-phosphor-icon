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

public val BoldGroup.HeartBreak: ImageVector
    get() {
        if (_heartBreak != null) {
            return _heartBreak!!
        }
        _heartBreak = Builder(name = "HeartBreak", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.0f, 36.0f)
                arcToRelative(65.6f, 65.6f, 0.0f, false, false, -46.67f, 19.33f)
                lineTo(128.0f, 58.66f)
                lineToRelative(-3.33f, -3.33f)
                arcTo(66.0f, 66.0f, 0.0f, false, false, 12.0f, 102.0f)
                curveToRelative(0.0f, 72.34f, 105.81f, 130.14f, 110.31f, 132.57f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.38f, 0.0f)
                curveTo(138.19f, 232.14f, 244.0f, 174.34f, 244.0f, 102.0f)
                arcTo(66.08f, 66.08f, 0.0f, false, false, 178.0f, 36.0f)
                close()
                moveTo(172.51f, 178.36f)
                arcTo(328.69f, 328.69f, 0.0f, false, true, 128.0f, 210.16f)
                arcToRelative(328.69f, 328.69f, 0.0f, false, true, -44.51f, -31.8f)
                curveTo(61.82f, 159.77f, 36.0f, 131.42f, 36.0f, 102.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 71.7f, -29.7f)
                lineTo(111.0f, 75.63f)
                lineToRelative(-7.52f, 7.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                lineToRelative(21.7f, 21.7f)
                lineToRelative(-13.7f, 13.69f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.0f, 17.0f)
                lineToRelative(22.18f, -22.19f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                lineTo(129.0f, 91.63f)
                lineTo(148.3f, 72.3f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 220.0f, 102.0f)
                curveTo(220.0f, 131.42f, 194.18f, 159.77f, 172.51f, 178.36f)
                close()
            }
        }
        .build()
        return _heartBreak!!
    }

private var _heartBreak: ImageVector? = null
