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

public val RegularGroup.Personsimplewalk: ImageVector
    get() {
        if (_personsimplewalk != null) {
            return _personsimplewalk!!
        }
        _personsimplewalk = Builder(name = "Personsimplewalk", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 80.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 152.0f, 80.0f)
                close()
                moveTo(152.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 152.0f, 32.0f)
                close()
                moveTo(216.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                curveToRelative(-35.31f, 0.0f, -52.95f, -17.81f, -67.12f, -32.12f)
                curveToRelative(-2.74f, -2.77f, -5.36f, -5.4f, -8.0f, -7.84f)
                lineToRelative(-13.43f, 30.88f)
                lineToRelative(37.2f, 26.57f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 176.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(144.0f, 180.12f)
                lineToRelative(-31.07f, -22.2f)
                lineTo(79.34f, 235.19f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 72.0f, 240.0f)
                arcToRelative(7.84f, 7.84f, 0.0f, false, true, -3.19f, -0.67f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.15f, -10.52f)
                lineToRelative(54.08f, -124.37f)
                curveToRelative(-9.31f, -1.65f, -20.92f, 1.2f, -34.7f, 8.58f)
                arcToRelative(163.88f, 163.88f, 0.0f, false, false, -30.57f, 21.77f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.95f, -11.66f)
                curveToRelative(2.5f, -2.35f, 61.69f, -57.23f, 98.72f, -25.08f)
                curveToRelative(3.83f, 3.32f, 7.48f, 7.0f, 11.0f, 10.57f)
                curveTo(166.19f, 122.7f, 179.36f, 136.0f, 208.0f, 136.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 144.0f)
                close()
            }
        }
        .build()
        return _personsimplewalk!!
    }

private var _personsimplewalk: ImageVector? = null
