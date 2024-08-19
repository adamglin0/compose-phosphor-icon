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

public val BoldGroup.Phosphorlogo: ImageVector
    get() {
        if (_phosphorlogo != null) {
            return _phosphorlogo!!
        }
        _phosphorlogo = Builder(name = "Phosphorlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 104.0f)
                arcToRelative(76.08f, 76.08f, 0.0f, false, false, -76.0f, -76.0f)
                lineTo(72.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 60.0f, 40.0f)
                lineTo(60.0f, 168.0f)
                arcToRelative(84.09f, 84.09f, 0.0f, false, false, 84.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(156.0f, 179.89f)
                arcTo(76.09f, 76.09f, 0.0f, false, false, 228.0f, 104.0f)
                close()
                moveTo(84.0f, 85.81f)
                lineTo(123.48f, 156.0f)
                lineTo(84.0f, 156.0f)
                close()
                moveTo(132.0f, 122.19f)
                lineTo(92.52f, 52.0f)
                lineTo(132.0f, 52.0f)
                close()
                moveTo(85.22f, 180.0f)
                lineTo(132.0f, 180.0f)
                verticalLineToRelative(46.79f)
                arcTo(60.18f, 60.18f, 0.0f, false, true, 85.22f, 180.0f)
                close()
                moveTo(156.0f, 155.83f)
                lineTo(156.0f, 52.17f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 0.0f, 103.66f)
                close()
            }
        }
        .build()
        return _phosphorlogo!!
    }

private var _phosphorlogo: ImageVector? = null
