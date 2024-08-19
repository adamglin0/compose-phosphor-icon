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

public val ThinGroup.Bracketsangle: ImageVector
    get() {
        if (_bracketsangle != null) {
            return _bracketsangle!!
        }
        _bracketsangle = Builder(name = "Bracketsangle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(83.37f, 42.15f)
                lineTo(28.74f, 128.0f)
                lineToRelative(54.63f, 85.85f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.22f, 5.52f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 80.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.37f, -1.85f)
                lineToRelative(-56.0f, -88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -4.3f)
                lineToRelative(56.0f, -88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.74f, 4.3f)
                close()
                moveTo(235.37f, 125.85f)
                lineTo(179.37f, 37.85f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -6.74f, 4.3f)
                lineTo(227.26f, 128.0f)
                lineToRelative(-54.63f, 85.85f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.22f, 5.52f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 176.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.37f, -1.85f)
                lineToRelative(56.0f, -88.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 235.37f, 125.85f)
                close()
            }
        }
        .build()
        return _bracketsangle!!
    }

private var _bracketsangle: ImageVector? = null
