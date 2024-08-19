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

public val RegularGroup.Wifilow: ImageVector
    get() {
        if (_wifilow != null) {
            return _wifilow!!
        }
        _wifilow = Builder(name = "Wifilow", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 140.0f, 204.0f)
                close()
                moveTo(172.71f, 158.53f)
                arcToRelative(76.05f, 76.05f, 0.0f, false, false, -89.42f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.42f, 12.94f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 70.58f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 9.42f, -12.94f)
                close()
            }
        }
        .build()
        return _wifilow!!
    }

private var _wifilow: ImageVector? = null
