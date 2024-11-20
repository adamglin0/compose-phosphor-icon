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

public val ThinGroup.AirplaneInFlight: ImageVector
    get() {
        if (_airplaneInFlight != null) {
            return _airplaneInFlight!!
        }
        _airplaneInFlight = Builder(name = "AirplaneInFlight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(72.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(216.0f, 212.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 216.0f)
                close()
                moveTo(244.0f, 136.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(61.06f, 164.0f)
                arcToRelative(35.79f, 35.79f, 0.0f, false, true, -34.48f, -25.66f)
                lineTo(12.52f, 91.45f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 24.0f, 76.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.83f, 1.17f)
                lineTo(57.66f, 100.0f)
                horizontalLineToRelative(29.7f)
                lineTo(76.63f, 67.79f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 88.0f, 52.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.83f, 1.17f)
                lineTo(145.66f, 100.0f)
                lineTo(208.0f, 100.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 244.0f, 136.0f)
                close()
                moveTo(236.0f, 136.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -28.0f, -28.0f)
                lineTo(144.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.83f, -1.17f)
                lineTo(94.35f, 60.0f)
                lineTo(88.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.8f, 5.26f)
                lineTo(96.7f, 102.74f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 92.91f, 108.0f)
                lineTo(56.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.82f, -1.17f)
                lineTo(30.35f, 84.0f)
                lineTo(24.0f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.83f, 5.15f)
                lineToRelative(14.07f, 46.9f)
                arcTo(27.83f, 27.83f, 0.0f, false, false, 61.06f, 156.0f)
                lineTo(236.0f, 156.0f)
                close()
            }
        }
        .build()
        return _airplaneInFlight!!
    }

private var _airplaneInFlight: ImageVector? = null
