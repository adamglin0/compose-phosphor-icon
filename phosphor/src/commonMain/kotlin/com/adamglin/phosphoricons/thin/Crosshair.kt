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

public val ThinGroup.Crosshair: ImageVector
    get() {
        if (_crosshair != null) {
            return _crosshair!!
        }
        _crosshair = Builder(name = "Crosshair", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 124.0f)
                lineTo(219.91f, 124.0f)
                arcTo(92.13f, 92.13f, 0.0f, false, false, 132.0f, 36.09f)
                lineTo(132.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(124.0f, 36.09f)
                arcTo(92.13f, 92.13f, 0.0f, false, false, 36.09f, 124.0f)
                lineTo(24.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(36.09f, 132.0f)
                arcTo(92.13f, 92.13f, 0.0f, false, false, 124.0f, 219.91f)
                lineTo(124.0f, 232.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 219.91f)
                arcTo(92.13f, 92.13f, 0.0f, false, false, 219.91f, 132.0f)
                lineTo(232.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(132.0f, 211.9f)
                lineTo(132.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(11.9f)
                arcTo(84.11f, 84.11f, 0.0f, false, true, 44.1f, 132.0f)
                lineTo(56.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(44.1f, 124.0f)
                arcTo(84.11f, 84.11f, 0.0f, false, true, 124.0f, 44.1f)
                lineTo(124.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 44.1f)
                arcTo(84.11f, 84.11f, 0.0f, false, true, 211.9f, 124.0f)
                lineTo(200.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(11.9f)
                arcTo(84.11f, 84.11f, 0.0f, false, true, 132.0f, 211.9f)
                close()
                moveTo(128.0f, 92.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 128.0f, 92.0f)
                close()
                moveTo(128.0f, 156.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 156.0f)
                close()
            }
        }
        .build()
        return _crosshair!!
    }

private var _crosshair: ImageVector? = null
