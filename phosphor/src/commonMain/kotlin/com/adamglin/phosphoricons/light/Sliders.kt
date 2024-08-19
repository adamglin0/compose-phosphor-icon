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

public val LightGroup.Sliders: ImageVector
    get() {
        if (_sliders != null) {
            return _sliders!!
        }
        _sliders = Builder(name = "Sliders", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(62.0f, 106.6f)
                lineTo(62.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(66.6f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, 58.8f)
                lineTo(50.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(62.0f, 165.4f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, -58.8f)
                close()
                moveTo(56.0f, 154.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 56.0f, 154.0f)
                close()
                moveTo(134.0f, 58.6f)
                lineTo(134.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(122.0f, 58.6f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, 58.8f)
                lineTo(122.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 117.4f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, -58.8f)
                close()
                moveTo(128.0f, 106.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 128.0f, 106.0f)
                close()
                moveTo(230.0f, 168.0f)
                arcToRelative(30.05f, 30.05f, 0.0f, false, false, -24.0f, -29.4f)
                lineTo(206.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(98.6f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, 58.8f)
                lineTo(194.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(206.0f, 197.4f)
                arcTo(30.05f, 30.05f, 0.0f, false, false, 230.0f, 168.0f)
                close()
                moveTo(200.0f, 186.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 200.0f, 186.0f)
                close()
            }
        }
        .build()
        return _sliders!!
    }

private var _sliders: ImageVector? = null
