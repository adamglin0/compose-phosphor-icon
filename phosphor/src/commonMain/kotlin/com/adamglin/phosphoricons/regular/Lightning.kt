package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Lightning: ImageVector
    get() {
        if (_lightning != null) {
            return _lightning!!
        }
        _lightning = Builder(name = "Lightning", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.79f, 118.17f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.0f, -5.66f)
                lineTo(153.18f, 90.9f)
                lineToRelative(14.66f, -73.33f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.69f, -7.0f)
                lineToRelative(-112.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.0f, 13.0f)
                lineToRelative(57.63f, 21.61f)
                lineTo(88.16f, 238.43f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.69f, 7.0f)
                lineToRelative(112.0f, -120.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 215.79f, 118.17f)
                close()
                moveTo(109.37f, 214.0f)
                lineToRelative(10.47f, -52.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.0f, -9.06f)
                lineTo(62.0f, 132.71f)
                lineToRelative(84.62f, -90.66f)
                lineTo(136.16f, 94.43f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.0f, 9.06f)
                lineToRelative(52.8f, 19.8f)
                close()
            }
        }
        .build()
        return _lightning!!
    }

private var _lightning: ImageVector? = null
