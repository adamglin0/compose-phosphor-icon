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

public val LightGroup.SkipBack: ImageVector
    get() {
        if (_skipBack != null) {
            return _skipBack!!
        }
        _skipBack = Builder(name = "SkipBack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.84f, 35.77f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.21f, 0.37f)
                lineTo(62.0f, 112.83f)
                verticalLineTo(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineTo(216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(143.16f)
                lineToRelative(122.63f, 76.7f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.21f, 0.37f)
                arcTo(13.69f, 13.69f, 0.0f, false, false, 206.0f, 208.12f)
                verticalLineTo(47.88f)
                arcTo(13.69f, 13.69f, 0.0f, false, false, 198.84f, 35.77f)
                close()
                moveTo(194.0f, 208.12f)
                arcToRelative(1.79f, 1.79f, 0.0f, false, true, -1.0f, 1.62f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -0.05f)
                lineTo(62.88f, 129.56f)
                arcToRelative(1.82f, 1.82f, 0.0f, false, true, 0.0f, -3.12f)
                lineTo(191.0f, 46.31f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.0f, -0.31f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 1.0f, 0.26f)
                arcToRelative(1.79f, 1.79f, 0.0f, false, true, 1.0f, 1.62f)
                close()
            }
        }
        .build()
        return _skipBack!!
    }

private var _skipBack: ImageVector? = null
