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

public val BoldGroup.Yarn: ImageVector
    get() {
        if (_yarn != null) {
            return _yarn!!
        }
        _yarn = Builder(name = "Yarn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 212.0f)
                lineTo(195.83f, 212.0f)
                arcTo(107.94f, 107.94f, 0.0f, true, false, 128.0f, 236.0f)
                lineToRelative(104.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 0.0f, -24.0f)
                close()
                moveTo(128.0f, 44.0f)
                arcToRelative(83.3f, 83.3f, 0.0f, false, true, 34.9f, 7.63f)
                quadTo(153.21f, 56.45f, 144.0f, 62.14f)
                arcToRelative(227.58f, 227.58f, 0.0f, false, false, -32.13f, -16.58f)
                arcTo(84.49f, 84.49f, 0.0f, false, true, 128.0f, 44.0f)
                close()
                moveTo(79.33f, 59.6f)
                arcTo(201.6f, 201.6f, 0.0f, false, true, 122.5f, 77.31f)
                quadToRelative(-6.73f, 5.35f, -13.0f, 11.2f)
                arcTo(185.48f, 185.48f, 0.0f, false, false, 65.0f, 72.49f)
                arcTo(85.0f, 85.0f, 0.0f, false, true, 79.33f, 59.6f)
                close()
                moveTo(51.11f, 94.23f)
                arcToRelative(161.5f, 161.5f, 0.0f, false, true, 40.75f, 12.43f)
                quadToRelative(-5.44f, 6.25f, -10.44f, 12.9f)
                arcToRelative(145.86f, 145.86f, 0.0f, false, false, -35.37f, -9.92f)
                arcTo(83.0f, 83.0f, 0.0f, false, true, 51.11f, 94.23f)
                close()
                moveTo(53.87f, 167.46f)
                arcToRelative(83.49f, 83.49f, 0.0f, false, true, -9.66f, -33.83f)
                arcTo(122.15f, 122.15f, 0.0f, false, true, 67.79f, 140.0f)
                arcTo(228.76f, 228.76f, 0.0f, false, false, 53.87f, 167.46f)
                close()
                moveTo(71.0f, 189.67f)
                arcTo(205.38f, 205.38f, 0.0f, false, true, 186.1f, 67.42f)
                arcToRelative(85.36f, 85.36f, 0.0f, false, true, 11.0f, 12.86f)
                arcTo(187.87f, 187.87f, 0.0f, false, false, 84.55f, 199.86f)
                arcTo(84.08f, 84.08f, 0.0f, false, true, 71.0f, 189.67f)
                close()
                moveTo(122.67f, 211.82f)
                arcToRelative(84.08f, 84.08f, 0.0f, false, true, -16.0f, -2.55f)
                arcToRelative(163.87f, 163.87f, 0.0f, false, true, 101.07f, -107.4f)
                arcToRelative(83.43f, 83.43f, 0.0f, false, true, 3.52f, 15.78f)
                arcTo(148.76f, 148.76f, 0.0f, false, false, 122.71f, 211.82f)
                close()
                moveTo(149.07f, 209.31f)
                arcToRelative(124.78f, 124.78f, 0.0f, false, true, 61.31f, -65.15f)
                arcTo(84.25f, 84.25f, 0.0f, false, true, 149.11f, 209.31f)
                close()
            }
        }
        .build()
        return _yarn!!
    }

private var _yarn: ImageVector? = null
