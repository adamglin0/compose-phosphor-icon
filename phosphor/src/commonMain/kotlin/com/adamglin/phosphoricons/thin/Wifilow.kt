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

public val ThinGroup.Wifilow: ImageVector
    get() {
        if (_wifilow != null) {
            return _wifilow!!
        }
        _wifilow = Builder(name = "Wifilow", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 204.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 204.0f)
                close()
                moveTo(170.35f, 161.77f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, -84.7f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.71f, 6.46f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 75.28f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.71f, -6.46f)
                close()
            }
        }
        .build()
        return _wifilow!!
    }

private var _wifilow: ImageVector? = null
