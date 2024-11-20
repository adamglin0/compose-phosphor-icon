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

public val RegularGroup.GlobeHemisphereEast: ImageVector
    get() {
        if (_globeHemisphereEast != null) {
            return _globeHemisphereEast!!
        }
        _globeHemisphereEast = Builder(name = "GlobeHemisphereEast", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 40.0f)
                arcToRelative(87.5f, 87.5f, 0.0f, false, true, 48.0f, 14.28f)
                lineTo(176.0f, 74.0f)
                lineTo(153.83f, 99.74f)
                lineTo(122.36f, 104.0f)
                lineToRelative(-0.31f, -0.22f)
                lineTo(102.38f, 90.92f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 79.87f, 95.1f)
                lineTo(58.93f, 126.4f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -2.7f, 8.81f)
                lineTo(56.0f, 171.44f)
                lineToRelative(-3.27f, 2.15f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 128.0f, 40.0f)
                close()
                moveTo(62.29f, 186.47f)
                lineToRelative(2.52f, -1.65f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 72.0f, 171.53f)
                lineToRelative(0.21f, -36.23f)
                lineTo(93.17f, 104.0f)
                arcToRelative(3.62f, 3.62f, 0.0f, false, false, 0.32f, 0.22f)
                lineToRelative(19.67f, 12.87f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, false, 11.35f, 2.77f)
                lineTo(156.0f, 115.59f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 10.0f, -5.41f)
                lineToRelative(22.17f, -25.76f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 192.0f, 74.0f)
                lineTo(192.0f, 67.67f)
                arcTo(87.87f, 87.87f, 0.0f, false, true, 211.77f, 155.0f)
                lineToRelative(-16.14f, -14.76f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.93f, -3.0f)
                lineToRelative(-30.46f, 12.65f)
                arcToRelative(16.08f, 16.08f, 0.0f, false, false, -9.68f, 12.45f)
                lineToRelative(-2.39f, 16.19f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 11.77f, 17.81f)
                lineTo(169.4f, 202.0f)
                lineToRelative(2.36f, 2.37f)
                arcTo(87.88f, 87.88f, 0.0f, false, true, 62.29f, 186.47f)
                close()
                moveTo(185.0f, 195.0f)
                lineToRelative(-4.3f, -4.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -7.26f, -4.18f)
                lineTo(152.0f, 180.85f)
                lineToRelative(2.39f, -16.19f)
                lineTo(184.84f, 152.0f)
                lineTo(205.0f, 170.48f)
                arcTo(88.43f, 88.43f, 0.0f, false, true, 185.0f, 195.0f)
                close()
            }
        }
        .build()
        return _globeHemisphereEast!!
    }

private var _globeHemisphereEast: ImageVector? = null
