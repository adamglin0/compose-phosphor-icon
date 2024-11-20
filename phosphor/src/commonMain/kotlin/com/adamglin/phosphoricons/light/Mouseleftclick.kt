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

public val LightGroup.MouseLeftClick: ImageVector
    get() {
        if (_mouseLeftClick != null) {
            return _mouseLeftClick!!
        }
        _mouseLeftClick = Builder(name = "MouseLeftClick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                lineTo(134.0f, 106.0f)
                lineTo(134.0f, 30.0f)
                horizontalLineToRelative(10.0f)
                arcTo(50.06f, 50.06f, 0.0f, false, true, 194.0f, 80.0f)
                close()
                moveTo(122.0f, 30.0f)
                lineTo(122.0f, 65.51f)
                lineTo(91.09f, 34.6f)
                arcTo(49.74f, 49.74f, 0.0f, false, true, 112.0f, 30.0f)
                close()
                moveTo(80.62f, 41.11f)
                lineTo(122.0f, 82.49f)
                lineTo(122.0f, 106.0f)
                horizontalLineToRelative(-7.51f)
                lineTo(66.9f, 58.42f)
                arcTo(50.3f, 50.3f, 0.0f, false, true, 80.62f, 41.11f)
                close()
                moveTo(62.0f, 80.0f)
                arcToRelative(50.17f, 50.17f, 0.0f, false, true, 0.78f, -8.73f)
                lineTo(97.51f, 106.0f)
                lineTo(62.0f, 106.0f)
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
        return _mouseLeftClick!!
    }

private var _mouseLeftClick: ImageVector? = null
