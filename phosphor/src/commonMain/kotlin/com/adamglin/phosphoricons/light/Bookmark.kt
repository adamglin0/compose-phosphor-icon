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

public val LightGroup.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(name = "Bookmark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 34.0f)
                lineTo(72.0f, 34.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 58.0f, 48.0f)
                lineTo(58.0f, 224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.18f, 5.09f)
                lineToRelative(60.81f, -38.0f)
                lineToRelative(60.83f, 38.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 198.0f, 224.0f)
                lineTo(198.0f, 48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 184.0f, 34.0f)
                close()
                moveTo(72.0f, 46.0f)
                lineTo(184.0f, 46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                lineTo(186.0f, 165.18f)
                lineToRelative(-54.83f, -34.27f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.36f, 0.0f)
                lineTo(70.0f, 165.17f)
                lineTo(70.0f, 48.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 72.0f, 46.0f)
                close()
                moveTo(131.17f, 178.91f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.36f, 0.0f)
                lineTo(70.0f, 213.17f)
                lineTo(70.0f, 179.33f)
                lineToRelative(58.0f, -36.25f)
                lineToRelative(58.0f, 36.25f)
                verticalLineToRelative(33.84f)
                close()
            }
        }
        .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
