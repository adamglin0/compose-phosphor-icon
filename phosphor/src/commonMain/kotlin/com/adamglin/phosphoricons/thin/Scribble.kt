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

public val ThinGroup.Scribble: ImageVector
    get() {
        if (_scribble != null) {
            return _scribble!!
        }
        _scribble = Builder(name = "Scribble", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(202.84f, 186.83f)
                arcToRelative(18.61f, 18.61f, 0.0f, false, false, 0.0f, 26.34f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f)
                arcToRelative(26.63f, 26.63f, 0.0f, false, true, 0.0f, -37.66f)
                lineToRelative(9.38f, -9.37f)
                arcToRelative(18.63f, 18.63f, 0.0f, true, false, -26.35f, -26.34f)
                lineTo(113.45f, 212.2f)
                arcToRelative(26.63f, 26.63f, 0.0f, false, true, -37.66f, -37.66f)
                lineTo(174.55f, 75.8f)
                arcTo(18.63f, 18.63f, 0.0f, true, false, 148.2f, 49.46f)
                lineTo(81.45f, 116.2f)
                arcTo(26.63f, 26.63f, 0.0f, false, true, 43.79f, 78.54f)
                lineTo(85.17f, 37.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.65f, 5.66f)
                lineTo(49.44f, 84.2f)
                arcToRelative(18.63f, 18.63f, 0.0f, true, false, 26.35f, 26.34f)
                lineTo(142.55f, 43.8f)
                arcToRelative(26.63f, 26.63f, 0.0f, false, true, 37.66f, 37.66f)
                lineTo(81.45f, 180.2f)
                arcToRelative(18.63f, 18.63f, 0.0f, true, false, 26.35f, 26.34f)
                lineToRelative(66.75f, -66.74f)
                arcToRelative(26.63f, 26.63f, 0.0f, false, true, 37.66f, 37.66f)
                close()
            }
        }
        .build()
        return _scribble!!
    }

private var _scribble: ImageVector? = null
