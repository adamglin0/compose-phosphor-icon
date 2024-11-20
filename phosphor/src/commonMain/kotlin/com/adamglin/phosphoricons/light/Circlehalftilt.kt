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

public val LightGroup.CircleHalfTilt: ImageVector
    get() {
        if (_circleHalfTilt != null) {
            return _circleHalfTilt!!
        }
        _circleHalfTilt = Builder(name = "CircleHalfTilt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.12f, 55.88f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 55.88f, 200.13f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 200.12f, 55.88f)
                close()
                moveTo(90.0f, 209.62f)
                arcToRelative(89.61f, 89.61f, 0.0f, false, true, -21.23f, -13.89f)
                lineTo(90.0f, 174.49f)
                close()
                moveTo(122.0f, 217.78f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, true, -20.0f, -3.58f)
                lineTo(102.0f, 162.49f)
                lineToRelative(20.0f, -20.0f)
                close()
                moveTo(154.0f, 214.2f)
                arcToRelative(89.8f, 89.8f, 0.0f, false, true, -20.0f, 3.58f)
                lineTo(134.0f, 130.49f)
                lineToRelative(20.0f, -20.0f)
                close()
                moveTo(186.0f, 196.8f)
                arcToRelative(89.45f, 89.45f, 0.0f, false, true, -20.0f, 12.83f)
                lineTo(166.0f, 98.49f)
                lineToRelative(20.0f, -20.0f)
                close()
                moveTo(60.27f, 187.24f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, true, 127.0f, -127.0f)
                close()
                moveTo(198.0f, 184.57f)
                lineTo(198.0f, 71.43f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, true, 0.0f, 113.14f)
                close()
            }
        }
        .build()
        return _circleHalfTilt!!
    }

private var _circleHalfTilt: ImageVector? = null
