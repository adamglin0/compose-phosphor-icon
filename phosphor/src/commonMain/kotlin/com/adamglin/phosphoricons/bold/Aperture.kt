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

public val BoldGroup.Aperture: ImageVector
    get() {
        if (_aperture != null) {
            return _aperture!!
        }
        _aperture = Builder(name = "Aperture", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.41f, 51.63f)
                arcToRelative(108.0f, 108.0f, 0.0f, true, false, 0.0f, 152.74f)
                arcTo(107.38f, 107.38f, 0.0f, false, false, 204.41f, 51.63f)
                close()
                moveTo(187.41f, 68.63f)
                arcTo(83.85f, 83.85f, 0.0f, false, true, 196.26f, 79.0f)
                lineTo(169.0f, 111.09f)
                lineToRelative(-23.3f, -65.21f)
                arcTo(83.52f, 83.52f, 0.0f, false, true, 187.43f, 68.6f)
                close()
                moveTo(68.56f, 68.63f)
                arcToRelative(83.44f, 83.44f, 0.0f, false, true, 51.11f, -24.2f)
                lineToRelative(14.16f, 39.65f)
                lineTo(65.71f, 71.61f)
                curveTo(66.64f, 70.59f, 67.59f, 69.59f, 68.58f, 68.6f)
                close()
                moveTo(48.0f, 153.7f)
                arcToRelative(84.48f, 84.48f, 0.0f, false, true, 3.4f, -60.3f)
                lineTo(92.84f, 101.0f)
                close()
                moveTo(68.55f, 187.4f)
                arcTo(83.94f, 83.94f, 0.0f, false, true, 59.74f, 177.0f)
                lineTo(87.0f, 144.91f)
                lineToRelative(23.3f, 65.21f)
                arcTo(83.53f, 83.53f, 0.0f, false, true, 68.58f, 187.4f)
                close()
                moveTo(104.91f, 123.79f)
                lineTo(120.09f, 105.94f)
                lineTo(143.15f, 110.15f)
                lineTo(151.03f, 132.21f)
                lineTo(135.86f, 150.06f)
                lineTo(112.8f, 145.85f)
                close()
                moveTo(187.4f, 187.4f)
                arcToRelative(83.49f, 83.49f, 0.0f, false, true, -51.11f, 24.2f)
                lineTo(122.15f, 172.0f)
                lineToRelative(68.14f, 12.44f)
                curveTo(189.36f, 185.41f, 188.41f, 186.41f, 187.43f, 187.4f)
                close()
                moveTo(163.16f, 155.0f)
                lineTo(208.0f, 102.3f)
                arcToRelative(84.43f, 84.43f, 0.0f, false, true, -3.41f, 60.3f)
                close()
            }
        }
        .build()
        return _aperture!!
    }

private var _aperture: ImageVector? = null
