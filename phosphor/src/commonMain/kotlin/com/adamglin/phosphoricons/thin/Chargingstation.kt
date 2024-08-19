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

public val ThinGroup.Chargingstation: ImageVector
    get() {
        if (_chargingstation != null) {
            return _chargingstation!!
        }
        _chargingstation = Builder(name = "Chargingstation", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(131.31f, 125.76f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.4f, 3.73f)
                lineToRelative(-16.0f, 40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 112.0f, 172.0f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, true, -1.49f, -0.29f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.22f, -5.2f)
                lineTo(122.09f, 132.0f)
                horizontalLineTo(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.71f, -5.49f)
                lineToRelative(16.0f, -40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.42f, 3.0f)
                lineTo(101.91f, 124.0f)
                horizontalLineTo(128.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 131.31f, 125.76f)
                close()
                moveTo(244.0f, 86.63f)
                verticalLineTo(168.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f)
                verticalLineTo(128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineTo(172.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                horizontalLineTo(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineTo(52.0f)
                verticalLineTo(56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 72.0f, 36.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f)
                verticalLineToRelative(52.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(86.63f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.51f, -8.49f)
                lineTo(213.17f, 58.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineToRelative(19.31f, 19.32f)
                arcTo(19.85f, 19.85f, 0.0f, false, true, 244.0f, 86.63f)
                close()
                moveTo(164.0f, 212.0f)
                verticalLineTo(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineTo(72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 60.0f, 56.0f)
                verticalLineTo(212.0f)
                close()
            }
        }
        .build()
        return _chargingstation!!
    }

private var _chargingstation: ImageVector? = null
