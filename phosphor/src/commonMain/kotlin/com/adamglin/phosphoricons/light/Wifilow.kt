package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Wifilow: ImageVector
    get() {
        if (_wifilow != null) {
            return _wifilow!!
        }
        _wifilow = Builder(name = "Wifilow", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(138.0f, 204.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 138.0f, 204.0f)
                close()
                moveTo(171.53f, 160.15f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, false, -87.06f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.06f, 9.7f)
                arcToRelative(62.0f, 62.0f, 0.0f, false, true, 72.94f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.38f, -1.32f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 171.53f, 160.15f)
                close()
            }
        }
        .build()
        return _wifilow!!
    }

private var _wifilow: ImageVector? = null
