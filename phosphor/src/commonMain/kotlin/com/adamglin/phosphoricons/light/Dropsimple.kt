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

public val LightGroup.Dropsimple: ImageVector
    get() {
        if (_dropsimple != null) {
            return _dropsimple!!
        }
        _dropsimple = Builder(name = "Dropsimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.53f, 49.06f)
                arcToRelative(251.42f, 251.42f, 0.0f, false, false, -41.09f, -38.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.88f, 0.0f)
                arcToRelative(251.42f, 251.42f, 0.0f, false, false, -41.09f, 38.0f)
                curveTo(56.34f, 80.26f, 42.0f, 113.09f, 42.0f, 144.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, false, 172.0f, 0.0f)
                curveTo(214.0f, 113.09f, 199.66f, 80.26f, 172.53f, 49.06f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(74.09f, 74.09f, 0.0f, false, true, -74.0f, -74.0f)
                curveToRelative(0.0f, -59.62f, 59.0f, -108.93f, 74.0f, -120.51f)
                curveTo(143.0f, 35.07f, 202.0f, 84.38f, 202.0f, 144.0f)
                arcTo(74.09f, 74.09f, 0.0f, false, true, 128.0f, 218.0f)
                close()
            }
        }
        .build()
        return _dropsimple!!
    }

private var _dropsimple: ImageVector? = null
