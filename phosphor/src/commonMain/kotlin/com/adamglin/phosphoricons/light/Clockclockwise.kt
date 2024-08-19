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

public val LightGroup.Clockclockwise: ImageVector
    get() {
        if (_clockclockwise != null) {
            return _clockclockwise!!
        }
        _clockclockwise = Builder(name = "Clockclockwise", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.0f, 80.0f)
                verticalLineToRelative(44.6f)
                lineToRelative(37.09f, 22.25f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.18f, 10.3f)
                lineToRelative(-40.0f, -24.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 122.0f, 128.0f)
                lineTo(122.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(224.0f, 58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(218.0f, 87.36f)
                curveToRelative(-7.48f, -8.83f, -14.94f, -17.13f, -23.53f, -25.83f)
                arcToRelative(94.0f, 94.0f, 0.0f, true, false, -1.95f, 134.83f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.24f, -8.72f)
                arcTo(82.0f, 82.0f, 0.0f, true, true, 186.0f, 70.0f)
                curveToRelative(9.24f, 9.36f, 17.18f, 18.3f, 25.31f, 28.0f)
                lineTo(184.0f, 98.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(230.0f, 64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 58.0f)
                close()
            }
        }
        .build()
        return _clockclockwise!!
    }

private var _clockclockwise: ImageVector? = null
