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

public val BoldGroup.Rewind: ImageVector
    get() {
        if (_rewind != null) {
            return _rewind!!
        }
        _rewind = Builder(name = "Rewind", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.7f, 54.46f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.33f, 0.66f)
                lineTo(132.0f, 101.85f)
                verticalLineToRelative(-30.0f)
                arcToRelative(19.91f, 19.91f, 0.0f, false, false, -30.63f, -16.72f)
                lineTo(13.19f, 111.29f)
                arcToRelative(19.79f, 19.79f, 0.0f, false, false, 0.0f, 33.42f)
                lineToRelative(88.18f, 56.17f)
                arcTo(19.91f, 19.91f, 0.0f, false, false, 132.0f, 184.16f)
                verticalLineToRelative(-30.0f)
                lineToRelative(73.37f, 46.73f)
                arcTo(19.91f, 19.91f, 0.0f, false, false, 236.0f, 184.16f)
                lineTo(236.0f, 71.84f)
                arcTo(19.84f, 19.84f, 0.0f, false, false, 225.7f, 54.46f)
                close()
                moveTo(108.0f, 176.64f)
                lineTo(31.63f, 128.0f)
                lineTo(108.0f, 79.36f)
                close()
                moveTo(212.0f, 176.64f)
                lineTo(135.63f, 128.0f)
                lineTo(212.0f, 79.36f)
                close()
            }
        }
        .build()
        return _rewind!!
    }

private var _rewind: ImageVector? = null
