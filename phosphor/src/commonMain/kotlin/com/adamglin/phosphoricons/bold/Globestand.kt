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

public val BoldGroup.GlobeStand: ImageVector
    get() {
        if (_globeStand != null) {
            return _globeStand!!
        }
        _globeStand = Builder(name = "GlobeStand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 176.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, false, -72.0f, -72.0f)
                arcTo(72.08f, 72.08f, 0.0f, false, false, 136.0f, 176.0f)
                close()
                moveTo(136.0f, 56.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -48.0f, 48.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 136.0f, 56.0f)
                close()
                moveTo(148.0f, 215.35f)
                lineTo(148.0f, 228.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(104.0f, 252.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(20.0f)
                lineTo(124.0f, 215.36f)
                arcTo(112.0f, 112.0f, 0.0f, false, true, 53.88f, 27.84f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 71.47f, 44.16f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 195.84f, 168.53f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 16.32f, 17.59f)
                arcTo(111.51f, 111.51f, 0.0f, false, true, 148.0f, 215.35f)
                close()
            }
        }
        .build()
        return _globeStand!!
    }

private var _globeStand: ImageVector? = null
