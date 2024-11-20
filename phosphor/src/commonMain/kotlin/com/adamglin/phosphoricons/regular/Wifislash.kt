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

public val RegularGroup.WifiSlash: ImageVector
    get() {
        if (_wifiSlash != null) {
            return _wifiSlash!!
        }
        _wifiSlash = Builder(name = "WifiSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.92f, 210.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f)
                lineToRelative(-52.0f, -57.15f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, -57.41f, 7.24f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -9.42f, -12.93f)
                arcTo(75.43f, 75.43f, 0.0f, false, true, 128.0f, 144.0f)
                curveToRelative(1.28f, 0.0f, 2.55f, 0.0f, 3.82f, 0.1f)
                lineTo(104.9f, 114.49f)
                arcTo(108.0f, 108.0f, 0.0f, false, false, 61.0f, 135.31f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 49.73f, 134.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 51.0f, 122.77f)
                arcToRelative(124.27f, 124.27f, 0.0f, false, true, 41.71f, -21.66f)
                lineTo(69.37f, 75.4f)
                arcToRelative(155.43f, 155.43f, 0.0f, false, false, -40.29f, 24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 18.92f, 87.0f)
                arcTo(171.87f, 171.87f, 0.0f, false, true, 58.0f, 62.86f)
                lineTo(42.08f, 45.38f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 53.92f, 34.62f)
                close()
                moveTo(128.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 192.0f)
                close()
                moveTo(237.08f, 87.0f)
                arcTo(172.3f, 172.3f, 0.0f, false, false, 106.0f, 49.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 2.0f, 15.87f)
                arcTo(158.33f, 158.33f, 0.0f, false, true, 128.0f, 64.0f)
                arcToRelative(156.25f, 156.25f, 0.0f, false, true, 98.92f, 35.37f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 237.08f, 87.0f)
                close()
                moveTo(195.0f, 135.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.24f, -1.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -1.3f, -11.24f)
                arcToRelative(124.25f, 124.25f, 0.0f, false, false, -51.73f, -24.2f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 150.0f, 114.24f)
                arcTo(108.12f, 108.12f, 0.0f, false, true, 195.0f, 135.31f)
                close()
            }
        }
        .build()
        return _wifiSlash!!
    }

private var _wifiSlash: ImageVector? = null
