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

public val LightGroup.FunnelSimple: ImageVector
    get() {
        if (_funnelSimple != null) {
            return _funnelSimple!!
        }
        _funnelSimple = Builder(name = "FunnelSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.0f, 136.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(64.0f, 142.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(192.0f, 130.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 198.0f, 136.0f)
                close()
                moveTo(232.0f, 82.0f)
                lineTo(24.0f, 82.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(232.0f, 94.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(152.0f, 178.0f)
                lineTo(104.0f, 178.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
            }
        }
        .build()
        return _funnelSimple!!
    }

private var _funnelSimple: ImageVector? = null
