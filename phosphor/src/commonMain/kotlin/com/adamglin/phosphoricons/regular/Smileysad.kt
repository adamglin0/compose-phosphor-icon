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

public val RegularGroup.Smileysad: ImageVector
    get() {
        if (_smileysad != null) {
            return _smileysad!!
        }
        _smileysad = Builder(name = "Smileysad", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 88.0f, -88.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 128.0f, 216.0f)
                close()
                moveTo(80.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 108.0f)
                close()
                moveTo(176.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 108.0f)
                close()
                moveTo(174.92f, 172.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.84f, 8.0f)
                curveToRelative(-7.47f, -12.91f, -19.21f, -20.0f, -33.08f, -20.0f)
                reflectiveCurveToRelative(-25.61f, 7.1f, -33.08f, 20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.84f, -8.0f)
                curveToRelative(10.29f, -17.79f, 27.39f, -28.0f, 46.92f, -28.0f)
                reflectiveCurveTo(164.63f, 154.2f, 174.92f, 172.0f)
                close()
            }
        }
        .build()
        return _smileysad!!
    }

private var _smileysad: ImageVector? = null
