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

public val ThinGroup.MouseLeftClick: ImageVector
    get() {
        if (_mouseLeftClick != null) {
            return _mouseLeftClick!!
        }
        _mouseLeftClick = Builder(name = "MouseLeftClick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 20.0f)
                lineTo(112.0f, 20.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 52.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, false, 60.0f, 60.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, false, 60.0f, -60.0f)
                lineTo(204.0f, 80.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 144.0f, 20.0f)
                close()
                moveTo(196.0f, 80.0f)
                verticalLineToRelative(28.0f)
                lineTo(132.0f, 108.0f)
                lineTo(132.0f, 28.0f)
                horizontalLineToRelative(12.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, true, 196.0f, 80.0f)
                close()
                moveTo(124.0f, 28.0f)
                lineTo(124.0f, 70.34f)
                lineTo(87.7f, 34.05f)
                arcTo(51.61f, 51.61f, 0.0f, false, true, 112.0f, 28.0f)
                close()
                moveTo(80.78f, 38.44f)
                lineTo(124.0f, 81.66f)
                lineTo(124.0f, 108.0f)
                lineTo(113.66f, 108.0f)
                lineTo(64.51f, 58.85f)
                arcTo(52.5f, 52.5f, 0.0f, false, true, 80.78f, 38.44f)
                close()
                moveTo(60.0f, 80.0f)
                arcToRelative(51.55f, 51.55f, 0.0f, false, true, 1.59f, -12.75f)
                lineTo(102.34f, 108.0f)
                lineTo(60.0f, 108.0f)
                close()
                moveTo(144.0f, 228.0f)
                lineTo(112.0f, 228.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, true, -52.0f, -52.0f)
                lineTo(60.0f, 116.0f)
                lineTo(196.0f, 116.0f)
                verticalLineToRelative(60.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, true, 144.0f, 228.0f)
                close()
            }
        }
        .build()
        return _mouseLeftClick!!
    }

private var _mouseLeftClick: ImageVector? = null
