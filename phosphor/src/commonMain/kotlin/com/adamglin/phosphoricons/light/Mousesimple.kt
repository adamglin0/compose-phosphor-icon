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

public val LightGroup.MouseSimple: ImageVector
    get() {
        if (_mouseSimple != null) {
            return _mouseSimple!!
        }
        _mouseSimple = Builder(name = "MouseSimple", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(194.0f, 176.0f)
                arcToRelative(50.06f, 50.06f, 0.0f, false, true, -50.0f, 50.0f)
                lineTo(112.0f, 226.0f)
                arcToRelative(50.06f, 50.06f, 0.0f, false, true, -50.0f, -50.0f)
                lineTo(62.0f, 80.0f)
                arcToRelative(50.06f, 50.06f, 0.0f, false, true, 50.0f, -50.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(50.06f, 50.06f, 0.0f, false, true, 50.0f, 50.0f)
                close()
                moveTo(134.0f, 64.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(122.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _mouseSimple!!
    }

private var _mouseSimple: ImageVector? = null
