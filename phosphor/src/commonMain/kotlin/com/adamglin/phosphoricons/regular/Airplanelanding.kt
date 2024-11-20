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

public val RegularGroup.AirplaneLanding: ImageVector
    get() {
        if (_airplaneLanding != null) {
            return _airplaneLanding!!
        }
        _airplaneLanding = Builder(name = "AirplaneLanding", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(104.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(248.0f, 208.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 256.0f, 216.0f)
                close()
                moveTo(229.84f, 191.7f)
                lineTo(53.21f, 142.24f)
                arcTo(40.12f, 40.12f, 0.0f, false, true, 24.0f, 103.72f)
                lineTo(24.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 45.06f, 32.82f)
                lineToRelative(5.47f, 1.82f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.0f, 4.87f)
                lineTo(66.13f, 68.88f)
                lineTo(96.0f, 77.39f)
                lineTo(96.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 21.06f, -15.18f)
                lineToRelative(5.47f, 1.82f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.85f, 4.5f)
                lineToRelative(22.5f, 53.63f)
                lineToRelative(60.84f, 17.0f)
                arcTo(40.13f, 40.13f, 0.0f, false, true, 240.0f, 148.32f)
                lineTo(240.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.16f, 7.7f)
                close()
                moveTo(224.0f, 148.32f)
                arcToRelative(24.09f, 24.09f, 0.0f, false, false, -17.58f, -23.13f)
                lineToRelative(-64.57f, -18.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.23f, -4.61f)
                lineTo(114.0f, 48.67f)
                lineTo(112.0f, 48.0f)
                lineTo(112.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.19f, 7.7f)
                lineToRelative(-44.0f, -12.54f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.33f, -5.0f)
                lineTo(41.79f, 48.59f)
                lineTo(40.0f, 48.0f)
                verticalLineToRelative(55.72f)
                arcToRelative(24.09f, 24.09f, 0.0f, false, false, 17.53f, 23.12f)
                lineTo(224.0f, 173.45f)
                close()
            }
        }
        .build()
        return _airplaneLanding!!
    }

private var _airplaneLanding: ImageVector? = null
