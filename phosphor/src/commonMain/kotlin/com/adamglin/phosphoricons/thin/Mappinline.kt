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

public val ThinGroup.Mappinline: ImageVector
    get() {
        if (_mappinline != null) {
            return _mappinline!!
        }
        _mappinline = Builder(name = "Mappinline", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 228.0f)
                lineTo(139.72f, 228.0f)
                arcTo(263.66f, 263.66f, 0.0f, false, false, 171.0f, 197.62f)
                curveToRelative(26.81f, -30.83f, 41.0f, -63.2f, 41.0f, -93.62f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, -168.0f, 0.0f)
                curveToRelative(0.0f, 30.42f, 14.17f, 62.79f, 41.0f, 93.62f)
                arcTo(263.66f, 263.66f, 0.0f, false, false, 116.28f, 228.0f)
                lineTo(56.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(200.0f, 236.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(90.9f, 192.23f)
                curveTo(73.15f, 171.8f, 52.0f, 139.9f, 52.0f, 104.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, true, 152.0f, 0.0f)
                curveToRelative(0.0f, 35.9f, -21.15f, 67.8f, -38.9f, 88.23f)
                arcTo(254.62f, 254.62f, 0.0f, false, true, 128.0f, 227.0f)
                arcTo(254.62f, 254.62f, 0.0f, false, true, 90.9f, 192.23f)
                close()
                moveTo(164.0f, 104.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 164.0f, 104.0f)
                close()
                moveTo(100.0f, 104.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 100.0f, 104.0f)
                close()
            }
        }
        .build()
        return _mappinline!!
    }

private var _mappinline: ImageVector? = null
