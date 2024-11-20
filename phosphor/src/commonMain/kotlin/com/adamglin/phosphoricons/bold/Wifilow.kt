package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.WifiLow: ImageVector
    get() {
        if (_wifiLow != null) {
            return _wifiLow!!
        }
        _wifiLow = Builder(name = "WifiLow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 204.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 144.0f, 204.0f)
                close()
                moveTo(175.06f, 155.3f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, -94.12f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 14.13f, 19.4f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 65.86f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 14.13f, -19.4f)
                close()
            }
        }
        .build()
        return _wifiLow!!
    }

private var _wifiLow: ImageVector? = null
