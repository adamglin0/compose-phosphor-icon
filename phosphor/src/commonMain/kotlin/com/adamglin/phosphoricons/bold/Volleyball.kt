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

public val BoldGroup.Volleyball: ImageVector
    get() {
        if (_volleyball != null) {
            return _volleyball!!
        }
        _volleyball = Builder(name = "Volleyball", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(96.83f, 50.0f)
                arcToRelative(83.49f, 83.49f, 0.0f, false, true, 17.92f, -5.0f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 161.26f, 116.0f)
                lineTo(134.93f, 116.0f)
                close()
                moveTo(134.93f, 140.0f)
                horizontalLineToRelative(76.2f)
                arcToRelative(83.37f, 83.37f, 0.0f, false, true, -4.69f, 18.0f)
                arcToRelative(84.07f, 84.07f, 0.0f, false, true, -84.68f, 4.79f)
                close()
                moveTo(211.13f, 116.0f)
                lineTo(185.29f, 116.0f)
                arcToRelative(107.43f, 107.43f, 0.0f, false, false, -14.4f, -49.71f)
                arcTo(108.71f, 108.71f, 0.0f, false, false, 159.5f, 50.15f)
                arcTo(84.21f, 84.21f, 0.0f, false, true, 211.13f, 116.0f)
                close()
                moveTo(76.07f, 62.05f)
                lineTo(89.0f, 84.39f)
                arcToRelative(107.44f, 107.44f, 0.0f, false, false, -35.85f, 37.32f)
                arcToRelative(108.9f, 108.9f, 0.0f, false, false, -8.28f, 18.0f)
                arcTo(83.65f, 83.65f, 0.0f, false, true, 76.07f, 62.05f)
                close()
                moveTo(62.79f, 180.87f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 101.0f, 105.2f)
                lineTo(114.14f, 128.0f)
                lineTo(76.07f, 194.0f)
                arcTo(84.68f, 84.68f, 0.0f, false, true, 62.79f, 180.87f)
                close()
                moveTo(96.79f, 205.98f)
                lineTo(109.71f, 183.61f)
                arcTo(107.41f, 107.41f, 0.0f, false, false, 160.0f, 196.0f)
                arcToRelative(109.0f, 109.0f, 0.0f, false, false, 19.59f, -1.78f)
                arcTo(83.72f, 83.72f, 0.0f, false, true, 96.83f, 206.0f)
                close()
            }
        }
        .build()
        return _volleyball!!
    }

private var _volleyball: ImageVector? = null
