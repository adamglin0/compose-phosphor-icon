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

public val ThinGroup.Cloudarrowdown: ImageVector
    get() {
        if (_cloudarrowdown != null) {
            return _cloudarrowdown!!
        }
        _cloudarrowdown = Builder(name = "Cloudarrowdown", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 128.0f)
                arcToRelative(83.28f, 83.28f, 0.0f, false, true, -16.8f, 50.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.4f, -4.8f)
                arcTo(76.0f, 76.0f, 0.0f, true, false, 84.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                arcToRelative(83.45f, 83.45f, 0.0f, false, true, 4.57f, -27.27f)
                arcTo(52.0f, 52.0f, 0.0f, true, false, 72.0f, 204.0f)
                lineTo(96.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(72.0f, 212.0f)
                arcTo(60.0f, 60.0f, 0.0f, true, true, 83.61f, 93.13f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 244.0f, 128.0f)
                close()
                moveTo(181.17f, 173.17f)
                lineTo(156.0f, 198.34f)
                lineTo(156.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(70.34f)
                lineToRelative(-25.17f, -25.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 0.0f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, -5.66f)
                close()
            }
        }
        .build()
        return _cloudarrowdown!!
    }

private var _cloudarrowdown: ImageVector? = null
