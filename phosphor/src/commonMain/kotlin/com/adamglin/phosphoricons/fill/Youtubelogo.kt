package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Youtubelogo: ImageVector
    get() {
        if (_youtubelogo != null) {
            return _youtubelogo!!
        }
        _youtubelogo = Builder(name = "Youtubelogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.33f, 69.52f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -14.49f, -16.4f)
                curveTo(185.56f, 39.88f, 131.0f, 40.0f, 128.0f, 40.0f)
                reflectiveCurveToRelative(-57.56f, -0.12f, -91.84f, 13.12f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -14.49f, 16.4f)
                curveTo(19.08f, 79.5f, 16.0f, 97.74f, 16.0f, 128.0f)
                reflectiveCurveToRelative(3.08f, 48.5f, 5.67f, 58.48f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 14.49f, 16.41f)
                curveTo(69.0f, 215.56f, 120.4f, 216.0f, 127.34f, 216.0f)
                horizontalLineToRelative(1.32f)
                curveToRelative(6.94f, 0.0f, 58.37f, -0.44f, 91.18f, -13.11f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 14.49f, -16.41f)
                curveToRelative(2.59f, -10.0f, 5.67f, -28.22f, 5.67f, -58.48f)
                reflectiveCurveTo(236.92f, 79.5f, 234.33f, 69.52f)
                close()
                moveTo(160.59f, 134.52f)
                lineTo(120.59f, 162.52f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 108.0f, 156.0f)
                lineTo(108.0f, 100.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.59f, -6.55f)
                lineToRelative(40.0f, 28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 13.1f)
                close()
            }
        }
        .build()
        return _youtubelogo!!
    }

private var _youtubelogo: ImageVector? = null
