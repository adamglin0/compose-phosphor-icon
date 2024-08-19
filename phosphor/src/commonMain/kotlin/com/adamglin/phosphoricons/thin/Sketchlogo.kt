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

public val ThinGroup.Sketchlogo: ImageVector
    get() {
        if (_sketchlogo != null) {
            return _sketchlogo!!
        }
        _sketchlogo = Builder(name = "Sketchlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.0f, 101.37f)
                lineToRelative(-56.0f, -64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 184.0f, 36.0f)
                lineTo(72.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.0f, 1.37f)
                lineToRelative(-56.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.09f, 5.36f)
                lineToRelative(112.0f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.84f, 0.0f)
                lineToRelative(112.0f, -120.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 243.0f, 101.37f)
                close()
                moveTo(77.29f, 108.0f)
                lineToRelative(39.07f, 97.66f)
                lineTo(25.2f, 108.0f)
                close()
                moveTo(170.09f, 108.0f)
                lineTo(128.0f, 213.23f)
                lineTo(85.91f, 108.0f)
                close()
                moveTo(88.0f, 100.0f)
                lineToRelative(40.0f, -53.33f)
                lineTo(168.0f, 100.0f)
                close()
                moveTo(178.71f, 108.0f)
                lineTo(230.8f, 108.0f)
                lineToRelative(-91.16f, 97.66f)
                close()
                moveTo(231.18f, 100.0f)
                lineTo(178.0f, 100.0f)
                lineTo(136.0f, 44.0f)
                horizontalLineToRelative(46.18f)
                close()
                moveTo(73.82f, 44.0f)
                lineTo(120.0f, 44.0f)
                lineTo(78.0f, 100.0f)
                lineTo(24.82f, 100.0f)
                close()
            }
        }
        .build()
        return _sketchlogo!!
    }

private var _sketchlogo: ImageVector? = null
