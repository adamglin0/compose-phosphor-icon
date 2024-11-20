package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.HeartStraightBreak: ImageVector
    get() {
        if (_heartStraightBreak != null) {
            return _heartStraightBreak!!
        }
        _heartStraightBreak = Builder(name = "HeartStraightBreak", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.0f, 57.0f)
                arcToRelative(58.1f, 58.1f, 0.0f, false, false, -82.0f, -0.06f)
                lineTo(128.0f, 69.47f)
                lineTo(115.0f, 56.91f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, false, -82.0f, 82.05f)
                lineToRelative(89.37f, 90.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.4f, 0.0f)
                lineTo(223.0f, 139.0f)
                arcTo(58.09f, 58.09f, 0.0f, false, false, 223.0f, 57.0f)
                close()
                moveTo(211.64f, 127.76f)
                lineTo(128.0f, 212.6f)
                lineTo(44.29f, 127.68f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, true, 59.41f, -59.4f)
                lineToRelative(0.1f, 0.1f)
                lineToRelative(12.67f, 12.19f)
                lineToRelative(-10.0f, 9.65f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.11f, 11.42f)
                lineTo(132.69f, 128.0f)
                lineToRelative(-10.35f, 10.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineToRelative(16.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.31f)
                lineTo(123.42f, 96.09f)
                lineTo(152.2f, 68.38f)
                lineToRelative(0.11f, -0.1f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, true, 59.37f, 59.44f)
                close()
            }
        }
        .build()
        return _heartStraightBreak!!
    }

private var _heartStraightBreak: ImageVector? = null
