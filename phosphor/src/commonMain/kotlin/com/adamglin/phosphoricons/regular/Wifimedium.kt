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

public val RegularGroup.WifiMedium: ImageVector
    get() {
        if (_wifiMedium != null) {
            return _wifiMedium!!
        }
        _wifiMedium = Builder(name = "WifiMedium", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 140.0f, 204.0f)
                close()
                moveTo(205.0f, 122.77f)
                arcToRelative(124.0f, 124.0f, 0.0f, false, false, -153.94f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 61.0f, 135.31f)
                arcToRelative(108.0f, 108.0f, 0.0f, false, true, 134.06f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.24f, -1.3f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 205.0f, 122.77f)
                close()
                moveTo(172.74f, 158.53f)
                arcToRelative(76.05f, 76.05f, 0.0f, false, false, -89.42f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.42f, 12.94f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 70.58f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 9.42f, -12.94f)
                close()
            }
        }
        .build()
        return _wifiMedium!!
    }

private var _wifiMedium: ImageVector? = null
