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

public val ThinGroup.Sliders: ImageVector
    get() {
        if (_sliders != null) {
            return _sliders!!
        }
        _sliders = Builder(name = "Sliders", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(60.0f, 108.29f)
                lineTo(60.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(68.29f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, 55.42f)
                lineTo(52.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(60.0f, 163.71f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, -55.42f)
                close()
                moveTo(56.0f, 156.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 56.0f, 156.0f)
                close()
                moveTo(132.0f, 60.29f)
                lineTo(132.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(124.0f, 60.29f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, 55.42f)
                lineTo(124.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 115.71f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, -55.42f)
                close()
                moveTo(128.0f, 108.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 108.0f)
                close()
                moveTo(228.0f, 168.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -24.0f, -27.71f)
                lineTo(204.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(196.0f, 140.29f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, 55.42f)
                lineTo(196.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(204.0f, 195.71f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 228.0f, 168.0f)
                close()
                moveTo(200.0f, 188.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 200.0f, 188.0f)
                close()
            }
        }
        .build()
        return _sliders!!
    }

private var _sliders: ImageVector? = null
