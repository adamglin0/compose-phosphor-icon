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

public val RegularGroup.ChargingStation: ImageVector
    get() {
        if (_chargingStation != null) {
            return _chargingStation!!
        }
        _chargingStation = Builder(name = "ChargingStation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.62f, 123.51f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.81f, 7.46f)
                lineToRelative(-16.0f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 104.57f, 165.0f)
                lineToRelative(11.61f, -29.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.43f, -11.0f)
                lineToRelative(16.0f, -40.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 119.43f, 91.0f)
                lineToRelative(-11.61f, 29.0f)
                horizontalLineTo(128.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 134.62f, 123.51f)
                close()
                moveTo(248.0f, 86.63f)
                verticalLineTo(168.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -48.0f, 0.0f)
                verticalLineTo(128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                horizontalLineTo(176.0f)
                verticalLineToRelative(88.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(48.0f)
                verticalLineTo(56.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 72.0f, 32.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 24.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 24.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(86.63f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 229.66f, 81.0f)
                lineTo(210.34f, 61.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(241.0f, 69.66f)
                arcTo(23.85f, 23.85f, 0.0f, false, true, 248.0f, 86.63f)
                close()
                moveTo(160.0f, 208.0f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                horizontalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineTo(208.0f)
                close()
            }
        }
        .build()
        return _chargingStation!!
    }

private var _chargingStation: ImageVector? = null
