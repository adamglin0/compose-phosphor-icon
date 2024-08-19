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

public val LightGroup.Linksimple: ImageVector
    get() {
        if (_linksimple != null) {
            return _linksimple!!
        }
        _linksimple = Builder(name = "Linksimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.25f, 91.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.49f)
                lineToRelative(-64.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.49f, -8.48f)
                lineToRelative(64.0f, -64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 164.25f, 91.75f)
                close()
                moveTo(214.2f, 41.8f)
                arcToRelative(54.07f, 54.07f, 0.0f, false, false, -76.38f, 0.0f)
                lineTo(107.75f, 71.85f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.49f, 8.49f)
                lineToRelative(30.07f, -30.06f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 59.41f, 59.41f)
                lineToRelative(-30.08f, 30.07f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.49f, 8.49f)
                lineToRelative(30.07f, -30.07f)
                arcTo(54.0f, 54.0f, 0.0f, false, false, 214.2f, 41.8f)
                close()
                moveTo(139.76f, 175.64f)
                lineToRelative(-30.07f, 30.08f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, -59.41f, -59.41f)
                lineToRelative(30.06f, -30.07f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.49f, -8.49f)
                lineToRelative(-30.0f, 30.07f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, 76.38f, 76.39f)
                lineToRelative(30.07f, -30.08f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.49f, -8.49f)
                close()
            }
        }
        .build()
        return _linksimple!!
    }

private var _linksimple: ImageVector? = null
