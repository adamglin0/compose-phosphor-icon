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

public val ThinGroup.Arrowssplit: ImageVector
    get() {
        if (_arrowssplit != null) {
            return _arrowssplit!!
        }
        _arrowssplit = Builder(name = "Arrowssplit", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.83f, 186.83f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineTo(188.0f, 206.34f)
                verticalLineTo(137.66f)
                lineToRelative(-60.0f, -60.0f)
                lineToRelative(-60.0f, 60.0f)
                verticalLineToRelative(68.68f)
                lineToRelative(25.17f, -25.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 5.66f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineTo(60.0f, 206.34f)
                verticalLineTo(136.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.17f, -2.83f)
                lineTo(124.0f, 70.34f)
                verticalLineTo(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineTo(70.34f)
                lineToRelative(62.83f, 62.83f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 196.0f, 136.0f)
                verticalLineToRelative(70.34f)
                lineToRelative(25.17f, -25.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 5.66f)
                close()
            }
        }
        .build()
        return _arrowssplit!!
    }

private var _arrowssplit: ImageVector? = null
