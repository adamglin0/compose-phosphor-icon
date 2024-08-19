package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Skull: ImageVector
    get() {
        if (_skull != null) {
            return _skull!!
        }
        _skull = Builder(name = "Skull", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 16.0f)
                curveTo(70.65f, 16.0f, 24.0f, 60.86f, 24.0f, 116.0f)
                curveToRelative(0.0f, 34.1f, 18.27f, 66.0f, 48.0f, 84.28f)
                lineTo(72.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(100.0f, 200.27f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, 7.47f, -8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.53f, 8.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(140.0f, 200.27f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, 7.47f, -8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.53f, 8.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(184.0f, 200.28f)
                curveTo(213.73f, 182.0f, 232.0f, 150.1f, 232.0f, 116.0f)
                curveTo(232.0f, 60.86f, 185.35f, 16.0f, 128.0f, 16.0f)
                close()
                moveTo(92.0f, 152.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 92.0f, 152.0f)
                close()
                moveTo(164.0f, 152.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 164.0f, 152.0f)
                close()
            }
        }
        .build()
        return _skull!!
    }

private var _skull: ImageVector? = null
