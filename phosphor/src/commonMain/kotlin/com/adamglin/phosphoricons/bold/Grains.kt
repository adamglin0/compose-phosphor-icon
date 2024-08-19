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

public val BoldGroup.Grains: ImageVector
    get() {
        if (_grains != null) {
            return _grains!!
        }
        _grains = Builder(name = "Grains", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 52.0f)
                arcToRelative(91.68f, 91.68f, 0.0f, false, false, -29.9f, 5.0f)
                curveToRelative(-15.39f, -28.76f, -43.4f, -43.06f, -44.73f, -43.72f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.74f, 0.0f)
                curveToRelative(-1.33f, 0.66f, -29.34f, 15.0f, -44.74f, 43.72f)
                arcTo(91.57f, 91.57f, 0.0f, false, false, 48.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 64.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, 184.0f, 0.0f)
                lineTo(220.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 52.0f)
                close()
                moveTo(60.0f, 77.06f)
                arcToRelative(68.15f, 68.15f, 0.0f, false, true, 55.72f, 60.73f)
                arcToRelative(91.89f, 91.89f, 0.0f, false, false, -55.72f, -29.0f)
                close()
                moveTo(116.0f, 210.94f)
                arcTo(68.12f, 68.12f, 0.0f, false, true, 60.0f, 144.0f)
                lineTo(60.0f, 133.06f)
                arcTo(68.12f, 68.12f, 0.0f, false, true, 116.0f, 200.0f)
                close()
                moveTo(99.37f, 67.71f)
                curveToRelative(8.2f, -14.94f, 21.32f, -25.0f, 28.63f, -29.77f)
                curveToRelative(7.32f, 4.79f, 20.43f, 14.83f, 28.63f, 29.77f)
                arcTo(92.69f, 92.69f, 0.0f, false, false, 128.0f, 98.61f)
                arcTo(92.8f, 92.8f, 0.0f, false, false, 99.37f, 67.71f)
                close()
                moveTo(196.0f, 144.0f)
                arcToRelative(68.12f, 68.12f, 0.0f, false, true, -56.0f, 66.94f)
                lineTo(140.0f, 200.0f)
                arcToRelative(68.12f, 68.12f, 0.0f, false, true, 56.0f, -66.94f)
                close()
                moveTo(196.0f, 108.78f)
                arcToRelative(91.89f, 91.89f, 0.0f, false, false, -55.72f, 29.0f)
                arcTo(68.15f, 68.15f, 0.0f, false, true, 196.0f, 77.06f)
                close()
            }
        }
        .build()
        return _grains!!
    }

private var _grains: ImageVector? = null
