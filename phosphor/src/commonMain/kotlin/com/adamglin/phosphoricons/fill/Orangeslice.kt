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

public val FillGroup.OrangeSlice: ImageVector
    get() {
        if (_orangeSlice != null) {
            return _orangeSlice!!
        }
        _orangeSlice = Builder(name = "OrangeSlice", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(51.18f, 145.51f)
                arcTo(95.5f, 95.5f, 0.0f, false, true, 32.0f, 88.0f)
                curveToRelative(0.0f, -1.41f, 0.0f, -2.81f, 0.09f, -4.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -3.79f)
                lineTo(107.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.83f, 6.83f)
                close()
                moveTo(120.0f, 183.66f)
                lineTo(120.0f, 99.31f)
                lineTo(61.83f, 157.49f)
                arcTo(95.68f, 95.68f, 0.0f, false, false, 120.0f, 183.66f)
                close()
                moveTo(204.82f, 145.51f)
                arcTo(95.5f, 95.5f, 0.0f, false, false, 224.0f, 88.0f)
                curveToRelative(0.0f, -1.41f, 0.0f, -2.81f, -0.09f, -4.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -3.79f)
                lineTo(149.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.83f, 6.83f)
                close()
                moveTo(248.0f, 80.0f)
                horizontalLineToRelative(-4.08f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.14f)
                curveToRelative(0.0f, 1.28f, 0.07f, 2.57f, 0.07f, 3.86f)
                arcTo(112.0f, 112.0f, 0.0f, false, true, 16.0f, 88.0f)
                curveToRelative(0.0f, -1.29f, 0.0f, -2.58f, 0.07f, -3.86f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.14f)
                lineTo(8.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, false, 256.0f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 248.0f, 80.0f)
                close()
                moveTo(136.0f, 99.31f)
                verticalLineToRelative(84.35f)
                arcToRelative(95.68f, 95.68f, 0.0f, false, false, 58.17f, -26.17f)
                close()
            }
        }
        .build()
        return _orangeSlice!!
    }

private var _orangeSlice: ImageVector? = null
