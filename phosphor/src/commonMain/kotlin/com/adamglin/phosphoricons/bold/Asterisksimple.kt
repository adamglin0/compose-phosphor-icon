package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.AsteriskSimple: ImageVector
    get() {
        if (_asteriskSimple != null) {
            return _asteriskSimple!!
        }
        _asteriskSimple = Builder(name = "AsteriskSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.45f, 107.14f)
                lineToRelative(-65.19f, 26.08f)
                lineToRelative(46.21f, 59.41f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -18.94f, 14.74f)
                lineTo(128.0f, 147.55f)
                lineTo(81.47f, 207.37f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -18.94f, -14.74f)
                lineToRelative(46.21f, -59.41f)
                lineTo(43.55f, 107.14f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 8.91f, -22.28f)
                lineTo(116.0f, 110.28f)
                verticalLineTo(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(70.28f)
                lineToRelative(63.54f, -25.42f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 8.91f, 22.28f)
                close()
            }
        }
        .build()
        return _asteriskSimple!!
    }

private var _asteriskSimple: ImageVector? = null
