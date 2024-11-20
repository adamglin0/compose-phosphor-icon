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

public val ThinGroup.FilmSlate: ImageVector
    get() {
        if (_filmSlate != null) {
            return _filmSlate!!
        }
        _filmSlate = Builder(name = "FilmSlate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 108.0f)
                lineTo(71.26f, 108.0f)
                lineTo(209.0f, 71.64f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.84f, -4.92f)
                lineToRelative(-8.16f, -30.0f)
                arcToRelative(11.92f, 11.92f, 0.0f, false, false, -14.54f, -8.31f)
                lineTo(36.83f, 68.61f)
                arcToRelative(11.78f, 11.78f, 0.0f, false, false, -7.26f, 5.53f)
                arcTo(11.59f, 11.59f, 0.0f, false, false, 28.41f, 83.0f)
                lineToRelative(7.67f, 28.19f)
                arcTo(3.87f, 3.87f, 0.0f, false, false, 36.0f, 112.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(208.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(220.0f, 112.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 216.0f, 108.0f)
                close()
                moveTo(126.0f, 53.33f)
                lineToRelative(38.0f, 21.92f)
                lineTo(116.08f, 87.9f)
                lineTo(78.12f, 66.0f)
                close()
                moveTo(191.16f, 36.13f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.0f, -0.13f)
                arcTo(3.88f, 3.88f, 0.0f, false, true, 196.0f, 38.81f)
                lineToRelative(7.1f, 26.12f)
                lineTo(175.0f, 72.35f)
                lineTo(137.0f, 50.43f)
                close()
                moveTo(36.46f, 78.13f)
                arcToRelative(3.86f, 3.86f, 0.0f, false, true, 2.37f, -1.8f)
                lineToRelative(28.27f, -7.46f)
                lineToRelative(38.0f, 21.91f)
                lineTo(43.25f, 107.12f)
                lineTo(36.13f, 80.94f)
                arcTo(3.66f, 3.66f, 0.0f, false, true, 36.5f, 78.14f)
                close()
                moveTo(212.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(48.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 116.0f)
                lineTo(212.0f, 116.0f)
                close()
            }
        }
        .build()
        return _filmSlate!!
    }

private var _filmSlate: ImageVector? = null
