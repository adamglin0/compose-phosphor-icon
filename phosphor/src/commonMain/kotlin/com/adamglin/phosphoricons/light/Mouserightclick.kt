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

public val LightGroup.Mouserightclick: ImageVector
    get() {
        if (_mouserightclick != null) {
            return _mouserightclick!!
        }
        _mouserightclick = Builder(name = "Mouserightclick", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 18.0f)
                lineTo(112.0f, 18.0f)
                arcTo(62.07f, 62.07f, 0.0f, false, false, 50.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(62.07f, 62.07f, 0.0f, false, false, 62.0f, 62.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(62.07f, 62.07f, 0.0f, false, false, 62.0f, -62.0f)
                lineTo(206.0f, 80.0f)
                arcTo(62.07f, 62.07f, 0.0f, false, false, 144.0f, 18.0f)
                close()
                moveTo(194.0f, 80.0f)
                verticalLineToRelative(26.0f)
                lineTo(158.49f, 106.0f)
                lineToRelative(34.73f, -34.73f)
                arcTo(50.17f, 50.17f, 0.0f, false, true, 194.0f, 80.0f)
                close()
                moveTo(189.1f, 58.42f)
                lineTo(141.51f, 106.0f)
                lineTo(134.0f, 106.0f)
                lineTo(134.0f, 82.49f)
                lineToRelative(41.38f, -41.38f)
                arcTo(50.3f, 50.3f, 0.0f, false, true, 189.1f, 58.42f)
                close()
                moveTo(164.91f, 34.6f)
                lineTo(134.0f, 65.51f)
                lineTo(134.0f, 30.0f)
                horizontalLineToRelative(10.0f)
                arcTo(49.74f, 49.74f, 0.0f, false, true, 164.91f, 34.6f)
                close()
                moveTo(112.0f, 30.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(76.0f)
                lineTo(62.0f, 106.0f)
                lineTo(62.0f, 80.0f)
                arcTo(50.06f, 50.06f, 0.0f, false, true, 112.0f, 30.0f)
                close()
                moveTo(144.0f, 226.0f)
                lineTo(112.0f, 226.0f)
                arcToRelative(50.06f, 50.06f, 0.0f, false, true, -50.0f, -50.0f)
                lineTo(62.0f, 118.0f)
                lineTo(194.0f, 118.0f)
                verticalLineToRelative(58.0f)
                arcTo(50.06f, 50.06f, 0.0f, false, true, 144.0f, 226.0f)
                close()
            }
        }
        .build()
        return _mouserightclick!!
    }

private var _mouserightclick: ImageVector? = null
