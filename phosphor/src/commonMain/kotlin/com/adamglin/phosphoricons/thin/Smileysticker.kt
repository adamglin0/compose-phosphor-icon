package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Smileysticker: ImageVector
    get() {
        if (_smileysticker != null) {
            return _smileysticker!!
        }
        _smileysticker = Builder(name = "Smileysticker", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcToRelative(100.0f, 100.0f, 0.0f, true, false, 29.39f, 195.61f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, false, 1.66f, -1.0f)
                lineTo(222.62f, 159.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.0f, -1.65f)
                arcTo(100.07f, 100.07f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(216.25f, 154.1f)
                lineTo(154.1f, 216.25f)
                arcToRelative(91.88f, 91.88f, 0.0f, true, true, 62.15f, -62.15f)
                close()
                moveTo(84.0f, 108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 84.0f, 108.0f)
                close()
                moveTo(172.0f, 108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 172.0f, 108.0f)
                close()
                moveTo(171.46f, 154.0f)
                curveToRelative(-9.55f, 16.52f, -25.39f, 26.0f, -43.46f, 26.0f)
                reflectiveCurveToRelative(-33.91f, -9.48f, -43.46f, -26.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.92f, -4.0f)
                curveToRelative(8.21f, 14.19f, 21.19f, 22.0f, 36.54f, 22.0f)
                reflectiveCurveToRelative(28.33f, -7.81f, 36.54f, -22.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.92f, 4.0f)
                close()
            }
        }
        .build()
        return _smileysticker!!
    }

private var _smileysticker: ImageVector? = null
