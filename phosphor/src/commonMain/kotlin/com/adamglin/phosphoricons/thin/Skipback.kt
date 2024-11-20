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

public val ThinGroup.SkipBack: ImageVector
    get() {
        if (_skipBack != null) {
            return _skipBack!!
        }
        _skipBack = Builder(name = "SkipBack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(197.87f, 37.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.18f, 0.32f)
                lineTo(60.0f, 116.44f)
                verticalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineTo(216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(139.56f)
                lineToRelative(125.69f, 78.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.18f, 0.32f)
                arcTo(11.69f, 11.69f, 0.0f, false, false, 204.0f, 208.12f)
                verticalLineTo(47.88f)
                arcTo(11.69f, 11.69f, 0.0f, false, false, 197.87f, 37.52f)
                close()
                moveTo(196.0f, 208.12f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.0f, 3.37f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.06f, -0.11f)
                lineTo(61.82f, 131.26f)
                arcToRelative(3.83f, 3.83f, 0.0f, false, true, 0.0f, -6.52f)
                lineTo(189.94f, 44.62f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.11f, -0.62f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.95f, 0.51f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 2.0f, 3.37f)
                close()
            }
        }
        .build()
        return _skipBack!!
    }

private var _skipBack: ImageVector? = null
