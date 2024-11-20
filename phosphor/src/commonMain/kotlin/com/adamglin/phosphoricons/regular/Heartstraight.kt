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

public val RegularGroup.HeartStraight: ImageVector
    get() {
        if (_heartStraight != null) {
            return _heartStraight!!
        }
        _heartStraight = Builder(name = "HeartStraight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.0f, 57.0f)
                arcToRelative(58.07f, 58.07f, 0.0f, false, false, -81.92f, -0.1f)
                lineTo(128.0f, 69.05f)
                lineTo(114.91f, 56.86f)
                arcTo(58.0f, 58.0f, 0.0f, false, false, 33.0f, 139.0f)
                lineToRelative(89.35f, 90.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.4f, 0.0f)
                lineTo(223.0f, 139.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, false, 0.0f, -82.0f)
                close()
                moveTo(211.65f, 127.76f)
                lineTo(128.0f, 212.6f)
                lineTo(44.3f, 127.68f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 59.4f, -59.4f)
                lineToRelative(0.2f, 0.2f)
                lineToRelative(18.65f, 17.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.9f, 0.0f)
                lineTo(152.1f, 68.48f)
                lineToRelative(0.2f, -0.2f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, true, 59.36f, 59.44f)
                close()
            }
        }
        .build()
        return _heartStraight!!
    }

private var _heartStraight: ImageVector? = null
