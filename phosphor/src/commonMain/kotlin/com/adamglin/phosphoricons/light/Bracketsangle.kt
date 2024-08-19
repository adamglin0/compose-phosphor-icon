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

public val LightGroup.Bracketsangle: ImageVector
    get() {
        if (_bracketsangle != null) {
            return _bracketsangle!!
        }
        _bracketsangle = Builder(name = "Bracketsangle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(85.06f, 43.22f)
                lineTo(31.11f, 128.0f)
                lineToRelative(54.0f, 84.78f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.84f, 8.28f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.28f, -1.84f)
                lineToRelative(-56.0f, -88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -6.44f)
                lineToRelative(56.0f, -88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 10.12f, 6.44f)
                close()
                moveTo(237.06f, 124.78f)
                lineTo(181.06f, 36.78f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -10.12f, 6.44f)
                lineTo(224.89f, 128.0f)
                lineToRelative(-53.95f, 84.78f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.84f, 8.28f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.28f, -1.84f)
                lineToRelative(56.0f, -88.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 237.06f, 124.78f)
                close()
            }
        }
        .build()
        return _bracketsangle!!
    }

private var _bracketsangle: ImageVector? = null
