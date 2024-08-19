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

public val BoldGroup.Lightning: ImageVector
    get() {
        if (_lightning != null) {
            return _lightning!!
        }
        _lightning = Builder(name = "Lightning", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.71f, 117.38f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.25f, -8.52f)
                lineTo(161.28f, 88.39f)
                lineToRelative(10.59f, -70.61f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.64f, -10.0f)
                lineToRelative(-112.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.31f, 19.33f)
                lineToRelative(51.18f, 20.47f)
                lineTo(84.13f, 238.22f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.64f, 10.0f)
                lineToRelative(112.0f, -120.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 219.71f, 117.38f)
                close()
                moveTo(113.6f, 203.55f)
                lineToRelative(6.27f, -41.77f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.41f, -12.92f)
                lineTo(68.74f, 131.37f)
                lineTo(142.4f, 52.45f)
                lineToRelative(-6.27f, 41.77f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.41f, 12.92f)
                lineToRelative(43.72f, 17.49f)
                close()
            }
        }
        .build()
        return _lightning!!
    }

private var _lightning: ImageVector? = null
